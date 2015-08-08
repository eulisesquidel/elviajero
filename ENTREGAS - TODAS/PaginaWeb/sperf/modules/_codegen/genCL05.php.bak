<?
	//=======================================================================================
	// Generacion de Modulos y Clases Base - Pagina 04 - Generacion de Directorios, módulos y clases
	// Fecha: 22/06/2004
	// Autor: RM
	//=======================================================================================
	
	$pagePrefix = "genCL";
	$pageNumber = 5;
	
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
	
	
	//Post de los archivos con las Entidades a generar...
	$i=0;
	$code='';
	$codebase='';
	$files='';	
	
	$path_XML = "./modules/$m/$g_pathGenClassXML";

	
	foreach ($_POST as $key =>  $value){
		if (substr($key,0,6)=='chkEnt')	{
			$codebase = genClaseBase($value,$path,$filebase);
			$code = genClase($value,$path,$file);
			$files .= $path."/".$filebase."\n";
		
			if(!is_dir($path))   {
				if (mkdir($path)) { 
					genFile($codebase,$path."/".$filebase);
					genFile($code,$path."/".$file);
				}else{
					echo "ERROR: No se pudo crear directorio".$path;
				}
             }else{
				genFile($codebase,$path."/".$filebase);
				if(!file_exists($path."/".$file)){
					genFile($code,$path."/".$file);
					$files .= $path."/".$file."\n";
				}
			 }  
			$i++;
		}
	}
	
	$smarty->assign('files',$files);



