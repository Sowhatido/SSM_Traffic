/*
SQLyog Ultimate - MySQL GUI v8.2 
MySQL - 5.3.5-MariaDB : Database - ssm_traffic
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`ssm_traffic` /*!40100 DEFAULT CHARACTER SET utf8 */;

/*Table structure for table `user` */

DROP TABLE IF EXISTS `user`;

CREATE TABLE `user` (
  `id` int(10) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `permission` varchar(255) DEFAULT NULL,
  `o_ther` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;

/*Data for the table `user` */

insert  into `user`(`id`,`username`,`password`,`permission`,`o_ther`) values (1,'张三','123456','车主',NULL),(2,'李四','111111','货主',NULL),(5,'admin','111111','车主',NULL),(7,'1','1','货主',NULL),(3,'2','2','车主',NULL),(4,'5','5','管理员',NULL),(6,'7','7','车主',NULL),(8,'8','8','车主',NULL),(9,'9','9','车主',NULL),(10,'10','10','管理员',NULL),(11,'11','11','车主',NULL),(12,'12','12','车主',NULL),(13,'admin1','1111111','业务员',NULL),(14,'admin14','11111114','车主',NULL),(15,'admin4','1111114','车主',NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
