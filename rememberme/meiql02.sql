/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50716
Source Host           : 127.0.0.1:3306
Source Database       : nanyang

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2018-11-08 22:33:37
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ts_eme_plan_fil_adjustment
-- ----------------------------
DROP TABLE IF EXISTS `ts_eme_plan_fil_adjustment`;
CREATE TABLE `ts_eme_plan_fil_adjustment` (
  `adjustment_id` varchar(100) DEFAULT NULL COMMENT '补充id',
  `adjustment_catalog` varchar(255) DEFAULT NULL COMMENT '调整或补充文件目录',
  `adjustment_desc` varchar(255) DEFAULT NULL COMMENT '调整或补充内容',
  `id` varchar(100) NOT NULL COMMENT '主键id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='补充或调整内容 与环境应急预案变更备案表 关联 adjustment_id 关联';

-- ----------------------------
-- Table structure for ts_eme_plan_filing
-- ----------------------------
DROP TABLE IF EXISTS `ts_eme_plan_filing`;
CREATE TABLE `ts_eme_plan_filing` (
  `id` varchar(100) NOT NULL,
  `company_name` varchar(255) DEFAULT NULL COMMENT '单位名称',
  `company_code` varchar(255) DEFAULT NULL COMMENT '机构代码',
  `legal_person` varchar(255) DEFAULT NULL COMMENT '法定代表人',
  `legal_person_tel` varchar(255) DEFAULT NULL COMMENT '法定代表人联系电话',
  `Contacts_people` varchar(255) DEFAULT NULL COMMENT '联系人',
  `Contacts_people_tel` varchar(255) DEFAULT NULL COMMENT '联系人联系电话',
  `fax` varchar(255) DEFAULT NULL COMMENT '传真',
  `email` varchar(255) DEFAULT NULL COMMENT '电子邮件',
  `address` varchar(255) DEFAULT NULL COMMENT '地址',
  `center` varchar(255) DEFAULT NULL COMMENT '经纬度（中心',
  `signing_date` date DEFAULT NULL COMMENT '签署日期 配合内容使用',
  `signing_desc` varchar(255) DEFAULT NULL COMMENT '签署内容公章等',
  `signing_people` varchar(255) DEFAULT NULL COMMENT '预案签署人',
  `Delivery_time` timestamp NULL DEFAULT NULL COMMENT '报送时间',
  `File_directory` varchar(1000) DEFAULT NULL COMMENT '预案备案文件目录',
  `Filing_opinion` varchar(1000) DEFAULT NULL COMMENT '备案意见',
  `Filing_number` varchar(255) DEFAULT NULL COMMENT '备案编号',
  `Delivery_company` varchar(255) DEFAULT NULL COMMENT '报送单位',
  `Acceptance_responsible_people` varchar(255) DEFAULT NULL COMMENT '受理部门负责人',
  `Acceptance_Agent` varchar(255) DEFAULT NULL COMMENT '经办人',
  `received_date` date DEFAULT NULL COMMENT '收讫日期配合备案意见使用',
  `plan_name` varchar(255) DEFAULT NULL COMMENT '预案名称',
  `risk_level` varchar(255) DEFAULT NULL COMMENT '风险级别',
  `Acceptance_date` date DEFAULT NULL COMMENT '受理日期配合备案意见使用',
  `company_id` varchar(255) DEFAULT NULL COMMENT '公司id',
  `create_user` varchar(255) DEFAULT NULL COMMENT '创建者',
  `create_time` varchar(255) DEFAULT NULL COMMENT '创建时间',
  `bak1` varchar(255) DEFAULT NULL,
  `bak2` varchar(255) DEFAULT NULL,
  `bak3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='企业事业单位环境应急预案备案表';

-- ----------------------------
-- Table structure for ts_eme_plan_filing_mod
-- ----------------------------
DROP TABLE IF EXISTS `ts_eme_plan_filing_mod`;
CREATE TABLE `ts_eme_plan_filing_mod` (
  `id` varchar(100) NOT NULL COMMENT '主键id',
  `company_name` varchar(255) DEFAULT NULL COMMENT '公司名称',
  `contact` varchar(255) DEFAULT NULL COMMENT '联系',
  `contact_tel` varchar(255) DEFAULT NULL COMMENT '联系电话',
  `beian_number` varchar(255) DEFAULT NULL COMMENT '备案编号',
  `adjustment_id` varchar(100) DEFAULT NULL COMMENT '补充调整内容 关联到补充调整表',
  `adjustment_reason` varchar(255) DEFAULT NULL COMMENT '申请调整或补充理由',
  `apply_date` timestamp NULL DEFAULT NULL COMMENT '申请日期',
  `company_seal` varchar(255) DEFAULT NULL COMMENT '单位公章',
  `company_id` varchar(255) DEFAULT NULL COMMENT '公司id',
  `create_user` varchar(255) DEFAULT NULL COMMENT '创建人',
  `create_time` varchar(255) DEFAULT NULL COMMENT '创建时间',
  `bak1` varchar(255) DEFAULT NULL,
  `bak2` varchar(255) DEFAULT NULL,
  `bak3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='环境应急预案变更备案表';
