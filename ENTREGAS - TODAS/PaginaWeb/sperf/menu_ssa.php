<?php
// W3 ITSolutions -------------------------------------------


// Cargo Includes Generales
include_once "./base.inc.php";
// Cargo Modulo Menu_SSA
require_once("$baseDir/modules/menuesssa/menussa.php");
// Modulo Smarty Template
require_once("$baseDir/smarty/libs/Smarty.class.php");
// Clase de validacion
require_once("./lib/valida.inc.php");
// Legacy Code ----------------------------------------------
require_once("./base_modulos.inc");
// Codigo ---------------------------------------------------

$aDatos = array();
if (isset($_REQUEST["accion"])){
	if ($_REQUEST["accion"] == "Modificar"){
		$oMenus = new Menussa($_REQUEST["id"]);
		$oMenus->Link	= validaTexto($_REQUEST["link"]);
		$oMenus->Persistir();
		header("Location: ". $_SERVER['PHP_SELF']);
	}
}

$oMenuesSSA = new MenuesSSA();
$rs = $oMenuesSSA->GetAll();
$row = $rs->_array;
foreach ($row as $key => $value) {
	$fields = $value;
        $aDatos[] 	 = array(	"id_menu_ssa" 	=> $fields['ID_MENU_SSA'],
        				"seccion"	=> $fields['SECCION'],
        				"link"		=> $fields['LINK']);
}
$smarty->assign("menus", $aDatos);
// Render del template
$smarty->display('menu_ssa.tpl');

function validaTexto($texto){
	$txt = str_replace("<","&lt;",$texto);
	$txt = str_replace(">","&gt;",$txt);
	return $txt;

}
?>
