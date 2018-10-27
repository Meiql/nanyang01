package org.springrain.nybusiness.mail.service;

import org.springrain.nybusiness.mail.entity.TsMailListInside;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:43:02
 * @see org.springrain.nybusiness.mail.service.TsMailListInside
 */
public interface ITsMailListInsideService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsMailListInside findTsMailListInsideById(Object id) throws Exception;
	
	
	
	
}
