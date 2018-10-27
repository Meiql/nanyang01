package org.springrain.nybusiness.eme.service;

import org.springrain.nybusiness.eme.entity.TsEmergencyMaterialSum;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:32:26
 * @see org.springrain.nybusiness.eme.service.TsEmergencyMaterialSum
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
