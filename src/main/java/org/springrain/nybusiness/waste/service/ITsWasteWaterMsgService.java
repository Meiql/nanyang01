package org.springrain.nybusiness.waste.service;

import java.util.List;

import org.springrain.frame.util.Page;
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
	
	public List<TsWasteWaterMsg> finderTsMaillistForList(Page page,
			TsWasteWaterMsg tsWasteWaterMsg, List<String> listCompany) throws Exception;
	
}
