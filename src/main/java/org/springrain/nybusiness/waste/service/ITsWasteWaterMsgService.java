package org.springrain.nybusiness.waste.service;

import org.springrain.nybusiness.waste.entity.TsWasteWaterMsg;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:48:01
 * @see org.springrain.nybusiness.waste.service.TsWasteWaterMsg
 */
public interface ITsWasteWaterMsgService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsWasteWaterMsg findTsWasteWaterMsgById(Object id) throws Exception;
	
	
	
}
