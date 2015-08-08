<?
//---------------------------------------------------------------
// Clase Base: Novedad_base 
// 
// AUTOGENERADO 2007-11-14 14:22:9 --- W3 ITSolutions --- 
// Autor: RM - 2007 
//---------------------------------------------------------------

require_once("$baseDir/lib/g_XMLfunctions.inc.php");

class Novedad_base { 

	// variables internas
	var $_entidad_base;
	var $_prop;
	var $_condb; // Conexion a la base de datos  

	// Propiedades
	var $Id;
	var $Titulo;
	var $Seccion;
	var $Ancho;
	var $Texto;
	var $Activo;
	var $Foto;

	function Novedad_base($Id='') { 

		$this->_entidad_base = 'NOVEDADES'; 
		$this->_condb = $_SESSION["ConDB"];

		$this->_prop = array(
					'ID_NOVEDAD'=>array( 
						'VALUE'=>'', 
						'TIPO'=>'NUMBER', 
						'NULO'=>'N', 
						'KEY'=>'PK' 
					),
					'TITULO'=>array( 
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
					),
					'ANCHO'=>array( 
						'VALUE'=>'', 
						'TIPO'=>'VARCHAR2', 
						'NULO'=>'Y', 
						'KEY'=>'' 
					),
					'TEXTO'=>array( 
						'VALUE'=>'', 
						'TIPO'=>'VARCHAR2', 
						'NULO'=>'Y', 
						'KEY'=>'' 
					),
					'ACTIVO'=>array( 
						'VALUE'=>'', 
						'TIPO'=>'NUMBER', 
						'NULO'=>'Y', 
						'KEY'=>'' 
					),
					'FOTO'=>array( 
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

		$this->_prop['ID_NOVEDAD']['VALUE']=$Id;

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
				case 'ID_NOVEDAD':
					$this->Id=$value;
					break;
				case 'TITULO':
					$this->Titulo=$value;
					break;
				case 'SECCION':
					$this->Seccion=$value;
					break;
				case 'ANCHO':
					$this->Ancho=$value;
					break;
				case 'TEXTO':
					$this->Texto=$value;
					break;
				case 'ACTIVO':
					$this->Activo=$value;
					break;
				case 'FOTO':
					$this->Foto=$value;
					break;
			}
		}
		if (array_key_exists($key,$this->_prop)){
			$this->_prop[$key]["VALUE"] = $value;
		}
	} //end function _bindProps

	function _bindValues(){
		$this->_prop['ID_NOVEDAD']['VALUE'] = $this->Id;
		$this->_prop['TITULO']['VALUE'] = $this->Titulo;
		$this->_prop['SECCION']['VALUE'] = $this->Seccion;
		$this->_prop['ANCHO']['VALUE'] = $this->Ancho;
		$this->_prop['TEXTO']['VALUE'] = $this->Texto;
		$this->_prop['ACTIVO']['VALUE'] = $this->Activo;
		$this->_prop['FOTO']['VALUE'] = $this->Foto;
	} //end function _bindValues

} //end class Novedad_base

class Novedades_base { 

	// variables internas
	var $_item_class;
	var $_entidad_base;
	var $_prop;
	var $_condb; // Conexion a la base de datos  


	function Novedades_base() { 
		$this->_item_class = new Novedad_base();
		$this->_entidad_base =  $this->_item_class->_entidad_base;
		$this->_condb = $_SESSION["ConDB"];
	}

	function GetAll() { 
		$sqlHelper = new gODataManager($this->_condb);
		$rs = $sqlHelper->spGetAll($this->_entidad_base);
		return $rs;
	}
} //end class Novedades_base
?>
