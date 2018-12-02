package org.springrain.nybusiness.waste.service;

import java.util.List;

import org.springrain.frame.util.Page;
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
	
	

	/**
	 * 
	 * @param page
	 * @param tsWasteEmptyingMsg
	 * @param listCompany
	 * @return 分页查询
	 * @throws Exception
	 */
	List<TsWasteEmptyingMsg> listFinderTsWasteEmptyingMsg(Page page,TsWasteEmptyingMsg tsWasteEmptyingMsg,List<String> listCompany)throws Exception;
	
	
	
}
