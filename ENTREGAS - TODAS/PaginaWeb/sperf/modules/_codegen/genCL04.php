<?
	//=======================================================================================
	// Generacion de Modulos y Clases Base - Pagina 04 - Generacion de Directorios, m�dulos y clases
	// Fecha: 22/06/2004
	// Autor: RM
	//=======================================================================================
	
	$pagePrefix = "genCL";
	$pageNumber = 4;
	
	//--------------------------------------------
	//Variables del Wizard
	//--------------------------------------------
	$smarty->assign('title', 'Tablas: Lista');
	$wzMenu = gLoadArrayfromFile("./modules/$m/wzCLMenu.inc");

	$wzMenuSelectColor = array_fill(1, 10, '#000');
	$wzMenuSelectColor[$pageNumber] = '#FFF'; 
	
	//var_dump($wzMenu);
	//var_dump($wzMenuSelectColor);
	
	$smarty->assign('wzMenu', $wzMenu);
	$smarty->assign('wzMenuSelectColor', $wzMenuSelectColor);
	
	$pageNext = $pagePrefix.substr("0".($pageNumber+1),-2);
	$pagePrev = $pagePrefix.substr("0".($pageNumber-1),-2);
	
	$smarty->assign('pageNext',"m=$m&a=$pageNext");
	$smarty->assign('pagePrev',"m=$m&a=$pagePrev");
	
	//--------------------------------------------
	//Variables POST & GET
	//--------------------------------------------
		
	$formAction	= "./index.php?m=$m&a=$pageNext";
	
	//Form variables
	$smarty->assign('formAction', $formAction);
	$path_XML = "./modules/$m/$g_pathGenClassXML";

	
	if ($dir = opendir($path_XML)) {
		while (false !== ($file = readdir($dir))) {
			if (substr($file,0,7) == "cg_ent_") {
				$entidad = substr($file,7,strlen($file)-4-7);
				$archivos[ucfirst($entidad)]=$file; 
			}
		}
		closedir($dir);
	}

	$smarty->assign('archivos',$archivos);

?>
