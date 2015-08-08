<?
	//=======================================================================================
	// Test de Modulos y Clases Base - Pagina 03 - Resultados
	// Fecha: 18/10/2007
	// Autor: RM
	//=======================================================================================
	
	$pagePrefix = "genTS";
	$pageNumber = 3;
	
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
	
	
	//Post de los valores de las propiedades (for insert)
	$i=0;
	foreach ($_POST as $key=>$value){
		if (substr($key,0,5)=='txtPN')	{
			$propValue[$i] = $value;
			$i++;
		}
	}

	//Post de los valores de las propiedades (for update)
	$i=0;
	foreach ($_POST as $key=>$value){ 
		if (substr($key,0,5)=='txtPU')	{
			if (strlen($value)>0){
				$propValue2[$i] = $value;
			}
			$i++;
		}
	}


	$fileTestClase = $_SESSION[$m]['fileTestClase'];
	$fileInclude = $_SESSION[$m]['fileTestInclude'];
	$colClass = $_SESSION[$m]['testColClass'];
	$Class = $_SESSION[$m]['testClass'];
	
	//incluyo el file de la clase a testear
	if (file_exists($fileInclude))
		include $fileInclude;
	

	testClase($fileTestClase,$propValue,$propValue2,$smarty,$colClass,$Class) ;
	
	//$smarty->assign('files',$files);
	$smarty->assign('Clase',$Class);	


//-------------------------------------------------------
// GEN TEST CLASE
//-------------------------------------------------------
function testClase($fileName,$propValue,$propValue2,$smarty,$colClass,$Class) {
	
	global $g_pathGenClassXML;
	
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


	$auxProps = $xml['xml']['#']['properties'][0]['#']['property'];
	
	for($i = 0; $i < count($auxProps); $i++) {
		$property = $auxProps[$i];	
		
		$_Propiedades[$i]['NOMBRE'] = $property['#']['nombre'][0]['#'];
		$_Propiedades[$i]['CAMPO'] = strtoupper($property['#']['campo'][0]['#']);
		$_Propiedades[$i]['TIPO'] = strtoupper($property['#']['tipo'][0]['#']);
		$_Propiedades[$i]['NULO'] = strtoupper($property['#']['nulo'][0]['#']);
		$_Propiedades[$i]['KEY'] = strtoupper($property['#']['key'][0]['#']);		
		$_Propiedades[$i]['VALUE'] = $propValue[$i] ;		
	}

	//Instancio Class Collection
	eval('$_colClass = new '.$colClass.'();');
	//Instancio Class
	eval('$_Class = new '.$Class.'();');
	
	
	//Seteo Propiedades for insert	
	for($i = 0; $i < count($auxProps); $i++) {
		if(strlen($_Propiedades[$i]['VALUE'])>0){
			if($_Propiedades[$i]['TIPO']=='NUMBER'){
				eval('$_Class->'.$_Propiedades[$i]['NOMBRE'].'='.$_Propiedades[$i]['VALUE'].';');
			}else{
				eval('$_Class->'.$_Propiedades[$i]['NOMBRE']."='".$_Propiedades[$i]['VALUE']."';");
			}
		}
	}
	
	// --- Test Insert Method ------
	$rc = $_Class->Persistir();
	$id = intval($rc->_array[0][0]);

	$_Class->getByID($id);
	$smarty->assign('clsINS',getInfoClass($_Class));

	// --- Test Update Method ------

	//Seteo Propiedades for update
	
	for($i = 0; $i < count($auxProps); $i++) {
		if(strlen($propValue2[$i])>0){
			if($_Propiedades[$i]['TIPO']=='NUMBER'){
				eval('$_Class->'.$_Propiedades[$i]['NOMBRE'].'='.$propValue2[$i].';');
			}else{
				eval('$_Class->'.$_Propiedades[$i]['NOMBRE']."='".$propValue2[$i]."';");
			}
		}
	}

	$rc = $_Class->Persistir();
	$id = intval($rc->_array[0][0]);

	$_Class->getByID($id);
	$smarty->assign('clsUPD',getInfoClass($_Class));


// --- Test GetALL Method ------
	$rs = $_colClass->GetAll();

	$rsAll = simplifyArray($rs->_array );
	$smarty->assign('rsAll',$rsAll);

// --- Test Delete Method ------
	$_Class->getByID($id);
	$_Class->Eliminar();
	$smarty->assign('id',$id);


// --- Test GetALL Method ------
	$rs = $_colClass->GetAll();

	$rsAll = simplifyArray($rs->_array );
	$smarty->assign('rsAll2',$rsAll);
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

function simplifyArray($aParam){
	
	$row=0;
	if (count($aParam)>0){
		foreach ($aParam as $key=>$value){
			$i=0;
			foreach ($aParam[$row] as $key=>$value){
				if ($i%2!=0)	{
					$rsOut[$row][$key] = $value;
				}
				$i++;
			}
			$row++;
		}
	}
	return $rsOut;
}

function getInfoClass($_Class){
	$aux = $_Class->_prop;
	foreach ($aux as $key=>$value){
		$rs[$key]=$aux[$key]['VALUE'];
	}
	return $rs;
}






?>
