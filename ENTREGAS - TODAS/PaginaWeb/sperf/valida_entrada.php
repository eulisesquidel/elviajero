<?php
require_once("./lib/valida.inc.php");

$valido = new validacion();

if (!$valido->estado){
        if ($valido->login($_REQUEST["usuario"],$_REQUEST["clave"],$_REQUEST["valido"])){
                $valido->redirecciona('admin.php');
        } else {
                $valido->errorLogin('errorLogin.php');
        }
} else {
    $valido->redirecciona('admin.php');
}
?>
