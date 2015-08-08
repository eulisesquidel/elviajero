<?
	//=======================================================================================
	// Generacion de SPs - Pagina 01 - Seleccion de Tablas
	// Fecha: 15/06/2004
	// Autor: RM
	//=======================================================================================
	$pagePrefix = "genSP";
	$pageNumber = 1;

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
	

	//--------------------------------------------
	//Variables de paginacion
	//--------------------------------------------
	$pageLimit = 100;
	$offset = ($_GET) ? $_GET["offset"] : 1;
	$offset = ($offset) ? $offset : 1;
	$urlvars = "m=$m&a=$a&offset";

	initSmartyPaginate($urlvars,$offset,$pageLimit);
	
	//--------------------------------------------
	//Variables POST & GET
	//--------------------------------------------

	$formAction	= "./index.php?m=$m&a=$pageNext";
	
	//Form variables
	$smarty->assign('formAction', $formAction);


	//--------------------------------------------
	//Variables de orden
	//--------------------------------------------
	if (isset($_GET["sortfield"])){
		$_SESSION[$m][$a]['sortfield']= $_GET["sortfield"];
	}
	
	$orderby = isset($_SESSION[$m][$a]['sortfield']) ? " ORDER BY ".$_SESSION[$m][$a]['sortfield'] : "";

	//--------------------------------------------
	//Variables de conexion
	//--------------------------------------------
	$conf = PAE_GetConfiguration("$baseDir/../_configuration/",$g_ConfigTxt);
	$_SESSION[$m]['SCHEMA']=$conf["DB_Database"];
	
	// Consulta SQL
	$sql= "SELECT DISTINCT TABLE_NAME FROM ALL_TAB_COLUMNS WHERE OWNER='".strtoupper($conf["DB_User"])."' ".$orderby ;


	$sqlHelper = new gODataManager($condb);
	$errMensajes ="";

	$rs = $sqlHelper->sqlGetCommand($sql);
	
	//resulset paginado
	$rsOutput = getCurrentListSmartyPaginate($rs,$smarty);
	
	//resulset de salida
	$smarty->assign('rsOutput',$rsOutput );
	
	

?>
