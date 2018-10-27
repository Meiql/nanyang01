package org.springrain.nybusiness.environment.service;

import org.springrain.nybusiness.environment.entity.TsEnvironmentSensitivePoint;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 10:25:22
 * @see org.springrain.nybusiness.environment.service.TsEnvironmentSensitivePoint
 */
public interface ITsEnvironmentSensitivePointService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsEnvironmentSensitivePoint findTsEnvironmentSensitivePointById(Object id) throws Exception;
	
	
	
}
