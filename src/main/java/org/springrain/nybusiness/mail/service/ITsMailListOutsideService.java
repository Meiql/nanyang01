package org.springrain.nybusiness.mail.service;

import org.springrain.nybusiness.mail.entity.TsMailListOutside;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:42:46
 * @see org.springrain.nybusiness.mail.service.TsMailListOutside
 */
public interface ITsMailListOutsideService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsMailListOutside findTsMailListOutsideById(Object id) throws Exception;
	
	
	
}
