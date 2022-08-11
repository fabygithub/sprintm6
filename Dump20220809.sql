CREATE DATABASE  IF NOT EXISTS `asesorias` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `asesorias`;
-- MySQL dump 10.13  Distrib 8.0.29, for Win64 (x86_64)
--
-- Host: localhost    Database: asesorias
-- ------------------------------------------------------
-- Server version	8.0.29

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `administrativo`
--

DROP TABLE IF EXISTS `administrativo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `administrativo` (
  `id_administrativo` int NOT NULL AUTO_INCREMENT,
  `area_administrativo` varchar(20) NOT NULL,
  `experiencia_administrativo` varchar(100) DEFAULT NULL,
  `usuario_id_usuario` int NOT NULL,
  PRIMARY KEY (`id_administrativo`,`usuario_id_usuario`),
  KEY `fk_administrativo_usuario1_idx` (`usuario_id_usuario`),
  CONSTRAINT `fk_administrativo_usuario1` FOREIGN KEY (`usuario_id_usuario`) REFERENCES `usuario` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `administrativo`
--

LOCK TABLES `administrativo` WRITE;
/*!40000 ALTER TABLE `administrativo` DISABLE KEYS */;
/*!40000 ALTER TABLE `administrativo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `capacitacion`
--

DROP TABLE IF EXISTS `capacitacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `capacitacion` (
  `id` int NOT NULL AUTO_INCREMENT,
  `rut` int NOT NULL,
  `dia` varchar(20) NOT NULL,
  `hora` varchar(6) NOT NULL,
  `lugar` varchar(50) NOT NULL,
  `duracion` varchar(70) NOT NULL,
  `c_asistentes` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `capacitacion`
--

LOCK TABLES `capacitacion` WRITE;
/*!40000 ALTER TABLE `capacitacion` DISABLE KEYS */;
INSERT INTO `capacitacion` VALUES (1,95454778,'Lunes','15:50','Valparaiso','1 mes',25),(2,85774558,'Miercoles','18:00','Quilpue','3 semanas',12),(3,56854589,'Miercoles','09:00','Viña del Mar','6 semanas',8),(4,45785458,'Viernes','12:00','Valparaiso','2 meses',55),(5,96544455,'Viernes','21:00','Quilpue','8 semanas',23),(6,57856588,'Lunes','16:30','Valparaiso','2 dias',45),(7,65888999,'Sabado','17:00','Quilpue','2 semanas',14),(8,77889999,'Miercoles','08:30','Viña del Mar','5 dias',18),(9,87444111,'Jueves','15:15','Valparaiso','1 mes',29),(10,71555666,'Viernes','09:00','Quilpue','3 semanas',33),(11,23555666,'Lunes','11:00','Viña del Mar','2 semanas',44),(12,45778888,'Lunes','18:00','Valparaiso','2 semanas',10),(13,45778888,'Lunes','18:00','Valparaiso','2 semanas',10),(14,77889888,'Martes','16:00','ViÃ±a','3 semanas',12),(15,88555666,'Martes','18:30','Valparaiso','3 semanas',55),(16,89888555,'Miercoles','15:50','Valparaiso','2 semanas y media',15),(17,75444444,'Martes','15:59','Valparaiso','tres semanas',15),(18,46885555,'Miercoles','08:45','Valparaiso','cuatro semanas',25),(19,79885666,'Martes','15:09','Curauma City','cinco dias',55),(20,55222555,'Miercoles','15:00','Valparaiso','cuatro semanas',4),(21,77999888,'Jueves','19:30','Valparaiso y Base Prat','cuatro semanas',55),(23,45777888,'Miercoles','11:45','Valparaiso','Cuatro semanas',200),(25,84666555,'Martes','15:45','Curauma City','veinte horas',22),(27,25444588,'Domingo','08:55','Valparaiso','2 semanas',15),(28,81222555,'Viernes','09:45','Valparaiso','2 semanas',12),(29,93555666,'Viernes','15:00','Valparaiso','5 meses',25);
/*!40000 ALTER TABLE `capacitacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cliente`
--

DROP TABLE IF EXISTS `cliente`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `cliente` (
  `id_cliente` int NOT NULL AUTO_INCREMENT,
  `rut_cliente` int NOT NULL,
  `nombres_cliente` varchar(30) NOT NULL,
  `apellidos_cliente` varchar(30) NOT NULL,
  `telefono_cliente` varchar(15) NOT NULL,
  `afp_cliente` varchar(30) DEFAULT NULL,
  `sistema_salud_cliente` int DEFAULT NULL,
  `direccion_cliente` varchar(70) DEFAULT NULL,
  `comuna_cliente` varchar(50) DEFAULT NULL,
  `edad_cliente` int NOT NULL,
  `usuario_id_usuario` int NOT NULL,
  PRIMARY KEY (`id_cliente`,`usuario_id_usuario`),
  KEY `fk_cliente_usuario1_idx` (`usuario_id_usuario`),
  CONSTRAINT `fk_cliente_usuario1` FOREIGN KEY (`usuario_id_usuario`) REFERENCES `usuario` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cliente`
--

