/*
Navicat MySQL Data Transfer

Source Server         : nanyang
Source Server Version : 50614
Source Host           : localhost:3306
Source Database       : nanyang

Target Server Type    : MYSQL
Target Server Version : 50614
File Encoding         : 65001

Date: 2018-11-01 17:04:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `ts_eme_equ_sum_category`
-- ----------------------------
DROP TABLE IF EXISTS `ts_eme_equ_sum_category`;
CREATE TABLE `ts_eme_equ_sum_category` (
  `id` decimal(10,0) NOT NULL,
  `name` varchar(100) DEFAULT NULL COMMENT '类别名称',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='F2 码表应急救援设施设备汇总表_类别码表';

-- ----------------------------
-- Records of ts_eme_equ_sum_category
-- ----------------------------

-- ----------------------------
-- Table structure for `ts_eme_plan_fil_adjustment`
-- ----------------------------
DROP TABLE IF EXISTS `ts_eme_plan_fil_adjustment`;
CREATE TABLE `ts_eme_plan_fil_adjustment` (
  `adjustment_id` varchar(100) DEFAULT NULL,
  `adjustment_catalog` varchar(255) DEFAULT NULL COMMENT '调整或补充文件目录',
  `adjustment_desc` varchar(255) DEFAULT NULL COMMENT '调整或补充内容',
  `id` varchar(100) NOT NULL DEFAULT '',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='补充或调整内容 与环境应急预案变更备案表 关联 adjustment_id 关联';

-- ----------------------------
-- Records of ts_eme_plan_fil_adjustment
-- ----------------------------

-- ----------------------------
-- Table structure for `ts_eme_plan_filing`
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
  `company_id` varchar(100) DEFAULT NULL COMMENT '公司id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='企业事业单位环境应急预案备案表';

-- ----------------------------
-- Records of ts_eme_plan_filing
-- ----------------------------

-- ----------------------------
-- Table structure for `ts_eme_plan_filing_mod`
-- ----------------------------
DROP TABLE IF EXISTS `ts_eme_plan_filing_mod`;
CREATE TABLE `ts_eme_plan_filing_mod` (
  `id` varchar(100) NOT NULL,
  `company_name` varchar(255) DEFAULT NULL COMMENT '公司名称',
  `contact` varchar(255) DEFAULT NULL COMMENT '联系',
  `contact_tel` varchar(255) DEFAULT NULL COMMENT '联系电话',
  `beian_number` varchar(255) DEFAULT NULL COMMENT '备案编号',
  `adjustment_id` varchar(100) DEFAULT NULL COMMENT '补充调整内容 关联到补充调整表',
  `adjustment_reason` varchar(255) DEFAULT NULL COMMENT '申请调整或补充理由',
  `apply_date` timestamp NULL DEFAULT NULL COMMENT '申请日期',
  `company_seal` varchar(255) DEFAULT NULL COMMENT '单位公章',
  `company_id` varchar(100) DEFAULT NULL COMMENT '公司id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='环境应急预案变更备案表';

-- ----------------------------
-- Records of ts_eme_plan_filing_mod
-- ----------------------------

-- ----------------------------
-- Table structure for `ts_emergency_equipment_sum`
-- ----------------------------
DROP TABLE IF EXISTS `ts_emergency_equipment_sum`;
CREATE TABLE `ts_emergency_equipment_sum` (
  `id` varchar(100) NOT NULL COMMENT 'id',
  `Serial_number` decimal(10,0) DEFAULT NULL COMMENT '序号',
  `category` decimal(10,0) DEFAULT NULL COMMENT '类别',
  `name` varchar(255) DEFAULT NULL COMMENT '名称',
  `quantity` decimal(10,0) DEFAULT NULL COMMENT '数量',
  `unit` varchar(10) DEFAULT NULL COMMENT '单位',
  `outside_tel` varchar(255) DEFAULT NULL COMMENT '外部供应单位联系方式_联络方式',
  `outside_people` varchar(255) DEFAULT NULL COMMENT '外部供应单位联系方式_主要联系人',
  `outside_company` varchar(255) DEFAULT NULL COMMENT '外部供应单位名称',
  `out_Equipment` varchar(255) DEFAULT NULL COMMENT '设备来源_厂外设备',
  `in_Equipment` varchar(255) DEFAULT NULL COMMENT '设备来源_厂内设备',
  `company_id` varchar(100) DEFAULT NULL COMMENT '公司id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='F2应急救援设施设备汇总表';

-- ----------------------------
-- Records of ts_emergency_equipment_sum
-- ----------------------------

-- ----------------------------
-- Table structure for `ts_emergency_material_sum`
-- ----------------------------
DROP TABLE IF EXISTS `ts_emergency_material_sum`;
CREATE TABLE `ts_emergency_material_sum` (
  `id` varchar(100) NOT NULL COMMENT 'id',
  `Serial_number` decimal(10,0) DEFAULT NULL,
  `meaterial_name` varchar(255) DEFAULT NULL COMMENT '物资名称',
  `quantity` decimal(10,0) DEFAULT NULL,
  `unit` varchar(10) DEFAULT NULL COMMENT '单位',
  `in_Equipment` varchar(255) DEFAULT NULL COMMENT '设备来源-厂内设备',
  `outside_tel` varchar(255) DEFAULT NULL COMMENT '外部供应单位主要联系方式',
  `outside_people` varchar(255) DEFAULT NULL COMMENT '外部供应单位主要联系人',
  `outside_company` varchar(255) DEFAULT NULL COMMENT '外部供应单位名称',
  `out_equipment` varchar(255) DEFAULT NULL COMMENT '设备来源-外部供应',
  `company_id` varchar(255) DEFAULT NULL COMMENT '公司id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='F3应急救援物资汇总表';

-- ----------------------------
-- Records of ts_emergency_material_sum
-- ----------------------------

-- ----------------------------
-- Table structure for `ts_ergency_investigation`
-- ----------------------------
DROP TABLE IF EXISTS `ts_ergency_investigation`;
CREATE TABLE `ts_ergency_investigation` (
  `id` decimal(10,0) NOT NULL,
  `serial_number` varchar(100) DEFAULT NULL,
  `category` decimal(10,0) DEFAULT NULL,
  `name` varchar(256) DEFAULT NULL,
  `type_Specifications` varchar(256) DEFAULT NULL,
  `quantity` decimal(10,0) DEFAULT NULL,
  `Unit` varchar(10) DEFAULT NULL,
  `place` varchar(256) DEFAULT NULL,
  `Custodian_or_post` varchar(256) DEFAULT NULL,
  `user_or_posts` varchar(256) DEFAULT NULL,
  `Final_validity_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `remarks` varchar(500) DEFAULT NULL,
  `company_id` varchar(100) DEFAULT NULL COMMENT '公司id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='F1应急资源现状调查表';

-- ----------------------------
-- Records of ts_ergency_investigation
-- ----------------------------

-- ----------------------------
-- Table structure for `ts_ergency_investigation_type`
-- ----------------------------
DROP TABLE IF EXISTS `ts_ergency_investigation_type`;
CREATE TABLE `ts_ergency_investigation_type` (
  `id` decimal(10,0) NOT NULL,
  `name` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='F1码表  应急资源现状调查表 类别  1.设备2物资3场所';

-- ----------------------------
-- Records of ts_ergency_investigation_type
-- ----------------------------
