/*
Navicat MySQL Data Transfer

Source Server         : nanyang
Source Server Version : 50614
Source Host           : localhost:3306
Source Database       : nanyang

Target Server Type    : MYSQL
Target Server Version : 50614
File Encoding         : 65001

Date: 2018-11-09 14:52:50
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `ts_eme_equ_sum_category`
-- ----------------------------
DROP TABLE IF EXISTS `ts_eme_equ_sum_category`;
CREATE TABLE `ts_eme_equ_sum_category` (
  `id` varchar(255) NOT NULL,
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
  `adjustment_id` varchar(100) DEFAULT NULL COMMENT '补充id',
  `adjustment_catalog` varchar(255) DEFAULT NULL COMMENT '调整或补充文件目录',
  `adjustment_desc` varchar(255) DEFAULT NULL COMMENT '调整或补充内容',
  `id` varchar(100) NOT NULL COMMENT '主键id',
  `bak1` varchar(255) DEFAULT NULL,
  `bak2` varchar(255) DEFAULT NULL,
  `bak3` varchar(255) DEFAULT NULL,
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
  `company_id` varchar(255) DEFAULT NULL COMMENT '公司id',
  `create_user` varchar(255) DEFAULT NULL COMMENT '创建者',
  `create_time` varchar(255) DEFAULT NULL COMMENT '创建时间',
  `bak1` varchar(255) DEFAULT NULL,
  `bak2` varchar(255) DEFAULT NULL,
  `bak3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='企业事业单位环境应急预案备案表';

-- ----------------------------
-- Records of ts_eme_plan_filing
-- ----------------------------
--INSERT INTO `ts_eme_plan_filing` VALUES ('78749bfe6053414ba9f27905b72b099f', '李龙养猪场', '123', '1', null, null, null, null, null, '科学大道133号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '4717d0ccadb34f2b8874c65af71e62b0', '71b30282e79e451a83893570d10e2d8c', '2018-11-09 12:20:02', null, null, null);
--INSERT INTO `ts_eme_plan_filing` VALUES ('b0ef849cfbe8476a9e263a15858e8401', '123', '2', '3', null, null, null, null, null, '001', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '4717d0ccadb34f2b8874c65af71e62b0', '71b30282e79e451a83893570d10e2d8c', '2018-11-09 12:19:30', null, null, null);

-- ----------------------------
-- Table structure for `ts_eme_plan_filing_mod`
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

-- ----------------------------
-- Records of ts_eme_plan_filing_mod
-- ----------------------------
--INSERT INTO `ts_eme_plan_filing_mod` VALUES ('cb17aec3a1e946778da2c0639551c101', '李龙养猪场', '123', '123', '1243', '123456', '12456', null, null, '4717d0ccadb34f2b8874c65af71e62b0', '71b30282e79e451a83893570d10e2d8c', '2018-11-09 14:40:01', null, null, null);

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
  `create_user` varchar(255) DEFAULT NULL COMMENT '创建用户',
  `create_time` varchar(255) DEFAULT NULL COMMENT '创建时间',
  `company_id` varchar(255) DEFAULT NULL COMMENT '公司id',
  `bak1` varchar(255) DEFAULT NULL,
  `bak2` varchar(255) DEFAULT NULL,
  `bak3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='F2应急救援设施设备汇总表';

-- ----------------------------
-- Records of ts_emergency_equipment_sum
-- ----------------------------
--INSERT INTO `ts_emergency_equipment_sum` VALUES ('4df4fd95d1f14ce0bd3c540f9c6b5d29', '1', '1', '1', '1', '1', '6', '5', '4', '3', '2', '71b30282e79e451a83893570d10e2d8c', '2018-11-06 15:15:40', '4717d0ccadb34f2b8874c65af71e62b0', null, null, null);
--INSERT INTO `ts_emergency_equipment_sum` VALUES ('8a78dfc303e14becafccf83ce419aef2', '11', '2', '12', '13', '14', '19', '18', '17', '16', '15', '71b30282e79e451a83893570d10e2d8c', '2018-11-06 15:21:49', '4717d0ccadb34f2b8874c65af71e62b0', null, null, null);

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
  `create_user` varchar(255) DEFAULT NULL COMMENT '创建用户',
  `create_time` varchar(255) DEFAULT NULL COMMENT '创建时间',
  `company_id` varchar(255) DEFAULT NULL COMMENT '公司id',
  `bak1` varchar(255) DEFAULT NULL,
  `bak2` varchar(255) DEFAULT NULL,
  `bak3` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='F3应急救援物资汇总表';

-- ----------------------------
-- Records of ts_emergency_material_sum
-- ----------------------------
--INSERT INTO `ts_emergency_material_sum` VALUES ('d7b41c307cd8442ea9439fa83911aa18', '1', '2', '3', '4', '5', '9', '8', '7', '6', '71b30282e79e451a83893570d10e2d8c', '2018-11-06 15:35:49', '4717d0ccadb34f2b8874c65af71e62b0', null, null, null);

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
--INSERT INTO `ts_ergency_investigation` VALUES ('ae6a0f1b376144b8a9a6049d7a20799c', 'liran1', '1', '0', '0', '0', '0', '0', '0', '0', '0', '测试权限li', '79d3cd9c00584133b528e92d55e3a6b1', '1b8bdcd94b6347c89482469fe67d4103', '2018-11-06 16:20:25', null, null);
--INSERT INTO `ts_ergency_investigation` VALUES ('d9229142072b4bd5b64f433471b97b2e', 'admin1', '3', '1', '1', '1', '1', '1', '1', '1', '1', '1', null, 'u_10001', '2018-11-06 16:15:07', null, null);
--INSERT INTO `ts_ergency_investigation` VALUES ('dd488638bee14ad39c8758195dacae5e', 'li测试', '2', '1', '1', '1', '1', '1', '1', '1', '1', 'li测试权限1', '4717d0ccadb34f2b8874c65af71e62b0', '71b30282e79e451a83893570d10e2d8c', '2018-11-06 16:13:01', null, null);

-- ----------------------------
-- Table structure for `ts_ergency_investigation_type`
-- ----------------------------
DROP TABLE IF EXISTS `ts_ergency_investigation_type`;
CREATE TABLE `ts_ergency_investigation_type` (
  `id` varchar(100) NOT NULL,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='F1码表  应急资源现状调查表 类别  1.设备2物资3场所';

-- ----------------------------
-- Records of ts_ergency_investigation_type
-- ----------------------------





INSERT INTO `t_menu` VALUES ('00749e75109f4711a42debcb267a64b3', 'F1新增', '20a4992cf5884158bc03690d5783f396', '', '/tsergencyinvestigation/update', '0', '1', '10', '', null, null, null, null, null);
INSERT INTO `t_menu` VALUES ('190a0dd8dafd4d979cbe0dc46287b0c3', 'F3新增', '20a4992cf5884158bc03690d5783f396', '', '/tsemergencymaterialsum/update', '0', '1', '15', '', null, null, null, null, null)INSERT INTO `t_menu` VALUES ('19ba78a5d9184f8ab83ce532260aaa10', '添加菜单', 'b71aef5d18b9440099bc7442749c9b0c', '', '/springrain/system/cms/wxconfig/menu/update', '0', '0', '1', '', null, null, null, null, null);
INSERT INTO `t_menu` VALUES ('19d74e4a994c46bf9ad7b0cee49ac2e1', 'F3删除', '20a4992cf5884158bc03690d5783f396', '', '/tsemergencymaterialsum/delete', '0', '1', '16', '', null, null, null, null, null);
INSERT INTO `t_menu` VALUES ('20a4992cf5884158bc03690d5783f396', '应急资源现状', '5588b53268e84fa3b2dbebcf24071e0d', '', null, '1', '1', null, '&#xe624;', null, null, null, null, null);
INSERT INTO `t_menu` VALUES ('23c2aa4965844637ac41c5d3300f5056', '应急救援物资汇总表', '20a4992cf5884158bc03690d5783f396', '', '/tsemergencymaterialsum/list', '1', '1', '3', '', null, null, null, null, null);
INSERT INTO `t_menu` VALUES ('29a57f1f0ece475bb2a30944c40a79ec', 'F1删除', '20a4992cf5884158bc03690d5783f396', '', '/tsergencyinvestigation/delete', '0', '1', '11', '', null, null, null, null, null);
INSERT INTO `t_menu` VALUES ('32fb1ce0c14a42959d38f5a67c0537b1', '环境应急预案备案表', '20a4992cf5884158bc03690d5783f396', '', '/tsemeplanfiling/list', '1', '1', '4', '', null, null, null, null, null);
INSERT INTO `t_menu` VALUES ('41147ca9b7e648919be5b4bcadd12dd0', '环境应急预案变更备案表', '20a4992cf5884158bc03690d5783f396', '', '/tsemeplanfilingmod/list', '1', '1', '5', '', null, null, null, null, null);
INSERT INTO `t_menu` VALUES ('4a9fe6078b8a4d66b248492761ad388e', '应急资源类型', '20a4992cf5884158bc03690d5783f396', '', '/tsergencyinvestigationtype/list', '1', '1', null, '', null, null, null, null, null);
INSERT INTO `t_menu` VALUES ('5b114f278190416aa9bd9e72e0ae29d7', 'F2新增', '20a4992cf5884158bc03690d5783f396', '', '/tsemergencyequipmentsum/update', '0', '1', '12', '', null, null, null, null, null);
INSERT INTO `t_menu` VALUES ('73d4a0d1989546949e3689d97e2d8412', 'F2删除', '20a4992cf5884158bc03690d5783f396', '', '/tsemergencyequipmentsum/delete', '0', '1', '14', '', null, null, null, null, null);
INSERT INTO `t_menu` VALUES ('75fdb338340342d4b6d4756df3c82b88', '备案删除', '20a4992cf5884158bc03690d5783f396', '', '/tsemeplanfiling/delete', '0', '1', null, '', null, null, null, null, null);
INSERT INTO `t_menu` VALUES ('a034a1c584bb4d2ebaf2c44fc5f06bc4', '变更删除', '20a4992cf5884158bc03690d5783f396', '', '/tsemeplanfilingmod/delete', '0', '1', null, '', null, null, null, null, null);
INSERT INTO `t_menu` VALUES ('a0784d7d2164402eb245206c7268fec2', '备案修改', '20a4992cf5884158bc03690d5783f396', '', '/tsemeplanfiling/update', '0', '1', null, '', null, null, null, null, null);
INSERT INTO `t_menu` VALUES ('af22605f79ad48adb7bb50cb3f0f06f1', '变更新增', '20a4992cf5884158bc03690d5783f396', '', '/tsemeplanfilingmod/add', '0', '1', null, '', null, null, null, null, null);
INSERT INTO `t_menu` VALUES ('ba9cde4d3cb64eb9b4c67271be6dcf5b', '应急资源现状调查表', '20a4992cf5884158bc03690d5783f396', 'FIv表', '/tsergencyinvestigation/list', '1', '1', '1', '', null, null, null, null, null);
INSERT INTO `t_menu` VALUES ('bfad0f66acb64c7f9a1b6950346bbdaa', '应急救援设施设备汇总表', '20a4992cf5884158bc03690d5783f396', '', '/tsemergencyequipmentsum/list', '1', '1', '2', '', null, null, null, null, null);
INSERT INTO `t_menu` VALUES ('c832009477fe44b48551b2d00fab878a', '变更修改', '20a4992cf5884158bc03690d5783f396', '', '/tsemeplanfilingmod/update', '0', '1', null, '', null, null, null, null, null);
INSERT INTO `t_menu` VALUES ('e80c7cf1a36e47d9a019a6f37a66c0b5', '备案新增', '20a4992cf5884158bc03690d5783f396', '', '/tsemeplanfiling/add', '0', '1', null, '', null, null, null, null, null);


