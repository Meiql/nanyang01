package org.springrain.nybusiness.msg.service;

import java.util.List;

import org.springrain.frame.util.Page;
import org.springrain.nybusiness.msg.entity.TsMsgProductTechnology;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:45:34
 * @see org.springrain.nybusiness.msg.service.TsMsgProductTechnology
 */
public interface ITsMsgProductTechnologyService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsMsgProductTechnology findTsMsgProductTechnologyById(Object id) throws Exception;
	
	/**
	 * 根据权限查询
	 * @param page
	 * @param tsMsgEnviroRisk
	 * @param listCompany
	 * @return
	 * @throws Exception
	 */
	List<TsMsgProductTechnology> finderTsMsgProductTechnology(Page page, TsMsgProductTechnology tsMsgProductTechnology,List<String> listCompany)throws Exception;
	
	
	
}
