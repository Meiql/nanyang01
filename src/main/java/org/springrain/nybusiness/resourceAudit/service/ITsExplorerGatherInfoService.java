package org.springrain.nybusiness.resourceAudit.service;

import java.util.List;

import org.springrain.frame.util.Page;
import org.springrain.nybusiness.resourceAudit.entity.TsExplorerGatherInfo;
import org.springrain.nybusiness.resourceAudit.entity.TsGoodsExpiryList;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-24 13:28:27
 * @see org.springrain.nybusiness.resourceAudit.service.TsExplorerGatherInfo
 */
public interface ITsExplorerGatherInfoService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsExplorerGatherInfo findTsExplorerGatherInfoById(Object id) throws Exception;
	public List<TsExplorerGatherInfo> findListData(Page page, TsExplorerGatherInfo tsExplorerGatherInfo,List<String> listCompany) throws Exception;
	
	
	public List<TsExplorerGatherInfo> findThreeWastesData(Page page, TsExplorerGatherInfo tsExplorerGatherInfo) throws Exception;
	
	
}
