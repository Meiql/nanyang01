package org.springrain.nybusiness.ergency.service.impl;

import java.io.File;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springrain.nybusiness.company.entity.TsCompanyInfo;
import org.springrain.nybusiness.ergency.entity.TsEmePlanFilAdjustment;
import org.springrain.nybusiness.ergency.entity.TsEmePlanFiling;
import org.springrain.nybusiness.ergency.entity.TsEmePlanFilingMod;
import org.springrain.nybusiness.ergency.service.ITsEmePlanFilAdjustmentService;
import org.springrain.nybusiness.ergency.service.ITsEmePlanFilingModService;
import org.springrain.frame.entity.IBaseEntity;
import org.springrain.frame.util.Finder;
import org.springrain.frame.util.Page;
import org.springrain.system.service.BaseSpringrainServiceImpl;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-08 21:32:38
 * @see org.springrain.nybusiness.ergency.service.impl.TsEmePlanFilingMod
 */
@Service("tsEmePlanFilingModService")
public class TsEmePlanFilingModServiceImpl extends BaseSpringrainServiceImpl implements ITsEmePlanFilingModService {

	@Resource
	private ITsEmePlanFilAdjustmentService tsEmePlanFilAdjustmentService;
    @Override
	public String  save(Object entity ) throws Exception{
	      TsEmePlanFilingMod tsEmePlanFilingMod=(TsEmePlanFilingMod) entity;
	       return super.save(tsEmePlanFilingMod).toString();
	}

    @Override
	public String  saveorupdate(Object entity ) throws Exception{
	      TsEmePlanFilingMod tsEmePlanFilingMod=(TsEmePlanFilingMod) entity;
		 return super.saveorupdate(tsEmePlanFilingMod).toString();
	}
	
	@Override
    public Integer update(IBaseEntity entity ) throws Exception{
	 TsEmePlanFilingMod tsEmePlanFilingMod=(TsEmePlanFilingMod) entity;
	return super.update(tsEmePlanFilingMod);
    }
    @Override
	public TsEmePlanFilingMod findTsEmePlanFilingModById(Object id) throws Exception{
	 return super.findById(id,TsEmePlanFilingMod.class);
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
	public List<TsEmePlanFilingMod> finderTsMaillistForList(Page page, TsEmePlanFilingMod tsEmePlanFilingMod,
			List<String> listCompany) throws Exception {
		if(CollectionUtils.isEmpty(listCompany)){
			return null;
		}
		Finder finder = new Finder();
		finder.append("SELECT * FROM `ts_eme_plan_filing_mod` t where t.company_id in (:companyId)")
		.setParam("companyId", listCompany);
		if(StringUtils.isNoneBlank(tsEmePlanFilingMod.getCompany_name())) {
			finder.append(" and t.company_name like:name").setParam("name", "%"+tsEmePlanFilingMod.getCompany_name()+"%");
		}
		if(tsEmePlanFilingMod.getBak1()!=null&&!"0".equals(tsEmePlanFilingMod.getBak1())) {
			finder.append(" and t.bak1 =:bak1").setParam("bak1", tsEmePlanFilingMod.getBak1());
		}
		return super.queryForList(finder, TsEmePlanFilingMod.class, page);
	}
	 //公司信息
    @Override
   	public TsCompanyInfo findCompanyInfoById(Object id) throws Exception{
   	 return super.findById(id,TsCompanyInfo.class);
   	}
    @Override
	public TsEmePlanFilingMod findUserByIfindTsEmePlanFilingById(Object id) throws Exception {
    	TsEmePlanFilingMod u=super.findById(id, TsEmePlanFilingMod.class);
		String adjustment_id = u.getAdjustment_id();
		//获取目录
		List<TsEmePlanFilAdjustment> adjustments = tsEmePlanFilAdjustmentService.findAdjustmentByFilId(adjustment_id);
		u.setFiladjustment(adjustments);
		return u;
	}
    
}
