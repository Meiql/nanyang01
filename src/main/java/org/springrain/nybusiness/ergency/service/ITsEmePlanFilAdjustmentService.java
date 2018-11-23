package org.springrain.nybusiness.ergency.service;

import java.util.List;

import org.springrain.nybusiness.ergency.entity.TsEmePlanFilAdjustment;
import org.springrain.system.service.IBaseSpringrainService;
/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-08 21:33:26
 * @see org.springrain.nybusiness.ergency.service.TsEmePlanFilAdjustment
 */
public interface ITsEmePlanFilAdjustmentService extends IBaseSpringrainService {
	
	/**
	 * 根据ID查找
	 * @param id
	 * @return
	 * @throws Exception
	 */
	TsEmePlanFilAdjustment findTsEmePlanFilAdjustmentById(Object id) throws Exception;
	/**
	 * 根据备案表中的File_directory 查询 备案目录
	 * @param id
	 * @return
	 * @throws Exception
	 */
	List<TsEmePlanFilAdjustment> findAdjustmentByFilId(String id) throws Exception;
	
	public void deleteByAdjustmentId(String adjustmentId) throws Exception;
	public void updateTsEmePlanFilingMod(String id)throws Exception;
}
