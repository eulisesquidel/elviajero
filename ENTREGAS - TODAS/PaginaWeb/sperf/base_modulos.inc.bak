<?php
  	$valido = new validacion();
	if (!$valido->estado){ 
	     $valido->redirecciona('login.html');
	}

	$smarty = new Smarty;
	// Seteos de base para Smarty
	$smarty->compile_check 	= true;
	$smarty->debugging 	= false;
	$smarty->template_dir 	= "$baseDir/smarty/templates/";
	$smarty->compile_dir 	= "$baseDir/smarty/templates_c/";
	$smarty->config_dir 	= "$baseDir/smarty/configs/";
	$smarty->cache_dir 	= "$baseDir/smarty/cache/";
?>