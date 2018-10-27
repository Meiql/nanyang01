package org.springrain.nybusiness.ergency.service;

import org.springrain.nybusiness.ergency.entity.TsErgencyInvestigation;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:41:01
 * @see org.springrain.nybusiness.ergency.service.TsErgencyInvestigation
 */
public interface ITsErgencyInvestigationService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsErgencyInvestigation findTsErgencyInvestigationById(Object id) throws Exception;
	
	
	
}
