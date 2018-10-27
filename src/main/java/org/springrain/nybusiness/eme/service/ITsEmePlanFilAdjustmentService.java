package org.springrain.nybusiness.eme.service;

import org.springrain.nybusiness.eme.entity.TsEmePlanFilAdjustment;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:29:44
 * @see org.springrain.nybusiness.eme.service.TsEmePlanFilAdjustment
 */
public interface ITsEmePlanFilAdjustmentService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsEmePlanFilAdjustment findTsEmePlanFilAdjustmentById(Object id) throws Exception;
	
	
	
}
