<?php
/**
* @desc Este PHP es para el ABM de usuarios
*/
// W3 ITSolutions -------------------------------------------

// Cargo Includes Generales
include_once "./base.inc.php";
// Cargo Modulo usuario
require_once("$baseDir/modules/usuarios/usuario.php");
// Modulo Smarty Template
require_once("$baseDir/smarty/libs/Smarty.class.php");
// Clase de validacion
require_once("./lib/valida.inc.php");
// Legacy Code ----------------------------------------------
require_once("./base_modulos.inc");

// Codigo ---------------------------------------------------

$aDatos = array();
// acciones de post backs
if (isset($_REQUEST["accion"])){
	if ($_REQUEST["accion"]=="Guardar"){
		// Insert y Update
			$oUsuario = new Usuario($_REQUEST["id_usuario"]);
			$oUsuario->Usuario 	= $_REQUEST["usuario"];
			$oUsuario->Nombre	= $_REQUEST["nombre"];
			$oUsuario->Apellido	= $_REQUEST["apellido"];
			$oUsuario->Persistir();
			header("Location: ". $_SERVER['PHP_SELF']);
	}

	if ((isset($_REQUEST["id_usuario"])) && ($_REQUEST["accion"]=="Editar")){
		// Get para Edit
		$oUsuario = new Usuario($_REQUEST["id_usuario"]);
		$smarty->assign("id_usuario",	$oUsuario->Id);
			$smarty->assign("usuario",	$oUsuario->Usuario);
			$smarty->assign("nombre",	$oUsuario->Nombre);
			$smarty->assign("apellido",	$oUsuario->Apellido);
	}

	if ((isset($_REQUEST["id_usuario"])) && ($_REQUEST["accion"]=="Borrar")){
		// Delete
		$oUsuario = new Usuario($_REQUEST["id_usuario"]);
		$oUsuario->Eliminar();
		header("Location: ". $_SERVER['PHP_SELF']);
	}
}
// Common
$oUsuarios = new Usuarios();
$rs = $oUsuarios->GetAll();
$row = $rs->_array;
if (count($row)>=1){
        foreach ($row as $key => $value) {
                $fields         = $value;
                $aDatos[] 	= array("id_usuario" => $fields["ID_USUARIO"],
                			"usuario" => $fields["USUARIO"],
                			"nombre" => $fields["NOMBRE"],
                			"apellido" => $fields["APELLIDO"]);
	}
}
$smarty->assign("usuarios", $aDatos);
// Render del template
$smarty->display('usuarios.tpl');
?>
