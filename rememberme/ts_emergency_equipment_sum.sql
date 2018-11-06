/*
Navicat MySQL Data Transfer

Source Server         : mysql
Source Server Version : 50716
Source Host           : 127.0.0.1:3306
Source Database       : nanyang

Target Server Type    : MYSQL
Target Server Version : 50716
File Encoding         : 65001

Date: 2018-11-05 21:41:21
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ts_emergency_equipment_sum
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
  `create_user` varchar(255) DEFAULT NULL COMMENT '创建用户',
  `create_time` varchar(255) DEFAULT NULL COMMENT '创建时间',
  `company_id` varchar(255) DEFAULT NULL COMMENT '公司id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='F2应急救援设施设备汇总表';

-- ----------------------------
-- Table structure for ts_emergency_material_sum
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
  `create_user` varchar(255) DEFAULT NULL COMMENT '创建用户',
  `create_time` varchar(255) DEFAULT NULL COMMENT '创建时间',
  `company_id` varchar(255) DEFAULT NULL COMMENT '公司id',
  `bak1` varchar(255) DEFAULT NULL,
  `bak2` varchar(255) DEFAULT NULL,
  `bak3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='F3应急救援物资汇总表';
