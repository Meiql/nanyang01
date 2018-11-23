package org.springrain.nybusiness.ergency.service;

import java.util.List;

import org.springrain.frame.util.Page;
import org.springrain.nybusiness.ergency.entity.TsEmergencyUser;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-03 10:32:33
 * @see org.springrain.nybusiness.ergency.service.TsEmergencyUser
 */
public interface ITsEmergencyUserService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsEmergencyUser findTsEmergencyUserById(Object id) throws Exception;
	
	/**
	 * 
	 * @param page
	 * @param tsEmergencyUser
	 * @return 自定义分页查询
	 * @throws Exception
	 */
	List<TsEmergencyUser> finderListForPage(Page page,TsEmergencyUser tsEmergencyUser)throws Exception;
	
	TsEmergencyUser finderObject()throws Exception;
	
	
}
