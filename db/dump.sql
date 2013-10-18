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
-- Table structure for table `categories`
--

DROP TABLE IF EXISTS `categories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `categories` (
  `code` varchar(10) NOT NULL,
  `description` varchar(50) NOT NULL,
  PRIMARY KEY (`code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `categories`
--

LOCK TABLES `categories` WRITE;
/*!40000 ALTER TABLE `categories` DISABLE KEYS */;
INSERT INTO `categories` VALUES ('1','Appetizers'),('10','Cold Beverages'),('2','Basmati Rice'),('3','Roties'),('4','Tandoori Specialities'),('5','Fry Specialities'),('6','Hyderabadi Specialities'),('7','Special Curries'),('8','Desserts'),('9','Accompaniments');
/*!40000 ALTER TABLE `categories` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer_order`
--

DROP TABLE IF EXISTS `customer_order`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer_order` (
  `bill_number` bigint(20) NOT NULL AUTO_INCREMENT,
  `bill_amount` decimal(12,2) NOT NULL,
  `discount` decimal(8,2) NOT NULL,
  `net_amount` decimal(12,2) NOT NULL,
  `created_by` varchar(20) NOT NULL,
  `bill_type` varchar(20) NOT NULL,
  `table_num` varchar(5) NOT NULL,
  `bill_date` varchar(20) NOT NULL,
  `bill_status` varchar(20) NOT NULL DEFAULT 'created',
  PRIMARY KEY (`bill_number`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer_order`
--

LOCK TABLES `customer_order` WRITE;
/*!40000 ALTER TABLE `customer_order` DISABLE KEYS */;
INSERT INTO `customer_order` VALUES (11,'59.00','0.00','59.00','john','Al-a-Carte','T02','18/10/2013 11:56:03','completed'),(12,'152.50','15.00','137.50','john','Parcel','T06','18/10/2013 11:57:12','completed'),(14,'0.00','0.00','0.00','john','','','18/10/2013 11:58:54','created'),(15,'0.00','0.00','0.00','john','','','18/10/2013 11:59:08','created');
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
  `category` varchar(10) NOT NULL,
  PRIMARY KEY (`item_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dish_items`
--

LOCK TABLES `dish_items` WRITE;
/*!40000 ALTER TABLE `dish_items` DISABLE KEYS */;
INSERT INTO `dish_items` VALUES ('P101','Plane Rice','5.00','2'),('P102','Mutton Biryani','14.00','2'),('P103','Chicken Biryani','13.00','2'),('P104','Butter Naan','2.50','3'),('P105','Chiken 65','10.00','5'),('P106','Khati Dal','3.00','6'),('P107','Naan','2.00','3'),('P108','Bag Rice Dalcha','7.00','2'),('P109','Chicken Kurma','6.00','6'),('P110','Roti','1.00','3'),('P112','Mutton Kurma','6.00','6'),('P113','Water Bottle(big)','2.00','10'),('P114','Mutton Fry','12.00','5'),('P115','Bagare Baingan','5.00','6'),('P116','Water Bottle(small)','1.00','10'),('P117','Butter Chicken','10.00','7'),('P118','Shami kabab','12.00','4'),('P119','Tea','1.00','10'),('P120','Tandoori Chicken(full)','24.00','4'),('P121','Tandoori chicken(Half)','12.00','4'),('T100','Palak Pakoda','5.00','1'),('T101','Veg Pakoda','5.00','1'),('T102','Vegetable Biryani','10.00','2'),('T103','Special Fried Rice','10.00','2'),('T104','Pudina/Garlic Paratha','2.50','3'),('T105','Special kulcha','3.00','3'),('T106','Chicken Tikka','12.00','4'),('T107','Malai Tikka','13.00','4'),('T108','Paneer Tikka','10.00','4'),('T109','Hariyali Tikka','13.00','4'),('T110','Mutton Sheck Kabab','14.00','4'),('T111','Garlic Chiken ','10.00','5'),('T112','Chilli Chiken ','10.00','5'),('T113','Bendi Fry ','5.00','5'),('T114','Kofta Kabab ','5.00','5'),('T115','Alu Methi Gosh','6.00','6'),('T116','Gawar Phali Gosh','6.00','6'),('T117','Shezhwan Chicken','10.00','7'),('T118','Pepper Masala (Chicken/Mutton)','10.00','7'),('T119','Dhal Makhani','7.00','7'),('T120','Alu Mutter','7.00','7'),('T121','Dabal Ka Mitha(Sweet)','4.00','8'),('T122','Gulabjamun(2 pcs)','4.00','8');
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
INSERT INTO `dish_order` VALUES (12,'Chiken 65',3,'10.00'),(12,'Butter Chicken',3,'10.00'),(12,'Mutton Biryani',5,'14.00'),(12,'Butter Naan',9,'2.50'),(11,'Butter Naan',6,'2.50'),(11,'Alu Methi Gosh',3,'6.00'),(11,'Chicken Biryani',2,'13.00');
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
INSERT INTO `users` VALUES ('James','james','james','james@gmail.com','9837461264','ROLE_ADMIN'),('John','john','john','john@gmail.com','8099035353','ROLE_USER'),('Murali','murali','murali','murali@gmail.com','9030566642','ROLE_MANAGER');
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

-- Dump completed on 2013-10-18  6:42:53
