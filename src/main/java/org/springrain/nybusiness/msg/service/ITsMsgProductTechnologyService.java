package org.springrain.nybusiness.msg.service;

import org.springrain.nybusiness.msg.entity.TsMsgProductTechnology;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:45:34
 * @see org.springrain.nybusiness.msg.service.TsMsgProductTechnology
 */
public interface ITsMsgProductTechnologyService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsMsgProductTechnology findTsMsgProductTechnologyById(Object id) throws Exception;
	
	
	
}
