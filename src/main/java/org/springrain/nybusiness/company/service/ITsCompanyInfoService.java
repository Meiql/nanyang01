package org.springrain.nybusiness.company.service;

import java.util.List;

import org.springrain.frame.util.Page;
import org.springrain.nybusiness.company.entity.TsCompanyInfo;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-04 21:31:43
 * @see org.springrain.nybusiness.company.service.TsCompanyInfo
 */
public interface ITsCompanyInfoService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsCompanyInfo findTsCompanyInfoById(Object id) throws Exception;
	
	
	/**
	 * 
	 * @Author ll
	 * @Date 2018年11月5日 下午12:42:04
	 * @Description 保存注册信息
	 * @Fcunction saveRegisterCompanyIn
	 * @param tsCompanyInfo
	 * @throws Exception
	 *
	 */
	void saveRegisterCompany(TsCompanyInfo tsCompanyInfo)throws Exception;
	
	/**
	 * 
	 * @Author ll
	 * @Date 2018年11月5日 下午12:43:22
	 * @Description 查询待审核的企业信息 
	 * @Fcunction finderExamineCompany
	 * @param companyInfo
	 * @return
	 * @throws Exception
	 *
	 */
	List<TsCompanyInfo> finderExamineCompany(Page page,TsCompanyInfo companyInfo)throws Exception;
	
	/**
	 * 审核企业信息
	 * @param tsCompanyInfo
	 * @throws Exception
	 */
	void updateCompanyInfo(TsCompanyInfo tsCompanyInfo)throws Exception;
	
	/**
	 * 通过userID 查询companyid
	 * @return 通过userId 
	 * @throws Exception
	 */
	List<String> finderCompanyIdByUserId(String userId)throws Exception;
	/**
	 *  查询企业信息 
	 * @param page
	 * @param companyInfo
	 * @param listCompany
	 * @return
	 * @throws Exception
	 */
	List<TsCompanyInfo> finderCompanyInfo(Page page,TsCompanyInfo companyInfo,List<String> listCompany)throws Exception;
}
