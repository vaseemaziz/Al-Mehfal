-- MySQL dump 10.13  Distrib 5.5.32, for Win32 (x86)
--
-- Host: localhost    Database: restaurant
-- ------------------------------------------------------
-- Server version	5.5.32

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
  `due_amount` decimal(12,2) NOT NULL,
  `paid_amount` decimal(12,2) NOT NULL,
  `date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `credit_details`
--

LOCK TABLES `credit_details` WRITE;
/*!40000 ALTER TABLE `credit_details` DISABLE KEYS */;
INSERT INTO `credit_details` VALUES (0,'8099035353',0.00,50.00,'2013-12-03 12:28:10'),(1,'8099035353',150.00,0.00,'2013-12-03 07:02:39'),(2,'8099035353',25.00,75.00,'2013-12-03 07:03:41');
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
  `created_by` varchar(10) NOT NULL,
  `created_on` varchar(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `mobile` (`mobile`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES (1,'Raviteja','Hyd','8099035353','murali','2013-12-03 12:32:38');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dine_tables`
--

DROP TABLE IF EXISTS `dine_tables`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dine_tables` (
  `table_name` varchar(10) NOT NULL,
  `num_chairs` int(11) NOT NULL,
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
INSERT INTO `dish_categories` VALUES ('01','Appetizers'),('02','Basmati Rice'),('03','Roties'),('04','Tandoori Specialities'),('05','Fry Specialities'),('06','Hyderabadi Specialities'),('07','Special Curries'),('08','Desserts'),('09','Accompaniments'),('10','Cold Beverages');
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
INSERT INTO `dish_items` VALUES ('P101','Plane Rice',5.00,'02'),('P102','Mutton Biryani',14.00,'02'),('P103','Chicken Biryani',13.00,'02'),('P104','Butter Naan',2.50,'03'),('P105','Chiken 65',10.00,'05'),('P106','Khati Dal',3.00,'06'),('P107','Naan',2.00,'03'),('P108','Bag Rice Dalcha',7.00,'02'),('P109','Chicken Kurma',6.00,'06'),('P110','Roti',1.00,'03'),('P112','Mutton Kurma',6.00,'06'),('P113','Water Bottle(big)',2.00,'10'),('P114','Mutton Fry',12.00,'05'),('P115','Bagare Baingan',5.00,'06'),('P116','Water Bottle(small)',1.00,'10'),('P117','Butter Chicken',10.00,'07'),('P118','Shami kabab',12.00,'04'),('P119','Tea',1.00,'10'),('P120','Tandoori Chicken(full)',24.00,'04'),('P121','Tandoori chicken(Half)',12.00,'04'),('T100','Palak Pakoda',5.00,'01'),('T101','Veg Pakoda',5.00,'01'),('T102','Vegetable Biryani',10.00,'02'),('T103','Special Fried Rice',10.00,'02'),('T104','Pudina/Garlic Paratha',2.50,'03'),('T105','Special kulcha',3.00,'03'),('T106','Chicken Tikka',12.00,'04'),('T107','Malai Tikka',13.00,'04'),('T108','Paneer Tikka',10.00,'04'),('T109','Hariyali Tikka',13.00,'04'),('T110','Mutton Sheck Kabab',14.00,'04'),('T111','Garlic Chiken ',10.00,'05'),('T112','Chilli Chiken ',10.00,'05'),('T113','Bendi Fry ',5.00,'05'),('T114','Kofta Kabab ',5.00,'05'),('T115','Alu Methi Gosh',6.00,'06'),('T116','Gawar Phali Gosh',6.00,'06'),('T117','Shezhwan Chicken',10.00,'07'),('T118','Pepper Masala (Chicken/Mutton)',10.00,'07'),('T119','Dhal Makhani',7.00,'07'),('T120','Alu Mutter',7.00,'07'),('T121','Dabal Ka Mitha(Sweet)',4.00,'08'),('T122','Gulabjamun(2 pcs)',4.00,'08');
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
INSERT INTO `dish_orders` VALUES (1,' Palak Pakoda ',5,5.00),(1,' Veg Pakoda ',5,5.00),(1,' Chicken Biryani ',5,13.00),(1,' Bag Rice Dalcha ',5,7.00),(2,' Palak Pakoda ',2,5.00),(2,' Veg Pakoda ',3,5.00),(3,' Palak Pakoda ',2,5.00);
/*!40000 ALTER TABLE `dish_orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_master`
--

DROP TABLE IF EXISTS `employee_master`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee_master` (
  `reg_no` int(11) NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(50) NOT NULL,
  `gender` varchar(10) NOT NULL,
  `date_of_birth` varchar(20) NOT NULL,
  `date_of_joining` varchar(20) NOT NULL,
  `passport_no` varchar(40) NOT NULL,
  `passport_expiry_date` varchar(20) NOT NULL,
  `visa_no` varchar(40) NOT NULL,
  `visa_expiry_date` varchar(20) NOT NULL,
  `local_contact_no` varchar(20) NOT NULL,
  `international_contact_no` varchar(20) NOT NULL,
  `creation_by` varchar(20) NOT NULL,
  `creation_date` varchar(20) NOT NULL,
  `last_updated_by` varchar(20) NOT NULL,
  `last_updated_on` varchar(20) NOT NULL,
  `health_card_expiry` varchar(20) NOT NULL,
  `health_card_expiry2` varchar(20) NOT NULL,
  `bank_name` varchar(50) NOT NULL,
  `bank_branch_name` varchar(30) NOT NULL,
  `bank_account_no` varchar(30) NOT NULL,
  `basic_salary` decimal(12,2) NOT NULL,
  `address_line1` varchar(80) NOT NULL,
  `address_line2` varchar(80) NOT NULL,
  `address_line3` varchar(80) NOT NULL,
  `loginid` varchar(20) NOT NULL,
  PRIMARY KEY (`reg_no`),
  UNIQUE KEY `passport_no` (`passport_no`),
  UNIQUE KEY `visa_no` (`visa_no`),
  UNIQUE KEY `local_contact_no` (`local_contact_no`),
  UNIQUE KEY `international_contact_no` (`international_contact_no`),
  UNIQUE KEY `bank_account_no` (`bank_account_no`),
  UNIQUE KEY `loginid` (`loginid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_master`
--

LOCK TABLES `employee_master` WRITE;
/*!40000 ALTER TABLE `employee_master` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee_master` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_payroll`
--

DROP TABLE IF EXISTS `employee_payroll`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employee_payroll` (
  `reg_no` int(11) NOT NULL,
  `emp_name` varchar(30) NOT NULL,
  `date` varchar(20) NOT NULL,
  `basic_salary` decimal(12,2) NOT NULL,
  `gross_pay` decimal(10,2) NOT NULL,
  `loan_deduction` decimal(10,2) NOT NULL,
  `other_deduction` decimal(10,2) NOT NULL,
  `created_by` varchar(30) NOT NULL,
  `created_on` varchar(30) NOT NULL,
  `net_salary` decimal(10,2) NOT NULL,
  `last_updated_by` varchar(30) NOT NULL,
  `last_updated_on` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_payroll`
--

LOCK TABLES `employee_payroll` WRITE;
/*!40000 ALTER TABLE `employee_payroll` DISABLE KEYS */;
/*!40000 ALTER TABLE `employee_payroll` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employees`
--

DROP TABLE IF EXISTS `employees`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `employees` (
  `username` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `authority` varchar(15) NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employees`
--

LOCK TABLES `employees` WRITE;
/*!40000 ALTER TABLE `employees` DISABLE KEYS */;
INSERT INTO `employees` VALUES ('james','james','ROLE_ADMIN'),('john','john','ROLE_USER'),('murali','murali','ROLE_MANAGER'),('pranay','pranay','ROLE_USER'),('rana','rana','ROLE_MANAGER'),('vaseem','vaseem','ROLE_MANAGER');
/*!40000 ALTER TABLE `employees` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `expenses`
--

DROP TABLE IF EXISTS `expenses`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `expenses` (
  `exp_id` bigint(20) NOT NULL AUTO_INCREMENT,
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
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `orders` (
  `bill_number` bigint(20) NOT NULL AUTO_INCREMENT,
  `bill_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `bill_amount` decimal(12,2) NOT NULL,
  `discount` decimal(6,2) NOT NULL,
  `net_amount` decimal(12,2) NOT NULL,
  `created_by` varchar(20) NOT NULL,
  `sales_type` varchar(10) NOT NULL,
  `table_num` varchar(10) DEFAULT '',
  `bill_type` varchar(10) DEFAULT 'cash',
  `bill_status` varchar(10) DEFAULT 'pending',
  PRIMARY KEY (`bill_number`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,'2013-12-03 07:01:51',150.00,0.00,150.00,'murali','Al-a-Carte','T01','Credit','completed'),(2,'2013-12-03 07:02:57',25.00,0.00,25.00,'murali','Al-a-Carte','T01','Credit','completed'),(3,'2013-12-03 07:08:10',10.00,0.00,10.00,'murali','Al-a-Carte','T01','Cash','completed');
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchase_items`
--

DROP TABLE IF EXISTS `purchase_items`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `purchase_items` (
  `grp_no` bigint(20) NOT NULL,
  `raw_material_id` varchar(20) NOT NULL,
  `raw_material_desc` varchar(50) NOT NULL,
  `raw_material_uom` varchar(10) NOT NULL,
  `raw_material_qty` int(11) NOT NULL,
  `raw_material_amt` decimal(12,2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchase_items`
--

LOCK TABLES `purchase_items` WRITE;
/*!40000 ALTER TABLE `purchase_items` DISABLE KEYS */;
/*!40000 ALTER TABLE `purchase_items` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `purchases`
--

DROP TABLE IF EXISTS `purchases`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `purchases` (
  `grn_no` bigint(20) NOT NULL AUTO_INCREMENT,
  `supplier_num` int(11) NOT NULL,
  `supplier_name` varchar(50) NOT NULL,
  `invoice_num` varchar(30) NOT NULL,
  `invoice_date` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `invoice_amount` decimal(12,2) NOT NULL,
  `paid_amount` decimal(12,2) NOT NULL,
  `created_on` varchar(20) NOT NULL,
  `created_by` varchar(20) NOT NULL,
  `purchase_date` timestamp NOT NULL DEFAULT '0000-00-00 00:00:00',
  PRIMARY KEY (`grn_no`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `purchases`
--

LOCK TABLES `purchases` WRITE;
/*!40000 ALTER TABLE `purchases` DISABLE KEYS */;
/*!40000 ALTER TABLE `purchases` ENABLE KEYS */;
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
  `uom` varchar(10) NOT NULL,
  `sno` int(11) NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`sno`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `raw_materials`
--

LOCK TABLES `raw_materials` WRITE;
/*!40000 ALTER TABLE `raw_materials` DISABLE KEYS */;
INSERT INTO `raw_materials` VALUES ('Spices','Chilli Powder','KG',1);
/*!40000 ALTER TABLE `raw_materials` ENABLE KEYS */;
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
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `suppliers`
--

LOCK TABLES `suppliers` WRITE;
/*!40000 ALTER TABLE `suppliers` DISABLE KEYS */;
/*!40000 ALTER TABLE `suppliers` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2013-12-03 22:53:52
