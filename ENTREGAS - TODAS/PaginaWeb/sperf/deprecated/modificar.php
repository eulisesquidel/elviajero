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

$tabla = $_POST['tabla'];
// Nombre de extensión para Windows
$extension = "image/pjpeg";

// === Seccion MySQL (a Eliminar)===============================================================================
// === Seccion Oracle (Nueva)===============================================================================
if ($tabla =="menu2"){
  	$directorio = "./admin/menu2/";



	$icon_file = $_FILES['ICONO'];
	if(count($icon_file)>0){
		UploadFile($directorio, $icon_file, $directorio);
	}


	$menu2 = new Menu2();
	$menu2->Id =  $_POST['ID_MENU2'];
	$menu2->Link = $_POST['LINK'];
	$menu2->Icono = $icon_file['name'];
	$menu2->Nombre = $_POST['NOMBRE'];
	
	$menu2->Persistir();

	header("Location: menu2.php");
}


function UploadFile($Target_dir, $fileArray, $directorio){

	$name = $fileArray['name'];
	$type = $fileArray['type'];
	$tmp_name = $fileArray['tmp_name'];
	$size = $fileArray['size'];
	$error = $fileArray['error'];

	if($error==0){
		if(strpos('|  image/jpeg |',$type)>0){
			 Resampling($tmp_name, $directorio, $name);
		}else{
			CustomError('El icono no corresponde a un formato de imagen aceptado (jpg,jpeg).','menu2.php');
		}
	}else{
		CustomError('Error en la subida del archivo.','menu2.php');
	}

}

function Resampling($tmp_name, $directorio, $name){
	
	// Indico el destino del directorio de la imagen
	$imagen_origen = ImageCreateFromJPEG($tmp_name);
	// Calculo el tamaño de la imagen original
	$tam_ancho = imagesx ($imagen_origen);
	$tam_alto = imagesy ($imagen_origen);

	//Calculo la medida que va a tener
	if ($tam_ancho>=$tam_alto){
		$ancho = 38;
		$alto = (38*$tam_alto)/$tam_ancho;
	}else{
		$ancho = (38*$tam_ancho)/$tam_alto;
		$alto = 38;
	}
	
	//Creo una imagen
	$imagen_destino = ImageCreateTrueColor ($ancho, $alto);
	//Resize
	imagecopyresized ($imagen_destino, $imagen_origen, 0,0,0,0, $ancho, $alto, $tam_ancho, $tam_alto);
	$nombre_destino = $directorio.$name;
	//Genero Copia Destino
	ImageJPEG ($imagen_destino, $nombre_destino, 100);
	//Borro imagen virtual
	ImageDestroy ($imagen_destino);
	
}

function CustomError($msg, $target){
	header("Location: error.php?msg=$msg&target=$target");
    exit;
}
?>