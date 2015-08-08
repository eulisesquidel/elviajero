<?
//---------------------------------------------------------------
// Clase: Usuario 
// 
// AUTOGENERADO 2007-11-20 11:33:59 --- W3 ITSolutions --- 
// Autor: RM - 2007 
//---------------------------------------------------------------

require_once("$baseDir/lib/g_XMLfunctions.inc.php");
require_once("$baseDir/modules/usuarios/usuario_base.php");

class Usuario extends Usuario_base { 

	// variables internas

	// Functiones para extender la Clase Base:  (Agregar aquí)



} //end class Usuario

class Usuarios extends Usuarios_base { 

	// variables internas

	// Functiones para extender la Clase Base:  (Agregar aquí)
        function GETbyUsuario($Usuario) { 
        
                $_prop['USUARIO']['VALUE']=$Usuario;
                
                $sqlHelper = new gODataManager($this->_condb);
                $rs = $sqlHelper->spExecuteCursor($this->_entidad_base, $_prop,'GETbyNombre');
                return $rs;
        }


} //end class Usuarios
?>
