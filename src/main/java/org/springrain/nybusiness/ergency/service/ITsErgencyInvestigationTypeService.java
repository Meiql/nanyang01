package org.springrain.nybusiness.ergency.service;

import org.springrain.nybusiness.ergency.entity.TsErgencyInvestigationType;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-31 10:30:53
 * @see org.springrain.nybusiness.ergency.service.TsErgencyInvestigationType
 */
public interface ITsErgencyInvestigationTypeService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsErgencyInvestigationType findTsErgencyInvestigationTypeById(Object id) throws Exception;
	
	
	
}
