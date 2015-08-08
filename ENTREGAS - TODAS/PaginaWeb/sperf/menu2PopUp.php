<?php
// W3 ITSolutions -------------------------------------------

// Cargo Includes Generales
include_once "./base.inc.php";
// Cargo Modulo Menu_SSA
require_once("$baseDir/modules/menues2/menu2.php");
// Modulo Smarty Template
require_once("$baseDir/smarty/libs/Smarty.class.php");
// Clase de validacion
require_once("./lib/valida.inc.php");
// Legacy Code ----------------------------------------------
require_once("./base_modulos.inc");
// Codigo ---------------------------------------------------
$error_menu=0;    
$error = "";

if (isset($_REQUEST["accion"])){   
	// Aca va el verificador de Link duplicado                                                                  
/*	if (!verificadorDuplicado($_REQUEST["link"],$_REQUEST["id_menu2"])){*/      
		if ($_REQUEST["accion"] == "Modificar"){
			
		       
			if($_FILES['icono']['size'] < 1024000){
				$oMenus = new Menu2($_REQUEST["id_menu2"]);
				$oMenus->Nombre 	= validaTexto($_REQUEST["nombre"]);
				$oMenus->Link		= validaTexto($_REQUEST["link"]);
				// Para subir el icono
				if(archivoValido($_FILES['icono']['name'])){
					if(!nombreValido($_FILES['icono']['name'])){
						if(($_REQUEST["icono_viejo"]!=$_FILES['icono']['name']) or 
								($_REQUEST["icono_viejo"]==$_FILES['icono']['name'])){  
								$target_path = "admin/menu2/";
								$target_path = $target_path . basename( $_FILES['icono']['name']);
								if(move_uploaded_file($_FILES['icono']['tmp_name'], $target_path)) {
									$oMenus->Icono = $_FILES['icono']['name'];
									$anchoImagen = Resampling(basename( $_FILES['icono']['name']), 
													$target_path, $oMenus->Icono);
									chmod($target_path,0666);
								} else{
									$oMenus->Icono = $_REQUEST["icono_viejo"];
								}
							
						} else {
							$oMenus->Icono = $_REQUEST["icono_viejo"];
						}
						if(isset($_REQUEST["borraicono"]) == true){
							$oMenus->Icono = "";
						}
						$oMenus->Persistir();
						
						// Retorno
						echo "
						<script language='javascript'>      
							var ret = new Array('".$oMenus->Nombre."','".
										$oMenus->Link."',".
										$_REQUEST["id_menu2"].",'".
										$oMenus->Icono."');
							window.opener.recarga(ret);
							window.close();
						</script>";
						 
					} else {
					       $error = "Nombre invalido - caracteres no permitidos";   
					}
				} else {
					$error = "Archivo no valido !!!";
				}
			} else {    
				$error = "Archivo demasiado grande";  
			}
		}
/*	} else {
	    $error_menu=1;
	}
*/	
}  

// Comportamiento general
$oMenu2 = new Menu2($_REQUEST["id_menu2"]); 
$smarty->assign("id_menu2",         $oMenu2->Id);
$smarty->assign("icono",            $oMenu2->Icono);
$smarty->assign("nombre",           $oMenu2->Nombre); 
$smarty->assign("link",             $oMenu2->Link);
$smarty->assign("error",            $error);
// Render del template
$smarty->display('menu2PopUp.tpl'); 

/*if ($error_menu == 1){ 
	echo "<script language='javascript'>alert('Error: Link de menu repetido.');</script>";
}
*/
/**
* @desc validacion del nombre del archivo
*/
function nombreValido($sFile){    
	$charInvalidos = array("á","é","í","ó","ú","ñ","Ñ","!","@","·","#","$","%","&","/","(",")","=","?","¿");  
	for($i=0; $i<count($charInvalidos)-1; $i++){
		if (strpos($sFile,$charInvalidos[$i])){
			return true;
		}
	}
	return false;
}

/**
* @desc Invalidacion de scripting
*/
function validaTexto($texto){
	$txt = str_replace("<","&lt;",$texto);
	$txt = str_replace(">","&gt;",$txt);
	return $txt;

}

/**
* @desc Verificacion de tipo de archivo
*/
function archivoValido($archivo){
	if (strlen($archivo)>1){
		$aArchivo = explode(".",$archivo);  
		if ((strtolower($aArchivo[1]) == "jpg") or (strtolower($aArchivo[1]) == "gif")){
			return true;
		}
		if (strlen($archivo)<=0){
			return true;
		}
	}  else {
		return true;
	}
	return false;
}

/**
 * @desc Esta funcion es para verificar que no se ingresen titulos de menu o links repetidos.
 */
function verificadorDuplicado($link,$id){     
	$oMenues2 = new Menues2();
	$rs = $oMenues2->GetAll();
	$row = @$rs->_array;
	$cantidad = 0;
	foreach ($row as $key => $value) {
		$fields = $value;
		$cantidad++;
		if (strlen(trim($fields['LINK'])) >= 1){  
			if ((trim($fields['LINK']) == trim($link)) and ($fields['ID_MENU2'] != $id) ){ 
				return true;
			}
		}
		
	}
	return false;
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

		// Calculo la medida que va a tener
		// No tocar los valores de Alto y Ancho.
		if ($tam_ancho >= $tam_alto){ 
			$ancho = 32;
			$alto = 32;
			  
		}else{      
			$ancho = 32;
			$alto = 32;
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
		$ancho = 32;
		$imagen_origen = ImageCreateFromGIF('transparentimage.gif');
		$img_width = ImagesX($imagen_origen);
		$img_height = ImagesY($imagen_origen);
		/*
		$new_width = '32';
		$new_height = ($new_width * $img_height) / $img_width;
		*/
		$imagen_destino = imagecreatetruecolor(32, 32);

		$colorTransparent = imagecolortransparent($imagen_origen);
		imagepalettecopy($imagen_origen, $imagen_destino);
		imagefill($resized, 0, 0, $colorTransparent);
		imagecolortransparent($imagen_destino, $colorTransparent);

		imagetruecolortopalette($imagen_destino, true, 256);

		imagecopyresized($imagen_destino, $imagen_origen, 0, 0, 0, 0, 32, 32, $img_width, $img_height);
		$nombre_destino = $directorio; 
		ImageDestroy ($imagen_destino);
	
	
	
		/*
		$imagen_origen = ImageCreateFromGif($directorio);
		// Calculo el tamaño de la imagen original
		$tam_ancho = imagesx ($imagen_origen);
		$tam_alto = imagesy ($imagen_origen);

		//Calculo la medida que va a tener
		if ($tam_ancho >= $tam_alto){      
			$ancho = 32;
			$alto = 32; 
		}else{   
			$ancho = 32;
			$alto = 32;
		}     
		//Creo una imagen   
		$imagen_destino = ImageCreateTrueColor ($ancho, $alto);  
		//Resize
		imagecopyresized ($imagen_destino, $imagen_origen, 0,0,0,0, $ancho, $alto, $tam_ancho, $tam_alto);
		$nombre_destino = $directorio;
		//Genero Copia Destino
		imagegif($imagen_destino, $nombre_destino, 100);
		imagecolortransparent($imagen_destino, $nombre_destino);
		//Borro imagen virtual
		ImageDestroy ($imagen_destino);
		*/
		chmod($nombre_destino,0666);  
		return $ancho; 
		  
	}
}


?>
