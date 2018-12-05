package org.springrain.nybusiness.ergency.service;

import java.util.List;

import org.springrain.frame.util.Page;
import org.springrain.nybusiness.ergency.entity.TsDeclare;
import org.springrain.nybusiness.waste.entity.TsWasteAirMsg;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-20 11:16:28
 * @see org.springrain.nybusiness.company.service.TsDeclare
 */
public interface ITsDeclareService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsDeclare findTsDeclareById(Object id) throws Exception;
	
	
	public List<TsDeclare> finderTsDeclareForList(Page page,
			TsDeclare tsDeclare, List<String> listCompany) throws Exception;
}
