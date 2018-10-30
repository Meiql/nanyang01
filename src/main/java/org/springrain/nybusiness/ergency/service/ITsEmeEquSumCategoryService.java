package org.springrain.nybusiness.ergency.service;

import org.springrain.nybusiness.ergency.entity.TsEmeEquSumCategory;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link 9iu.org}
 * @author springrain<Auto generate>
 * @version  2018-10-30 13:45:27
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
