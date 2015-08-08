<?
	//=======================================================================================
	// Generacion de Modulos y Clases Base - Pagina 02 - Generacionde Modulos y Clases Base
	// Fecha: 22/06/2004
	// Autor: RM
	//=======================================================================================
	
	$pagePrefix = "genCL";
	$pageNumber = 2;
	
	$conf = PAE_GetConfiguration("$baseDir/../_configuration/",$g_ConfigTxt);
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
	//Variables de orden
	//--------------------------------------------
	if (isset($_GET["sortfield"])){
		$_SESSION[$m][$a]['sortfield']= $_GET["sortfield"];
	}
	//--------------------------------------------
	//Variables POST & GET
	//--------------------------------------------
	
	
	$formAction	= "./index.php?m=$m&a=$pageNext";
	
	//Form variables
	$smarty->assign('formAction', $formAction);
	
	


	$sqlHelper = new gODataManager($condb);
	
	foreach ($_POST as $key =>  $value){
		if (substr($key,0,9)=='chkTables')	{
			$rs = getTableDescription($value);	
			$table[$value] = $rs->_array;
		}
	}
	
	$_SESSION[$m]['table']= $table;
    
	//resulset de salida
	$smarty->assign('table',$table);




//---------------------------------------------------------------------
//--- Funciones
//---------------------------------------------------------------------

function getTableDescription($tableName){
	
	//Variables de conexion
	global $condb, $conf, $sqlHelper;
	
	// Consulta SQL de Columnas
	$sql = "SELECT * FROM ALL_TAB_COLUMNS WHERE OWNER='".strtoupper($conf["DB_User"])."'  AND TABLE_NAME='". $id."' ".$orderby ;
	$sql = "SELECT C.COLUMN_NAME, C.DATA_TYPE, C.NULLABLE, " ;
	$sql = $sql."CASE WHEN P.CONSTRAINT_TYPE IS NULL THEN '' ELSE 'PK' END KEY " ;
	$sql = $sql."FROM ALL_TAB_COLUMNS C " ;
	$sql = $sql."LEFT JOIN ALL_IND_COLUMNS I ON I.INDEX_OWNER = C.OWNER " ;
	$sql = $sql."AND I.TABLE_NAME = C.TABLE_NAME  " ;
	$sql = $sql."AND I.COLUMN_NAME = C.COLUMN_NAME " ;
	$sql = $sql."LEFT JOIN ALL_CONSTRAINTS P ON P.OWNER = C.OWNER " ;
	$sql = $sql."AND P.TABLE_NAME = C.TABLE_NAME " ;
	$sql = $sql."AND P.INDEX_NAME = I.INDEX_NAME " ;
	$sql = $sql."AND P.CONSTRAINT_TYPE = 'P' " ;
	$sql = $sql."WHERE C.OWNER='".strtoupper($conf["DB_User"])."'  AND C.TABLE_NAME='". $tableName."'";

	
	
	$rs = $sqlHelper->sqlGetCommand($sql);	
	
	return $rs ;
	
}

?>
