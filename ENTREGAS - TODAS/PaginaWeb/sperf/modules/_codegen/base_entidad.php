<?
	//=======================================================================================
	// Clase Base Ejemplo para una Entidad
	// Fecha: 28/06/2004
	// Autor: RM
	//=======================================================================================

require_once("$baseDir/lib/g_XMLfunctions.inc.php");

	
class Persona { 

	var $_prop;

	function Persona($id=0){
		if ($id==0){
			$this->$_prop = array('Id'=>0,'Nombre'=>'','Apellido'=>'','Fecha_Nacimiento'=>'');
		}
		this=>getByID($id);
	}

	function Nombre ($value){		
		$_prop['Nombre'] = $value;
		return $_prop['Nombre'];
	}

	function Apellido ($value){
		$_prop['Apellido'] = $value;
		return $_prop['Apellido'];
	}

	function Fecha_Nacimiento ($value){
		$_prop['Fecha_Nacimiento'] = $value;
		return $_prop['Fecha_Nacimiento'];
	}

	function getByID($id){
		//Buscar en las tablas relacionadas
	}

	function Persistir(){
		//Grabar en las tablas relacionadas
	    //Debe detectar Si existe => Update()
		//              No existe => Insert()
	}

	function Eliminar($id){
		//Elimina en las tablas relacionadas => Delete()
	}

	function setFromXML(){
		//Setear todas las propiedades desde un XML
	}

	function setFromArray(){
		//Setear todas las propiedades desde un Array
	}

	function toXML(){
		//Generar XML a partir de $_prop
	}

	function toArray(){
		//Generar Array a partir de $_prop
	}
}

class Personas { 

	var $_prop;

	function Personas(){
	}

	function getBySearch($condition){
	}

	function getItem($id){
	}

	function getCurrent($id){
	}

	function getNext($id){
	}

}
























?>