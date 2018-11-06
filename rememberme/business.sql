-- 通讯录 新增 删除菜单
INSERT INTO `t_menu` (`id`, `name`, `pid`, `description`, `pageurl`, `menuType`, `active`, `sortno`, `menuIcon`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('019cb5e9adb0450b9daf0ac11a11f3bf', '删除外部通讯录', '81702df7fdf24653b5369b1a19a3845a', '', '/tsmaillistoutside/delete', '0', '1', NULL, '', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_menu` (`id`, `name`, `pid`, `description`, `pageurl`, `menuType`, `active`, `sortno`, `menuIcon`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('28eb83ad4ea94a24b2a64bf3be3508ea', '新增通讯录', '1a25e97a820a4929921c031c8444ede2', '', '/tsmaillistinside/update', '0', '1', NULL, '', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_menu` (`id`, `name`, `pid`, `description`, `pageurl`, `menuType`, `active`, `sortno`, `menuIcon`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('81702df7fdf24653b5369b1a19a3845a', '外部通讯录', 'c6396e39f29540ed9adf90d61fbf08cb', '', '/tsmaillistoutside/list', '1', '1', NULL, '', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_menu` (`id`, `name`, `pid`, `description`, `pageurl`, `menuType`, `active`, `sortno`, `menuIcon`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('9f03354568f44cd7b641d567881374ea', '删除内部通讯录', '1a25e97a820a4929921c031c8444ede2', '', '/tsmaillistinside/delete', '0', '1', NULL, '', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_menu` (`id`, `name`, `pid`, `description`, `pageurl`, `menuType`, `active`, `sortno`, `menuIcon`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('cf55149310d248ccbea9b648f0073c40', '新增外部通讯录', '81702df7fdf24653b5369b1a19a3845a', '', '/tsmaillistoutside/update', '0', '1', NULL, '', NULL, NULL, NULL, NULL, NULL);
--李龙2018-11-03创建应急组织机构表
CREATE TABLE `ts_emergency_org` (
  `id` varchar(50) NOT NULL COMMENT '编号',
  `name` varchar(60) DEFAULT NULL COMMENT '名称',
  `comcode` varchar(1000) DEFAULT NULL COMMENT '代码',
  `pid` varchar(50) DEFAULT NULL COMMENT '上级部门ID',
  `leaf` int(11) DEFAULT NULL COMMENT '叶子节点(0:树枝节点;1:叶子节点)',
  `sortno` int(11) DEFAULT NULL COMMENT '排序号',
  `description` varchar(2000) DEFAULT NULL COMMENT '描述',
  `active` int(11) DEFAULT '1' COMMENT '是否有效(0否,1是)',
  `bak1` varchar(100) DEFAULT NULL,
  `bak2` varchar(100) DEFAULT NULL,
  `bak3` varchar(100) DEFAULT NULL,
  `bak4` varchar(100) DEFAULT NULL,
  `bak5` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='应急组织结构';

-- 李龙2018-11-03应急组织人员
CREATE TABLE `ts_emergency_user` (
  `id` varchar(50) NOT NULL COMMENT '编号',
  `name` varchar(60) DEFAULT NULL COMMENT '名称',
  `emergencyOrgId` varchar(50) DEFAULT NULL COMMENT '所属应急组织',
  `createUser` varchar(200) DEFAULT NULL COMMENT '创建人',
  `createTime` varchar(200) DEFAULT NULL COMMENT '创建时间',
  `updateUser` varchar(200) DEFAULT NULL COMMENT '更新人',
  `updateTime` varchar(200) DEFAULT NULL COMMENT '更新时间',
  `bak1` varchar(100) DEFAULT NULL,
  `bak2` varchar(100) DEFAULT NULL,
  `bak3` varchar(100) DEFAULT NULL,
  `bak4` varchar(100) DEFAULT NULL,
  `bak5` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='应急组织人员';
 -- 李龙应急组织机构和人员 菜单sql
INSERT INTO `t_menu` (`id`, `name`, `pid`, `description`, `pageurl`, `menuType`, `active`, `sortno`, `menuIcon`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('24503cd432b84bd8a6c48f45bf455a0a', '应急组织机构', '20a4992cf5884158bc03690d5783f396', '', '/tsemergencyorg/list', '1', '1', NULL, '', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_menu` (`id`, `name`, `pid`, `description`, `pageurl`, `menuType`, `active`, `sortno`, `menuIcon`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('b7fcd4968d474622b81ae80b69166396', '应急组织人员修改', 'e20ffc9a11f94862b498e401f6d9cf8b', '', '/tsemergencyuser/update', '0', '1', NULL, '', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_menu` (`id`, `name`, `pid`, `description`, `pageurl`, `menuType`, `active`, `sortno`, `menuIcon`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('d6cfdd05e4e2492d826012c33044ca9b', '应急组织删除', 'e20ffc9a11f94862b498e401f6d9cf8b', '', '/tsemergencyuser/delete', '0', '1', NULL, '', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_menu` (`id`, `name`, `pid`, `description`, `pageurl`, `menuType`, `active`, `sortno`, `menuIcon`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('de91f9aa6ead4fd2ad27c76d76a97067', '应急组织机构修改', '24503cd432b84bd8a6c48f45bf455a0a', '', '/tsemergencyorg/update', '0', '1', NULL, '', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_menu` (`id`, `name`, `pid`, `description`, `pageurl`, `menuType`, `active`, `sortno`, `menuIcon`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('e20ffc9a11f94862b498e401f6d9cf8b', '应急组织人员', '20a4992cf5884158bc03690d5783f396', '', '/tsemergencyuser/list', '1', '1', NULL, '', NULL, NULL, NULL, NULL, NULL);

-- 2018-11-15 创建用户表
CREATE TABLE `ts_company_info` (
  `id` varchar(50) NOT NULL,
  `companyName` varchar(255) DEFAULT NULL COMMENT '公司名称',
  `corporationCode` varchar(255) DEFAULT NULL COMMENT '法人代码',
  `corporationName` varchar(255) DEFAULT NULL COMMENT '法人名称',
  `postalCode` varchar(255) DEFAULT NULL COMMENT '邮政编码',
  `contactsName` varchar(255) DEFAULT NULL COMMENT '联系人',
  `phone` varchar(255) DEFAULT NULL COMMENT '联系电话',
  `eamil` varchar(255) DEFAULT NULL COMMENT '电子邮箱',
  `address` varchar(255) DEFAULT NULL COMMENT '厂区地址',
  `industrialyuanchu` varchar(255) DEFAULT NULL COMMENT '所在工业园区',
  `longitude` varchar(255) DEFAULT NULL COMMENT '经度',
  `latitude` varchar(255) DEFAULT NULL COMMENT '纬度',
  `runningDays` varchar(255) DEFAULT NULL COMMENT '运行天数',
  `mainBusiness` varchar(255) DEFAULT NULL COMMENT '主要业务',
  `industryCategary` varchar(255) DEFAULT NULL COMMENT '行业类别',
  `IndustryCode` varchar(255) DEFAULT NULL COMMENT '行业编码',
  `registerType` varchar(255) DEFAULT NULL COMMENT '注册类型',
  `enterprisesize` varchar(255) DEFAULT NULL COMMENT '企业规模',
  `factoryTime` varchar(255) DEFAULT NULL COMMENT '建厂时间',
  `wasterEmission` varchar(255) DEFAULT NULL COMMENT '废水排放量',
  `wasterWhereabouts` varchar(255) DEFAULT NULL COMMENT '废水排放去向',
  `orgid` varchar(255) DEFAULT NULL COMMENT '管辖机构id',
  `userId` varchar(255) DEFAULT NULL COMMENT '用户id',
  `createTime` varchar(255) DEFAULT NULL COMMENT '创建时间',
  `bak1` varchar(255) DEFAULT NULL,
  `bak2` varchar(255) DEFAULT NULL,
  `bak3` varchar(255) DEFAULT NULL,
  `state` varchar(255) DEFAULT NULL,
  `dismissal` varchar(255) DEFAULT NULL COMMENT '驳回原因',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- 企业管理菜单
INSERT INTO `t_menu` (`id`, `name`, `pid`, `description`, `pageurl`, `menuType`, `active`, `sortno`, `menuIcon`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('227958bad9f347cabdc9ba3a57530387', '企业信息审核更新', 'cb378a7da5da47ddb0e8396fafc42ded', '', '/tscompanyinfo/examineupdate', '0', '1', NULL, '', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_menu` (`id`, `name`, `pid`, `description`, `pageurl`, `menuType`, `active`, `sortno`, `menuIcon`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('5c2d109d1aeb4346bdd87d8d6f6dc567', '企业管理', '5588b53268e84fa3b2dbebcf24071e0d', '', NULL, '1', '1', NULL, '&#xe624;', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_menu` (`id`, `name`, `pid`, `description`, `pageurl`, `menuType`, `active`, `sortno`, `menuIcon`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('cb378a7da5da47ddb0e8396fafc42ded', '企业信息审核', '5c2d109d1aeb4346bdd87d8d6f6dc567', '', '/tscompanyinfo/examine', '1', '1', NULL, '', NULL, NULL, NULL, NULL, NULL);

-- 固定企业角色id
INSERT INTO `t_role` (`id`, `name`, `code`, `pid`, `roleType`, `remark`, `active`, `orgId`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('b259ecdaeff843a89490f805c8690de8', '企业角色', NULL, NULL, '0', '', '1', 'o_10047', NULL, NULL, NULL, NULL, NULL);

-- 固定角色菜单
INSERT INTO `t_role_menu` (`id`, `roleId`, `menuId`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('0b042aae5c8a447e957bf109a8a82ef0', 'b259ecdaeff843a89490f805c8690de8', '6fe2622924204513a5005ead14b8ec65', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_menu` (`id`, `roleId`, `menuId`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('0b09b638e8644df4834d4cd0940a84c4', 'b259ecdaeff843a89490f805c8690de8', '9b0dc488f0a7447d929111221c08dc10', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_menu` (`id`, `roleId`, `menuId`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('20990f716c0c45c282719f4f1ccd93cb', 'b259ecdaeff843a89490f805c8690de8', '28eb83ad4ea94a24b2a64bf3be3508ea', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_menu` (`id`, `roleId`, `menuId`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('22a1a27cdbf04b81a006a7826a81ca6e', 'b259ecdaeff843a89490f805c8690de8', '6bb89e6d9eba4c57ab1161812dd29f91', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_menu` (`id`, `roleId`, `menuId`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('24fa5f5852744c6eb3d67c1b61a4ddac', 'b259ecdaeff843a89490f805c8690de8', 'b7fcd4968d474622b81ae80b69166396', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_menu` (`id`, `roleId`, `menuId`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('37262edcfe4d45c5b7eef4dfa7d226da', 'b259ecdaeff843a89490f805c8690de8', '019cb5e9adb0450b9daf0ac11a11f3bf', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_menu` (`id`, `roleId`, `menuId`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('3bb4a83055dd4991a54fe8c3b8261c46', 'b259ecdaeff843a89490f805c8690de8', 'e20ffc9a11f94862b498e401f6d9cf8b', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_menu` (`id`, `roleId`, `menuId`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('3e23dd9ae4cb4f65a0fb950b59bba97b', 'b259ecdaeff843a89490f805c8690de8', 'e9808f5e37984cc1824b16687e618747', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_menu` (`id`, `roleId`, `menuId`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('416ba43a951e41b0b5dfd0fdef8d9162', 'b259ecdaeff843a89490f805c8690de8', 'c6396e39f29540ed9adf90d61fbf08cb', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_menu` (`id`, `roleId`, `menuId`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('41d1904b4a0d4dea9a859fcf9e8a0f17', 'b259ecdaeff843a89490f805c8690de8', '5588b53268e84fa3b2dbebcf24071e0d', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_menu` (`id`, `roleId`, `menuId`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('4795ff4d4c0045e88e450ef40f7ad1a6', 'b259ecdaeff843a89490f805c8690de8', '9c944422c70748ffa4ebb40c23c6bd80', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_menu` (`id`, `roleId`, `menuId`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('4ab705b9f86845d58d14bc4e92bb9633', 'b259ecdaeff843a89490f805c8690de8', '056906408fea45888fd42bbfa8f1d4b4', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_menu` (`id`, `roleId`, `menuId`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('5b0153d8d03f4ea88e0b720993d338e8', 'b259ecdaeff843a89490f805c8690de8', '48c5c32c2c424b54b4102488c9df45a4', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_menu` (`id`, `roleId`, `menuId`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('5cb0ac0c71ad4a42960566c246ec3532', 'b259ecdaeff843a89490f805c8690de8', '13ecac692aca449a9db1663f53caba66', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_menu` (`id`, `roleId`, `menuId`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('60cfc10e166b4a8b8a07f3e5f03e850f', 'b259ecdaeff843a89490f805c8690de8', '90fb34db92f14aeeb52470a85cd6c5e9', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_menu` (`id`, `roleId`, `menuId`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('6f6ecb9e527242239efa0f629b9b4cff', 'b259ecdaeff843a89490f805c8690de8', '454724432d384bc29251708c9ef0fe54', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_menu` (`id`, `roleId`, `menuId`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('9b0bf19595964436a9b87c07f87d3b5b', 'b259ecdaeff843a89490f805c8690de8', 'd22a5553e0a84c288e3c2ed5b4687fdf', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_menu` (`id`, `roleId`, `menuId`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('a431e8d55bd14b0d89be1b177d92608a', 'b259ecdaeff843a89490f805c8690de8', '81702df7fdf24653b5369b1a19a3845a', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_menu` (`id`, `roleId`, `menuId`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('a82d7c2922e343bfa8d2440d214f5e72', 'b259ecdaeff843a89490f805c8690de8', '1a25e97a820a4929921c031c8444ede2', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_menu` (`id`, `roleId`, `menuId`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('b9ffa673c8c84ffe920eea740c9a8bb6', 'b259ecdaeff843a89490f805c8690de8', 'ba9cde4d3cb64eb9b4c67271be6dcf5b', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_menu` (`id`, `roleId`, `menuId`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('c08b9e0a82bb40478c8ee14813f69894', 'b259ecdaeff843a89490f805c8690de8', 'e83dbefdfd3342a9a931cf9f7dbfa874', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_menu` (`id`, `roleId`, `menuId`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('c0bf5cdc672c4afd88f11cf30b61aee1', 'b259ecdaeff843a89490f805c8690de8', '20a4992cf5884158bc03690d5783f396', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_menu` (`id`, `roleId`, `menuId`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('cc7e0898c8914100a9e59c8aebc7afaa', 'b259ecdaeff843a89490f805c8690de8', 'cf55149310d248ccbea9b648f0073c40', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_menu` (`id`, `roleId`, `menuId`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('d578e61ab3b648e38f809f36b3a5c1ad', 'b259ecdaeff843a89490f805c8690de8', '9f03354568f44cd7b641d567881374ea', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_menu` (`id`, `roleId`, `menuId`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('d617caf41be240b697c74ecf838cbfc3', 'b259ecdaeff843a89490f805c8690de8', 'de91f9aa6ead4fd2ad27c76d76a97067', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_menu` (`id`, `roleId`, `menuId`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('df78389d9b3d48b3baf4ddcab8532862', 'b259ecdaeff843a89490f805c8690de8', '4a9fe6078b8a4d66b248492761ad388e', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_menu` (`id`, `roleId`, `menuId`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('ec1c0b578106495d99486a82bf13d9b1', 'b259ecdaeff843a89490f805c8690de8', '24503cd432b84bd8a6c48f45bf455a0a', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_menu` (`id`, `roleId`, `menuId`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('efc1f800f0ae4ef5a700ade3122f2899', 'b259ecdaeff843a89490f805c8690de8', 'e53ea47b73334a9585347264a63076cd', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_menu` (`id`, `roleId`, `menuId`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('f8dc4cfe199f40c7ad686003e326768b', 'b259ecdaeff843a89490f805c8690de8', 'd6cfdd05e4e2492d826012c33044ca9b', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_role_menu` (`id`, `roleId`, `menuId`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('fd168dd5a9e94d1e906dbf5e92f28ee0', 'b259ecdaeff843a89490f805c8690de8', 'aec3b07b53514d6985fac3ad7777c36b', NULL, NULL, NULL, NULL, NULL);

-- 用户管理 新增字段
alter table t_user add COLUMN conpanyid VARCHAR(200) DEFAULT NULL; 

