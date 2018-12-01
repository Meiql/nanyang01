package org.springrain.nybusiness.resourceAudit.service;

import java.util.List;

import org.springrain.frame.util.Page;
import org.springrain.nybusiness.company.entity.TsCompanyInfo;
import org.springrain.nybusiness.ergency.entity.TsEmePlanFiling;
import org.springrain.nybusiness.ergency.entity.TsEmergencyEquipmentSum;
import org.springrain.nybusiness.ergency.entity.TsEmergencyMaterialSum;
import org.springrain.nybusiness.ergency.entity.TsErgencyInvestigation;
import org.springrain.nybusiness.msg.entity.TsMsgEnviroRisk;
import org.springrain.nybusiness.resourceAudit.entity.TsGoodsInventory;
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
			TsPreparegoodsNum tsPreparegoodsNum,List<String> listCompany) throws Exception ;
	
	List<TsEmergencyMaterialSum> finderTsEmergencyForList(Page page, TsEmergencyMaterialSum tsEmergencyMaterialSum,List<String> listCompany)
			throws Exception;
	List<TsEmePlanFiling> finderTsEmePlanFilingForList(Page page, TsEmePlanFiling tsEmePlanFiling ,List<String> listCompany) throws Exception;

	List<TsCompanyInfo> finderTsCompanyInfoForList(Page page, TsCompanyInfo tsCompanyInfo) throws Exception;

	List<TsMsgEnviroRisk> finderTsMsgEnviroRiskForList(Page page, TsMsgEnviroRisk tsMsgEnviroRisk ,List<String> listCompany) throws Exception;
	
}
