<?
	//=======================================================================================
	// Generacion de Modulos y Clases Base - Pagina 03 - XML Metada Generada
	// Fecha: 22/06/2004
	// Autor: RM
	//=======================================================================================
	
	$pagePrefix = "genCL";
	$pageNumber = 3;
	
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
    
    //var_dump($_POST);

	//Post de los nombres de Tablas
	$i=0;
	foreach ($_POST as $key=>$value){
		if (substr($key,0,5)=='ttab_')	{
			$entidades[substr($key,5)]['TABLA'] = $value;
			$i++;
		}
	}
	
	//Post de los nombres de Clases
	$i=0;
	foreach ($_POST as $key=>$value){
		if (substr($key,0,5)=='tcla_')	{
			$entidades[substr($key,5)]['CLASE'] = $value;
			$i++;
		}
	}
	

	//Post de los nombres de Colecciones
	$i=0;
	foreach ($_POST as $key=>$value){
		if (substr($key,0,5)=='tcol_')	{
			$entidades[substr($key,5)]['COLECCION'] = $value;
			$i++;
		}
	}

	//Post de los alias de los campos
	$i=0;
	foreach ($_POST as $key=>$value){
		if (substr($key,0,6)=='tprop_')	{
			$id = split("_",$key);
            $auxNroCampo = $id[count($id)-1];
            $auxEntidad = substr(substr($key,6),0,strlen($key)-strlen($auxNroCampo)-7);
            //echo "auxNroCampo=$auxNroCampo auxEntidad=$auxEntidad <br>";
			$entidades[$auxEntidad]['CAMPO'.$auxNroCampo ] = $value;
			$i++;
		}
	}
	
	$path_XML = "./modules/$m/$g_pathGenClassXML";

	//--- Generacion de Archivos XML
	//var_dump($entidades);	
	// generacion por cada entidad
	if (count($entidades)>0){
		foreach ($entidades as $key=>$value){
			$sXML = genXMLEntity( $key,$value,$_SESSION[$m]['table']);
			$path = strtolower("$path_XML/cg_ent_$key.xml");
			genFile( $sXML, $path);
			$archivos[ucfirst(strtolower($key))]=$path; 
		}
	}
	$smarty->assign('archivos',$archivos);

//-------------------------------------------------------
//genXMLEntity
//-------------------------------------------------------   
function genXMLEntity( $entidad, $alias, $tablas ){

    $CR="\n";
	$indent="  ";
	$sXML = "<xml>$CR";	
	$sXML .= $indent.addNodo('entidad',ucfirst(strtolower($entidad)));
	$i=0;
	foreach ($alias as $key=>$value){
		if (substr($key,0,5)=='CAMPO'){
			if ($i==0) {
				$sXML .="$indent<properties>$CR";
			}
			$sXML .="$indent$indent<property>$CR";
			$campo=$tablas[$entidad][$i]['COLUMN_NAME'];
			$tipo=$tablas[$entidad][$i]['DATA_TYPE'];
			$nulo=$tablas[$entidad][$i]['NULLABLE'];
			$pk =  $tablas[$entidad][$i]['KEY'];
			$sXML .= $indent.$indent.$indent.addNodo('nombre',ucfirst(strtolower($value)));		
			$sXML .= $indent.$indent.$indent.addNodo('campo',strtolower($campo));		
			$sXML .= $indent.$indent.$indent.addNodo('tipo',strtolower($tipo));		
			$sXML .= $indent.$indent.$indent.addNodo('nulo',strtolower($nulo));		
			$sXML .= $indent.$indent.$indent.addNodo('key',strtolower($pk));		
			$i++;
			$sXML .="$indent$indent</property>$CR";
		}else{
			$sXML .= $indent.addNodo(strtolower($key),ucfirst(strtolower($value)));			
			if (strtolower($key)=="coleccion"){
				$sXML .= $indent.addNodo('path_relativo',strtolower("./modules/$value"));
			}
		}
	}

	$sXML .=  "$indent</properties>$CR</xml>$CR";
	return($sXML);
}	



?>
