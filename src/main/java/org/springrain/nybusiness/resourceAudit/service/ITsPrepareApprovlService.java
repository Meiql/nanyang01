package org.springrain.nybusiness.resourceAudit.service;

import java.util.List;

import org.springrain.frame.util.Page;
import org.springrain.nybusiness.company.entity.TsCompanyInfo;
import org.springrain.nybusiness.ergency.entity.TsEmePlanFiling;
import org.springrain.nybusiness.ergency.entity.TsEmergencyEquipmentSum;
import org.springrain.nybusiness.ergency.entity.TsEmergencyMaterialSum;
import org.springrain.nybusiness.msg.entity.TsMsgEnviroRisk;
import org.springrain.nybusiness.resourceAudit.entity.TsPrepareApprovl;
import org.springrain.nybusiness.resourceAudit.entity.TsPreparegoodsNum;
import org.springrain.system.service.IBaseSpringrainService;

/**
 * TODO 在此加入类描述
 * 
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version 2018-11-14 22:30:47
 * @see org.springrain.nybusiness.resourceAudit.service.TsPrepareApprovl
 */
public interface ITsPrepareApprovlService extends IBaseSpringrainService {

	/**
	 * 根据ID查找
	 * 
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsPrepareApprovl findTsPrepareApprovlById(Object id) throws Exception;

	public List<TsPrepareApprovl> findListData(TsPrepareApprovl tsPrepareApprovl) throws Exception;

	/**
	 * 审批通过（bak1）
	 * 
	 * @param id
	 * @throws Exception
	 */

	List<TsEmergencyMaterialSum> finderTsEmergencyForList(Page page, TsEmergencyMaterialSum tsEmergencyMaterialSum )
			throws Exception;

	List<TsEmePlanFiling> finderTsEmePlanFilingForList(Page page, TsEmePlanFiling tsEmePlanFiling) throws Exception;

	List<TsCompanyInfo> finderTsCompanyInfoForList(Page page, TsCompanyInfo tsCompanyInfo) throws Exception;

	List<TsMsgEnviroRisk> finderTsMsgEnviroRiskForList(Page page, TsMsgEnviroRisk tsMsgEnviroRisk) throws Exception;

	void updateTsEmePlanFilingPass(String id, String type) throws Exception;

	void updateTsCompanyInfoPass(String id, String type) throws Exception;

	void updateTsEmergencyEquipmentSumPass(String id, String type) throws Exception;
	void updateTsErgencyInvestigation(String id, String type)throws Exception;

	void updateTsMsgEnviroRiskPass(String id, String type) throws Exception;

}
