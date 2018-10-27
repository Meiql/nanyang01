package org.springrain.nybusiness.waste.service;

import org.springrain.nybusiness.waste.entity.TsWasteEmptyingMsg;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:47:29
 * @see org.springrain.nybusiness.waste.service.TsWasteEmptyingMsg
 */
public interface ITsWasteEmptyingMsgService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsWasteEmptyingMsg findTsWasteEmptyingMsgById(Object id) throws Exception;
	
	
	
}
