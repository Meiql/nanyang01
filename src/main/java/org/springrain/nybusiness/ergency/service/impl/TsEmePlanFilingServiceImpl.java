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
import org.springrain.nybusiness.ergency.entity.TsEmergencyEquipmentSum;
import org.springrain.nybusiness.ergency.service.ITsEmePlanFilAdjustmentService;
import org.springrain.nybusiness.ergency.service.ITsEmePlanFilingService;
import org.springrain.cms.entity.CmsContent;
import org.springrain.frame.entity.IBaseEntity;
import org.springrain.frame.util.Finder;
import org.springrain.frame.util.Page;
import org.springrain.system.entity.Role;
import org.springrain.system.entity.User;
import org.springrain.system.entity.UserOrg;
import org.springrain.system.service.BaseSpringrainServiceImpl;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-08 21:32:48
 * @see org.springrain.nybusiness.ergency.service.impl.TsEmePlanFiling
 */
@Service("tsEmePlanFilingService")
public class TsEmePlanFilingServiceImpl extends BaseSpringrainServiceImpl implements ITsEmePlanFilingService {
	@Resource
	private ITsEmePlanFilAdjustmentService tsEmePlanFilAdjustmentService;
   
    @Override
	public String  save(Object entity ) throws Exception{
	      TsEmePlanFiling tsEmePlanFiling=(TsEmePlanFiling) entity;
	       return super.save(tsEmePlanFiling).toString();
	}

    @Override
	public String  saveorupdate(Object entity ) throws Exception{
	      TsEmePlanFiling tsEmePlanFiling=(TsEmePlanFiling) entity;
		 return super.saveorupdate(tsEmePlanFiling).toString();
	}
	
	@Override
    public Integer update(IBaseEntity entity ) throws Exception{
	 TsEmePlanFiling tsEmePlanFiling=(TsEmePlanFiling) entity;
	return super.update(tsEmePlanFiling);
    }
    @Override
	public TsEmePlanFiling findTsEmePlanFilingById(Object id) throws Exception{
	 return super.findById(id,TsEmePlanFiling.class);
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
		public List<TsEmePlanFiling> finderTsMaillistForList(Page page,
				TsEmePlanFiling tsEmePlanFiling, List<String> listCompany) throws Exception {
			if(CollectionUtils.isEmpty(listCompany)){
				return null;
			}
			Finder finder = new Finder();
			finder.append("SELECT t.*,t1.companyName as companyName FROM `ts_eme_plan_filing` t ,ts_company_info t1 where t.company_id = t1.id and t.company_id in (:companyId)")
			.setParam("companyId", listCompany);
			if(StringUtils.isNoneBlank(tsEmePlanFiling.getCompany_name())) {
				finder.append(" and t.company_name like:name").setParam("name", "%"+tsEmePlanFiling.getCompany_name()+"%");
			}
			if(tsEmePlanFiling.getBak1()!=null&&!"0".equals(tsEmePlanFiling.getBak1())) {
				finder.append(" and t.bak1 =:bak1").setParam("bak1", tsEmePlanFiling.getBak1());
			}
			if(StringUtils.isNoneBlank(tsEmePlanFiling.getCompanyName())) {
				finder.append(" and t1.companyName like:companyName").setParam("companyName", "%"+tsEmePlanFiling.getCompanyName()+"%");
			}
			return super.queryForList(finder, TsEmePlanFiling.class, page);
		}
		@Override
		public List<TsCompanyInfo> finderCompanyInfo(List<String> listCompany) throws Exception {
			if(CollectionUtils.isEmpty(listCompany)){
				return null;
			}
			Finder finder = new Finder();
			finder.append("SELECT * FROM `ts_company_info` t where t.id in (:companyId)")
			.setParam("companyId", listCompany);
			return super.queryForList(finder, TsCompanyInfo.class, null);
		}
		 //公司信息
	    @Override
	   	public TsCompanyInfo findCompanyInfoById(Object id) throws Exception{
	   	 return super.findById(id,TsCompanyInfo.class);
	   	}

		@Override
		public List<TsEmePlanFiling> findTsEmePlansFilingById(Object id) throws Exception {
			// TODO Auto-generated method stub
			//return null;
			Finder finder = new Finder("select t.*,t1.id as adid,t1.adjustment_id,t1.adjustment_catalog,t1.adjustment_desc from ts_eme_plan_filing t left join ts_eme_plan_fil_adjustment t1 on t.File_directory = t1.adjustment_id WHERE t.id=:id");
			finder.setParam("id", id);
			return super.queryForList(finder, TsEmePlanFiling.class, null);
			
			
		}

		@Override
		public TsEmePlanFiling findUserByIfindTsEmePlanFilingById(Object id) throws Exception {
			TsEmePlanFiling u=super.findById(id, TsEmePlanFiling.class);
			String File_directory = u.getFile_directory();
			//获取目录
			List<TsEmePlanFilAdjustment> adjustments = tsEmePlanFilAdjustmentService.findAdjustmentByFilId(File_directory);
			u.setFiladjustment(adjustments);
			return u;
		}
		@Override
		public void updateTsEmePlanFiling(String id)throws Exception {
			TsEmePlanFiling tsEmePlanFiling = super.findById(id, TsEmePlanFiling.class);
			tsEmePlanFiling.setBak1("2");
			super.update(tsEmePlanFiling);
		}

}
