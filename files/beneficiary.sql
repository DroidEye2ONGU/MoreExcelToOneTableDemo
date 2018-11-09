/*
SQLyog  v12.2.6 (64 bit)
MySQL - 5.7.23-log : Database - beneficiarytest
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`beneficiarytest` /*!40100 DEFAULT CHARACTER SET latin1 */;

USE `beneficiarytest`;

/*Table structure for table `project_beneficiary_help` */

DROP TABLE IF EXISTS `project_beneficiary_help`;

CREATE TABLE `project_beneficiary_help` (
  `ID` int(11) DEFAULT NULL,
  `PROJECT_ID` varchar(255) DEFAULT NULL,
  `HELP_TYPE` varchar(255) DEFAULT NULL,
  `BENEFIT_NAME` varchar(255) DEFAULT NULL,
  `BENEFIT` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `project_beneficiary_help` */

insert  into `project_beneficiary_help`(`ID`,`PROJECT_ID`,`HELP_TYPE`,`BENEFIT_NAME`,`BENEFIT`) values 
(1,'1','totalyHel','Wang','1000');

/*Table structure for table `project_beneficiary_map` */

DROP TABLE IF EXISTS `project_beneficiary_map`;

CREATE TABLE `project_beneficiary_map` (
  `ID` int(11) DEFAULT NULL,
  `PROJECT_TYPE` int(11) DEFAULT NULL,
  `PROJECT_BENEFICIARY_CLASS` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `project_beneficiary_map` */

insert  into `project_beneficiary_map`(`ID`,`PROJECT_TYPE`,`PROJECT_BENEFICIARY_CLASS`) values 
(1,1,'beneficiary.model.BeneficiaryHelp'),
(2,2,'beneficiary.model.BeneficiaryScholar');

/*Table structure for table `project_beneficiary_scholar` */

DROP TABLE IF EXISTS `project_beneficiary_scholar`;

CREATE TABLE `project_beneficiary_scholar` (
  `ID` int(11) DEFAULT NULL,
  `PROJECT_ID` varchar(255) DEFAULT NULL,
  `HELP_SCHOOL` varchar(255) DEFAULT NULL,
  `GRADE` int(11) DEFAULT NULL COMMENT '成绩',
  `BENEFIT` varchar(22) DEFAULT NULL,
  `BENEFIT_NAME` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `project_beneficiary_scholar` */

insert  into `project_beneficiary_scholar`(`ID`,`PROJECT_ID`,`HELP_SCHOOL`,`GRADE`,`BENEFIT`,`BENEFIT_NAME`) values 
(1,'1','NUC',1500,'1000','Mr.wang');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
