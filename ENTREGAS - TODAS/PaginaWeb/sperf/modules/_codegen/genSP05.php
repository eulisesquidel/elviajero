<?
	//=======================================================================================
	// Generacion de SPs - Pagina 05 - Actualizacion de la BD
	// Fecha: 15/06/2004
	// Autor: RM
	//=======================================================================================
	$pagePrefix = "genSP";
	$pageNumber = 5;

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

	$formAction	= "./index.php?m=$m";
	//--------------------------------------------
	//Variables POST & GET
	//--------------------------------------------
	$sqlHelper = new gODataManager($condb);
	$sCR = "\n";
	$sOut ='';
	
   	foreach ($_POST as $key =>  $value){
		if (substr($key,0,7)=='chkFile')	{
			//Leo el script SQL
			$sSQL='';	
			$fo= fopen($value,"r") or die ("No se encuentra el Archivo:".$value);
			while (!feof($fo)) {
				$sSQL.= fgets($fo, 4096);
			}
			fclose ($fo);
			$sOut .= "Archivo procesado: $value<br>";
			$pos =strpos($sSQL,"$sCR/") ;
			$sSQL =substr($sSQL,0,$pos) ;
			//echo "$sSQL<br>";
			$rs = $sqlHelper->sqlGetCommand($sSQL);
			if (strlen($sqlHelper->ErrorMsg)>0){
				$sOut .= "<b>Error</b>: ".$sqlHelper->ErrorMsg."<br><br>";
			}else{
				$sOut .= "<b>OK</b>"."<br><br>";
			}
		}
	}




	//$rs = $sqlHelper->sqlGetCommand($sql);

	//Form variables
	$smarty->assign('formAction', $formAction);
	$gentipo = $_SESSION[$m]['GENTIPO'];
	$smarty->assign('gentipo',$gentipo);
	$smarty->assign('sOut',$sOut);

	
?>
