package org.springrain.nybusiness.tsInfoDetail.service;

import java.util.List;
import java.util.Map;

import org.springrain.nybusiness.tsInfoDetail.entity.TsInfoPortal;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-12-11 22:30:58
 * @see org.springrain.nybusiness.tsInfoDetail.service.TsInfoPortal
 */
public interface ITsInfoPortalService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsInfoPortal findTsInfoPortalById(Object id) throws Exception;
	/**
	 * meiql 根据类型查list
	 * @param typeId
	 * @return
	 * @throws Exception
	 */
	List<TsInfoPortal> finderListForList(String typeId) throws Exception;
	/**
	 * 页面公告新闻
	 * @return
	 * @throws Exception
	 */
	List<TsInfoPortal> listInfo() throws Exception;
	/**
	 * 通过detailID 查询companyid
	 * @return 通过userId 
	 * @throws Exception
	 */
	List<Map<String, Object>> finderDetailId(String detailID)throws Exception;
	/**
	 * 门户页面置顶内容
	 * @return
	 * @throws Exception
	 */
	List<TsInfoPortal> stick() throws Exception;
	
}
