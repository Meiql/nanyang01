package org.springrain.nybusiness.resourceAudit.service;

import java.util.List;

import org.springrain.frame.util.Page;
import org.springrain.nybusiness.ergency.entity.TsEmePlanFiling;
import org.springrain.nybusiness.resourceAudit.entity.TsGoodsExpiryList;
import org.springrain.nybusiness.resourceAudit.entity.TsPrepareApprovl;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-14 22:59:33
 * @see org.springrain.nybusiness.resourceAudit.service.TsGoodsExpiryList
 */
public interface ITsGoodsExpiryListService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsGoodsExpiryList findTsGoodsExpiryListById(Object id) throws Exception;
	
	public List<TsGoodsExpiryList> findListData(Page page, TsGoodsExpiryList tsGoodsExpiryList) throws Exception;
	
}
