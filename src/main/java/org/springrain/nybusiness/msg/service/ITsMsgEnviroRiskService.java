package org.springrain.nybusiness.msg.service;

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
	
	
	
}
