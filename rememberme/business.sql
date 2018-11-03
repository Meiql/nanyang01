-- 通讯录 新增 删除菜单
INSERT INTO `nanyang`.`t_menu` (`id`, `name`, `pid`, `description`, `pageurl`, `menuType`, `active`, `sortno`, `menuIcon`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('019cb5e9adb0450b9daf0ac11a11f3bf', '删除外部通讯录', '81702df7fdf24653b5369b1a19a3845a', '', '/tsmaillistoutside/delete', '0', '1', NULL, '', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `nanyang`.`t_menu` (`id`, `name`, `pid`, `description`, `pageurl`, `menuType`, `active`, `sortno`, `menuIcon`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('28eb83ad4ea94a24b2a64bf3be3508ea', '新增通讯录', '1a25e97a820a4929921c031c8444ede2', '', '/tsmaillistinside/update', '0', '1', NULL, '', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `nanyang`.`t_menu` (`id`, `name`, `pid`, `description`, `pageurl`, `menuType`, `active`, `sortno`, `menuIcon`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('81702df7fdf24653b5369b1a19a3845a', '外部通讯录', 'c6396e39f29540ed9adf90d61fbf08cb', '', '/tsmaillistoutside/list', '1', '1', NULL, '', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `nanyang`.`t_menu` (`id`, `name`, `pid`, `description`, `pageurl`, `menuType`, `active`, `sortno`, `menuIcon`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('9f03354568f44cd7b641d567881374ea', '删除内部通讯录', '1a25e97a820a4929921c031c8444ede2', '', '/tsmaillistinside/delete', '0', '1', NULL, '', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `nanyang`.`t_menu` (`id`, `name`, `pid`, `description`, `pageurl`, `menuType`, `active`, `sortno`, `menuIcon`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('cf55149310d248ccbea9b648f0073c40', '新增外部通讯录', '81702df7fdf24653b5369b1a19a3845a', '', '/tsmaillistoutside/update', '0', '1', NULL, '', NULL, NULL, NULL, NULL, NULL);
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
INSERT INTO `nanyang`.`t_menu` (`id`, `name`, `pid`, `description`, `pageurl`, `menuType`, `active`, `sortno`, `menuIcon`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('24503cd432b84bd8a6c48f45bf455a0a', '应急组织机构', '20a4992cf5884158bc03690d5783f396', '', '/tsemergencyorg/list', '1', '1', NULL, '', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `nanyang`.`t_menu` (`id`, `name`, `pid`, `description`, `pageurl`, `menuType`, `active`, `sortno`, `menuIcon`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('b7fcd4968d474622b81ae80b69166396', '应急组织人员修改', 'e20ffc9a11f94862b498e401f6d9cf8b', '', '/tsemergencyuser/update', '0', '1', NULL, '', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `nanyang`.`t_menu` (`id`, `name`, `pid`, `description`, `pageurl`, `menuType`, `active`, `sortno`, `menuIcon`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('d6cfdd05e4e2492d826012c33044ca9b', '应急组织删除', 'e20ffc9a11f94862b498e401f6d9cf8b', '', '/tsemergencyuser/delete', '0', '1', NULL, '', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `nanyang`.`t_menu` (`id`, `name`, `pid`, `description`, `pageurl`, `menuType`, `active`, `sortno`, `menuIcon`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('de91f9aa6ead4fd2ad27c76d76a97067', '应急组织机构修改', '24503cd432b84bd8a6c48f45bf455a0a', '', '/tsemergencyorg/update', '0', '1', NULL, '', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `nanyang`.`t_menu` (`id`, `name`, `pid`, `description`, `pageurl`, `menuType`, `active`, `sortno`, `menuIcon`, `bak1`, `bak2`, `bak3`, `bak4`, `bak5`) VALUES ('e20ffc9a11f94862b498e401f6d9cf8b', '应急组织人员', '20a4992cf5884158bc03690d5783f396', '', '/tsemergencyuser/list', '1', '1', NULL, '', NULL, NULL, NULL, NULL, NULL);


