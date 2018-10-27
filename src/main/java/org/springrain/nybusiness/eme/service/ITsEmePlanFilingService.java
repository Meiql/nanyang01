package org.springrain.nybusiness.eme.service;

import org.springrain.nybusiness.eme.entity.TsEmePlanFiling;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:30:04
 * @see org.springrain.nybusiness.eme.service.TsEmePlanFiling
 */
public interface ITsEmePlanFilingService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsEmePlanFiling findTsEmePlanFilingById(Object id) throws Exception;
	
	
	
}
