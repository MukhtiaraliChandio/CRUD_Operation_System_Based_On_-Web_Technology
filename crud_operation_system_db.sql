/*
SQLyog Ultimate v11.11 (64 bit)
MySQL - 5.5.5-10.1.21-MariaDB : Database - crud_operation_web_demo
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`crud_operation_web_demo` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `crud_operation_web_demo`;

/*Table structure for table `student` */

DROP TABLE IF EXISTS `student`;

CREATE TABLE `student` (
  `std_id` int(10) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) DEFAULT NULL,
  `last_name` varchar(50) DEFAULT NULL,
  `surname` varchar(50) DEFAULT NULL,
  `cnic` varchar(50) DEFAULT NULL,
  `contact_number` varchar(50) DEFAULT NULL,
  `profile_pic` varchar(50) DEFAULT NULL,
  `date_of_birth` varchar(50) DEFAULT NULL,
  `gender` varchar(50) DEFAULT NULL,
  `select_country` varchar(50) DEFAULT NULL,
  `select_province` varchar(50) DEFAULT NULL,
  `select_city_sindh` varchar(50) DEFAULT NULL,
  `select_city_punjab` varchar(50) DEFAULT NULL,
  `select_city_balochistan` varchar(50) DEFAULT NULL,
  `select_city_kpk` varchar(50) DEFAULT NULL,
  `select_city_gilgit_baltistan` varchar(50) DEFAULT NULL,
  `select_city_azad_kashmir` varchar(50) DEFAULT NULL,
  `hobbies` varchar(50) DEFAULT NULL,
  `address` varchar(200) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `user_password` varchar(50) DEFAULT NULL,
  `retype_password` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`std_id`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=latin1;

/*Data for the table `student` */

insert  into `student`(`std_id`,`first_name`,`last_name`,`surname`,`cnic`,`contact_number`,`profile_pic`,`date_of_birth`,`gender`,`select_country`,`select_province`,`select_city_sindh`,`select_city_punjab`,`select_city_balochistan`,`select_city_kpk`,`select_city_gilgit_baltistan`,`select_city_azad_kashmir`,`hobbies`,`address`,`email`,`user_password`,`retype_password`) values (13,'Shaista ','Ali','Chandio','4130660574701','03031135130','20191209_151244.jpg','2024-12-09','Female','Pakistan','Sindh','Sindh','Pakistan','Karachi','Lahore','Quetta','Peshawar','Reading Drawing ','Cilfton','shaista123@gmail.com','12345','1234'),(14,'Hujaj','Ali','Qambrani','4130660574706','03081135131','20191209_130738.jpg','2024-12-10','Male','England','kpk','Sukkar','Rawalpindi','Khuzdar','Mingora','Shigar','Mirpur','Reading Music Writing','A33/7 Johar Complex Mossmeyat Main Road University Karachi','hujaj12@gmail.com','12','12'),(15,'Sunny','Ali ','Sayed','4130660574703','03081135133','20191209_130738.jpg','2024-12-10','Male','England','kpk','Sukkar','Rawalpindi','kpk','America','Larkana','Rawalpindi','Reading Drawing gym','Laiquatabad','sunny@123gmail.com','1234566','1234566'),(16,'Mukhtiar ','Ali','Chandio','4130660574700','03081135133','20191209_141809.jpg','2024-12-06','Male','Pakistan','Sindh','Karachi','Lahore','Quetta','Peshawar','Kharmang','Hattian Bala','Drawing gym walking','  \r\nSultanabad','mukhtiarali567880@gmail.com','112233','112233'),(17,'Yusra','Ali','Chandio','4130660574755','03031139132','20191209_151242.jpg','2024-12-07','Female','Landon','Punjab','Benazirabad','Gujranwala','Hub','Kohat','Ghanche','Bhimber','Reading Music Writing Drawing gym walking','  \r\nNorth Naizamabad','yusra12@gmail.com','12345678','12345678'),(18,'Mehrab','Ali ','Baloch','4130660574704','03031135132','WhatsApp Image 2024-11-27 at 5.30.31 PM.jpeg','2024-12-09','Male','Pakistan','Sindh','Karachi','Lahore','Quetta','Peshawar','Kharmang','Hattian Bala','Music Writing Drawing','North Naizamabad','mehrab@gmail.com','1122','1122'),(19,'Aslam','Ali','UrduSpeaking','4130660574702','03091135133','','2025-11-01','Male','Pakistan','Sindh','Karachi','Lahore','Quetta','Peshawar','Kharmang','Hattian Bala','Reading Music','A33/7 Johar Complex Mossmeyat Main Road University Karachi','mukhtiarali567880@gmail.com','amjad4455','amjad1234');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
