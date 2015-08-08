<?php
// W3 ITSolutions -------------------------------------------

// Cargo Includes Generales                                  
include_once "./base.inc.php";
// Cargo Modulo Menu_SSA                                     
require_once("$baseDir/modules/menues1/menu1.php");
require_once("$baseDir/modules/menu1_items/menu1_item.php");
// Modulo Smarty Template                                    
require_once("$baseDir/smarty/libs/Smarty.class.php");
// Clase de validacion                                       
require_once("./lib/valida.inc.php");
// Legacy Code ----------------------------------------------
require_once("./base_modulos.inc");
// Codigo ---------------------------------------------------
$aDatos = array();
$error_menu=0;
$strTextoSubMenus = "";
$strSubMenus = "";
if (isset($_REQUEST["accion"])){
  if (isset($_REQUEST["link"])){
    $linkUrl=$_REQUEST["link"];
  }else {
    $linkUrl="";
  }
  $id_menu1 = $_REQUEST["id_menu1"];
  
  // Aca va el verificador de Link duplicado                                                                  
	if (!verificadorDuplicado($linkUrl,$id_menu1)){    
		if (($_REQUEST["accion"]=="Guardar") and ($_REQUEST["cantidad"] <= 8) and ($_REQUEST["id_menu1"])){
			if($_REQUEST["link"]){
				// GRABA CUANDO NO HAY SUBMENUS                                                     
				$oMenu = new Menu1($_REQUEST["id_menu1"]);
				$oMenu->Nombre 	= validaTexto($_REQUEST["nombre"]);
				$oMenu->UrlLink	= validaTexto($_REQUEST["link"]);
				$oMenu->Persistir();

				/*
				* Esto borra los submenus si se ha optado porque la opcion sea un link              
				*/
				$oMnu_item = new Menu1_item();
				$oMnu_item->DeleteAllByIdRaiz($_REQUEST["id_menu1"]);
				header("Location: ". $_SERVER['PHP_SELF']);
			} else {
				// GRABA CUANDO HAY SUBMENUS                                                         
				if ($_REQUEST["id_menu1"]){   
					$aSubMenus = array();
					$aTextoSubMenus = array(); 
					/**
					* Esto es para que quite el LINK de la tabla MENU1                           
					*/
					$oMenu = new Menu1($_REQUEST["id_menu1"]);
					$oMenu->Nombre 		= validaTexto($_REQUEST["nombre"]);
					$oMenu->UrlLink		= "";
					$oMenu->Persistir();

					for ($i=1; $i < count($_REQUEST); $i++){  
						if (isset($_REQUEST["texto_$i"])){
							if ($_REQUEST["texto_$i"]){
								array_push($aTextoSubMenus, validaTexto($_REQUEST["texto_$i"]));
								array_push($aSubMenus, validaTexto($_REQUEST["valor_$i"]));
							}
						}

					}
					
					
					$oMnu_item = new Menu1_item();
					$oMnu_item->DeleteAllByIdRaiz($_REQUEST["id_menu1"]);
					for ($i=0; $i < count($aTextoSubMenus); $i++){
						$oMnu_item->Nombre	= $aTextoSubMenus[$i];
						$oMnu_item->UrlLink	= $aSubMenus[$i];
						$oMnu_item->Id_raiz	= $_REQUEST["id_menu1"];
						@$oMnu_item->Persistir();
					} 
				}
			}
			
		} elseif (($_REQUEST["accion"] == "Guardar")){
			$error_menu=1;
		} 
	} else {
	    $error_menu=2;
	}
	
	
	if ($_REQUEST["accion"]=="Editar"){
		$oMenu = new Menu1($_REQUEST["id_menu1"]);
		$smarty->assign("id_menu1",		$oMenu->Id);
		$smarty->assign("nombre",		$oMenu->Nombre);
		$smarty->assign("link",			$oMenu->UrlLink);
		// Recupera los submenus
		$oMnus_item = new Menu1_items();
		$rs = $oMnus_item->GETbyIDRaiz($oMenu->Id);
		if(@$rs->_array){
			$row = @$rs->_array;
			$strTextoSubMenus 	= "";
			$strSubMenus		= "";
			if (count($row)>=1){
				foreach ($row as $key => $value) {
					$fields = $value;
					$strTextoSubMenus 	.= trim($fields["NOMBRE"]).",";
					$strSubMenus		    .= trim($fields["LINK"]).",";
				}
			}
			$smarty->assign("aTextoSubMenus",	substr($strTextoSubMenus	,0,	strlen($strTextoSubMenus)-1));
			$smarty->assign("aSubMenus",		substr($strSubMenus		,0,	strlen($strSubMenus)-1));
		}

	}
}

