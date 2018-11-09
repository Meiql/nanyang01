package org.springrain.nybusiness.ergency.service;

import java.util.List;

import org.springrain.frame.util.Page;
import org.springrain.nybusiness.company.entity.TsCompanyInfo;
import org.springrain.nybusiness.ergency.entity.TsEmePlanFilingMod;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-08 21:32:38
 * @see org.springrain.nybusiness.ergency.service.TsEmePlanFilingMod
 */
public interface ITsEmePlanFilingModService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsEmePlanFilingMod findTsEmePlanFilingModById(Object id) throws Exception;
	/**
	 *  分页查询
	 * @param page
	 * @param tsMailListOutside
	 * @param listCompany
	 * @return
	 * @throws Exception
	 */
	List<TsEmePlanFilingMod> finderTsMaillistForList(Page page,TsEmePlanFilingMod tsEmePlanFilingMod,List<String> listCompany)throws Exception;
	
	public TsCompanyInfo findCompanyInfoById(Object id) throws Exception;
}
