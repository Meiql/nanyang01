package org.springrain.nybusiness.facility.service;

import java.util.List;

import org.springrain.frame.util.Page;
import org.springrain.nybusiness.company.entity.TsCompanyInfo;
import org.springrain.nybusiness.facility.entity.TsFacilityInfo;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-28 16:52:21
 * @see org.springrain.nybusiness.company.service.TsFacilityInfo
 */
public interface ITsFacilityInfoService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsFacilityInfo findTsFacilityInfoById(Object id) throws Exception;
	
	/**
	 * 通过userID 查询companyid
	 * @return 通过userId 
	 * @throws Exception
	 */
	
	
	List<TsFacilityInfo> findertsFacilityInfo(Page page,TsFacilityInfo tsFacilityInfo,List<String> listCompany)throws Exception;
}
