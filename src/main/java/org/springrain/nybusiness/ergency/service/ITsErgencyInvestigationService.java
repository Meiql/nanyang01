package org.springrain.nybusiness.ergency.service;

import java.util.List;

import org.springrain.frame.util.Page;
import org.springrain.nybusiness.ergency.entity.TsErgencyInvestigation;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-05 16:24:44
 * @see org.springrain.nybusiness.ergency.service.TsErgencyInvestigation
 */
public interface ITsErgencyInvestigationService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsErgencyInvestigation findTsErgencyInvestigationById(Object id) throws Exception;
	
	/**
	 *  分页查询
	 * @param page
	 * @param tsMailListOutside
	 * @param listCompany
	 * @return
	 * @throws Exception
	 */
	List<TsErgencyInvestigation> finderTsMaillistForList(Page page,TsErgencyInvestigation tsErgencyInvestigation,List<String> listCompany)throws Exception;
	void updateTsErgencyInvestigation(String id)throws Exception;
}
