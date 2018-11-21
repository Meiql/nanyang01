package org.springrain.nybusiness.resourceAudit.service;

import org.springrain.nybusiness.resourceAudit.entity.TsGoodsInventory;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-08 23:33:54
 * @see org.springrain.nybusiness.resourceAudit.service.TsGoodsInventory
 */
public interface ITsGoodsInventoryService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsGoodsInventory findTsGoodsInventoryById(Object id) throws Exception;
	
	
	
}
