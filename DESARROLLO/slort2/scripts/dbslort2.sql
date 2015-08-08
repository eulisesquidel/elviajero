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
  `id_CalculoDeUbicacion` int(11) NOT NULL auto_increment,
  `cod_unidad` int(11) default NULL,
  `Id_reserva` int(11) default NULL,
  PRIMARY KEY  (`id_CalculoDeUbicacion`)
) ENGINE=InnoDB AUTO_INCREMENT=56 DEFAULT CHARSET=latin1;

#
# Data for the `calculoubicacion` table  (LIMIT 0,500)
#

INSERT INTO `calculoubicacion` (`id_CalculoDeUbicacion`, `cod_unidad`, `Id_reserva`) VALUES 
  (1,NULL,NULL),
  (2,NULL,NULL),
  (3,4,1),
  (4,NULL,NULL),
  (5,NULL,NULL),
  (6,2,2),
  (7,NULL,NULL),
  (8,NULL,NULL),
  (9,NULL,NULL),
  (10,2,4),
  (11,NULL,NULL),
  (12,NULL,NULL),
  (13,NULL,NULL),
  (14,NULL,NULL),
  (15,NULL,NULL),
  (16,NULL,NULL),
  (17,NULL,NULL),
  (18,NULL,NULL),
  (19,NULL,NULL),
  (20,NULL,NULL),
  (21,NULL,NULL),
  (22,NULL,NULL),
  (23,3,14),
  (24,NULL,NULL),
  (25,NULL,NULL),
  (26,NULL,NULL),
  (27,5,17),
  (28,NULL,NULL),
  (29,NULL,NULL),
  (30,NULL,NULL),
  (31,1,20),
  (32,NULL,NULL),
  (33,NULL,NULL),
  (34,NULL,NULL),
  (36,NULL,NULL),
  (37,5,23),
  (38,NULL,NULL),
  (39,NULL,NULL),
  (40,NULL,NULL),
  (41,3,22),
  (42,NULL,NULL),
  (43,3,22),
  (44,NULL,NULL),
  (45,3,25),
  (46,NULL,NULL),
  (47,3,26),
  (48,NULL,NULL),
  (49,3,26),
  (50,NULL,NULL),
  (51,3,25),
  (52,NULL,NULL),
  (53,3,26),
  (54,NULL,NULL),
  (55,1,26);

COMMIT;

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
  `fleliminado` tinyint(1) default '0',
  PRIMARY KEY  (`cod_cliente`)
) ENGINE=InnoDB AUTO_INCREMENT=73 DEFAULT CHARSET=latin1;

#
# Data for the `cliente` table  (LIMIT 0,500)
#

