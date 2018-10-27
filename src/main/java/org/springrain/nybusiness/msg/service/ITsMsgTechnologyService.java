package org.springrain.nybusiness.msg.service;

import org.springrain.nybusiness.msg.entity.TsMsgTechnology;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:44:38
 * @see org.springrain.nybusiness.msg.service.TsMsgTechnology
 */
public interface ITsMsgTechnologyService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsMsgTechnology findTsMsgTechnologyById(Object id) throws Exception;
	
	
	
}
