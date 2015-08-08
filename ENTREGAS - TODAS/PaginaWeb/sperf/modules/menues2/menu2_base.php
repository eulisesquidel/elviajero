<?
//---------------------------------------------------------------
// Clase Base: Menu2_base 
// 
// AUTOGENERADO 2007-11-14 10:9:6 --- W3 ITSolutions --- 
// Autor: RM - 2007 
//---------------------------------------------------------------

require_once("$baseDir/lib/g_XMLfunctions.inc.php");

class Menu2_base { 

	// variables internas
	var $_entidad_base;
	var $_prop;
	var $_condb; // Conexion a la base de datos  

	// Propiedades
	var $Id;
	var $Link;
	var $Icono;
	var $Nombre;

	function Menu2_base($Id='') { 

		$this->_entidad_base = 'MENU2'; 
		$this->_condb = $_SESSION["ConDB"];

		$this->_prop = array(
					'ID_MENU2'=>array( 
						'VALUE'=>'', 
						'TIPO'=>'NUMBER', 
						'NULO'=>'N', 
						'KEY'=>'PK' 
					),
					'LINK'=>array( 
						'VALUE'=>'', 
						'TIPO'=>'VARCHAR2', 
						'NULO'=>'Y', 
						'KEY'=>'' 
					),
					'ICONO'=>array( 
						'VALUE'=>'', 
						'TIPO'=>'VARCHAR2', 
						'NULO'=>'Y', 
						'KEY'=>'' 
					),
					'NOMBRE'=>array( 
						'VALUE'=>'', 
						'TIPO'=>'VARCHAR2', 
						'NULO'=>'Y', 
						'KEY'=>'' 
					)
		                    );
		if( $Id!='' ) { 
			$this->getByID($Id);
		} //if
	} //end function 

	function getByID($Id) {

		$this->_prop['ID_MENU2']['VALUE']=$Id;

		$sqlHelper = new gODataManager($this->_condb);
		$rs = $sqlHelper->spGetById($this->_entidad_base,$this->_prop);
		$this->_bindProps($rs->_array[0]);
	} //end function getByID

	function Persistir(){ 
		$this->_bindValues();
		$sqlHelper = new gODataManager($this->_condb);
		$rc= $sqlHelper->spPersistir($this->_entidad_base,$this->_prop);
		return $rc;
	} //end function Persistir

	function Eliminar(){ 
		$this->_bindValues();
		$sqlHelper = new gODataManager($this->_condb);
		$sqlHelper->spDelete($this->_entidad_base,$this->_prop);
	} //end function Eliminar

	function _bindProps($arrayProps){
		foreach ($arrayProps as $key => $value){
			switch($key){
				case 'ID_MENU2':
					$this->Id=$value;
					break;
				case 'LINK':
					$this->Link=$value;
					break;
				case 'ICONO':
					$this->Icono=$value;
					break;
				case 'NOMBRE':
					$this->Nombre=$value;
					break;
			}
		}
		if (array_key_exists($key,$this->_prop)){
			$this->_prop[$key]["VALUE"] = $value;
		}
	} //end function _bindProps

	function _bindValues(){
		$this->_prop['ID_MENU2']['VALUE'] = $this->Id;
		$this->_prop['LINK']['VALUE'] = $this->Link;
		$this->_prop['ICONO']['VALUE'] = $this->Icono;
		$this->_prop['NOMBRE']['VALUE'] = $this->Nombre;
	} //end function _bindValues

} //end class Menu2_base

class Menues2_base { 

	// variables internas
	var $_item_class;
	var $_entidad_base;
	var $_prop;
	var $_condb; // Conexion a la base de datos  


	function Menues2_base() { 
		$this->_item_class = new Menu2_base();
		$this->_entidad_base =  $this->_item_class->_entidad_base;
		$this->_condb = $_SESSION["ConDB"];
	}

	function GetAll() { 
		$sqlHelper = new gODataManager($this->_condb);
		$rs = $sqlHelper->spGetAll($this->_entidad_base);
		return $rs;
	}
} //end class Menues2_base
?>