INSERT INTO `cliente` (`cod_cliente`, `tipo_cliente`, `nombre`, `apellido`, `razonsocial`, `domicilio`, `cod_postal`, `localidad`, `telefono`, `cargo`, `email`, `fecha_alta`, `fecha_baja`, `tipo_docu`, `num_doc`, `estado`, `fecha_modif`, `fleliminado`) VALUES 
  (10,'Particular','Ruben','Ferreira','','Almafuerte 278','','Lomas de Zamora','3533-3971','','','2010-11-13 19:32:46',NULL,'DNI','23.456.674',NULL,'2010-12-18 19:21:43',0),
  (71,'Particular','Agostina','Frangella','','sarandi 853','','Buenos Aires','49420401','','','2010-12-16 21:46:54',NULL,'DNI','55.555.555',NULL,'2010-12-18 19:22:21',0),
  (72,'Particular','Romina','Giliberti','','marcelo t alvear 34','','capital federal','3434-9897','','','2010-12-18 19:33:20',NULL,'DNI','24.563.431',NULL,'2010-12-20 17:55:32',0);

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
  `tokenIpoki` char(20) default NULL,
  PRIMARY KEY  (`cod_unidad`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

#
# Data for the `flota` table  (LIMIT 0,500)
#

INSERT INTO `flota` (`cod_unidad`, `activo`, `userYahoo`, `passwYahoo`, `nombre`, `apellido`, `domicilio`, `cod_postal`, `localidad`, `telefono`, `cargo`, `email`, `fecha_alta`, `fecha_baja`, `CUIT`, `licencia`, `fecha_modif`, `fleliminado`, `flSimulada`, `consumerKeyYahoo`, `consumerSecretYahoo`, `tokenIpoki`) VALUES 
  (1,1,'','','Simulado','Simulado1','','','','','','','2010-11-13 14:41:11',NULL,'','123','2010-12-20 20:06:37',NULL,True,'','',NULL),
  (2,0,'Usuario ','Password ','taxiudemm3 - Federico','Giliberti','Domicilio','Código ','Localidad ','Teléfono','Cargo','Email','2010-11-13 11:15:45',NULL,'Cuit ','123','2010-12-20 20:07:13',NULL,False,'','','FPMbrVsEkladPOIRxufK'),
  (3,1,'ferreyraru','udemmudemm','Ruben','Ferreyra','','','','','','','2010-07-31 18:02:05',NULL,'','125','2010-12-20 20:24:30',NULL,True,'VVcIsipjoqND','YvLOhwqZc2jzsjibMMMtDeic6diaKVaX',NULL),
  (4,1,'taxiudemm','fireeagle','taxiudemm - Romina','Giliberti','','','','','','','2010-11-13 17:45:30',NULL,'','222','2010-12-20 21:05:19',NULL,False,'kfIZEcPyvN6H','09malTaAEBVdzaoWDQqCZ4QPWYtbppUd','lFtsYiRzASjXUkHNQQIU'),
  (5,1,'taxiudemm1','udemmudemm','taxiudemm 1 - Miguel','Daufi','','','','','','','2010-11-13 20:42:32',NULL,'','666','2010-12-20 20:25:22',NULL,False,'dGohW5z0dfvL','vp2i8U2GT2S76LRdojp6t12Wcd6wIYUs','ZCnBzWbOVlJxLrgAkaYs'),
  (6,1,'taxiudemm2','udemmudemm','taxiudemm 2 - Agostina','Frangella','','','','','','','2010-11-13 19:45:32',NULL,'','853','2010-12-20 17:41:08',NULL,False,'f4wbVqn4Ootx','DIJC16qpdASIwFlKRzpuetjXVfQLSySJ','lcBllEtxHhJlHWiqqXtz');

COMMIT;

#
# Structure for the `historicoubicaciondetalle` table : 
#

DROP TABLE IF EXISTS `historicoubicaciondetalle`;

CREATE TABLE `historicoubicaciondetalle` (
  `id` int(11) NOT NULL auto_increment,
  `id_CalculoDeUbicacion` int(11) NOT NULL,
  `cod_unidad` int(11) NOT NULL,
  `fecha` date default NULL,
  `hora` time default NULL,
  `GPSactivo` binary(1) default NULL,
  `ranking` int(11) default NULL,
  `observaciones` varchar(50) default NULL,
  `distanciaObjetivo` float(9,3) default NULL,
  `tiempoObjetivo` varchar(20) default NULL,
  `motivoNoAsignado` varchar(50) default NULL,
  PRIMARY KEY  (`id`),
  KEY `cod_unidad` (`cod_unidad`),
  KEY `id_CalculoDeUbicacion` (`id_CalculoDeUbicacion`),
  KEY `fecha` (`fecha`),
  CONSTRAINT `historicoubicaciondetalle_fk` FOREIGN KEY (`cod_unidad`) REFERENCES `flota` (`cod_unidad`),
  CONSTRAINT `historicoubicaciondetalle_fk1` FOREIGN KEY (`id_CalculoDeUbicacion`) REFERENCES `calculoubicacion` (`id_CalculoDeUbicacion`)
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=latin1;

#
# Data for the `historicoubicaciondetalle` table  (LIMIT 0,500)
#

INSERT INTO `historicoubicaciondetalle` (`id`, `id_CalculoDeUbicacion`, `cod_unidad`, `fecha`, `hora`, `GPSactivo`, `ranking`, `observaciones`, `distanciaObjetivo`, `tiempoObjetivo`, `motivoNoAsignado`) VALUES 
  (1,3,4,'2010-12-18','20:35:00','1',0,NULL,25.4,'40 min',''),
  (2,3,5,'2010-12-18','20:35:00','1',1,NULL,25.4,'40 min',''),
  (3,3,6,'2010-12-18','20:35:00','1',2,NULL,25.4,'40 min',''),
  (4,6,2,'2010-12-19','21:14:00','1',0,NULL,10.9,'22 min',''),
  (5,10,2,'2010-12-19','23:22:00','1',0,NULL,16.2,'20 min','dfdfd'),
  (6,10,4,'2010-12-19','23:22:00','1',1,NULL,25.7,'40 min',''),
  (7,23,3,'2010-12-20','21:27:00','1',0,NULL,3.8,'11 min',''),
  (8,23,1,'2010-12-20','21:27:00','1',1,NULL,6.1,'17 min',''),
  (9,23,5,'2010-12-20','21:27:00','1',2,NULL,32.5,'34 min',''),
  (10,23,6,'2010-12-20','21:27:00','1',3,NULL,32.5,'34 min',''),
  (11,27,5,'2010-12-20','21:29:00','1',0,NULL,6.5,'14 min',''),
  (12,27,6,'2010-12-20','21:29:00','1',1,NULL,6.5,'14 min',''),
  (13,27,1,'2010-12-20','21:29:00','1',2,NULL,14,'25 min',''),
  (14,27,3,'2010-12-20','21:29:00','1',3,NULL,22.2,'34 min',''),
  (15,31,1,'2010-12-20','21:32:00','1',0,NULL,105,'1h 36 min',''),
  (16,31,3,'2010-12-20','21:32:00','1',1,NULL,108,'1h 41 min',''),
  (17,31,5,'2010-12-20','21:32:00','1',2,NULL,89.9,'1h 30 min',''),
  (18,31,6,'2010-12-20','21:32:00','1',3,NULL,89.9,'1h 30 min',''),
  (19,37,5,'2010-12-20','21:44:00','1',0,NULL,6.5,'14 min',''),
  (20,37,6,'2010-12-20','21:44:00','1',1,NULL,6.5,'14 min',''),
  (21,37,1,'2010-12-20','21:44:00','1',2,NULL,14,'25 min',''),
  (22,37,3,'2010-12-20','21:44:00','1',3,NULL,22.2,'34 min',''),
  (23,41,3,'2010-12-20','21:58:00','1',0,NULL,3.2,'7 min',''),
  (24,41,1,'2010-12-20','21:58:00','1',1,NULL,7.1,'19 min',''),
  (25,41,5,'2010-12-20','21:58:00','1',2,NULL,23.7,'36 min',''),
  (26,41,6,'2010-12-20','21:58:00','1',3,NULL,23.7,'36 min',''),
  (27,43,3,'2010-12-20','21:58:00','1',0,NULL,3.2,'7 min',''),
  (28,43,1,'2010-12-20','21:58:00','1',1,NULL,7.1,'19 min',''),
  (29,43,5,'2010-12-20','21:58:00','1',2,NULL,23.7,'36 min',''),
  (30,43,6,'2010-12-20','21:58:00','1',3,NULL,23.7,'36 min',''),
  (31,45,3,'2010-12-20','22:01:00','1',0,NULL,2.8,'6 min','no disponible'),
  (32,45,1,'2010-12-20','22:01:00','1',1,NULL,8.4,'23 min',''),
  (33,45,5,'2010-12-20','22:01:00','1',2,NULL,25,'40 min',''),
  (34,45,6,'2010-12-20','22:01:00','1',3,NULL,25,'40 min',''),
  (35,47,3,'2010-12-20','22:01:00','1',0,NULL,5.1,'12 min',''),
  (36,47,1,'2010-12-20','22:01:00','1',1,NULL,18.9,'28 min',''),
  (37,47,5,'2010-12-20','22:01:00','1',2,NULL,24.6,'39 min',''),
  (38,47,6,'2010-12-20','22:01:00','1',3,NULL,24.6,'39 min',''),
  (39,49,3,'2010-12-20','22:02:00','1',0,NULL,5.1,'12 min',''),
  (40,49,1,'2010-12-20','22:02:00','1',1,NULL,18.9,'28 min',''),
  (41,49,5,'2010-12-20','22:02:00','1',2,NULL,24.6,'39 min',''),
  (42,49,6,'2010-12-20','22:02:00','1',3,NULL,24.6,'39 min',''),
  (43,51,3,'2010-12-20','22:02:00','1',0,NULL,2.8,'6 min',''),
  (44,51,1,'2010-12-20','22:02:00','1',1,NULL,8.4,'23 min',''),
  (45,51,5,'2010-12-20','22:02:00','1',2,NULL,25,'40 min',''),
  (46,51,6,'2010-12-20','22:02:00','1',3,NULL,25,'40 min',''),
  (47,53,3,'2010-12-20','22:03:00','1',0,NULL,5.1,'12 min',''),
  (48,53,1,'2010-12-20','22:03:00','1',1,NULL,18.9,'28 min',''),
  (49,53,5,'2010-12-20','22:03:00','1',2,NULL,24.6,'39 min',''),
  (50,53,6,'2010-12-20','22:03:00','1',3,NULL,24.6,'39 min',''),
  (51,55,3,'2010-12-20','22:03:00','1',0,NULL,5.1,'12 min','no disponible'),
  (52,55,1,'2010-12-20','22:03:00','1',1,NULL,18.9,'28 min',''),
  (53,55,5,'2010-12-20','22:03:00','1',2,NULL,24.6,'39 min',''),
  (54,55,6,'2010-12-20','22:03:00','1',3,NULL,24.6,'39 min','');

COMMIT;

#
# Structure for the `hotel` table : 
#

DROP TABLE IF EXISTS `hotel`;

CREATE TABLE `hotel` (
  `id_hotel` int(11) NOT NULL auto_increment,
  `nombre` varchar(100) default NULL,
  PRIMARY KEY  (`id_hotel`),
  KEY `nombre` (`nombre`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;

#
# Data for the `hotel` table  (LIMIT 0,500)
#

INSERT INTO `hotel` (`id_hotel`, `nombre`) VALUES 
  (1,'clinton');

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
  (7,'hotel','Adm de Hotel','hotel.do?reqCode=findData'),
  (8,'reporteReserva','Reporte Reserva','reporteReserva.do?reqCode=findData'),
  (9,'reporteHistoric','Reporte Historico','reporteHistorico.do?reqCode=findData');

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
) ENGINE=InnoDB AUTO_INCREMENT=198 DEFAULT CHARSET=latin1;

#
# Data for the `opcionmenu_perfil` table  (LIMIT 0,500)
#

INSERT INTO `opcionmenu_perfil` (`id_opcionmenu_perfil`, `id_opcionmenu`, `id_perfil`, `orden`) VALUES 
  (134,1,1,0),
  (135,4,1,4),
  (136,4,1,3),
  (137,7,1,7),
  (138,5,1,5),
  (139,2,1,1),
  (140,3,1,2),
  (141,6,1,6),
  (149,7,2,0),
  (151,6,2,0),
  (153,2,2,0),
  (154,5,2,0),
  (186,8,1,8),
  (187,9,1,9),
  (194,1,7,1),
  (195,2,7,3),
  (196,8,7,2),
  (197,9,7,4);

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
  `descripcion_corta` varchar(30) NOT NULL,
  `descripcion_larga` varchar(60) NOT NULL,
  `opcion_defecto` int(11) default NULL,
  PRIMARY KEY  (`id_perfil`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

#
# Data for the `perfil` table  (LIMIT 0,500)
#

INSERT INTO `perfil` (`id_perfil`, `descripcion_corta`, `descripcion_larga`, `opcion_defecto`) VALUES 
  (1,'Administradores','Administradores del sistema',1),
  (2,'Adm. Reservas','Adm. Reservas',6),
  (7,'Gestor de Reportes','Gestor de Reportes',8);

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
  `direccion` varchar(150) default NULL,
  `telefono` varchar(30) default NULL,
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
  KEY `fecha` (`fecha`),
  CONSTRAINT `reserva_fk` FOREIGN KEY (`id_calculoDeUbicacion`) REFERENCES `calculoubicacion` (`id_CalculoDeUbicacion`),
  CONSTRAINT `reserva_fk1` FOREIGN KEY (`cod_unidad`) REFERENCES `flota` (`cod_unidad`),
  CONSTRAINT `reserva_fk2` FOREIGN KEY (`cod_cliente`) REFERENCES `cliente` (`cod_cliente`),
  CONSTRAINT `reserva_fk3` FOREIGN KEY (`Id_hotel`) REFERENCES `hotel` (`id_hotel`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=latin1;

#
# Data for the `reserva` table  (LIMIT 0,500)
#

INSERT INTO `reserva` (`Id_reserva`, `fecha`, `hora`, `estado`, `cod_cliente`, `cod_unidad`, `id_usuario`, `observaciones`, `direccion`, `telefono`, `entreCalles`, `localidad`, `latitud`, `longitud`, `Id_hotel`, `id_calculoDeUbicacion`) VALUES 
  (1,'2010-12-18','21:12:00','Realizada',72,4,1,'','Marcelo T. de Alvear 450, Ciudad Autónoma de Buenos Aires, Capital Federal, Argentina','3434-9897','',NULL,-34.596,-58.374,NULL,NULL),
  (2,'2010-12-19','22:13:00','Realizada',71,2,1,'','Sarandí 853, Ciudad Autónoma de Buenos Aires, Capital Federal, Argentina','49420401','',NULL,-34.619,-58.395,NULL,7),
  (3,'2010-12-23','00:13:00','En proceso',71,NULL,1,'','Sarandí 853, Ciudad Autónoma de Buenos Aires, Capital Federal, Argentina','49420401','',NULL,-34.619,-58.395,NULL,12),
  (4,'2010-12-20','00:21:00','Realizada',72,2,1,'','Marcelo T. de Alvear, Ciudad Autónoma de Buenos Aires, Capital Federal, Argentina','3434-9897','',NULL,-34.597,-58.387,NULL,NULL),
  (5,'2010-12-21','21:25:00','Cancelada',10,NULL,1,'','Almafuerte 278, Lomas de Zamora, Buenos Aires, Argentina','3533-3971','',NULL,-34.756,-58.412,NULL,20),
  (6,'2010-12-20','22:16:00','Cancelada',72,NULL,1,'','Almafuerte 278, Lomas de Zamora, Buenos Aires, Argentina','3434-9897','',NULL,-34.756,-58.412,NULL,13),
  (7,'2010-12-20','22:16:00','Cancelada',72,NULL,1,'','Almafuerte 278, Lomas de Zamora, Buenos Aires, Argentina','3434-9897','',NULL,-34.756,-58.412,NULL,14),
  (8,'2010-12-20','22:16:00','Cancelada',72,NULL,1,'','Almafuerte 278, Lomas de Zamora, Buenos Aires, Argentina','3434-9897','',NULL,-34.756,-58.412,NULL,15),
  (9,'2010-12-20','22:16:00','Cancelada',72,NULL,1,'','Almafuerte 278, Lomas de Zamora, Buenos Aires, Argentina','3434-9897','',NULL,-34.756,-58.412,NULL,16),
  (10,'2010-12-20','22:16:00','Cancelada',72,NULL,1,'','Almafuerte 278, Lomas de Zamora, Buenos Aires, Argentina','3434-9897','',NULL,-34.756,-58.412,NULL,17),
  (11,'2010-12-20','22:16:00','Cancelada',72,NULL,1,'','Almafuerte 278, Lomas de Zamora, Buenos Aires, Argentina','3434-9897','',NULL,-34.756,-58.412,NULL,18),
  (12,'2010-12-20','22:16:00','Cancelada',72,NULL,1,'','Almafuerte 278, Lomas de Zamora, Buenos Aires, Argentina','3434-9897','',NULL,-34.756,-58.412,NULL,19),
  (13,'2010-12-20','22:23:00','Cancelada',10,NULL,1,'','Almafuerte 278, Lomas de Zamora, Buenos Aires, Argentina','3533-3971','',NULL,-34.756,-58.412,NULL,21),
  (14,'2010-12-20','22:27:00','A realizar',71,3,1,'','Sarandí 853, Ciudad Autónoma de Buenos Aires, Capital Federal, Argentina','49420401','',NULL,-34.619,-58.395,NULL,23),
  (15,'2010-12-20','22:28:00','Cancelada',10,NULL,1,'','Almafuerte 278, Lomas de Zamora, Buenos Aires, Argentina','3533-3971','',NULL,-34.756,-58.412,NULL,24),
  (16,'2010-12-21','22:28:00','Cancelada',10,NULL,1,'','Almafuerte 278, Lomas de Zamora, Buenos Aires, Argentina','3533-3971','',NULL,-34.756,-58.412,NULL,NULL),
  (17,'2010-12-20','22:28:00','A realizar',10,5,1,'','Almafuerte 278, Lomas de Zamora, Buenos Aires, Argentina','3533-3971','',NULL,-34.756,-58.412,NULL,27),
  (18,'2010-12-20','22:30:00','Cancelada',71,NULL,1,'','Sarandí 853, Ciudad Autónoma de Buenos Aires, Capital Federal, Argentina','49420401','',NULL,-34.619,-58.395,NULL,28),
  (19,'2010-12-20','22:31:00','Cancelada',71,NULL,1,'','Sarandí 853, Ciudad Autónoma de Buenos Aires, Capital Federal, Argentina','49420401','',NULL,-34.619,-58.395,NULL,29),
  (20,'2010-12-20','22:31:00','Cancelada',71,1,1,'','Independencia, Lobos, Buenos Aires, Argentina','49420401','',NULL,-35.088,-59.104,NULL,32),
  (21,'2010-12-20','22:33:00','Cancelada',71,NULL,1,'','Av Rivadavia 3200, Ciudad Autónoma de Buenos Aires, Capital Federal, Argentina','49420401','',NULL,-34.611,-58.412,NULL,33),
  (22,'2010-12-20','22:37:00','Cancelada',72,3,1,'','Rincón 432, Ciudad Autónoma de Buenos Aires, Capital Federal, Argentina','3434-9897','',NULL,-34.614,-58.396,NULL,NULL),
  (23,'2010-12-20','22:44:00','A realizar',10,5,1,'','Almafuerte 278, Lomas de Zamora, Buenos Aires, Argentina','3533-3971','',NULL,-34.756,-58.412,NULL,38),
  (24,'2010-12-20','22:46:00','Cancelada',72,NULL,1,'','Marcelo T. de Alvear, Ciudad Autónoma de Buenos Aires, Capital Federal, Argentina','3434-9897','',NULL,-34.597,-58.387,NULL,39),
  (25,'2010-12-20','23:00:00','A realizar',71,3,1,'','Montevideo 321, Ciudad Autónoma de Buenos Aires, Capital Federal, Argentina','49420401','',NULL,-34.605,-58.389,1,NULL),
  (26,'2010-12-20','23:01:00','A realizar',72,3,1,'peperopr ere','Marcelo T. de Alvear 575, Ciudad Autónoma de Buenos Aires, Capital Federal, Argentina','3434-9897','aaa',NULL,-34.596,-58.375,NULL,NULL),
  (27,'2010-12-20','23:06:00','En proceso',NULL,NULL,1,'','Ruta Provincial 47, General Rodríguez, Buenos Aires, Argentina','erew','',NULL,-34.665,-59.082,NULL,NULL),
  (28,'2010-12-20','23:09:00','En proceso',NULL,NULL,1,'','Florencio Parravicini 250-299, Burzaco, Buenos Aires, Argentina','wqwq','',NULL,-34.836,-58.379,NULL,NULL),
  (29,'2010-12-20','23:10:00','En proceso',10,NULL,1,'','Angel M. Rodríguez 4100-4199, Merlo, Buenos Aires, Argentina','3533-3971','',NULL,-34.692,-58.742,NULL,NULL),
  (31,'2010-12-20','23:15:00','En proceso',10,NULL,1,'','Almafuerte 278, Lomas de Zamora, Buenos Aires, Argentina','3533-3971 hdyjsksa','',NULL,-34.756,-58.412,NULL,NULL),
  (32,'2010-12-20','23:16:00','En proceso',71,NULL,1,'','Sarandí 853, Ciudad Autónoma de Buenos Aires, Capital Federal, Argentina','uytbabs','',NULL,-34.619,-58.395,NULL,NULL);

COMMIT;

#
# Structure for the `ubicacionreal` table : 
#

DROP TABLE IF EXISTS `ubicacionreal`;

CREATE TABLE `ubicacionreal` (
  `id` int(11) NOT NULL auto_increment,
  `cod_unidad` int(11) NOT NULL,
  `fecha` datetime default NULL,
  `hora` time default NULL,
  `GPSactivo` binary(1) default NULL,
  `latitud` double(15,6) default NULL,
  `longitud` double(15,6) default NULL,
  `simulada` binary(1) default NULL,
  `id_calculoDeUbicacion int` int(11) default NULL,
  PRIMARY KEY  (`id`),
  KEY `cod_unidad` (`cod_unidad`),
  CONSTRAINT `ubicacionreal1_fk` FOREIGN KEY (`cod_unidad`) REFERENCES `flota` (`cod_unidad`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=latin1;

#
# Data for the `ubicacionreal` table  (LIMIT 0,500)
#

INSERT INTO `ubicacionreal` (`id`, `cod_unidad`, `fecha`, `hora`, `GPSactivo`, `latitud`, `longitud`, `simulada`, `id_calculoDeUbicacion int`) VALUES 
  (1,3,'2010-12-20 21:25:16',NULL,'1',-34.605445,-58.415288,'1',NULL),
  (3,4,'2010-12-20 21:25:17',NULL,'1',0,0,'0',NULL),
  (4,1,'2010-12-20 21:25:16',NULL,'1',-34.652624,-58.419427,'1',NULL),
  (5,2,'2010-12-20 17:44:32',NULL,'1',-34.5463,-58.4923,'0',NULL),
  (6,5,'2010-12-20 21:25:18',NULL,'1',-34.800379,-58.4135,'0',NULL),
  (7,6,'2010-12-20 21:25:16',NULL,'1',-34.800336,-58.413512,'0',NULL);

COMMIT;

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
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;

#
# Data for the `usuario` table  (LIMIT 0,500)
#

INSERT INTO `usuario` (`id_usuario`, `usuario`, `pwd`, `nombre`, `apellido`, `email`, `telefono`, `id_perfil`) VALUES 
  (1,'Admin','prueba','Agostina','Frangella','agosvf@gmail.com','4942-0401',1),
  (2,'operador','prueba','operador','operador','','',2),
  (3,'Operadora 1','prueba','Romi','Gili','','',2),
  (4,'operadora 2','prueba','agos','fran','','',2);

COMMIT;

