<?
//---------------------------------------------------------------
// Clase Base: Usuario_base 
// 
// AUTOGENERADO 2007-11-20 11:33:59 --- W3 ITSolutions --- 
// Autor: RM - 2007 
//---------------------------------------------------------------

require_once("$baseDir/lib/g_XMLfunctions.inc.php");

class Usuario_base { 

	// variables internas
	var $_entidad_base;
	var $_prop;
	var $_condb; // Conexion a la base de datos  

	// Propiedades
	var $Id;
	var $Nombre;
	var $Usuario;
	var $Apellido;

	function Usuario_base($Id='') { 

		$this->_entidad_base = 'USUARIOS'; 
		$this->_condb = $_SESSION["ConDB"];

		$this->_prop = array(
					'ID_USUARIO'=>array( 
						'VALUE'=>'', 
						'TIPO'=>'NUMBER', 
						'NULO'=>'N', 
						'KEY'=>'PK' 
					),
					'NOMBRE'=>array( 
						'VALUE'=>'', 
						'TIPO'=>'VARCHAR2', 
						'NULO'=>'Y', 
						'KEY'=>'' 
					),
					'USUARIO'=>array( 
						'VALUE'=>'', 
						'TIPO'=>'VARCHAR2', 
						'NULO'=>'N', 
						'KEY'=>'' 
					),
					'APELLIDO'=>array( 
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

		$this->_prop['ID_USUARIO']['VALUE']=$Id;

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
				case 'ID_USUARIO':
					$this->Id=$value;
					break;
				case 'NOMBRE':
					$this->Nombre=$value;
					break;
				case 'USUARIO':
					$this->Usuario=$value;
					break;
				case 'APELLIDO':
					$this->Apellido=$value;
					break;
			}
		}
		if (array_key_exists($key,$this->_prop)){
			$this->_prop[$key]["VALUE"] = $value;
		}
	} //end function _bindProps

	function _bindValues(){
		$this->_prop['ID_USUARIO']['VALUE'] = $this->Id;
		$this->_prop['NOMBRE']['VALUE'] = $this->Nombre;
		$this->_prop['USUARIO']['VALUE'] = $this->Usuario;
		$this->_prop['APELLIDO']['VALUE'] = $this->Apellido;
	} //end function _bindValues

} //end class Usuario_base

class Usuarios_base { 

	// variables internas
	var $_item_class;
	var $_entidad_base;
	var $_prop;
	var $_condb; // Conexion a la base de datos  


	function Usuarios_base() { 
		$this->_item_class = new Usuario_base();
		$this->_entidad_base =  $this->_item_class->_entidad_base;
		$this->_condb = $_SESSION["ConDB"];
	}

	function GetAll() { 
		$sqlHelper = new gODataManager($this->_condb);
		$rs = $sqlHelper->spGetAll($this->_entidad_base);
		return $rs;
	}
} //end class Usuarios_base
?>
