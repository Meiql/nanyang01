package org.springrain.nybusiness.resourceAudit.service;

import java.util.List;

import org.springrain.frame.util.Page;
import org.springrain.nybusiness.resourceAudit.entity.TsPreparegoodsNum;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-16 01:29:53
 * @see org.springrain.nybusiness.resourceAudit.service.TsPreparegoodsNum
 */
public interface ITsPreparegoodsNumService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsPreparegoodsNum findTsPreparegoodsNumById(Object id) throws Exception;
	
	public List<TsPreparegoodsNum> findListData(
			TsPreparegoodsNum tsPreparegoodsNum) throws Exception ;
	
}
