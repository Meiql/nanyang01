package org.springrain.nybusiness.ergency.service.impl;

import java.io.File;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.lang3.StringUtils;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.stereotype.Service;
import org.springrain.nybusiness.ergency.entity.TsEmePlanFilAdjustment;
import org.springrain.nybusiness.ergency.entity.TsEmePlanFiling;
import org.springrain.nybusiness.ergency.entity.TsEmePlanFilingMod;
import org.springrain.nybusiness.ergency.service.ITsEmePlanFilAdjustmentService;
import org.springrain.nybusiness.ergency.service.ITsEmePlanFilingModService;
import org.springrain.frame.entity.IBaseEntity;
import org.springrain.frame.util.Finder;
import org.springrain.frame.util.GlobalStatic;
import org.springrain.frame.util.Page;
import org.springrain.system.entity.Menu;
import org.springrain.system.entity.Org;
import org.springrain.system.entity.RoleMenu;
import org.springrain.system.entity.UserOrg;
import org.springrain.system.service.BaseSpringrainServiceImpl;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-08 21:33:26
 * @see org.springrain.nybusiness.ergency.service.impl.TsEmePlanFilAdjustment
 */
@Service("tsEmePlanFilAdjustmentService")
public class TsEmePlanFilAdjustmentServiceImpl extends BaseSpringrainServiceImpl implements ITsEmePlanFilAdjustmentService {
	@Resource
	private ITsEmePlanFilingModService tsEmePlanFilingModService;
   
    @Override
	public String  save(Object entity ) throws Exception{
	      TsEmePlanFilAdjustment tsEmePlanFilAdjustment=(TsEmePlanFilAdjustment) entity;
	       return super.save(tsEmePlanFilAdjustment).toString();
	}

    @Override
	public String  saveorupdate(Object entity ) throws Exception{
	      TsEmePlanFilAdjustment tsEmePlanFilAdjustment=(TsEmePlanFilAdjustment) entity;
		 return super.saveorupdate(tsEmePlanFilAdjustment).toString();
	}
	
	@Override
    public Integer update(IBaseEntity entity ) throws Exception{
	 TsEmePlanFilAdjustment tsEmePlanFilAdjustment=(TsEmePlanFilAdjustment) entity;
	return super.update(tsEmePlanFilAdjustment);
    }
    @Override
	public TsEmePlanFilAdjustment findTsEmePlanFilAdjustmentById(Object id) throws Exception{
	 return super.findById(id,TsEmePlanFilAdjustment.class);
	}
    @Override
	public List<TsEmePlanFilAdjustment> findAdjustmentByFilId(String id) throws Exception {
		if(StringUtils.isBlank(id)){
			return null;
		}
		Finder finder=new Finder("select t.* from ts_eme_plan_fil_adjustment t where t.adjustment_id=:id");
		finder.setParam("id", id);
		return super.queryForList(finder, TsEmePlanFilAdjustment.class);
	}
    @Override

	public void deleteByAdjustmentId(String adjustmentId) throws Exception {
    	Finder finder_adjustmentr=Finder.getDeleteFinder(TsEmePlanFilAdjustment.class).append(" WHERE adjustment_id=:adjustmentId ").setParam("adjustmentId", adjustmentId);
		super.update(finder_adjustmentr);
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
	public void updateTsEmePlanFilingMod(String id)throws Exception {
		TsEmePlanFilingMod tsEmePlanFilingMod = super.findById(id, TsEmePlanFilingMod.class);
		tsEmePlanFilingMod.setBak1("2");
			super.update(tsEmePlanFilingMod);
		}
		
}
