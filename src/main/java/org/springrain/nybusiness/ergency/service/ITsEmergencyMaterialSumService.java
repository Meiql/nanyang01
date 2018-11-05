package org.springrain.nybusiness.ergency.service;

import org.springrain.nybusiness.ergency.entity.TsEmergencyMaterialSum;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-05 21:18:49
 * @see org.springrain.nybusiness.ergency.service.TsEmergencyMaterialSum
 */
public interface ITsEmergencyMaterialSumService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsEmergencyMaterialSum findTsEmergencyMaterialSumById(Object id) throws Exception;
	
	
	
}
