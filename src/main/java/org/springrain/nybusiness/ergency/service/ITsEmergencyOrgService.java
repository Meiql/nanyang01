package org.springrain.nybusiness.ergency.service;

import java.util.List;

import org.springrain.nybusiness.ergency.entity.TsEmergencyOrg;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-03 10:32:40
 * @see org.springrain.nybusiness.ergency.service.TsEmergencyOrg
 */
public interface ITsEmergencyOrgService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsEmergencyOrg findTsEmergencyOrgById(Object id) throws Exception;
	
	/**
	 * 
	 * @param id
	 * @param pid
	 * @return 查询newCode
	 * @throws Exception
	 */
	String findOrgNewComcode(String id, String pid)throws Exception;
	
	/**
	 * 
	 * @param entity
	 * @return 保存应急组织结构
	 * @throws Exception
	 */
	public String saveTsEmergencyOrg(TsEmergencyOrg entity) throws Exception;
	
	
	/**
	 * 
	 * @param entity
	 * @return 修改组织机构
	 * @throws Exception
	 */
	public Integer updateTsEmergencyOrg(TsEmergencyOrg entity) throws Exception;
	
	
	/**
	 * 
	 * @return 查询部门信息
	 * @throws Exception
	 */
	public List<TsEmergencyOrg> finderTsEmergencyOrgForList()throws Exception;
}
