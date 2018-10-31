package org.springrain.nybusiness.ergency.service;

import org.springrain.nybusiness.ergency.entity.TsEmeEquSumCategory;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-31 10:32:51
 * @see org.springrain.nybusiness.ergency.service.TsEmeEquSumCategory
 */
public interface ITsEmeEquSumCategoryService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsEmeEquSumCategory findTsEmeEquSumCategoryById(Object id) throws Exception;
	
	
	
}
