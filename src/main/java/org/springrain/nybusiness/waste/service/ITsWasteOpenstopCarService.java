package org.springrain.nybusiness.waste.service;

import org.springrain.nybusiness.waste.entity.TsWasteOpenstopCar;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:47:49
 * @see org.springrain.nybusiness.waste.service.TsWasteOpenstopCar
 */
public interface ITsWasteOpenstopCarService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsWasteOpenstopCar findTsWasteOpenstopCarById(Object id) throws Exception;
	
	
	
}
