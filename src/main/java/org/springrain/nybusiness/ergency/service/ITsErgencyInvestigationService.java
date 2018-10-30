package org.springrain.nybusiness.ergency.service;

import org.springrain.nybusiness.ergency.entity.TsErgencyInvestigation;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link 9iu.org}
 * @author springrain<Auto generate>
 * @version  2018-10-30 13:48:27
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