LOCK TABLES `cliente` WRITE;
/*!40000 ALTER TABLE `cliente` DISABLE KEYS */;
/*!40000 ALTER TABLE `cliente` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contacto`
--

DROP TABLE IF EXISTS `contacto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contacto` (
  `contacto_id` int NOT NULL,
  `contacto_email` varchar(255) DEFAULT NULL,
  `contacto_message` varchar(255) DEFAULT NULL,
  `contacto_name` varchar(255) DEFAULT NULL,
  `contacto_phono` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`contacto_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contacto`
--

LOCK TABLES `contacto` WRITE;
/*!40000 ALTER TABLE `contacto` DISABLE KEYS */;
/*!40000 ALTER TABLE `contacto` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `entidad`
--

DROP TABLE IF EXISTS `entidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `entidad` (
  `id_entidad` int NOT NULL AUTO_INCREMENT,
  `rut_cliente` int DEFAULT NULL,
  `nombres_cliente` varchar(30) DEFAULT NULL,
  `apellidos_cliente` varchar(30) DEFAULT NULL,
  `telefono` varchar(15) DEFAULT NULL,
  `afp_cliente` varchar(30) DEFAULT NULL,
  `sistema_salud_cliente` int DEFAULT NULL,
  `direccion_cliente` varchar(70) DEFAULT NULL,
  `comuna_cliente` varchar(50) DEFAULT NULL,
  `edad_cliente` int DEFAULT NULL,
  `titulo_profesional` varchar(50) DEFAULT NULL,
  `fecha_ingreso_profesional` varchar(8) DEFAULT NULL,
  `area_administrativo` varchar(20) DEFAULT NULL,
  `experiencia_administrativo` varchar(100) DEFAULT NULL,
  `id_usuario` int DEFAULT NULL,
  `afp_ckiente` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_entidad`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `entidad`
--

LOCK TABLES `entidad` WRITE;
/*!40000 ALTER TABLE `entidad` DISABLE KEYS */;
/*!40000 ALTER TABLE `entidad` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `profesional`
--

DROP TABLE IF EXISTS `profesional`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `profesional` (
  `id_profesional` int NOT NULL AUTO_INCREMENT,
  `titulo_profesional` varchar(50) NOT NULL,
  `fecha_ingreso_profesional` varchar(10) DEFAULT NULL,
  `usuario_id_usuario` int NOT NULL,
  PRIMARY KEY (`id_profesional`,`usuario_id_usuario`),
  KEY `fk_profesional_usuario1_idx` (`usuario_id_usuario`),
  CONSTRAINT `fk_profesional_usuario1` FOREIGN KEY (`usuario_id_usuario`) REFERENCES `usuario` (`id_usuario`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `profesional`
--

LOCK TABLES `profesional` WRITE;
/*!40000 ALTER TABLE `profesional` DISABLE KEYS */;
INSERT INTO `profesional` VALUES (1,'Tecnico','2010-08-15',1),(2,'Parvularia','2010-05-12',8),(3,'sin titulo','2010-06-07',9),(4,'ss','2010-05-06',10),(5,'tecnico','2010-05-10',11),(6,'mecanico','2009-05-10',12);
/*!40000 ALTER TABLE `profesional` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tipo_usuario`
--

DROP TABLE IF EXISTS `tipo_usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tipo_usuario` (
  `id` smallint NOT NULL,
  `nombre` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tipo_usuario`
--

LOCK TABLES `tipo_usuario` WRITE;
/*!40000 ALTER TABLE `tipo_usuario` DISABLE KEYS */;
INSERT INTO `tipo_usuario` VALUES (1,'Cliente'),(2,'Profesional'),(3,'Administrativo');
/*!40000 ALTER TABLE `tipo_usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario` (
  `id_usuario` int NOT NULL AUTO_INCREMENT,
  `nombre_usuario` varchar(50) NOT NULL,
  `f_nacimiento_usuario` varchar(10) NOT NULL,
  `tipo_usuario_id` smallint NOT NULL,
  PRIMARY KEY (`id_usuario`,`tipo_usuario_id`),
  KEY `fk_usuario_tipo_usuario1_idx` (`tipo_usuario_id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'paulaDiaz','25-05-1995',2),(2,'juanLopex','12-08-1983',3),(3,'PamelaBv','29-08-1988',1),(4,'susanilla','25-07-2000',2),(5,'pepinoRojo','23-04-1999',2),(6,'chechote','23-04-1990',2),(7,'juanPedro','25-05-1990',2),(8,'PamelaBV','29-08-1988',2),(9,'prueba 3','15-08-1980',2),(10,'sergioT','03-01-1979',2),(11,'juanito','25-08-1990',2),(12,'prueba 5','15-05-1990',2);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario_entidad`
--

DROP TABLE IF EXISTS `usuario_entidad`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `usuario_entidad` (
  `id_usuario` int DEFAULT NULL,
  `id_entidad` int DEFAULT NULL,
  `last_update` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  KEY `FKm7o7rah5gay498tps2n5ok2ho` (`id_entidad`),
  KEY `FKqy3ruswqenpu216rv9q64wk2u` (`id_usuario`),
  CONSTRAINT `FKm7o7rah5gay498tps2n5ok2ho` FOREIGN KEY (`id_entidad`) REFERENCES `entidad` (`id_entidad`),
  CONSTRAINT `FKqy3ruswqenpu216rv9q64wk2u` FOREIGN KEY (`id_usuario`) REFERENCES `usuario` (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario_entidad`
--

LOCK TABLES `usuario_entidad` WRITE;
/*!40000 ALTER TABLE `usuario_entidad` DISABLE KEYS */;
/*!40000 ALTER TABLE `usuario_entidad` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-08-09 13:44:10
