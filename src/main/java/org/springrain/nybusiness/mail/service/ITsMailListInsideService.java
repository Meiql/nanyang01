package org.springrain.nybusiness.mail.service;

import java.util.List;

import org.springrain.frame.util.Page;
import org.springrain.nybusiness.mail.entity.TsMailListInside;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:43:02
 * @see org.springrain.nybusiness.mail.service.TsMailListInside
 */
public interface ITsMailListInsideService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsMailListInside findTsMailListInsideById(Object id) throws Exception;
	
	
	/**
	 * 
	 * @param page
	 * @param tsMailListInside
	 * @return
	 * @throws Exception
	 */
	List<TsMailListInside> finderTsMaillistForList(Page page,TsMailListInside tsMailListInside,List<String> listCompany)throws Exception;
	
	
	
	
}
