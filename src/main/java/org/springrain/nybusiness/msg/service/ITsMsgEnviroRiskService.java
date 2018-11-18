package org.springrain.nybusiness.msg.service;

import java.util.List;

import org.springrain.frame.util.Page;
import org.springrain.nybusiness.msg.entity.TsMsgEnviroRisk;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:44:24
 * @see org.springrain.nybusiness.msg.service.TsMsgEnviroRisk
 */
public interface ITsMsgEnviroRiskService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsMsgEnviroRisk findTsMsgEnviroRiskById(Object id) throws Exception;
	
	/**
	 * 新增
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsMsgEnviroRisk saveTsMsgEnviroRisk(TsMsgEnviroRisk tsMsgEnviroRisk) throws Exception;
	
	/**
	 * 根据权限查询
	 * @param page
	 * @param tsMsgEnviroRisk
	 * @param listCompany
	 * @return
	 * @throws Exception
	 */
	List<TsMsgEnviroRisk> finderTsEnvirolistForList(Page page, TsMsgEnviroRisk tsMsgEnviroRisk,List<String> listCompany)throws Exception;
	
	/**
	 * 更新提交
	 * @param id
	 * @return
	 * @throws Exception
	 */
	void updateBak1(String id, Class<TsMsgEnviroRisk> class1) throws Exception;
	
}
