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

$aDatos = array();
$error_menu=0;    
if (isset($_REQUEST["accion"])){
	// Aca va el verificador de Link duplicado                                                                  
	if (!verificadorDuplicado($_REQUEST["link"],$_REQUEST["id_menu2"])){ 
		if ($_REQUEST["accion"] == "Modificar"){
			if($_FILES['icono']['size'] < 10240000){
				$oMenus = new Menu2($_REQUEST["id_menu2"]);
				$oMenus->Nombre 	= validaTexto($_REQUEST["nombre"]);
				$oMenus->Link		= validaTexto($_REQUEST["link"]);
                                
				// Para subir el icono 
				if($_REQUEST["icono_viejo"]!=$_FILES['icono']['name']){  
					$target_path = "admin/menu2/";
					$target_path = $target_path . basename( $_FILES['icono']['name']);
					if(move_uploaded_file($_FILES['icono']['tmp_name'], $target_path)) {
						$menus->Icono = $_FILES['icono']['name'];
						chmod($target_path,0666);
					} else{
						$oMenus->Icono = validaTexto($_REQUEST["icono_viejo"]);
					}  
				} else {
					$oMenus->Icono = validaTexto($_REQUEST["icono_viejo"]);
				}
				$oMenus->Persistir();
				header("Location: ". $_SERVER['PHP_SELF']);
			} else {
				$error = $_REQUEST["id_menu2"];
			}
		}
	} else {
	    $error_menu=1;
	}
}  

// Comportomaiento normal
$oMenues2 = new Menues2();
$rs = $oMenues2->GetAll();
$row = $rs->_array;
foreach ($row as $key => $value) {
	$fields = $value;
	if (!isset($error)){
		$error='';
	}
	if ($fields['ID_MENU2'] == $error){
		$txtError = "Muy largo";
	} else {
		$txtError = "";
	}
	$aDatos[] 	 = array(	"id_menu2" 	=> $fields['ID_MENU2'],
        				"icono"		=> $fields['ICONO'],
        				"nombre"	=> $fields['NOMBRE'],
        				"link"		=> $fields['LINK'],
					"error"		=> $error);
}

$smarty->assign("menus", $aDatos);
// Render del template
$smarty->display('menu2.tpl'); 
if ($error_menu == 1){ 
	echo "<script language='javascript'>alert('Error: Link de menu repetido.');</script>";
}

/**
* @desc Funcion de invalidacion de scripting
*/
function validaTexto($texto){
	$txt = str_replace("<","&lt;",$texto);
	$txt = str_replace(">","&gt;",$txt);
	return $txt;

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

?>