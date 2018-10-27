package org.springrain.nybusiness.environment.service;

import org.springrain.nybusiness.environment.entity.TsEnvironmentElement;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 10:25:09
 * @see org.springrain.nybusiness.environment.service.TsEnvironmentElement
 */
public interface ITsEnvironmentElementService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsEnvironmentElement findTsEnvironmentElementById(Object id) throws Exception;
	
	
	
}
