package org.springrain.nybusiness.facility.service.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springrain.nybusiness.company.entity.TsCompanyInfo;
import org.springrain.nybusiness.constants.SysStateEnum;
import org.springrain.nybusiness.facility.entity.TsFacilityInfo;
import org.springrain.nybusiness.facility.service.ITsFacilityInfoService;
import org.springrain.frame.common.SessionUser;
import org.springrain.frame.entity.IBaseEntity;
import org.springrain.frame.util.Finder;
import org.springrain.frame.util.Page;
import org.springrain.system.entity.Org;
import org.springrain.system.entity.User;
import org.springrain.system.entity.UserOrg;
import org.springrain.system.service.BaseSpringrainServiceImpl;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-28 16:52:21
 * @see org.springrain.nybusiness.company.service.impl.TsFacilityInfo
 */
@Service("tsFacilityInfoService")
public class TsFacilityInfoServiceImpl extends BaseSpringrainServiceImpl implements ITsFacilityInfoService {

   
    @Override
	public String  save(Object entity ) throws Exception{
	      TsFacilityInfo tsFacilityInfo=(TsFacilityInfo) entity;
	       return super.save(tsFacilityInfo).toString();
	}

    @Override
	public String  saveorupdate(Object entity ) throws Exception{
	      TsFacilityInfo tsFacilityInfo=(TsFacilityInfo) entity;
		 return super.saveorupdate(tsFacilityInfo).toString();
	}
	
	@Override
    public Integer update(IBaseEntity entity ) throws Exception{
	 TsFacilityInfo tsFacilityInfo=(TsFacilityInfo) entity;
	return super.update(tsFacilityInfo);
    }
    @Override
	public TsFacilityInfo findTsFacilityInfoById(Object id) throws Exception{
	 return super.findById(id,TsFacilityInfo.class);
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
		public List<TsFacilityInfo> findertsFacilityInfo(Page page,
				TsFacilityInfo tsFacilityInfo,List<String> listCompany) throws Exception {
			if(CollectionUtils.isEmpty(listCompany)){
				return null;
			}
			Finder finder = new Finder();
			finder.append("SELECT t.*,t1.name as createName FROM `ts_facility_info` t,t_user t1 where t.createUser=t1.id and t.companyId in (:companyId)")
			.setParam("companyId", listCompany);
			if(StringUtils.isNoneBlank(tsFacilityInfo.getDeviceNumber())){
				finder.append(" and t.deviceNumber like:deviceNumber").setParam("deviceNumber", "%"+tsFacilityInfo.getDeviceNumber()+"%");
			}
			return super.queryForList(finder, TsFacilityInfo.class, page);
		}
}
