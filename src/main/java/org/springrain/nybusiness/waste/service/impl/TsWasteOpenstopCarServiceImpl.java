package org.springrain.nybusiness.waste.service.impl;

import java.io.File;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springrain.frame.entity.IBaseEntity;
import org.springrain.frame.util.Finder;
import org.springrain.frame.util.Page;
import org.springrain.nybusiness.waste.entity.TsWasteAirMsg;
import org.springrain.nybusiness.waste.entity.TsWasteMaterialMsg;
import org.springrain.nybusiness.waste.entity.TsWasteOpenstopCar;
import org.springrain.nybusiness.waste.entity.TsWasteWaterMsg;
import org.springrain.nybusiness.waste.service.ITsWasteOpenstopCarService;
import org.springrain.system.service.BaseSpringrainServiceImpl;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:47:49
 * @see org.springrain.nybusiness.waste.service.impl.TsWasteOpenstopCar
 */
@Service("tsWasteOpenstopCarService")
public class TsWasteOpenstopCarServiceImpl extends BaseSpringrainServiceImpl implements ITsWasteOpenstopCarService {

   
    @Override
	public String  save(Object entity ) throws Exception{
	      TsWasteOpenstopCar tsWasteOpenstopCar=(TsWasteOpenstopCar) entity;
	       return super.save(tsWasteOpenstopCar).toString();
	}

    @Override
	public String  saveorupdate(Object entity ) throws Exception{
	      TsWasteOpenstopCar tsWasteOpenstopCar=(TsWasteOpenstopCar) entity;
		 return super.saveorupdate(tsWasteOpenstopCar).toString();
	}
	
	@Override
    public Integer update(IBaseEntity entity ) throws Exception{
	 TsWasteOpenstopCar tsWasteOpenstopCar=(TsWasteOpenstopCar) entity;
	return super.update(tsWasteOpenstopCar);
    }
    @Override
	public TsWasteOpenstopCar findTsWasteOpenstopCarById(Object id) throws Exception{
    	
    	TsWasteOpenstopCar tsWasteOpenstopCar =  super.findById(id,TsWasteOpenstopCar.class);
	 
	 if(tsWasteOpenstopCar == null){
		 return null;
	 }
	 if(StringUtils.isNoneBlank(tsWasteOpenstopCar.getAirId())){
		 TsWasteAirMsg tsWasteAirMsg = super.findById(tsWasteOpenstopCar.getAirId(),TsWasteAirMsg.class);
		 if(tsWasteAirMsg!=null){
			 tsWasteOpenstopCar.setTsWasteAirMsg(tsWasteAirMsg);
		 }
	 }
	 if(StringUtils.isNoneBlank(tsWasteOpenstopCar.getWaterId())){
		 TsWasteWaterMsg tsWasteWaterMsg = super.findById(tsWasteOpenstopCar.getWaterId(),TsWasteWaterMsg.class);
		 if(tsWasteWaterMsg!=null){
			 tsWasteOpenstopCar.setTsWasteWaterMsg(tsWasteWaterMsg);
		 }
	 }
	 if(StringUtils.isNoneBlank(tsWasteOpenstopCar.getMaterial())){
		 TsWasteMaterialMsg tsWasteMaterialMsg = super.findById(tsWasteOpenstopCar.getMaterial(),TsWasteMaterialMsg.class);
		 if(tsWasteMaterialMsg!=null){
			 tsWasteOpenstopCar.setTsWasteMaterialMsg(tsWasteMaterialMsg);
		 }
	 }
	 return tsWasteOpenstopCar;
	}
	
/**
 * 列表查询,每个service都会重载,要把sql语句封装到service中,Finder只是最后的方案
 * @param finder
 * @param page
 * @param clazz
 * @param o
 * @return
 * @throws Exception
 */
        @Override
    public <T> List<T> findListDataByFinder(Finder finder, Page page, Class<T> clazz,
			Object o) throws Exception{
			 return super.findListDataByFinder(finder,page,clazz,o);
			}
	/**
	 * 根据查询列表的宏,导出Excel
	 * @param finder 为空则只查询 clazz表
	 * @param ftlurl 类表的模版宏
	 * @param page 分页对象
	 * @param clazz 要查询的对象
	 * @param o  querybean
	 * @return
	 * @throws Exception
	 */
		@Override
	public <T> File findDataExportExcel(Finder finder,String ftlurl, Page page,
			Class<T> clazz, Object o)
			throws Exception {
			 return super.findDataExportExcel(finder,ftlurl,page,clazz,o);
		}

	@Override
	public List<TsWasteOpenstopCar> listFinderForPage(Page page,
			TsWasteOpenstopCar tsWasteOpenstopCar, List<String> listCompany)
			throws Exception {
		if(CollectionUtils.isEmpty(listCompany)){
			return null;
		}
		Finder finder = new Finder();
		finder.append("SELECT * FROM `ts_waste_openstop_car` t where t.companyId in (:companyId)")
		.setParam("companyId", listCompany);
		if(StringUtils.isNoneBlank(tsWasteOpenstopCar.getAddress())){
			finder.append(" and t.address like:address").setParam("address", "%"+tsWasteOpenstopCar.getAddress()+"%");
		}
		return super.queryForList(finder, TsWasteOpenstopCar.class, page);
	}

}