// Comportamiento general 
$oMenues1 = new Menues1();
$rs = $oMenues1->GetAll();
$row = @$rs->_array;
$cantidad = 0;
foreach ($row as $key => $value) {
	$fields = $value;
	$cantidad++;
	$aDatos[] 	= array("id_menu1" 	=> $fields['ID_MENU1'],
				"nombre" 	=> $fields["NOMBRE"],
				"link" 		=> $fields['LINK'],
				"submenu" 	=> GETSubMenus($fields['ID_MENU1']));
}
 
$smarty->assign("menu1", $aDatos);
/*
Esto va  a servir para validad la cantidad de menus
*/
$smarty->assign("cantidad",count($aDatos));

// Para re-pintar los datos
if ($error_menu != 0){
	$smarty->assign("id_menu1",              $_REQUEST["id_menu1"]);
	$smarty->assign("aTextoSubMenus",        substr($strTextoSubMenus        ,0,        strlen($strTextoSubMenus)-1));
	$smarty->assign("aSubMenus",             substr($strSubMenus             ,0,        strlen($strSubMenus)-1));
	$smarty->assign("nombre",                $_REQUEST["nombre"]);
	$smarty->assign("link",                  $_REQUEST["link"]);
}
// Render del template 
$smarty->display('menu1.tpl');
// Mensajes de error	
if ($error_menu == 1){
	echo "<script language='javascript'>alert('Imposible agregar mas elementos al menu. maximo permitido 8.');</script>";
}
if ($error_menu == 2){ 
	echo "<script language='javascript'>alert('Error: Link de menu repetido.');</script>";
}

// Invalida inyeccion de javascript
function validaTexto($texto){
	$txt = str_replace("<","&lt;",$texto);
	$txt = str_replace(">","&gt;",$txt);
	return $txt;

}

/**
 * @desc Esta funcion es para verificar que no se ingresen titulos de menu o links repetidos.
 */
function verificadorDuplicado($link,$id){    
	$oMenues1 = new Menues1();
	$rs = $oMenues1->GetAll();
	$row = @$rs->_array;
	$cantidad = 0;
	foreach ($row as $key => $value) {
		$fields = $value;
		$cantidad++;
		if (strlen(trim($fields['LINK'])) >= 1){ 
			if ((trim($fields['LINK']) == trim($link)) and ($fields['ID_MENU1'] != $id) ){   
				return false;
			}
		}
		
	}
	return false;
}

/**
* @desc Esta funcion recupera los submenus y arma un string separado por comas para
* que el JS pueda armarlo dentro del DIV como diferentes lineas
*/
function GETSubMenus($Id){
	$oMnus_item = new Menu1_items();
	$rs = $oMnus_item->GETbyIDRaiz($Id);  
	if(@$rs->_array){
		$row = @$rs->_array;
		$strTextoSubMenus 	= "";
		if (count($row)>=1){
			foreach ($row as $key => $value) {
				$fields = $value;
				$strTextoSubMenus 	.= $fields["NOMBRE"].",";
			}
			return substr($strTextoSubMenus,0,strlen($strTextoSubMenus)-1);
		}
	}
}	
return "--";

?>