<?
//---------------------------------------------------------------
// Clase Base: Mail_base 
// 
// AUTOGENERADO 2007-11-14 16:23:2 --- W3 ITSolutions --- 
// Autor: RM - 2007 
//---------------------------------------------------------------

require_once("$baseDir/lib/g_XMLfunctions.inc.php");

class Mail_base { 

	// variables internas
	var $_entidad_base;
	var $_prop;
	var $_condb; // Conexion a la base de datos  

	// Propiedades
	var $Id;
	var $Mail;
	var $Seccion;

	function Mail_base($Id='') { 

		$this->_entidad_base = 'MAILS'; 
		$this->_condb = $_SESSION["ConDB"];

		$this->_prop = array(
					'ID_MAILS'=>array( 
						'VALUE'=>'', 
						'TIPO'=>'NUMBER', 
						'NULO'=>'N', 
						'KEY'=>'PK' 
					),
					'MAIL'=>array( 
						'VALUE'=>'', 
						'TIPO'=>'VARCHAR2', 
						'NULO'=>'Y', 
						'KEY'=>'' 
					),
					'SECCION'=>array( 
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

		$this->_prop['ID_MAILS']['VALUE']=$Id;

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
				case 'ID_MAILS':
					$this->Id=$value;
					break;
				case 'MAIL':
					$this->Mail=$value;
					break;
				case 'SECCION':
					$this->Seccion=$value;
					break;
			}
		}
		if (array_key_exists($key,$this->_prop)){
			$this->_prop[$key]["VALUE"] = $value;
		}
	} //end function _bindProps

	function _bindValues(){
		$this->_prop['ID_MAILS']['VALUE'] = $this->Id;
		$this->_prop['MAIL']['VALUE'] = $this->Mail;
		$this->_prop['SECCION']['VALUE'] = $this->Seccion;
	} //end function _bindValues

} //end class Mail_base

class Mails_base { 

	// variables internas
	var $_item_class;
	var $_entidad_base;
	var $_prop;
	var $_condb; // Conexion a la base de datos  


	function Mails_base() { 
		$this->_item_class = new Mail_base();
		$this->_entidad_base =  $this->_item_class->_entidad_base;
		$this->_condb = $_SESSION["ConDB"];
	}

	function GetAll() { 
		$sqlHelper = new gODataManager($this->_condb);
		$rs = $sqlHelper->spGetAll($this->_entidad_base);
		return $rs;
	}
} //end class Mails_base
?>
