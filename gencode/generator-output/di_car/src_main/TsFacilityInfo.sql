
INSERT INTO t_menu values('ts_facility_info_list','设备信息管理', 'business_manager', null,'/tsfacilityinfo/list','1','是',null,null);
INSERT INTO t_menu values('ts_facility_info_update','修改设备信息', 'ts_facility_info_list', null,'/tsfacilityinfo/update','0','是',null,null);
INSERT INTO t_menu values('ts_facility_info_look','查看设备信息', 'ts_facility_info_list', null,'/tsfacilityinfo/look','0','是',null,null);
INSERT INTO t_menu values('ts_facility_info_export','导出设备信息', 'ts_facility_info_list', null,'/tsfacilityinfo/list/export','0','是',null,null);
INSERT INTO t_menu values('ts_facility_info_deletemore','批量删除设备信息', 'ts_facility_info_list', null,'/tsfacilityinfo/delete/more','0','是',null,null);
INSERT INTO t_menu values('ts_facility_info_delete','删除设备信息', 'ts_facility_info_list', null,'/tsfacilityinfo/delete','0','是',null,null);
INSERT INTO t_menu values('ts_facility_info_upload','导入设备信息', 'ts_facility_info_list', null,'/tsfacilityinfo/upload','0','是',null,null);
INSERT INTO `t_role_menu` VALUES ('ts_facility_info_list_admin', 'admin', 'ts_facility_info_list');
INSERT INTO `t_role_menu` VALUES ('ts_facility_info_update_admin', 'admin', 'ts_facility_info_update');
INSERT INTO `t_role_menu` VALUES ('ts_facility_info_look_admin', 'admin', 'ts_facility_info_look');
INSERT INTO `t_role_menu` VALUES ('ts_facility_info_export_admin', 'admin', 'ts_facility_info_export');
INSERT INTO `t_role_menu` VALUES ('ts_facility_info_deletemore_admin', 'admin', 'ts_facility_info_deletemore');
INSERT INTO `t_role_menu` VALUES ('ts_facility_info_delete_admin', 'admin', 'ts_facility_info_delete');
INSERT INTO `t_role_menu` VALUES ('ts_facility_info_upload_admin', 'admin', 'ts_facility_info_upload');
