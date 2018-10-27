package org.springrain.nybusiness.eme.service;

import org.springrain.nybusiness.eme.entity.TsEmePlanFilingMod;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:31:49
 * @see org.springrain.nybusiness.eme.service.TsEmePlanFilingMod
 */
public interface ITsEmePlanFilingModService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsEmePlanFilingMod findTsEmePlanFilingModById(Object id) throws Exception;
	
	
	
}
