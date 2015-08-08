<?php
// W3 ITSolutions -------------------------------------------

// Cargo Includes Generales
include_once "./base.inc.php";
// Cargo Modulo Menu_SSA
require_once("$baseDir/modules/mails/mail.php");
// Modulo Smarty Template
require_once("$baseDir/smarty/libs/Smarty.class.php");
// Clase de validacion
require_once("./lib/valida.inc.php");
// Legacy Code ----------------------------------------------
require_once("./base_modulos.inc");
// Codigo ---------------------------------------------------

$aDatos = array();
if (isset($_REQUEST["accion"])){
	// acciones de post backs
	if ($_REQUEST["accion"]=="Guardar"){
		$oMail = new Maile($_REQUEST["id_mail"]);
		$oMail->Seccion		= $_REQUEST["seccion"];
		$oMail->Mail		= $_REQUEST["mail"];
		$oMail->Persistir();
		header("Location: ". $_SERVER['PHP_SELF']);
	}

	if ($_REQUEST["accion"]=="Editar"){
		$oMail = new Maile($_REQUEST["id_mail"]);
		$smarty->assign("id_mail", 	$oMail->Id);
		$smarty->assign("seccion", 	$oMail->Seccion);
		$smarty->assign("mail",		$oMail->Mail);
	}

	if ($_REQUEST["accion"]=="Borrar"){
		$oMail = new Maile($_REQUEST["id_mail"]);
		$oMail->Eliminar();
		header("Location: ". $_SERVER['PHP_SELF']);
	}
}
$oMails = new Mails();
$rs = $oMails->GetAll();
$row = $rs->_array;
if (count($row)>=1){
	foreach($row as $key => $value) {
		$fields = $value;
	        $aDatos[] 	= array("id_mail" => $fields["ID_MAILS"],
                			"seccion" => $fields["SECCION"],
                			"mail" => $fields["MAIL"]);
	}

}

$smarty->assign("mails", $aDatos);
// Render del template
$smarty->display('lista_mails.tpl');
?>