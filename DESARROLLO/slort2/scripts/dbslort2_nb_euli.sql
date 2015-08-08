# SQL Manager 2005 Lite for MySQL 3.7.7.1
# ---------------------------------------
# Host     : localhost
# Port     : 3306
# Database : dbslort2


SET FOREIGN_KEY_CHECKS=0;

DROP DATABASE IF EXISTS `dbslort2`;

CREATE DATABASE `dbslort2`
    CHARACTER SET 'latin1'
    COLLATE 'latin1_swedish_ci';

USE `dbslort2`;

#
# Structure for the `calculoubicacion` table : 
#

DROP TABLE IF EXISTS `calculoubicacion`;

CREATE TABLE `calculoubicacion` (
  `id_CalculoDeUbicacion` int(11) NOT NULL,
  `cod_unidad` int(11) default NULL,
  PRIMARY KEY  (`id_CalculoDeUbicacion`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `cliente` table : 
#

DROP TABLE IF EXISTS `cliente`;

CREATE TABLE `cliente` (
  `cod_cliente` int(11) NOT NULL auto_increment,
  `tipo_cliente` varchar(50) default NULL,
  `nombre` varchar(50) default NULL,
  `apellido` varchar(50) default NULL,
  `razonsocial` varchar(100) default NULL,
  `domicilio` varchar(30) default NULL,
  `cod_postal` varchar(8) default NULL,
  `localidad` varchar(30) default NULL,
  `telefono` varchar(30) default NULL,
  `cargo` varchar(30) default NULL,
  `email` varchar(50) default NULL,
  `fecha_alta` datetime default NULL,
  `fecha_baja` datetime default NULL,
  `tipo_docu` varchar(4) default NULL,
  `num_doc` varchar(20) default NULL,
  `estado` varchar(3) default NULL,
  `fecha_modif` datetime default NULL,
  `fleliminado` tinyint(1) default NULL,
  PRIMARY KEY  (`cod_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

#
# Data for the `cliente` table  (LIMIT 0,500)
#

INSERT INTO `cliente` (`cod_cliente`, `tipo_cliente`, `nombre`, `apellido`, `razonsocial`, `domicilio`, `cod_postal`, `localidad`, `telefono`, `cargo`, `email`, `fecha_alta`, `fecha_baja`, `tipo_docu`, `num_doc`, `estado`, `fecha_modif`, `fleliminado`) VALUES 
  (1,'1','Eulises','Quidel','','','','','','','',NULL,NULL,'','1','','2010-07-24 18:29:46',NULL),
  (3,'1','Nombre','Apellido','','','','','','','',NULL,NULL,'','23445','','2010-07-24 18:27:45',NULL),
  (4,'1','ruben','ferreyra','','','','','','','','2010-07-31 18:27:49',NULL,'','29668685','','2010-07-31 18:27:49',NULL);

COMMIT;

#
# Structure for the `conexion` table : 
#

DROP TABLE IF EXISTS `conexion`;

CREATE TABLE `conexion` (
  `id_conexion` int(11) NOT NULL,
  `ambiente` char(15) default NULL,
  `nombre` varchar(50) default NULL,
  `driver` varchar(60) default NULL,
  `url` varchar(200) default NULL,
  `usuario` varchar(20) default NULL,
  `password` varchar(20) default NULL,
  PRIMARY KEY  (`id_conexion`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `flota` table : 
#

DROP TABLE IF EXISTS `flota`;

CREATE TABLE `flota` (
  `cod_unidad` int(11) NOT NULL auto_increment,
  `activo` tinyint(1) default NULL,
  `userYahoo` varchar(20) default NULL,
  `passwYahoo` varchar(20) default NULL,
  `nombre` varchar(50) default NULL,
  `apellido` varchar(50) default NULL,
  `domicilio` varchar(30) default NULL,
  `cod_postal` varchar(8) default NULL,
  `localidad` varchar(30) default NULL,
  `telefono` varchar(30) default NULL,
  `cargo` varchar(30) default NULL,
  `email` varchar(60) default NULL,
  `fecha_alta` datetime default NULL,
  `fecha_baja` datetime default NULL,
  `CUIT` varchar(20) default NULL,
  `licencia` varchar(3) default NULL,
  `fecha_modif` datetime default NULL,
  `fleliminado` tinyint(1) default NULL,
  `flSimulada` bit(1) default NULL,
  `consumerKeyYahoo` varchar(20) default NULL,
  `consumerSecretYahoo` varchar(40) default NULL,
  PRIMARY KEY  (`cod_unidad`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;

#
# Data for the `flota` table  (LIMIT 0,500)
#

INSERT INTO `flota` (`cod_unidad`, `activo`, `userYahoo`, `passwYahoo`, `nombre`, `apellido`, `domicilio`, `cod_postal`, `localidad`, `telefono`, `cargo`, `email`, `fecha_alta`, `fecha_baja`, `CUIT`, `licencia`, `fecha_modif`, `fleliminado`, `flSimulada`, `consumerKeyYahoo`, `consumerSecretYahoo`) VALUES 
  (1,0,'f','f','f','f','','','','','','',NULL,NULL,'','123','2010-07-31 16:39:02',NULL,NULL,NULL,NULL),
  (2,1,'Usuario ','Password ','Nombre','Apellido ','Domicilio','Código ','Localidad ','Teléfono','Cargo','Email',NULL,NULL,'Cuit ','123','2010-07-31 16:39:07',NULL,NULL,NULL,NULL),
  (3,1,'ferreyraru','udemmudemm','Ruben','Ferreyra','','','','','','','2010-07-31 18:02:05',NULL,'','125','2010-07-31 18:02:05',NULL,NULL,NULL,NULL);

COMMIT;

#
# Structure for the `historicoubicaciondetalle` table : 
#

DROP TABLE IF EXISTS `historicoubicaciondetalle`;

CREATE TABLE `historicoubicaciondetalle` (
  `id_CalculoDeUbicacion` int(11) NOT NULL,
  `cod_unidad` int(11) NOT NULL,
  `fecha` date default NULL,
  `hora` time default NULL,
  `GPSactivo` binary(1) default NULL,
  `ranking` int(11) default NULL,
  `observaciones` varchar(50) default NULL,
  `distanciaObjetivo` int(11) default NULL,
  `tiempoObjetivo` time default NULL,
  `motivoNoAsignado` varchar(50) default NULL,
  PRIMARY KEY  (`id_CalculoDeUbicacion`,`cod_unidad`),
  KEY `cod_unidad` (`cod_unidad`),
  KEY `id_CalculoDeUbicacion` (`id_CalculoDeUbicacion`),
  CONSTRAINT `historicoubicaciondetalle_fk` FOREIGN KEY (`cod_unidad`) REFERENCES `flota` (`cod_unidad`),
  CONSTRAINT `historicoubicaciondetalle_fk1` FOREIGN KEY (`id_CalculoDeUbicacion`) REFERENCES `calculoubicacion` (`id_CalculoDeUbicacion`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `hotel` table : 
#

DROP TABLE IF EXISTS `hotel`;

CREATE TABLE `hotel` (
  `id_hotel` int(11) NOT NULL auto_increment,
  `nombre` varchar(100) default NULL,
  PRIMARY KEY  (`id_hotel`),
  KEY `nombre` (`nombre`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;

#
# Data for the `hotel` table  (LIMIT 0,500)
#

INSERT INTO `hotel` (`id_hotel`, `nombre`) VALUES 
  (5,'5'),
  (4,'dadd'),
  (3,'hotel'),
  (2,'jañlkd'),
  (1,'sdsd');

COMMIT;

#
# Structure for the `opcionmenu` table : 
#

DROP TABLE IF EXISTS `opcionmenu`;

CREATE TABLE `opcionmenu` (
  `id_opcionmenu` int(11) NOT NULL,
  `descripcion_corta` varchar(15) NOT NULL,
  `descripcion_largo` varchar(40) NOT NULL,
  `link` varchar(100) default NULL,
  PRIMARY KEY  (`id_opcionmenu`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Data for the `opcionmenu` table  (LIMIT 0,500)
#

INSERT INTO `opcionmenu` (`id_opcionmenu`, `descripcion_corta`, `descripcion_largo`, `link`) VALUES 
  (1,'admusua','Adm de Usuarios','usuario.do?reqCode=findData'),
  (2,'cambiop','Cambiar Clave','usuario.do?reqCode=editCambiarPassword'),
  (3,'perfil','Adm de Perfil','perfil.do?reqCode=findData'),
  (4,'flota','Adm de Flota','flota.do?reqCode=findData'),
  (5,'cliente','Adm de Cliente','cliente.do?reqCode=findData'),
  (6,'reserva','Adm de Reserva','reserva.do?reqCode=findData'),
  (7,'hotel','Adm de Hotel','hotel.do?reqCode=findData');

COMMIT;

#
# Structure for the `opcionmenu_perfil` table : 
#

DROP TABLE IF EXISTS `opcionmenu_perfil`;

CREATE TABLE `opcionmenu_perfil` (
  `id_opcionmenu_perfil` int(11) NOT NULL auto_increment,
  `id_opcionmenu` int(11) NOT NULL,
  `id_perfil` int(11) NOT NULL,
  `orden` double(15,3) default NULL,
  PRIMARY KEY  (`id_opcionmenu_perfil`),
  KEY `id_opcionmenu` (`id_opcionmenu`),
  KEY `id_perfil` (`id_perfil`)
) ENGINE=InnoDB AUTO_INCREMENT=151 DEFAULT CHARSET=latin1;

#
# Data for the `opcionmenu_perfil` table  (LIMIT 0,500)
#

INSERT INTO `opcionmenu_perfil` (`id_opcionmenu_perfil`, `id_opcionmenu`, `id_perfil`, `orden`) VALUES 
  (118,2,1,1),
  (119,5,1,5),
  (120,1,1,0),
  (121,6,1,6),
  (122,3,1,2),
  (123,4,1,4),
  (124,4,1,3),
  (125,7,1,7),
  (146,7,2,0),
  (147,5,2,0),
  (148,2,2,0),
  (149,6,2,0),
  (150,4,2,0);

COMMIT;

#
# Structure for the `parametro` table : 
#

DROP TABLE IF EXISTS `parametro`;

CREATE TABLE `parametro` (
  `id_parametro` int(11) NOT NULL,
  `clave` varchar(50) default NULL,
  `valor` varchar(200) default NULL,
  PRIMARY KEY  (`id_parametro`),
  KEY `clave` (`clave`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `perfil` table : 
#

DROP TABLE IF EXISTS `perfil`;

CREATE TABLE `perfil` (
  `id_perfil` int(11) NOT NULL auto_increment,
  `descripcion_corta` varchar(15) NOT NULL,
  `descripcion_larga` varchar(40) NOT NULL,
  `opcion_defecto` int(11) default NULL,
  PRIMARY KEY  (`id_perfil`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

#
# Data for the `perfil` table  (LIMIT 0,500)
#

INSERT INTO `perfil` (`id_perfil`, `descripcion_corta`, `descripcion_larga`, `opcion_defecto`) VALUES 
  (1,'Administradores','Administradores del sistema',1),
  (2,'Adm. Reservas','Adm. Reservas',6);

COMMIT;

#
# Structure for the `reserva` table : 
#

DROP TABLE IF EXISTS `reserva`;

CREATE TABLE `reserva` (
  `Id_reserva` int(11) NOT NULL auto_increment,
  `fecha` date default NULL,
  `hora` time default NULL,
  `estado` varchar(30) default NULL,
  `cod_cliente` int(11) default NULL,
  `cod_unidad` int(11) default NULL,
  `id_usuario` int(11) default NULL,
  `observaciones` varchar(50) default NULL,
  `direccion` varchar(50) default NULL,
  `telefono` varchar(12) default NULL,
  `entreCalles` varchar(50) default NULL,
  `localidad` varchar(50) default NULL,
  `latitud` double(15,3) default NULL,
  `longitud` double(15,3) default NULL,
  `Id_hotel` int(11) default NULL,
  `id_calculoDeUbicacion` int(11) default NULL,
  PRIMARY KEY  (`Id_reserva`),
  KEY `id_calculoDeUbicacion` (`id_calculoDeUbicacion`),
  KEY `cod_unidad` (`cod_unidad`),
  KEY `cod_cliente` (`cod_cliente`),
  KEY `Id_hotel` (`Id_hotel`),
  CONSTRAINT `reserva_fk` FOREIGN KEY (`id_calculoDeUbicacion`) REFERENCES `calculoubicacion` (`id_CalculoDeUbicacion`),
  CONSTRAINT `reserva_fk1` FOREIGN KEY (`cod_unidad`) REFERENCES `flota` (`cod_unidad`),
  CONSTRAINT `reserva_fk2` FOREIGN KEY (`cod_cliente`) REFERENCES `cliente` (`cod_cliente`),
  CONSTRAINT `reserva_fk3` FOREIGN KEY (`Id_hotel`) REFERENCES `hotel` (`id_hotel`)
) ENGINE=InnoDB AUTO_INCREMENT=24 DEFAULT CHARSET=latin1;

#
# Data for the `reserva` table  (LIMIT 0,500)
#

INSERT INTO `reserva` (`Id_reserva`, `fecha`, `hora`, `estado`, `cod_cliente`, `cod_unidad`, `id_usuario`, `observaciones`, `direccion`, `telefono`, `entreCalles`, `localidad`, `latitud`, `longitud`, `Id_hotel`, `id_calculoDeUbicacion`) VALUES 
  (1,'2010-09-10',NULL,'',1,1,0,'','','','','',0,0,NULL,NULL),
  (2,NULL,NULL,'',4,1,0,'','','','','',0,0,NULL,NULL),
  (4,NULL,NULL,'',1,2,0,'','','','','',0,0,4,NULL),
  (14,NULL,NULL,'En proceso',4,3,1,'','','','','',0,0,3,NULL),
  (17,NULL,NULL,'En proceso',3,NULL,1,'','','','','',0,0,NULL,NULL),
  (18,NULL,NULL,'En proceso',3,NULL,1,'','','','','',0,0,NULL,NULL),
  (19,NULL,NULL,'En proceso',3,NULL,1,'','','','','',0,0,NULL,NULL),
  (20,NULL,NULL,'En proceso',4,NULL,1,'','','','','',0,0,NULL,NULL),
  (22,NULL,NULL,'En proceso',4,NULL,1,'','','','','',0,0,NULL,NULL),
  (23,NULL,NULL,'En proceso',4,NULL,1,'','','','','',0,0,NULL,NULL);

COMMIT;

#
# Structure for the `ubicacionreal` table : 
#

DROP TABLE IF EXISTS `ubicacionreal`;

CREATE TABLE `ubicacionreal` (
  `cod_unidad` int(11) NOT NULL,
  `fecha` date default NULL,
  `hora` time default NULL,
  `GPSactivo` binary(1) default NULL,
  `latitud` double(15,3) default NULL,
  `longitud` double(15,3) default NULL,
  `simulada` binary(1) default NULL,
  `id_calculoDeUbicacion int` int(11) default NULL,
  PRIMARY KEY  (`cod_unidad`),
  KEY `id_calculoDeUbicacion int` (`id_calculoDeUbicacion int`),
  CONSTRAINT `ubicacionreal_fk` FOREIGN KEY (`cod_unidad`) REFERENCES `flota` (`cod_unidad`),
  CONSTRAINT `ubicacionreal_fk1` FOREIGN KEY (`id_calculoDeUbicacion int`) REFERENCES `calculoubicacion` (`id_CalculoDeUbicacion`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

#
# Structure for the `usuario` table : 
#

DROP TABLE IF EXISTS `usuario`;

CREATE TABLE `usuario` (
  `id_usuario` int(11) NOT NULL auto_increment,
  `usuario` varchar(15) NOT NULL,
  `pwd` varchar(15) NOT NULL,
  `nombre` varchar(40) NOT NULL,
  `apellido` varchar(40) NOT NULL,
  `email` varchar(50) default NULL,
  `telefono` varchar(20) default NULL,
  `id_perfil` int(11) default NULL,
  PRIMARY KEY  (`id_usuario`),
  KEY `id_perfil` (`id_perfil`),
  CONSTRAINT `usuario_fk` FOREIGN KEY (`id_perfil`) REFERENCES `perfil` (`id_perfil`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=latin1;

#
# Data for the `usuario` table  (LIMIT 0,500)
#

INSERT INTO `usuario` (`id_usuario`, `usuario`, `pwd`, `nombre`, `apellido`, `email`, `telefono`, `id_perfil`) VALUES 
  (1,'Admin','prueba','nombre1','dadd','email11','telefono1',1),
  (2,'ruben','1234','rubena','apelldo','qwqwqw','dqwqwe',1),
  (3,'asasas','1234','asas','asa','asas','asasas',1),
  (4,'asas','1234','asa','asas','asasas','asasa',1),
  (7,'oper_reserva','prueba','oper_reserva','oper_reserva','oper_reserva','oper_reserva',2),
  (8,'usua','1234','','daaa','','',1);

COMMIT;

