/*
Navicat MySQL Data Transfer

Source Server         : zhengke
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : webplatform

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2018-07-07 21:19:35
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for tbl_customer
-- ----------------------------
DROP TABLE IF EXISTS `tbl_customer`;
CREATE TABLE `tbl_customer` (
  `customer_id` int(11) NOT NULL AUTO_INCREMENT,
  `customer_telnum` varchar(255) NOT NULL,
  `customer_password` varchar(255) NOT NULL DEFAULT '000000',
  `customer_sex` bit(1) NOT NULL,
  `customer_birthday` date NOT NULL,
  `customer_job` varchar(255) NOT NULL,
  `customer_picture` varchar(255) NOT NULL,
  PRIMARY KEY (`customer_id`),
  UNIQUE KEY `customer_telnum` (`customer_telnum`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for tbl_item
-- ----------------------------
DROP TABLE IF EXISTS `tbl_item`;
CREATE TABLE `tbl_item` (
  `item_id` int(11) NOT NULL AUTO_INCREMENT,
  `item_name` varchar(255) NOT NULL,
  `item_url` varchar(255) NOT NULL,
  `item_git_url` varchar(255) DEFAULT NULL,
  `Item_state` int(11) DEFAULT '1',
  `Item_time` datetime DEFAULT NULL,
  `Item_describe` varchar(255) DEFAULT NULL,
  `customer_id` int(11) NOT NULL,
  PRIMARY KEY (`item_id`),
  UNIQUE KEY `item_url` (`item_url`),
  KEY `customer_id` (`customer_id`),
  CONSTRAINT `tbl_item_ibfk_1` FOREIGN KEY (`customer_id`) REFERENCES `tbl_customer` (`customer_id`)
) ENGINE=InnoDB AUTO_INCREMENT=33 DEFAULT CHARSET=utf8;
