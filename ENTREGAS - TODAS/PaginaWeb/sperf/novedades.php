<?php
// W3 ITSolutions -------------------------------------------

// Cargo Includes Generales
include_once "./base.inc.php";
// Cargo Modulo Menu_SSA
require_once("$baseDir/modules/novedades/novedad.php");
// Modulo Smarty Template
require_once("$baseDir/smarty/libs/Smarty.class.php");
// Clase de validacion
require_once("./lib/valida.inc.php");
// Legacy Code ----------------------------------------------
require_once("./base_modulos.inc");
// Codigo ---------------------------------------------------

$aDatos = array();

$anchoImagen = 387 ;
$error =  "";
// EDITAR
if (isset($_REQUEST["accion"])){
	if ($_REQUEST["accion"]=="Editar"){
		$oNovedad = new Novedad($_REQUEST["id_novedad"]);
		$smarty->assign("id_novedad",	$oNovedad->Id);
		$smarty->assign("seccion",	$oNovedad->Seccion);
		$smarty->assign("titulo",	$oNovedad->Titulo);
		$smarty->assign("texto",	$oNovedad->Texto);
		$smarty->assign("foto",		$oNovedad->Foto);  
		if ($oNovedad->Activo == 1) {
			$smarty->assign("act",	"selected");
			$smarty->assign("des",	"");
		} else {
			$smarty->assign("act",	"");
			$smarty->assign("des",	"selected");
		}
	}

	// GUARDAR
	if ($_REQUEST["accion"] == "Guardar"){
		
		$oNovedad = new Novedad($_REQUEST["id_novedad"]);
		$oNovedad->Seccion 	= validaTexto($_REQUEST["seccion"]);
		$oNovedad->Titulo       = validaTexto($_REQUEST["titulo"]);
		$oNovedad->Texto	= validaTexto($_REQUEST["texto"]);
		
		if(archivoValido($_FILES['foto']['name'])){  
			if(!nombreValido($_FILES['foto']['name'])){
				if(($_REQUEST["foto_vieja"]!=$_FILES['foto']['name']) or ($_REQUEST["foto_vieja"]==$_FILES['foto']['name'])){
				//if($_REQUEST["foto_vieja"]!=$_FILES['foto']['name']){
					$target_path = "./admin/fotos_novedades/";
					$target_path = $target_path . basename( $_FILES['foto']['name']);
					if(move_uploaded_file($_FILES['foto']['tmp_name'], $target_path)) {
						$oNovedad->Foto = $_FILES['foto']['name'];
						$anchoImagen = Resampling(basename( $_FILES['foto']['name']), $target_path, $oNovedad->Foto);

					} else{
						$oNovedad->Foto = $_REQUEST["foto_vieja"];
					}
				} else {
					$oNovedad->Foto = $_REQUEST["foto_vieja"];
				}
				$oNovedad->Ancho = $anchoImagen;
				$oNovedad->Activo        = $_REQUEST["activado"];
				
				if (isset($_REQUEST["borraimagen"])){
					//echo $_REQUEST["borraimagen"]."<br />"; 
					if($_REQUEST["borraimagen"] == true){
						//echo "ACA BORRA FOTO<br />";
						$oNovedad->Foto = "";
						//echo "FOTO:" . $oNovedad->Foto ."<br />";
					}
				}
				
				
					 
				$oNovedad->Persistir();  
				header("Location: ". $_SERVER['PHP_SELF']);
			} else {
				$oNovedad = new Novedad($_REQUEST["id_novedad"]);
				$smarty->assign("id_novedad",           $oNovedad->Id);
				$smarty->assign("seccion",              $_REQUEST["seccion"]);
				$smarty->assign("titulo",               $_REQUEST["titulo"]);
				$smarty->assign("texto",                $_REQUEST["texto"]);
				$smarty->assign("foto",                 $oNovedad->Foto);  
				if ($oNovedad->Activo == 1) {
					$smarty->assign("act",        "selected");
					$smarty->assign("des",        "");
				} else {
					$smarty->assign("act",        "");
					$smarty->assign("des",        "selected");
				}
				$smarty->assign("error",                "Nombre invalido - caracteres no permitidos");
			}
		} else {
			$oNovedad = new Novedad($_REQUEST["id_novedad"]);
			$smarty->assign("id_novedad",           $oNovedad->Id);
			$smarty->assign("seccion",              $_REQUEST["seccion"]);
			$smarty->assign("titulo",               $_REQUEST["titulo"]);
			$smarty->assign("texto",                $_REQUEST["texto"]);
			$smarty->assign("foto",                 $oNovedad->Foto);  
			if ($oNovedad->Activo == 1) {
				$smarty->assign("act",        "selected");
				$smarty->assign("des",        "");
			} else {
				$smarty->assign("act",        "");
				$smarty->assign("des",        "selected");
			}
			$smarty->assign("error",                "Archivo no valido !!!");
		}
		
	}

	// BORRAR
	if ($_REQUEST["accion"]=="Borrar"){
		$novedad = new Novedad($_REQUEST["id_novedad"]);
		$novedad->Eliminar();
		header("Location: ". $_SERVER['PHP_SELF']);
	}
}


