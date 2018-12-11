package org.springrain.nybusiness.tsInfoDetail.service;

import org.springrain.nybusiness.tsInfoDetail.entity.TsInfoPortal;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-12-11 22:30:58
 * @see org.springrain.nybusiness.tsInfoDetail.service.TsInfoPortal
 */
public interface ITsInfoPortalService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsInfoPortal findTsInfoPortalById(Object id) throws Exception;
	
	
	
}
