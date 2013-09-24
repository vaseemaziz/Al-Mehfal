-- MySQL dump 10.13  Distrib 5.1.34, for Win32 (ia32)
--
-- Host: localhost    Database: restaurant
-- ------------------------------------------------------
-- Server version	5.1.34-community

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `restaurant`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `restaurant` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `restaurant`;

--
-- Table structure for table `customer_order`
--

DROP TABLE IF EXISTS `customer_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer_order` (
  `bill_num` bigint(20) NOT NULL AUTO_INCREMENT,
  `bill_amount` decimal(12,2) NOT NULL,
  `bill_date` varchar(20) NOT NULL,
  `waiter_id` varchar(20) NOT NULL,
  `table_num` varchar(5) NOT NULL,
  `chair_num` tinyint(3) NOT NULL,
  `cust_name` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`bill_num`)
) ENGINE=InnoDB AUTO_INCREMENT=27 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_order`
--

LOCK TABLES `customer_order` WRITE;
/*!40000 ALTER TABLE `customer_order` DISABLE KEYS */;
/*!40000 ALTER TABLE `customer_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dine_tables`
--

DROP TABLE IF EXISTS `dine_tables`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dine_tables` (
  `table_name` varchar(5) NOT NULL DEFAULT '',
  `num_chairs` tinyint(2) NOT NULL,
  PRIMARY KEY (`table_name`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dine_tables`
--

LOCK TABLES `dine_tables` WRITE;
/*!40000 ALTER TABLE `dine_tables` DISABLE KEYS */;
INSERT INTO `dine_tables` VALUES ('T01',6),('T02',4),('T03',2),('T04',2),('T05',6),('T06',6),('T07',10),('T08',4),('T09',10),('T10',5);
/*!40000 ALTER TABLE `dine_tables` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dish_items`
--

DROP TABLE IF EXISTS `dish_items`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dish_items` (
  `item_code` varchar(10) NOT NULL,
  `item_name` varchar(50) NOT NULL,
  `item_cost` decimal(8,2) NOT NULL,
  PRIMARY KEY (`item_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dish_items`
--

LOCK TABLES `dish_items` WRITE;
/*!40000 ALTER TABLE `dish_items` DISABLE KEYS */;
INSERT INTO `dish_items` VALUES ('100','Chicken Biriyani','13.00'),('101','Mutton Biryani','14.00'),('102','Roti','1.00'),('103','Naan','2.00'),('104','Button Naan','2.50'),('105','Kofta Kabab','5.00'),('106','Palak Pakoda','5.00'),('107','Veg Pakoda','5.00'),('108','Soft Drinks','1.50'),('109','Water Bottle','1.50'),('110','Tea','1.00'),('111','Green Salad','2.00'),('112','Khati Dal','3.00'),('113','Mutton Kurma','6.00'),('114','Aloo Methi Gosh','6.00'),('115','Aloo Mutter','7.00');
/*!40000 ALTER TABLE `dish_items` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dish_order`
--

DROP TABLE IF EXISTS `dish_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dish_order` (
  `order_id` bigint(20) NOT NULL,
  `item_name` varchar(50) NOT NULL,
  `quantity` smallint(6) NOT NULL,
  `item_cost` decimal(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dish_order`
--

LOCK TABLES `dish_order` WRITE;
/*!40000 ALTER TABLE `dish_order` DISABLE KEYS */;
/*!40000 ALTER TABLE `dish_order` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `users` (
  `name` varchar(50) NOT NULL,
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `email` varchar(50) NOT NULL,
  `mobile` varchar(15) NOT NULL,
  `authority` varchar(15) NOT NULL,
  `sales` tinyint(1) NOT NULL DEFAULT '0',
  `menu` tinyint(1) NOT NULL DEFAULT '0',
  `reports` tinyint(1) NOT NULL DEFAULT '0',
  `expenses` tinyint(1) NOT NULL DEFAULT '0',
  `suppliers` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`username`),
  UNIQUE KEY `email` (`email`),
  UNIQUE KEY `mobile` (`mobile`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `users`
--

LOCK TABLES `users` WRITE;
/*!40000 ALTER TABLE `users` DISABLE KEYS */;
INSERT INTO `users` VALUES ('James','james','james','james@gmail.com','9837461264','ROLE_ADMIN',1,1,1,1,1),('John','john','john','john@gmail.com','8099035353','ROLE_USER',1,0,0,0,0),('Murali','murali','murali','murali@gmail.com','9030566642','ROLE_MANAGER',1,1,0,0,0);
/*!40000 ALTER TABLE `users` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-09-24  6:45:50
