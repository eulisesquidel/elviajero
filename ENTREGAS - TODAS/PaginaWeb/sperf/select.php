<?php

// Cargo Includes Generales
include_once "./base.inc.php";
// Cargo Modulo Menu_SSA
require_once("$baseDir/modules/menuesssa/menussa.php");
// Cargo Modulo Menu1
require_once("$baseDir/modules/menues1/menu1.php");
// Cargo Modulo Menu1_Items
require_once("$baseDir/modules/menu1_items/menu1_item.php");
// Cargo Modulo Menu2
require_once("$baseDir/modules/menues2/menu2.php");
// Cargo Modulo Novedades
require_once("$baseDir/modules/novedades/novedad.php");

require_once("$baseDir/modules/mails/mail.php"); 


$tabla = $_GET['tabla'];
//*************************************************************************************************** 
// PARA EL MENU SSA
if ($tabla == "menu_ssa"){
	$menuesSSA = new MenuesSSA();
	$rs = $menuesSSA->GetAll();
	$row = $rs->_array;
	$contenido='';
	
	 foreach ($row as $key => $value) {
		$fields = $value;	 
		$contenido.=$fields['ID_MENU_SSA']."#".$fields['SECCION']."#".$fields['LINK']."¶";
	 }

}
//*************************************************************************************************** 
// PARA EL MENU 1
if ($tabla == "menu1"){
	$menues1 = new Menues1();
	$menu1_items = new Menu1_Items();
	
	$rs = $menues1->GetAll();
	$row = $rs->_array;
	$contenido='';

	 foreach ($row as $key => $value) {
		$fields = $value;	 
		$id_raiz = $fields['ID_MENU1'];
		$rs2 = $menu1_items->GETbyIDRaiz($id_raiz );
		$row2 = $rs2->_array;
		$subm = '';
		if(count($row2)>0) {
			foreach ($row2 as $key2 => $value2) {
				$fields2 = $value2;
				// Quick
				$concatenador = "&"; 
				/*
				$verifica = strstr($fields2['LINK'],$concatenador); 
				if($verifica == true){
					$concatenador = "&";
				} else {
					$concatenador = "?";
				} */                         
				$rnd =  $concatenador."x".rand(1000,9999)."=".rand(1000,9999);  
				// End Quick	 
				//$subm .=$fields2['NOMBRE']."*".str_replace("&","_xx_",$fields2['LINK']).$rnd."*"."¢";
				//Modificacion 06/04/2009
				$subm .=$fields2['NOMBRE']."*".str_replace("&","_xx_",$fields2['LINK'])."*"."¢";
			}
		}     
		// Quick
		$concatenador = "&"; 
		/*
		$verifica1 = strstr($fields['LINK'],$concatenador);
		$verifica2 = strstr($fields['LINK'],"?"); 
		if($verifica1 == true){
			$concatenador = "&";
		} else {
			$concatenador = "?";
		}                          
		$rnd =  $concatenador.rand(1000,9999)."=".rand();  
		// End Quick
		if(substr($fields['LINK'],-1,1)=="/"){$rnd="";}
		if ( (!strstr($fields['LINK'],"&")) and (!strstr($fields['LINK'],"?"))){$rnd="";}
		if(strlen($fields['LINK'])<1){$rnd="";}            */
		$rnd =  $concatenador.rand(1000,9999)."=".rand(1000,9999);
		$contenido.=$fields['ID_MENU1']."#".$fields['NOMBRE']."#".str_replace("&","_xx_",$fields['LINK'])."#".$subm."¶";
	 }
	  
}
//***************************************************************************************************
// PARA EL MENU 2
if ($tabla == "menu2"){
	$menues2 = new Menues2();
	$rs = $menues2->GetAll();
	$row = $rs->_array;
	$contenido='';

	 foreach ($row as $key => $value) {
		$fields = $value;
		// Quick
		$concatenador = "&"; 
		/*$verifica = strstr($fields['LINK'],$concatenador); 
		if($verifica == true){
			$concatenador = "&";
		} else {
			$concatenador = "?";
		} */                         
		$rnd =  $concatenador.rand(1000,9999)."=".rand(1000,9999);  
		// End Quick
		/*if(substr($fields['LINK'],-1,1) == "/"){$rnd="";}
		if ( (!strstr($fields['LINK'],"&")) and (!strstr($fields['LINK'],"?"))){$rnd="";}
		if(strlen($fields['LINK'])<1){$rnd="";} */
		$contenido.=$fields['ID_MENU2']."#".$fields['NOMBRE']."#".str_replace("&","_xx_",$fields['LINK']).$rnd."#".$fields['ICONO']."¶";
	 }
}
//*************************************************************************************************** 
// PARA LAS NOVEDADES
if ($tabla == "novedades"){
	$novedades = new Novedades();   
    $rs = $novedades->GETActivos();  
	//$rs = $novedades->GetAll();
	$row = $rs->_array;
	$contenido='';

	 foreach ($row as $key => $value) {
		$fields = $value;	 
		$contenido.=$fields['ID_NOVEDADES']."#".$fields['SECCION']."#".
				$fields['TITULO']."#".$fields['TEXTO']."#".
				$fields['FOTO']."#".$fields['ACTIVO']."#".
				$fields['ANCHO']."¶";
	 }

}
//*************************************************************************************************** 
// Para los mails
if ($tabla == "mails"){     
	$oMails = new Mails();
	$rs = $oMails->GetAll();
	$row = $rs->_array;
	if (count($row)>=1){
		foreach($row as $key => $value) {
			$fields = $value;
			$contenido.=$fields['ID_MAILS']."#".$fields['SECCION']."#".$fields['MAIL']."¶"; 
		}

	}
}

echo "&lista=".$contenido;
 
?>

