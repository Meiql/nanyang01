package org.springrain.nybusiness.waste.service;

import java.util.List;

import org.springrain.frame.util.Page;
import org.springrain.nybusiness.waste.entity.TsWasteAirMsg;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:47:16
 * @see org.springrain.nybusiness.waste.service.TsWasteAirMsg
 */
public interface ITsWasteAirMsgService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsWasteAirMsg findTsWasteAirMsgById(Object id) throws Exception;
	
	public List<TsWasteAirMsg> finderTsMaillistForList(Page page,
			TsWasteAirMsg tsWasteAirMsg, List<String> listCompany) throws Exception;
	
}
