/*
Navicat MySQL Data Transfer

Source Server         : nanyang
Source Server Version : 50614
Source Host           : localhost:3306
Source Database       : nanyang

Target Server Type    : MYSQL
Target Server Version : 50614
File Encoding         : 65001

Date: 2018-11-05 16:14:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `ts_ergency_investigation`
-- ----------------------------
DROP TABLE IF EXISTS `ts_ergency_investigation`;
CREATE TABLE `ts_ergency_investigation` (
  `id` varchar(100) NOT NULL COMMENT '主键id',
  `serial_number` varchar(100) DEFAULT NULL COMMENT '序号',
  `category` decimal(10,0) DEFAULT NULL COMMENT '类别',
  `name` varchar(256) DEFAULT NULL COMMENT '名称',
  `type_Specifications` varchar(256) DEFAULT NULL COMMENT '型号或规格',
  `quantity` decimal(10,0) DEFAULT NULL COMMENT '数量',
  `Unit` varchar(10) DEFAULT NULL COMMENT '单位',
  `place` varchar(256) DEFAULT NULL COMMENT '位置',
  `Custodian_or_post` varchar(256) DEFAULT NULL COMMENT '保管人员或岗位',
  `user_or_posts` varchar(256) DEFAULT NULL COMMENT '使用人员或岗位',
  `Final_validity_time` varchar(255) DEFAULT 'CURRENT_TIMESTAMP' COMMENT '最后有效期限',
  `remarks` varchar(500) DEFAULT NULL COMMENT '备注',
  `company_id` varchar(100) DEFAULT NULL COMMENT '公司id',
  `create_user` varchar(255) DEFAULT NULL COMMENT '创建人',
  `create_time` varchar(255) DEFAULT NULL COMMENT '创建时间',
  `bak1` varchar(255) DEFAULT NULL,
  `bak2` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='F1应急资源现状调查表';

-- ----------------------------
-- Records of ts_ergency_investigation
-- ----------------------------
