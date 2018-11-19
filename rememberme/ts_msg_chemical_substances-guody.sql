/*
Navicat MySQL Data Transfer

Source Server         : nanyang
Source Server Version : 50614
Source Host           : localhost:3306
Source Database       : nanyang

Target Server Type    : MYSQL
Target Server Version : 50614
File Encoding         : 65001

Date: 2018-11-19 23:14:22
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `ts_msg_chemical_substances`
-- ----------------------------
DROP TABLE IF EXISTS `ts_msg_chemical_substances`;
CREATE TABLE `ts_msg_chemical_substances` (
  `id` varchar(255) NOT NULL COMMENT '主键',
  `chemistryName` varchar(255) DEFAULT NULL COMMENT '化学品名称',
  `casTypeid` varchar(255) DEFAULT NULL COMMENT 'CAS 号或危 险废物类类别id 字典',
  `casTypeName` varchar(255) DEFAULT NULL COMMENT 'CAS 号或危 险废物类别 2 name 字典',
  `maxstock` varchar(255) DEFAULT NULL COMMENT '最大存量',
  `rawmaterial` varchar(255) DEFAULT NULL COMMENT '原料',
  `accessories` varchar(255) DEFAULT NULL COMMENT '辅料',
  `product` varchar(255) DEFAULT NULL COMMENT '产品',
  `betweenProduct` varchar(255) DEFAULT NULL COMMENT '中间产品',
  `byProduct` varchar(255) DEFAULT NULL COMMENT '副产品',
  `catalyzer` varchar(255) DEFAULT NULL COMMENT '催化剂',
  `discardedMatter` varchar(255) DEFAULT NULL COMMENT '废弃物',
  `riskunit` varchar(255) DEFAULT NULL COMMENT '设计环境风险单位',
  `createUser` varchar(255) NOT NULL,
  `createTime` varchar(255) NOT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `companyId` varchar(255) DEFAULT NULL,
  `createUserName` varchar(255) DEFAULT NULL,
  `bak2` varchar(255) DEFAULT NULL,
  `bak3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='化学物质调研表';

-- ----------------------------
-- Records of ts_msg_chemical_substances
-- ----------------------------
INSERT INTO `ts_msg_chemical_substances` VALUES ('1229b910fe094bafb5f98f1439dcb0cb', '李冉的化妆品', null, '化学', '60', '水', '精油', '打包', '脏水', '渣滓', '酶', '酶', '李冉微店', 'u_10001', '2018-11-10 11:28:40', null, '142a63b3a2ba4f6984f61f7c18edb76f', '超级管理员', null, null);
INSERT INTO `ts_msg_chemical_substances` VALUES ('31b0c6a2a1a94da0bb1d2c46cd7ffe77', '氯化物', null, '化学物', '44', '氯', 'cl2', '氯1', '氯2', '氯3', '氯4', '氯5', '开封化工', 'u_10001', '2018-11-10 10:52:17', null, '142a63b3a2ba4f6984f61f7c18edb76f', null, null, null);
