/*
Navicat MySQL Data Transfer

Source Server         : nanyang
Source Server Version : 50614
Source Host           : localhost:3306
Source Database       : nanyang

Target Server Type    : MYSQL
Target Server Version : 50614
File Encoding         : 65001

Date: 2018-11-19 23:13:42
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `ts_msg_product_technology`
-- ----------------------------
DROP TABLE IF EXISTS `ts_msg_product_technology`;
CREATE TABLE `ts_msg_product_technology` (
  `id` varchar(255) NOT NULL,
  `technologyId` varchar(255) DEFAULT NULL COMMENT '工艺id',
  `riskUnitNumber` varchar(255) DEFAULT NULL COMMENT '涉及到的风险单元套数',
  `riskUnit` varchar(255) DEFAULT NULL COMMENT '涉及到的风险单元',
  `createUser` varchar(255) DEFAULT NULL,
  `createTime` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `companyId` varchar(255) DEFAULT NULL,
  `technologyName` varchar(255) DEFAULT NULL,
  `whetherOrNot` varchar(255) DEFAULT NULL,
  `bak3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='生产工艺过程综合情况表';

-- ----------------------------
-- Records of ts_msg_product_technology
-- ----------------------------
INSERT INTO `ts_msg_product_technology` VALUES ('304532c865cb416e9d08bd44109e476c', 'd4b3b74017854f8f894eab81d8af2502', '2', '撒的发生', 'u_10001', '2018-11-12 23:19:33', '超级管理员', '142a63b3a2ba4f6984f61f7c18edb76f', '其他涉及易燃易爆等物质 的工艺过程 2', '是', null);
