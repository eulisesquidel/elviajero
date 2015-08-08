<?php
//-------------------------------------------------------------------------
// Setting de paths de la Aplicacion
// Autor: RM - W3 
// Ultima Modificación: 2007-06-01
//-------------------------------------------------------------------------
global $baseDir;
global $baseUrl;

$baseDir = dirname(__FILE__);

// automatically define the base url
$baseUrl = ( isset($_SERVER['HTTPS']) && $_SERVER['HTTPS'] != 'off') ? 'https://' : 'http://';
$baseUrl .= isset($_SERVER['HTTP_HOST']) ? $_SERVER['HTTP_HOST'] : getenv('HTTP_HOST');
$pathInfo = isset($_SERVER['PATH_INFO']) ? $_SERVER['PATH_INFO'] : getenv('PATH_INFO');
if (@$pathInfo) {
  $baseUrl .= str_replace('\\','/',dirname($pathInfo));
} else {
  $baseUrl .= str_replace('\\','/', dirname( isset($_SERVER['SCRIPT_NAME']) ? $_SERVER['SCRIPT_NAME'] : getenv('SCRIPT_NAME')));
}

?>
