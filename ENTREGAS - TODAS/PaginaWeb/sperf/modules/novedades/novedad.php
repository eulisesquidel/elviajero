<?
//---------------------------------------------------------------
// Clase: Novedad 
// 
// AUTOGENERADO 2007-11-14 14:22:9 --- W3 ITSolutions --- 
// Autor: RM - 2007 
//---------------------------------------------------------------

require_once("$baseDir/lib/g_XMLfunctions.inc.php");
require_once("$baseDir/modules/novedades/novedad_base.php");

class Novedad extends Novedad_base { 

	// variables internas

	// Functiones para extender la Clase Base:  (Agregar aquí)



} //end class Novedad

class Novedades extends Novedades_base { 

	// variables internas

	// Functiones para extender la Clase Base:  (Agregar aquí)
    function GETActivos() { 
    
        $_prop['ACTIVO']['VALUE']=1;  
        $sqlHelper = new gODataManager($this->_condb);
        $rs = $sqlHelper->spExecuteCursor($this->_entidad_base, $_prop,'GETACTIVOS');
        return $rs;
    }


} //end class Novedades
?>
