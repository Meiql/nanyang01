package org.springrain.nybusiness.eme.service;

import org.springrain.nybusiness.eme.entity.TsEmergencyEquipmentSum;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:32:11
 * @see org.springrain.nybusiness.eme.service.TsEmergencyEquipmentSum
 */
public interface ITsEmergencyEquipmentSumService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsEmergencyEquipmentSum findTsEmergencyEquipmentSumById(Object id) throws Exception;
	
	
	
}
