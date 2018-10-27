package org.springrain.nybusiness.msg.service;

import org.springrain.nybusiness.msg.entity.TsMsgChemicalSubstances;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:44:12
 * @see org.springrain.nybusiness.msg.service.TsMsgChemicalSubstances
 */
public interface ITsMsgChemicalSubstancesService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsMsgChemicalSubstances findTsMsgChemicalSubstancesById(Object id) throws Exception;
	
	
	
}
