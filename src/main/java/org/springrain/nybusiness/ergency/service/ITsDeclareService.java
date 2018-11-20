package org.springrain.nybusiness.ergency.service;

import org.springrain.nybusiness.ergency.entity.TsDeclare;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-20 11:16:28
 * @see org.springrain.nybusiness.company.service.TsDeclare
 */
public interface ITsDeclareService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsDeclare findTsDeclareById(Object id) throws Exception;
	
	
	
}