//-------------------------------------------------------
//GEN CLASE BASE
//-------------------------------------------------------
function genClaseBase($fileName,&$path,&$file) {
	global $path_XML;
	
	$_Clase='';
	$_Collection='';
	$_Tabla='';
	$_Path_Relativo='';
	$_Propiedades=array();
	
	//------------------------------------------------------------------------
	//---Roundtrip para no usar funciones XML incopatibles entre PHP4 y PHP5
	//------------------------------------------------------------------------
	//Leo la definicion XML de la Entidades	
	$fo= fopen("$path_XML/".$fileName,"r") or die ("No se encuentra el Archivo:"."$path_XML/".$fileName);
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
	
	$_Clase .= '_base';
	$_Collection .= '_base';
	$file = strtolower($_Clase).".php";
	
	$auxProps = $xml['xml']['#']['properties'][0]['#']['property'];
	
	for($i = 0; $i < count($auxProps); $i++) {
		$property = $auxProps[$i];	
		
		$_Propiedades[$i]['NOMBRE'] = $property['#']['nombre'][0]['#'];
		$_Propiedades[$i]['CAMPO'] = strtoupper($property['#']['campo'][0]['#']);
		$_Propiedades[$i]['TIPO'] = strtoupper($property['#']['tipo'][0]['#']);
		$_Propiedades[$i]['NULO'] = strtoupper($property['#']['nulo'][0]['#']);
		$_Propiedades[$i]['KEY'] = strtoupper($property['#']['key'][0]['#']);		
	}

	//------------------------------------------------------------------------
	//---Fin Roundtrip
	//------------------------------------------------------------------------
	
	//Test
		//~ echo "<br>";
		//~ echo "Clase: $_Clase<br>";
		//~ echo "Tabla: $_Tabla<br>";
		//~ echo "Path_Relativo: $_Path_Relativo<br>";
		//~ echo "<br>";
		//~ var_dump($_Propiedades);

	//------------------------------------------------------------------------
	//---Clase Bob 'El Constructor' --- Si podemos!!!
	//------------------------------------------------------------------------
	$today = getdate();
	$sCR = "\n";
	$sComaSimple = "'";
	
    $sClass ="<?$sCR";
	$sClass .= "//---------------------------------------------------------------$sCR";
    $sClass .= "// Clase Base: $_Clase $sCR";
    $sClass .= "// $sCR";
    $sClass .= "// AUTOGENERADO {$today['year']}-{$today['mon']}-{$today['mday']} {$today['hours']}:{$today['minutes']}:{$today['seconds']} --- W3 ITSolutions --- $sCR";
    $sClass .= "// Autor: RM - 2007 $sCR";
    $sClass .= "//---------------------------------------------------------------$sCR";
	$sClass .="$sCR";
	$sClass .='require_once('.'"'.'$baseDir/lib/g_XMLfunctions.inc.php'.'"'.");$sCR";
	$sClass .="$sCR";

	//=== Class Base ========================
	$sClass .="class $_Clase { $sCR";
	$sClass .="$sCR";
	$sClass .='	// variables internas'.$sCR;
	$sClass .='	var $_entidad_base;'.$sCR;
	$sClass .='	var $_prop;'.$sCR;
	$sClass .='	var $_condb; // Conexion a la base de datos  '.$sCR;
	$sClass .="$sCR";

	//---Loop Propiedades --------------
	$sClass .='	// Propiedades'.$sCR;
	for($i = 0; $i < count($_Propiedades); $i++) {
		$sClass .='	var $'.$_Propiedades[$i]['NOMBRE'].";$sCR";
	}	
	$sClass .="$sCR";

	//---Funcion Constructor -----------
	$sClass .="	function $_Clase(";
	
	$sAux=''; //genero los parametros constructores default
	for($i = 0; $i < count($_Propiedades); $i++) {
		if ($_Propiedades[$i]['KEY']!='') {
			$sAux .='$'.$_Propiedades[$i]['NOMBRE']."=".getStringDefaultTipo($_Propiedades[$i]['TIPO']).",";  
		}
	}		
	$sClass .=removeLastChar($sAux,',').") { $sCR";	
	$sClass .="$sCR";
	$sClass .='		$this->_entidad_base = '."$sComaSimple$_Tabla$sComaSimple; $sCR";
	$sClass .='		$this->_condb = $_SESSION["ConDB"];'.$sCR;
	$sClass .="$sCR";

	//--- Array de Propiedades inicial (constructor) ---
	$sAux='';
	$sClass .='		$this->_prop = array('.$sCR;
	for($i = 0; $i < count($_Propiedades); $i++) {
			//'COUNTRY_ID'=>array(
			$sAux .="					$sComaSimple".$_Propiedades[$i]['CAMPO']."$sComaSimple=>array( $sCR";
			$sAux .="						'VALUE'=>".getStringDefaultTipo($_Propiedades[$i]['TIPO']).", $sCR";
			$sAux .="						'TIPO'=>'{$_Propiedades[$i]['TIPO']}', $sCR";
			$sAux .="						'NULO'=>'{$_Propiedades[$i]['NULO']}', $sCR";
			$sAux .="						'KEY'=>'{$_Propiedades[$i]['KEY']}' $sCR";
			$sAux .="					),$sCR";
	}		
	
	$sClass .=removeLastChar($sAux,",").'		                    );'.$sCR;

	//--- Verifico si pasan parametros en el constructor ---
	
	$sClass .='		if(';	
	$sAux=''; 
	for($i = 0; $i < count($_Propiedades); $i++) {
		if ($_Propiedades[$i]['KEY']!='') {
			$sAux .=' $'.$_Propiedades[$i]['NOMBRE']."!=".getStringDefaultTipo($_Propiedades[$i]['TIPO']);			
			$sAux .=' &&'; 	
		}
	}		
	$sAux=removeLastChar($sAux,'&');
	$sAux=removeLastChar($sAux,'&');
	$sClass .=$sAux.") { $sCR";	

	$sClass .='			$this->getByID(';	
	$sAux='';
	for($i = 0; $i < count($_Propiedades); $i++) {
		if ($_Propiedades[$i]['KEY']!='') {
			$sAux .='$'.$_Propiedades[$i]['NOMBRE'].",";			
		}
	}		
	$sClass .=removeLastChar($sAux,',').');'.$sCR;	
	
	$sClass .='		} //if'.$sCR;	
    $sClass .="	} //end function $sCR";
	$sClass .="$sCR";

	// --- Function GetByID -----------------------------
	$sClass .='	function getByID(';
	$sAux='';
	for($i = 0; $i < count($_Propiedades); $i++) {
		if ($_Propiedades[$i]['KEY']!='') {
			$sAux .='$'.$_Propiedades[$i]['NOMBRE'].",";			
		}
	}		
	$sClass .=removeLastChar($sAux,',').') {'.$sCR;	
	$sClass .="$sCR";
	
	$sAux='';
	for($i = 0; $i < count($_Propiedades); $i++) {
		if ($_Propiedades[$i]['KEY']!='') {
			$sClass .='		$this->_prop['.$sComaSimple.$_Propiedades[$i]['CAMPO'].$sComaSimple."]['VALUE']=$".$_Propiedades[$i]['NOMBRE'].";$sCR";
		}
	}	
	$sClass .="$sCR";
	
	$sClass .='		$sqlHelper = new gODataManager($this->_condb);'.$sCR;
	$sClass .='		$rs = $sqlHelper->spGetById($this->_entidad_base,$this->_prop);'.$sCR;
	$sClass .='		$this->_bindProps($rs->_array[0]);'.$sCR;
	$sClass .='	} //end function getByID'.$sCR;
	// --- Fin Function GetByID -----------------------------

	$sClass .="$sCR";
	
	// --- Function Persistir -----------------------------
	$sClass .='	function Persistir(){ '.$sCR;	
	$sClass .='		$this->_bindValues();'.$sCR;	
	$sClass .='		$sqlHelper = new gODataManager($this->_condb);'.$sCR;	
	$sClass .='		$rc= $sqlHelper->spPersistir($this->_entidad_base,$this->_prop);'.$sCR;	
	$sClass .='		return $rc;'.$sCR;	
	$sClass .='	} //end function Persistir'.$sCR;	
	// --- Fin Function Persistir -----------------------------

	$sClass .="$sCR";

	// --- Function Eliminar -----------------------------
	$sClass .='	function Eliminar(){ '.$sCR;	
	$sClass .='		$this->_bindValues();'.$sCR;	
	$sClass .='		$sqlHelper = new gODataManager($this->_condb);'.$sCR;	
	$sClass .='		$sqlHelper->spDelete($this->_entidad_base,$this->_prop);'.$sCR;	
	$sClass .='	} //end function Eliminar'.$sCR;	
	// --- Fin Function Eliminar -----------------------------

	$sClass .="$sCR";

	// --- Function _bindProps -----------------------------
	$sClass .='	function _bindProps($arrayProps){'.$sCR;
	$sClass .='		foreach ($arrayProps as $key => $value){'.$sCR;
	$sClass .='			switch($key){'.$sCR;
	for($i = 0; $i < count($_Propiedades); $i++) {
		$sClass .='				case '.$sComaSimple.$_Propiedades[$i]['CAMPO'].$sComaSimple.':'.$sCR;
		$sClass .='					$this->'.$_Propiedades[$i]['NOMBRE'].'=$value;'.$sCR;
		$sClass .='					break;'.$sCR;
	}	

	$sClass .='			}'.$sCR;
	$sClass .='		}'.$sCR;	
	$sClass .='		if (array_key_exists($key,$this->_prop)){'.$sCR;
	$sClass .='			$this->_prop[$key]["VALUE"] = $value;'.$sCR;
	$sClass .='		}'.$sCR;
	$sClass .='	} //end function _bindProps'.$sCR;	
	// --- Fin Function _bindProps -----------------------------

	$sClass .="$sCR";

	// --- Function _bindValues -----------------------------
	$sClass .='	function _bindValues(){'.$sCR;
	for($i = 0; $i < count($_Propiedades); $i++) {
		$sClass .='		$this->_prop['.$sComaSimple.$_Propiedades[$i]['CAMPO'].$sComaSimple."]['VALUE'] = ".'$this->'.$_Propiedades[$i]['NOMBRE'].';'.$sCR;
	}
	$sClass .='	} //end function _bindValues'.$sCR;	
	// --- Fin Function _bindValues -----------------------------

	$sClass .="$sCR";
	$sClass .='} //end class '.$_Clase.$sCR;
	//=== Fin Class Base ========================

	$sClass .="$sCR";
	
	//=== Class Collection ======================
	$sClass .="class $_Collection { $sCR";
	$sClass .="$sCR";
	$sClass .='	// variables internas'.$sCR;
	$sClass .='	var $_item_class;'.$sCR;
	$sClass .='	var $_entidad_base;'.$sCR;
	$sClass .='	var $_prop;'.$sCR;
	$sClass .='	var $_condb; // Conexion a la base de datos  '.$sCR;
	$sClass .="$sCR";
	
	$sClass .="$sCR";
	$sClass .="	function $_Collection() { $sCR";
	$sClass .='		$this->_item_class = new '.$_Clase.'();'.$sCR;
	$sClass .='		$this->_entidad_base =  $this->_item_class->_entidad_base;'.$sCR;
	$sClass .='		$this->_condb = $_SESSION["ConDB"];'.$sCR;
	$sClass .='	}'.$sCR;

	$sClass .="$sCR";
	$sClass .="	function GetAll() { $sCR";
	$sClass .='		$sqlHelper = new gODataManager($this->_condb);'.$sCR;
	$sClass .='		$rs = $sqlHelper->spGetAll($this->_entidad_base);'.$sCR;
	$sClass .='		return $rs;'.$sCR;
	$sClass .='	}'.$sCR;
	
	$sClass .='} //end class '.$_Collection.$sCR;
	//=== Fin Class Collection ======================
	
	$sClass .="?>$sCR";
	return $sClass;
}