$oNovedades = new Novedades();
$rs = $oNovedades->GetAll();
$row = $rs->_array;
if (count($row)>=1){
	foreach ($row as $key => $value) {
			$fields = $value;
			$aDatos[] 	= array("id_novedad" 	=> $fields['ID_NOVEDAD'],
						"seccion" 	=> $fields['SECCION'],
						"titulo" 	=> $fields['TITULO'],
						"texto" 	=> substr( $fields ['TEXTO'],0,50)."...",
						"foto" 		=> $fields['FOTO'],
						"activo" 	=> ($fields['ACTIVO']==1?"SI":"NO")
						);
	}
}

$smarty->assign("novedades", $aDatos);
// Render del template
$smarty->display('novedades.tpl');


function nombreValido($sFile){ 
	$charInvalidos = array("á","é","í","ó","ú","ñ","Ñ","!","@","·","#","$","%","&","/","(",")","=","?","¿");  
	for($i=0; $i<count($charInvalidos)-1; $i++){
		if (strpos($sFile,$charInvalidos[$i])){
			return true;
		}
	}
	return false;
}


function validaTexto($texto){
	$txt = str_replace("<","&lt;",$texto);
	$txt = str_replace(">","&gt;",$txt);
	return $txt;

}

function archivoValido($archivo){
	if ($archivo){
		$aArchivo = explode(".",$archivo);
		if ((strtolower($aArchivo[1]) == "jpg") or (strtolower($aArchivo[1]) == "gif")){
			return true;
		}
		if (strlen($archivo)<=0){
			return true;
		}
		return false;
	} else {
		return true;
	}
}


/**
* @desc Esta funcion hace el resamplig de la imagen a los valores maximos 
*       que podra tener la imagen.
*       No tocar los valores de ancho y alto.
*/
function Resampling($tmp_name, $directorio, $name){

	// Indico el destino del directorio de la imagen
	if(substr($directorio,-3,3) <> "gif"){   
		$imagen_origen = ImageCreateFromJPEG($directorio);
		// Calculo el tamaño de la imagen original
		$tam_ancho = imagesx ($imagen_origen);
		$tam_alto = imagesy ($imagen_origen);

		//Calculo la medida que va a tener
		// No tocar los valores de Alto y Ancho.
		if ($tam_ancho >= $tam_alto){
			//$ancho = 387;
			//$alto = (290*$tam_alto)/$tam_ancho;  
			$ancho = 387;
			$alto = 290;
			  
		}else{
			//$ancho = (387*$tam_ancho)/$tam_alto;
			//$alto = 290;
			$ancho = 217;
			$alto = 290;
		}

		//Creo una imagen
		$imagen_destino = ImageCreateTrueColor ($ancho, $alto);
		//Resize
		imagecopyresized ($imagen_destino, $imagen_origen, 0,0,0,0, $ancho, $alto, $tam_ancho, $tam_alto);
		$nombre_destino = $directorio;
		//Genero Copia Destino
		ImageJPEG ($imagen_destino, $nombre_destino, 100);
		//Borro imagen virtual
		ImageDestroy ($imagen_destino);
		chmod($nombre_destino,0666);  
		return $ancho;
	} else {
		$imagen_origen = ImageCreateFromGif($directorio);
		// Calculo el tamaño de la imagen original
		$tam_ancho = imagesx ($imagen_origen);
		$tam_alto = imagesy ($imagen_origen);

		//Calculo la medida que va a tener
		/*if ($tam_ancho>=$tam_alto){
			$ancho = 387;
			$alto = (290*$tam_alto)/$tam_ancho;
		}else{
			$ancho = (387*$tam_ancho)/$tam_alto;
			$alto = 290;
		} */
		if ($tam_ancho >= $tam_alto){
			//$ancho = 387;
			//$alto = (290*$tam_alto)/$tam_ancho;  
			$ancho = 387;
			$alto = 290;
			  
		}else{
			//$ancho = (387*$tam_ancho)/$tam_alto;
			//$alto = 290;
			$ancho = 290;
			$alto = 387;
		}     
		//Creo una imagen
		$imagen_destino = ImageCreateTrueColor ($ancho, $alto);
		//Resize
		imagecopyresized ($imagen_destino, $imagen_origen, 0,0,0,0, $ancho, $alto, $tam_ancho, $tam_alto);
		$nombre_destino = $directorio;
		//Genero Copia Destino
		imagegif($imagen_destino, $nombre_destino, 100);
		//Borro imagen virtual
		ImageDestroy ($imagen_destino);
		chmod($nombre_destino,0666);  
		return $ancho;   
	}
}
