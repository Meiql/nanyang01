
INSERT INTO t_menu values('ts_declare_list','年（月）度申报表管理', 'business_manager', null,'/tsdeclare/list','1','是',null,null);
INSERT INTO t_menu values('ts_declare_update','修改年（月）度申报表', 'ts_declare_list', null,'/tsdeclare/update','0','是',null,null);
INSERT INTO t_menu values('ts_declare_look','查看年（月）度申报表', 'ts_declare_list', null,'/tsdeclare/look','0','是',null,null);
INSERT INTO t_menu values('ts_declare_export','导出年（月）度申报表', 'ts_declare_list', null,'/tsdeclare/list/export','0','是',null,null);
INSERT INTO t_menu values('ts_declare_deletemore','批量删除年（月）度申报表', 'ts_declare_list', null,'/tsdeclare/delete/more','0','是',null,null);
INSERT INTO t_menu values('ts_declare_delete','删除年（月）度申报表', 'ts_declare_list', null,'/tsdeclare/delete','0','是',null,null);
INSERT INTO t_menu values('ts_declare_upload','导入年（月）度申报表', 'ts_declare_list', null,'/tsdeclare/upload','0','是',null,null);
INSERT INTO `t_role_menu` VALUES ('ts_declare_list_admin', 'admin', 'ts_declare_list');
INSERT INTO `t_role_menu` VALUES ('ts_declare_update_admin', 'admin', 'ts_declare_update');
INSERT INTO `t_role_menu` VALUES ('ts_declare_look_admin', 'admin', 'ts_declare_look');
INSERT INTO `t_role_menu` VALUES ('ts_declare_export_admin', 'admin', 'ts_declare_export');
INSERT INTO `t_role_menu` VALUES ('ts_declare_deletemore_admin', 'admin', 'ts_declare_deletemore');
INSERT INTO `t_role_menu` VALUES ('ts_declare_delete_admin', 'admin', 'ts_declare_delete');
INSERT INTO `t_role_menu` VALUES ('ts_declare_upload_admin', 'admin', 'ts_declare_upload');
