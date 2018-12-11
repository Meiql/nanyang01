package org.springrain.nybusiness.tsInfoDetail.service;

import org.springrain.nybusiness.tsInfoDetail.entity.TsInfoDetails;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-12-11 22:31:15
 * @see org.springrain.nybusiness.tsInfoDetail.service.TsInfoDetails
 */
public interface ITsInfoDetailsService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsInfoDetails findTsInfoDetailsById(Object id) throws Exception;
	
	
	
}
