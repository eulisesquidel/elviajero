<?
//---------------------------------------------------------------
// Clase: Menu1_item 
// 
// AUTOGENERADO 2007-11-15 10:12:25 --- W3 ITSolutions --- 
// Autor: RM - 2007 
//---------------------------------------------------------------

require_once("$baseDir/lib/g_XMLfunctions.inc.php");
require_once("$baseDir/modules/menu1_items/menu1_item_base.php");

class Menu1_item extends Menu1_item_base { 

	// variables internas

	// Functiones para extender la Clase Base:  (Agregar aquí)
        function DeleteAllByIdRaiz($Id) {   
                $_prop['ID_RAIZ']['VALUE']=$Id;  
                $sqlHelper = new gODataManager($this->_condb);
                $rs = $sqlHelper->spExecuteCursor($this->_entidad_base, $_prop,'DELETEALLBYIDRAIZ'); 
        }


} //end class Menu1_item

class Menu1_items extends Menu1_items_base { 

	// variables internas

	// Functiones para extender la Clase Base:  (Agregar aquí)
	
	//----------------------------------------------------------------
	// function GETbyIDRaiz
	// Trae todos los submenues del menu raiz asociado
	// RM - 15-Nov-2007 
	//----------------------------------------------------------------
	function GETbyIDRaiz($Id) { 
	
		$_prop['ID']['VALUE']=$Id;
		
		$sqlHelper = new gODataManager($this->_condb);
		$rs = $sqlHelper->spExecuteCursor($this->_entidad_base, $_prop,'GETbyIDRaiz');
		return $rs;
	}


} //end class Menu1_items
?>
