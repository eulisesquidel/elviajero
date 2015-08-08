<?
	//=======================================================================================
	// Test de Modulos y Clases Base - Pagina 02 - Test de Clase
	// Fecha: 18/10/2007
	// Autor: RM
	//=======================================================================================
	
	$pagePrefix = "genTS";
	$pageNumber = 2;
	
	//--------------------------------------------
	//Variables del Wizard
	//--------------------------------------------
	$smarty->assign('title', 'Tablas: Lista');
	$wzMenu = gLoadArrayfromFile("./modules/$m/wzTSMenu.inc");

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
	
	
	//Post de los archivos con las Entidades a generar...
	$i=0;
	$code='';
	$files='';	
	
	foreach ($_POST as $key =>  $value){
		if ($key=='optEnt')	{
			genTestClase($value,$smarty,&$fileInclude,&$Class,&$colClass);
			$_SESSION[$m]['fileTestClase']=$value;
			$_SESSION[$m]['fileTestInclude']=$fileInclude;
			$_SESSION[$m]['testClass']=$Class;
			$_SESSION[$m]['testColClass']=$colClass;
		}	
	}
	
	$smarty->assign('files',$files);



//-------------------------------------------------------
// GEN TEST CLASE
//-------------------------------------------------------
function genTestClase($fileName,$smarty,&$fileInclude,&$Class, &$colClass) {
	global $g_pathGenClassXML;
	
	$_Clase='';
	$_Collection='';
	$_Tabla='';
	$_Path_Relativo='';
	$_Propiedades=array();
	
	//------------------------------------------------------------------------
	//---Roundtrip para no usar funciones XML incopatibles entre PHP4 y PHP5
	//------------------------------------------------------------------------
	//Leo la definicion XML de la Entidades	
	$fo= fopen("./modules/_codegen/$g_pathGenClassXML/".$fileName,"r") or die ("No se encuentra la pagina.");
	while (!feof($fo)) {
		$sXML .= fgets($fo, 4096);
	}
	fclose ($fo);
	
	//paso el xml a un array
	$xml = xmlize($sXML);
	//print_r($xml);

	//Seteo variables generales
	$_Clase = ucfirst($xml['xml']['#']['clase'][0]['#']);
	$_Collection = ucfirst($xml['xml']['#']['coleccion'][0]['#']);
	$_Tabla = strtoupper($xml['xml']['#']['tabla'][0]['#']);
	$_Path_Relativo = $xml['xml']['#']['path_relativo'][0]['#'];
	$path = $_Path_Relativo;
	$file = strtolower($_Clase).".php";
	
	//Seteo de variables de Output
	$fileInclude=$path."/".$file;
	$colClass = $_Collection;
	$Class = $_Clase;
	
	
	$auxProps = $xml['xml']['#']['properties'][0]['#']['property'];
	
	for($i = 0; $i < count($auxProps); $i++) {
		$property = $auxProps[$i];	
		
		$_Propiedades[$i]['NOMBRE'] = $property['#']['nombre'][0]['#'];
		$_Propiedades[$i]['CAMPO'] = strtoupper($property['#']['campo'][0]['#']);
		$_Propiedades[$i]['TIPO'] = strtoupper($property['#']['tipo'][0]['#']);
		$_Propiedades[$i]['NULO'] = strtoupper($property['#']['nulo'][0]['#']);
		$_Propiedades[$i]['KEY'] = strtoupper($property['#']['key'][0]['#']);		
	}
	
	
	//---Loop Propiedades --------------
	for($i = 0; $i < count($_Propiedades); $i++) {
		$propName[$i]=$_Propiedades[$i]['NOMBRE'];
		$propTipo[$i]=$_Propiedades[$i]['TIPO'];
		$propNulo[$i]=$_Propiedades[$i]['NULO'];
		$propKey[$i]=$_Propiedades[$i]['KEY'];
	}	

	$smarty->assign('Entidad',$_Clase);
	$smarty->assign('propName',$propName);
	$smarty->assign('propTipo',$propTipo);
	$smarty->assign('propNulo',$propNulo);
	$smarty->assign('propKey',$propKey);

}


function getStringDefaultTipo($tipo) {
	// Define una string default para cada tipo de datos
	
	switch (strtolower($tipo)) {
		case 'CHAR':
		case 'VARCHAR':
		case 'VARCHAR2':
			$sAux="''";
			break;
		case 'NUMBER':
			$sAux='0';
			break;	
		default: 	
			$sAux="''";
			break;	
	}
	return $sAux;
}

?>
