CREATE DATABASE  IF NOT EXISTS `library_database` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `library_database`;
-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: library_database
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `books_details`
--

DROP TABLE IF EXISTS `books_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `books_details` (
  `bookid` varchar(45) NOT NULL,
  `titles` varchar(45) DEFAULT NULL,
  `author` varchar(45) DEFAULT NULL,
  `mainclassification` varchar(45) DEFAULT NULL,
  `subclassification` varchar(45) DEFAULT NULL,
  `yearofpuclishing` varchar(45) DEFAULT NULL,
  `lastprintedyear` varchar(45) DEFAULT NULL,
  `isbnno` varchar(45) DEFAULT NULL,
  `noofpages` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`bookid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `books_details`
--

LOCK TABLES `books_details` WRITE;
/*!40000 ALTER TABLE `books_details` DISABLE KEYS */;
INSERT INTO `books_details` VALUES ('001','harry potter','j.k.rowling','fantacy','magic','1992','2007','1234','1000'),('002','indiana johns','adam','novel','adventure','1978','2008','4567','500'),('003','tom rider','marvel','film','adventure','2005','2018','7896','1500'),('004','batman','marvel','movie','adventure','2005','09','7896','2000'),('1','mother','father','family','home','1995','1996','45789','5000'),('null','null','null','null','null','null','null','null','null');
/*!40000 ALTER TABLE `books_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `main_class`
--

DROP TABLE IF EXISTS `main_class`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `main_class` (
  `M_C_ID` varchar(45) NOT NULL,
  `M_C_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`M_C_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `main_class`
--

LOCK TABLES `main_class` WRITE;
/*!40000 ALTER TABLE `main_class` DISABLE KEYS */;
/*!40000 ALTER TABLE `main_class` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sub_class`
--

DROP TABLE IF EXISTS `sub_class`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `sub_class` (
  `S_C_ID` varchar(45) NOT NULL,
  `S_C_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`S_C_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sub_class`
--

LOCK TABLES `sub_class` WRITE;
/*!40000 ALTER TABLE `sub_class` DISABLE KEYS */;
/*!40000 ALTER TABLE `sub_class` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-08-14 19:14:37
