/*
Navicat MySQL Data Transfer

Source Server         : nanyang
Source Server Version : 50614
Source Host           : localhost:3306
Source Database       : nanyang

Target Server Type    : MYSQL
Target Server Version : 50614
File Encoding         : 65001

Date: 2018-11-15 22:14:05
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `ts_msg_enviro_risk`
-- ----------------------------
DROP TABLE IF EXISTS `ts_msg_enviro_risk`;
CREATE TABLE `ts_msg_enviro_risk` (
  `id` varchar(255) NOT NULL COMMENT '主键id',
  `riskUnitName` varchar(255) DEFAULT NULL COMMENT '风险单位名称',
  `riskUnitTypeid` varchar(255) DEFAULT NULL COMMENT '风险单位类型',
  `riskUnitTypeName` varchar(255) DEFAULT NULL COMMENT '风险单位类别 name ',
  `Reserves` varchar(255) DEFAULT NULL COMMENT '设计能力或储量',
  `createUser` varchar(255) DEFAULT NULL,
  `createTime` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `companyId` varchar(255) DEFAULT NULL COMMENT '企业id',
  `involveChemical` varchar(255) DEFAULT NULL,
  `describes` varchar(255) DEFAULT NULL,
  `createUserName` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='环境风险单元信息表';

-- ----------------------------
-- Records of ts_msg_enviro_risk
-- ----------------------------
INSERT INTO `ts_msg_enviro_risk` VALUES ('2a72a10c39fd40948ff5d9c1404581f7', '李冉杀猪场', null, '生产', '60', '', null, null, '', '猪血', '制作毛血旺', null);
INSERT INTO `ts_msg_enviro_risk` VALUES ('fad1930ed7114026905b75538ff53304', '李冉杀鸡厂', null, '生产', '50', 'u_10001', '2018-11-10 11:03:22', null, null, '鸡爪', '泡椒鸡爪', null);
