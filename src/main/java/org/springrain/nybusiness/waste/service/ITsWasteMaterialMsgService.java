package org.springrain.nybusiness.waste.service;

import java.util.List;

import org.springrain.nybusiness.waste.entity.TsWasteMaterialMsg;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:47:39
 * @see org.springrain.nybusiness.waste.service.TsWasteMaterialMsg
 */
public interface ITsWasteMaterialMsgService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsWasteMaterialMsg findTsWasteMaterialMsgById(Object id) throws Exception;
	
	

	/**
	 * 
	 * @return 查询废水处理信息
	 * @throws Exception
	 */
	List<TsWasteMaterialMsg> listFinderTsWasteMaterialMsg()throws Exception;
}
