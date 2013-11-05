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
-- Table structure for table `credit_details`
--

DROP TABLE IF EXISTS `credit_details`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `credit_details` (
  `bill_number` bigint(20) NOT NULL,
  `customer_id` varchar(15) NOT NULL,
  PRIMARY KEY (`bill_number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `credit_details`
--

LOCK TABLES `credit_details` WRITE;
/*!40000 ALTER TABLE `credit_details` DISABLE KEYS */;
INSERT INTO `credit_details` VALUES (336,'8099035353'),(337,'9704498915'),(338,'8099035353'),(339,'8099035353'),(342,'8099035353'),(344,'9848642212');
/*!40000 ALTER TABLE `credit_details` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(50) NOT NULL,
  `address` varchar(150) DEFAULT NULL,
  `mobile` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `mobile` (`mobile`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'Raviteja','Moti Nagar, Hyderabad','8099035353'),(2,'Pranay','Dishuknagar, Hyderabad','9490518882'),(3,'Avinash','Uppal, Hyderabad','9908677737'),(4,'Abhishek','Nizampet, Hyderabad','9704498915'),(5,'Ashok','Hyd','9848642212');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
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
-- Table structure for table `dish_categories`
--

DROP TABLE IF EXISTS `dish_categories`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dish_categories` (
  `category_code` varchar(10) NOT NULL,
  `category_name` varchar(50) NOT NULL,
  PRIMARY KEY (`category_code`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dish_categories`
--

LOCK TABLES `dish_categories` WRITE;
/*!40000 ALTER TABLE `dish_categories` DISABLE KEYS */;
INSERT INTO `dish_categories` VALUES ('1','Appetizers'),('10','Cold Beverages'),('2','Basmati Rice'),('3','Roties'),('4','Tandoori Specialities'),('5','Fry Specialities'),('6','Hyderabadi Specialities'),('7','Special Curries'),('8','Desserts'),('9','Accompaniments');
/*!40000 ALTER TABLE `dish_categories` ENABLE KEYS */;
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
  `category_code` varchar(10) NOT NULL,
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
-- Table structure for table `dish_orders`
--

DROP TABLE IF EXISTS `dish_orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dish_orders` (
  `bill_number` bigint(20) NOT NULL,
  `item_name` varchar(50) NOT NULL,
  `quantity` int(8) NOT NULL,
  `item_cost` decimal(8,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dish_orders`
--

LOCK TABLES `dish_orders` WRITE;
/*!40000 ALTER TABLE `dish_orders` DISABLE KEYS */;
INSERT INTO `dish_orders` VALUES (336,' Palak Pakoda ',2,'5.00'),(336,' Veg Pakoda ',2,'5.00'),(337,' Palak Pakoda ',2,'5.00'),(337,' Veg Pakoda ',2,'5.00'),(338,' Palak Pakoda ',2,'5.00'),(338,' Veg Pakoda ',2,'5.00'),(338,' Shami kabab ',2,'12.00'),(338,' Tandoori Chicken(full) ',3,'24.00'),(338,' Chicken Biryani ',9,'13.00'),(339,' Butter Naan ',9,'2.50'),(339,' Naan ',7,'2.00'),(339,' Chicken Biryani ',6,'13.00'),(339,' Mutton Biryani ',5,'14.00'),(339,' Garlic Chiken  ',3,'10.00'),(339,' Chiken 65 ',3,'10.00'),(342,' Khati Dal ',5,'3.00'),(342,' Naan ',4,'2.00'),(342,' Water Bottle(big) ',4,'2.00'),(344,' Palak Pakoda ',3,'5.00'),(344,' Plane Rice ',3,'5.00'),(360,' Palak Pakoda ',2,'5.00'),(360,' Tandoori Chicken(full) ',2,'24.00'),(360,' Tandoori chicken(Half) ',2,'12.00'),(360,' Mutton Sheck Kabab ',2,'14.00'),(365,' Palak Pakoda ',9,'5.00'),(365,' Veg Pakoda ',1,'5.00'),(365,' Water Bottle(big) ',1,'2.00'),(365,' Water Bottle(small) ',1,'1.00'),(365,' Tea ',1,'1.00'),(365,' Chicken Biryani ',1,'13.00'),(365,' Bag Rice Dalcha ',1,'7.00'),(365,' Mutton Biryani ',1,'14.00'),(365,' Plane Rice ',3,'5.00'),(365,' Vegetable Biryani ',1,'10.00'),(366,' Palak Pakoda ',1,'5.00'),(366,' Veg Pakoda ',1,'5.00');
/*!40000 ALTER TABLE `dish_orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emp1`
--

DROP TABLE IF EXISTS `emp1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `emp1` (
  `id` int(11) NOT NULL,
  `name` varchar(30) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emp1`
--

LOCK TABLES `emp1` WRITE;
/*!40000 ALTER TABLE `emp1` DISABLE KEYS */;
/*!40000 ALTER TABLE `emp1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `emp2`
--

DROP TABLE IF EXISTS `emp2`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `emp2` (
  `id` int(11) DEFAULT NULL,
  `sal` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `emp2`
--

LOCK TABLES `emp2` WRITE;
/*!40000 ALTER TABLE `emp2` DISABLE KEYS */;
INSERT INTO `emp2` VALUES (2,100);
/*!40000 ALTER TABLE `emp2` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `expenses`
--

DROP TABLE IF EXISTS `expenses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `expenses` (
  `exp_id` bigint(20) NOT NULL,
  `exp_head` varchar(30) NOT NULL,
  `exp_sub_head` varchar(60) NOT NULL,
  `exp_details` varchar(120) NOT NULL,
  `exp_amount` decimal(12,2) NOT NULL,
  `exp_date` varchar(20) NOT NULL,
  `created_by` varchar(20) NOT NULL,
  `created_on` varchar(20) NOT NULL,
  `last_updated_on` varchar(20) NOT NULL,
  `last_updated_by` varchar(20) NOT NULL,
  PRIMARY KEY (`exp_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `expenses`
--

LOCK TABLES `expenses` WRITE;
/*!40000 ALTER TABLE `expenses` DISABLE KEYS */;
/*!40000 ALTER TABLE `expenses` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `expenses_seq`
--

DROP TABLE IF EXISTS `expenses_seq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `expenses_seq` (
  `n` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`n`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `expenses_seq`
--

LOCK TABLES `expenses_seq` WRITE;
/*!40000 ALTER TABLE `expenses_seq` DISABLE KEYS */;
/*!40000 ALTER TABLE `expenses_seq` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `bill_number` bigint(20) NOT NULL,
  `bill_date` varchar(20) NOT NULL,
  `bill_amount` decimal(12,2) NOT NULL,
  `discount` decimal(6,2) NOT NULL,
  `net_amount` decimal(12,2) NOT NULL,
  `created_by` varchar(20) NOT NULL,
  `sales_type` varchar(10) NOT NULL,
  `table_num` varchar(10) DEFAULT '',
  `bill_type` varchar(10) DEFAULT 'cash',
  `bill_status` varchar(10) DEFAULT 'pending',
  PRIMARY KEY (`bill_number`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (336,'01/11/2013 01:29:37','20.00','0.00','20.00','john','Al-a-Carte','T02','Credit','completed'),(337,'01/11/2013 01:35:15','20.00','0.00','20.00','john','Al-a-Carte','T01','Credit','completed'),(338,'01/11/2013 13:07:01','233.00','13.00','220.00','john','Parcel','-','Credit','completed'),(339,'01/11/2013 13:08:11','244.50','0.00','244.50','john','Bulk','-','Credit','completed'),(342,'01/11/2013 14:36:50','31.00','0.00','31.00','john','Al-a-Carte','T03','Credit','completed'),(344,'01/11/2013 14:40:01','30.00','0.00','30.00','john','Al-a-Carte','T01','Credit','completed'),(360,'02/11/2013 15:42:29','110.00','0.00','110.00','murali','Al-a-Carte','T01','Cash','completed'),(365,'04/11/2013 16:42:48','113.00','0.00','113.00','murali','Al-a-Carte','T01','','pending'),(366,'04/11/2013 16:43:21','10.00','0.00','10.00','murali','Al-a-Carte','T01','Cash','completed');
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `raw_materials`
--

DROP TABLE IF EXISTS `raw_materials`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `raw_materials` (
  `id` varchar(20) NOT NULL,
  `description` varchar(50) NOT NULL,
  `uom` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `raw_materials`
--

LOCK TABLES `raw_materials` WRITE;
/*!40000 ALTER TABLE `raw_materials` DISABLE KEYS */;
INSERT INTO `raw_materials` VALUES ('1','2','3'),('3','2','1'),('','',''),('1','2','3'),('','',''),('Id_01','Desc_01','unit_01'),('ID_02','Desc_02','Unit_02'),('','','');
/*!40000 ALTER TABLE `raw_materials` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `seq`
--

DROP TABLE IF EXISTS `seq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `seq` (
  `n` bigint(20) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`n`)
) ENGINE=InnoDB AUTO_INCREMENT=371 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `seq`
--

LOCK TABLES `seq` WRITE;
/*!40000 ALTER TABLE `seq` DISABLE KEYS */;
INSERT INTO `seq` VALUES (363),(364),(365),(366),(367),(368),(369),(370);
/*!40000 ALTER TABLE `seq` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supplier_seq`
--

DROP TABLE IF EXISTS `supplier_seq`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `supplier_seq` (
  `n` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`n`)
) ENGINE=InnoDB AUTO_INCREMENT=15 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier_seq`
--

LOCK TABLES `supplier_seq` WRITE;
/*!40000 ALTER TABLE `supplier_seq` DISABLE KEYS */;
INSERT INTO `supplier_seq` VALUES (2),(3),(4),(5),(6),(7),(8),(9),(10),(11),(12),(13),(14);
/*!40000 ALTER TABLE `supplier_seq` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `suppliers`
--

DROP TABLE IF EXISTS `suppliers`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `suppliers` (
  `supplier_num` int(11) NOT NULL AUTO_INCREMENT,
  `supplier_name` varchar(50) NOT NULL,
  `created_by` varchar(20) NOT NULL,
  `created_on` varchar(20) NOT NULL,
  `last_updated_by` varchar(20) NOT NULL,
  `last_updated_on` varchar(20) NOT NULL,
  `first_contact_name` varchar(50) NOT NULL,
  `first_contact_num` varchar(20) NOT NULL,
  `first_mobile_num` varchar(20) NOT NULL,
  `second_contact_name` varchar(50) NOT NULL,
  `second_contact_num` varchar(20) NOT NULL,
  `second_mobile_num` varchar(20) NOT NULL,
  `address_line1` varchar(50) NOT NULL,
  `address_line2` varchar(50) NOT NULL,
  `address_line3` varchar(50) NOT NULL,
  PRIMARY KEY (`supplier_num`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `suppliers`
--

LOCK TABLES `suppliers` WRITE;
/*!40000 ALTER TABLE `suppliers` DISABLE KEYS */;
INSERT INTO `suppliers` VALUES (4,'Ranjith','murali','04/11/2013 15:56:19','not updated','not updated','Ranjith','123','234','Ranjith','987','876','hyd','hyd','hyd'),(5,'Mohan','murali','04/11/2013 15:56:58','murali','04/11/2013 16:30:05','Mohan','234','234','Mohan','345','234','xyz','xyz','xyz');
/*!40000 ALTER TABLE `suppliers` ENABLE KEYS */;
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

-- Dump completed on 2013-11-05 16:10:16
