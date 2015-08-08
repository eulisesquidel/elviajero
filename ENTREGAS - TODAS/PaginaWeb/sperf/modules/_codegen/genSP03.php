<?	
	//=======================================================================================
	// Generacion de SPs - Pagina 03 - Generacion de Archivos SQL
	// Fecha: 15/06/2004
	// Autor: RM
	//=======================================================================================
	$pagePrefix = "genSP";
	$pageNumber = 3;
	
	$conf = PAE_GetConfiguration("$baseDir/../_configuration/",$g_ConfigTxt);
	//--------------------------------------------
	//Variables del Wizard
	//--------------------------------------------
	$smarty->assign('title', 'Tablas: Lista');
	$wzMenu = gLoadArrayfromFile("./modules/$m/wzSPMenu.inc");

	$wzMenuSelectColor = array_fill(1, 10, '#000');
	$wzMenuSelectColor[$pageNumber] = '#FFF'; 
	
	
	$smarty->assign('wzMenu', $wzMenu);
	$smarty->assign('wzMenuSelectColor', $wzMenuSelectColor);
	
	$pageNext = $pagePrefix.substr("0".($pageNumber+1),-2);
	$pagePrev = $pagePrefix.substr("0".($pageNumber-1),-2);
	
	$smarty->assign('pageNext',"m=$m&a=$pageNext");
	$smarty->assign('pagePrev',"m=$m&a=$pagePrev");
	
	$smarty->assign('schema',$_SESSION[$m]['SCHEMA']);	
	$smarty->assign('gentipo',$_SESSION[$m]['GENTIPO']);
	

	//--------------------------------------------
	//Variables POST & GET
	//--------------------------------------------

	
    $formAction	= "./index.php?m=$m&a=$pageNext";
	
	//Form variables
	$smarty->assign('formAction', $formAction);
	

	$sqlHelper = new gODataManager($condb);
	
	foreach ($_POST as $key =>  $value){
		if (substr($key,0,3)=='chk')	{
			$spAction[$value] = $value;
		}
	}
	
   	$_SESSION[$m]['spAction']= $spAction;


?>
