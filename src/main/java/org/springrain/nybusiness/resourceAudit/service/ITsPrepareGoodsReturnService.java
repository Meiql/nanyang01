package org.springrain.nybusiness.resourceAudit.service;

import java.util.List;

import org.springrain.nybusiness.resourceAudit.entity.TsPrepareGoodsReturn;
import org.springrain.nybusiness.resourceAudit.entity.TsPreparegoodsNum;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-14 22:54:36
 * @see org.springrain.nybusiness.resourceAudit.service.TsPrepareGoodsReturn
 */
public interface ITsPrepareGoodsReturnService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsPrepareGoodsReturn findTsPrepareGoodsReturnById(Object id) throws Exception;
	
	public List<TsPrepareGoodsReturn> findListData(
			TsPrepareGoodsReturn tsPrepareGoodsReturn) throws Exception ;
	
	
	
}
