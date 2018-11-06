package org.springrain.nybusiness.ergency.service;

import java.util.List;

import org.springrain.frame.util.Page;
import org.springrain.nybusiness.ergency.entity.TsEmergencyEquipmentSum;
import org.springrain.nybusiness.ergency.entity.TsErgencyInvestigation;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-05 21:01:39
 * @see org.springrain.nybusiness.ergency.service.TsEmergencyEquipmentSum
 */
public interface ITsEmergencyEquipmentSumService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsEmergencyEquipmentSum findTsEmergencyEquipmentSumById(Object id) throws Exception;
	
	/**
	 *  分页查询
	 * @param page
	 * @param tsMailListOutside
	 * @param listCompany
	 * @return
	 * @throws Exception
	 */
	List<TsEmergencyEquipmentSum> finderTsMaillistForList(Page page,TsEmergencyEquipmentSum tsEmergencyEquipmentSum,List<String> listCompany)throws Exception;
	
	
}
