package org.springrain.nybusiness.msg.service;

import java.util.List;

import org.springrain.frame.util.Page;
import org.springrain.nybusiness.msg.entity.TsMsgChemicalSubstances;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:44:12
 * @see org.springrain.nybusiness.msg.service.TsMsgChemicalSubstances
 */
public interface ITsMsgChemicalSubstancesService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsMsgChemicalSubstances findTsMsgChemicalSubstancesById(Object id) throws Exception;
	
	/**
	 * 根据权限查询
	 * @param page
	 * @param tsMsgEnviroRisk
	 * @param listCompany
	 * @return
	 * @throws Exception
	 */
	List<TsMsgChemicalSubstances> finderTsMsgChemicalSubstances(Page page, TsMsgChemicalSubstances tsMsgChemicalSubstances,List<String> listCompany)throws Exception;
	
	/**
	 * 根据id查询公司名称
	 * @param page
	 * @param tsMsgEnviroRisk
	 * @param listCompany
	 * @return
	 * @throws Exception
	 */
	String finderCompanyNameByCompanyId(String companyId) throws Exception;
	
}
