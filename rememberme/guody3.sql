/*
Navicat MySQL Data Transfer

Source Server         : nanyang
Source Server Version : 50614
Source Host           : localhost:3306
Source Database       : nanyang

Target Server Type    : MYSQL
Target Server Version : 50614
File Encoding         : 65001

Date: 2018-11-15 22:14:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `ts_msg_technology`
-- ----------------------------
DROP TABLE IF EXISTS `ts_msg_technology`;
CREATE TABLE `ts_msg_technology` (
  `id` varchar(255) NOT NULL COMMENT '主键',
  `name` varchar(255) NOT NULL COMMENT '名称',
  `remarks` varchar(255) NOT NULL COMMENT '创建人',
  `createUser` varchar(255) NOT NULL,
  `createTime` varchar(255) DEFAULT NULL,
  `bak1` varchar(255) DEFAULT NULL,
  `bak2` varchar(255) DEFAULT NULL,
  `bak3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='工艺类型表';

-- ----------------------------
-- Records of ts_msg_technology
-- ----------------------------
INSERT INTO `ts_msg_technology` VALUES ('0dbbb07c0caa412498dd6f9a6f77860c', '光气及光气化工艺', '超级管理员', 'u_10001', '2018-11-15 22:09:19', null, null, null);
INSERT INTO `ts_msg_technology` VALUES ('1279176795f84b9e933e8de32d2e9da4', '重氮化工艺', '超级管理员', 'u_10001', '2018-11-15 22:08:06', null, null, null);
INSERT INTO `ts_msg_technology` VALUES ('12aeae439fb64bd88ef44428bf06fe73', '过氧化工艺', '超级管理员', 'u_10001', '2018-11-15 22:07:44', null, null, null);
INSERT INTO `ts_msg_technology` VALUES ('18bc7ab36aff4ef0b290ca426d097772', '煤气化及煤化工新工艺', '超级管理员', 'u_10001', '2018-11-11 22:32:24', null, null, null);
INSERT INTO `ts_msg_technology` VALUES ('640808c94c6a491c81940591e46ff680', '具有国家规定禁止采用的 工艺设备 3', '超级管理员', 'u_10001', '2018-11-11 22:31:40', null, null, null);
INSERT INTO `ts_msg_technology` VALUES ('672637c4b3ca433f8fbfde2f90360bef', '电解工艺（氯碱）', '超级管理员', 'u_10001', '2018-11-15 22:09:12', null, null, null);
INSERT INTO `ts_msg_technology` VALUES ('8277df6d524447b9b7565febce9fa68c', '氟化工艺', '超级管理员', 'u_10001', '2018-11-15 22:08:20', null, null, null);
INSERT INTO `ts_msg_technology` VALUES ('8317e06b400f468cbac4e85536df8f55', '合成氨工艺', '超级管理员', 'u_10001', '2018-11-15 22:08:37', null, null, null);
INSERT INTO `ts_msg_technology` VALUES ('86753e0c7114479e9c35ec4cd484f385', '偶氮化工艺', '超级管理员', 'u_10001', '2018-11-11 22:32:02', null, null, null);
INSERT INTO `ts_msg_technology` VALUES ('8b8afab59f9c4effb0233c978e23cc81', '电石生产工艺', '超级管理员', 'u_10001', '2018-11-11 22:32:10', null, null, null);
INSERT INTO `ts_msg_technology` VALUES ('9104e510c3c441b5b81e4778c09c7a54', '加氢工艺', '超级管理员', 'u_10001', '2018-11-15 22:08:12', null, null, null);
INSERT INTO `ts_msg_technology` VALUES ('9b4b4d3c3780435fb82877be765b52c5', '聚合工艺', '超级管理员', 'u_10001', '2018-11-15 22:07:14', null, null, null);
INSERT INTO `ts_msg_technology` VALUES ('9ff5de69e7024e0e98b3c82b366f3e63', '胺基化工艺', '超级管理员', 'u_10001', '2018-11-15 22:07:37', null, null, null);
INSERT INTO `ts_msg_technology` VALUES ('d4b3b74017854f8f894eab81d8af2502', '其他涉及易燃易爆等物质 的工艺过程 2', '超级管理员', 'u_10001', '2018-11-11 22:31:48', null, null, null);
INSERT INTO `ts_msg_technology` VALUES ('d4d8bd627284401b8f9599d1776e2bd5', '硝化工艺', '超级管理员', 'u_10001', '2018-11-15 22:08:56', null, null, null);
INSERT INTO `ts_msg_technology` VALUES ('e3e7ef11214a4db488c17a97e3ff2142', '其他高温或高压的工艺 1', '超级管理员', 'u_10001', '2018-11-11 22:31:56', null, null, null);
INSERT INTO `ts_msg_technology` VALUES ('ee12ce5c02524509aaaa11b8fe607c22', '磺化工艺', '超级管理员', 'u_10001', '2018-11-15 22:07:22', null, null, null);
INSERT INTO `ts_msg_technology` VALUES ('f3a8b49087a642409f2f424a7cc64015', '裂解（裂化）工艺', '超级管理员', 'u_10001', '2018-11-15 22:08:29', null, null, null);
INSERT INTO `ts_msg_technology` VALUES ('f3bc3d141c4d488db55abc6690c66db9', '氧化工艺', '超级管理员', 'u_10001', '2018-11-15 22:07:51', null, null, null);
INSERT INTO `ts_msg_technology` VALUES ('feca0625265f45f1b551d2872dc7282e', '氯化工艺', '超级管理员', 'u_10001', '2018-11-15 22:09:05', null, null, null);
INSERT INTO `ts_msg_technology` VALUES ('ff6ee0670baa4b21895f570727ed86fc', '烷基化工艺', '超级管理员', 'u_10001', '2018-11-15 22:07:07', null, null, null);