//-------------------------------------------------------
//GEN CLASE Extend de la Clase Base
//-------------------------------------------------------
function genClase($fileName,&$path,&$file) {
	global $path_XML;
	
	$_Clase='';
	$_Collection='';
	$_Tabla='';
	$_Path_Relativo='';
	$_Propiedades=array();
	
	//------------------------------------------------------------------------
	//---Roundtrip para no usar funciones XML incopatibles entre PHP4 y PHP5
	//------------------------------------------------------------------------
	//Leo la definicion XML de la Entidades	
	$fo= fopen("$path_XML/".$fileName,"r") or die ("No se encuentra el Archivo:"."$path_XML/".$fileName);
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
	$path_base = substr($path,1)."/".strtolower($_Clase)."_base.php";
	
	$file = strtolower($_Clase).".php";
	
	$auxProps = $xml['xml']['#']['properties'][0]['#']['property'];
	
	for($i = 0; $i < count($auxProps); $i++) {
		$property = $auxProps[$i];	
		
		$_Propiedades[$i]['NOMBRE'] = $property['#']['nombre'][0]['#'];
		$_Propiedades[$i]['CAMPO'] = strtoupper($property['#']['campo'][0]['#']);
		$_Propiedades[$i]['TIPO'] = strtoupper($property['#']['tipo'][0]['#']);
		$_Propiedades[$i]['NULO'] = strtoupper($property['#']['nulo'][0]['#']);
		$_Propiedades[$i]['KEY'] = strtoupper($property['#']['key'][0]['#']);		
	}

	//------------------------------------------------------------------------
	//---Fin Roundtrip
	//------------------------------------------------------------------------
	
	//Test
		//~ echo "<br>";
		//~ echo "Clase: $_Clase<br>";
		//~ echo "Tabla: $_Tabla<br>";
		//~ echo "Path_Relativo: $_Path_Relativo<br>";
		//~ echo "<br>";
		//~ var_dump($_Propiedades);

	//------------------------------------------------------------------------
	//---Clase Bob 'El Constructor' --- Si podemos!!!
	//------------------------------------------------------------------------
	$today = getdate();
	$sCR = "\n";
	$sComaSimple = "'";
	
    $sClass ="<?$sCR";
	$sClass .= "//---------------------------------------------------------------$sCR";
    $sClass .= "// Clase: $_Clase $sCR";
    $sClass .= "// $sCR";
    $sClass .= "// AUTOGENERADO {$today['year']}-{$today['mon']}-{$today['mday']} {$today['hours']}:{$today['minutes']}:{$today['seconds']} --- W3 ITSolutions --- $sCR";
    $sClass .= "// Autor: RM - 2007 $sCR";
    $sClass .= "//---------------------------------------------------------------$sCR";
	$sClass .="$sCR";
	$sClass .='require_once('.'"'.'$baseDir/lib/g_XMLfunctions.inc.php'.'"'.");$sCR";
	$sClass .='require_once('.'"'.'$baseDir'."$path_base".'"'.");$sCR";
	$sClass .="$sCR";

	//=== Class ========================
	$sClass .="class $_Clase extends $_Clase"."_base { $sCR";
	$sClass .="$sCR";
	$sClass .='	// variables internas'.$sCR;
	$sClass .="$sCR";
	$sClass .='	// Functiones para extender la Clase Base:  (Agregar aquí)'.$sCR;
	$sClass .="$sCR";
	$sClass .="$sCR";
	$sClass .="$sCR";
	$sClass .='} //end class '.$_Clase.$sCR;
	//=== Fin Class Base ========================

	$sClass .="$sCR";
	
	//=== Class Collection ======================
	$sClass .="class $_Collection extends $_Collection"."_base { $sCR";
	$sClass .="$sCR";
	$sClass .='	// variables internas'.$sCR;
	$sClass .="$sCR";
	$sClass .='	// Functiones para extender la Clase Base:  (Agregar aquí)'.$sCR;
	$sClass .="$sCR";
	$sClass .="$sCR";
	$sClass .="$sCR";
	$sClass .='} //end class '.$_Collection.$sCR;
	//=== Fin Class Collection ======================
	
	$sClass .="?>$sCR";
	return $sClass;
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



//-------------------------------------------------------
//GEN CLASE BASE
//-------------------------------------------------------
function getPathBase($fileName) {
}
?>
