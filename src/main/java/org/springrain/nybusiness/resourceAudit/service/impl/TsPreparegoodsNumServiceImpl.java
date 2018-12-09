package org.springrain.nybusiness.resourceAudit.service.impl;

import java.io.File;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springrain.nybusiness.company.entity.TsCompanyInfo;
import org.springrain.nybusiness.ergency.entity.TsEmePlanFiling;
import org.springrain.nybusiness.ergency.entity.TsEmergencyEquipmentSum;
import org.springrain.nybusiness.ergency.entity.TsEmergencyMaterialSum;
import org.springrain.nybusiness.ergency.entity.TsErgencyInvestigation;
import org.springrain.nybusiness.msg.entity.TsMsgEnviroRisk;
import org.springrain.nybusiness.resourceAudit.entity.TsGoodsInventory;
import org.springrain.nybusiness.resourceAudit.entity.TsPreparegoodsNum;
import org.springrain.nybusiness.resourceAudit.service.ITsPreparegoodsNumService;
import org.springrain.frame.entity.IBaseEntity;
import org.springrain.frame.util.Finder;
import org.springrain.frame.util.Page;
import org.springrain.system.service.BaseSpringrainServiceImpl;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-16 01:29:53
 * @see org.springrain.nybusiness.resourceAudit.service.impl.TsPreparegoodsNum
 */
@Service("tsPreparegoodsNumService")
public class TsPreparegoodsNumServiceImpl extends BaseSpringrainServiceImpl implements ITsPreparegoodsNumService {

   
    @Override
	public String  save(Object entity ) throws Exception{
	      TsPreparegoodsNum tsPreparegoodsNum=(TsPreparegoodsNum) entity;
	       return super.save(tsPreparegoodsNum).toString();
	}

    @Override
	public String  saveorupdate(Object entity ) throws Exception{
	      TsPreparegoodsNum tsPreparegoodsNum=(TsPreparegoodsNum) entity;
		 return super.saveorupdate(tsPreparegoodsNum).toString();
	}
	
	@Override
    public Integer update(IBaseEntity entity ) throws Exception{
	 TsPreparegoodsNum tsPreparegoodsNum=(TsPreparegoodsNum) entity;
	return super.update(tsPreparegoodsNum);
    }
    @Override
	public TsPreparegoodsNum findTsPreparegoodsNumById(Object id) throws Exception{
	 return super.findById(id,TsPreparegoodsNum.class);
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
		public List<TsPreparegoodsNum> findListData(
				TsPreparegoodsNum tsPreparegoodsNum,List<String> listCompany) throws Exception {
			if(CollectionUtils.isEmpty(listCompany)){
				return null;
			}
			Finder finder = new Finder();
			finder.append("select :id").setParam("id", "1");
			finder.append(",a.company,b.emergency ,c.enviro ,d.filing from (select count(id) company from ts_company_info  where bak1=:company and id in (:companyid) ").setParam("company", "1").setParam("companyid", listCompany);
			finder.append(" ORDER BY id) a,(select count(id) emergency from (select t.id from ts_emergency_equipment_sum t where t.bak1=:eme and t.company_id in (:companyid) union all select t.id from ts_ergency_investigation t where t.bak1=:eme and t.company_id in (:companyid))t").setParam("eme", "1").setParam("companyid",listCompany ); 
			finder.append(" ORDER BY id) b,(select count(id) enviro from ts_msg_enviro_risk where bak1=:enviro and companyId in (:companyid)").setParam("enviro", "1").setParam("companyid", listCompany); 
			finder.append(" ORDER BY id) c,(select count(id) filing from ts_eme_plan_filing where bak1=:fil and company_id in (:companyid)").setParam("fil", "1").setParam("companyid", listCompany); 
			finder.append(" ORDER BY id) d");
			
			
			return super.queryForList(finder, TsPreparegoodsNum.class);
		}
		
		@Override
		public List<TsEmergencyMaterialSum> finderTsEmergencyForList(Page page,
				TsEmergencyMaterialSum tsEmergencyMaterialSum ,List<String> listCompany) throws Exception {
			if(CollectionUtils.isEmpty(listCompany)){
				return null;
			}
			Finder finder = new Finder();
			finder.append("select t.* ,t1.companyName as companyName from (SELECT t.id,t.serial_number,t.`name`,t.quantity,t.Unit,:nullvalue as in_Equipment,:nullvalue as outside_company,:nullvalue as outside_people, :nullvalue as outside_tel,t.bak1,:F1 as table_from,t.company_id FROM `ts_ergency_investigation` t  union all SELECT t.id,t.Serial_number,t.`name`,t.quantity,t.unit,t.in_Equipment,t.outside_company,t.outside_people,t.outside_tel,t.bak1,:F2 as table_from,t.company_id FROM `ts_emergency_equipment_sum` t )t,ts_company_info t1 where t.company_id = t1.id and t.bak1=:bak and t.company_id in (:companyId)")
			.setParam("companyId", listCompany).setParam("nullvalue", "").setParam("F1", "F1").setParam("F2", "F2").setParam("bak", "1");
		if(StringUtils.isNoneBlank(tsEmergencyMaterialSum.getName())) {
			finder.append(" and t.name like:name").setParam("name", "%"+tsEmergencyMaterialSum.getName()+"%");
		}
		if(tsEmergencyMaterialSum.getIn_Equipment()!=null&&!"0".equals(tsEmergencyMaterialSum.getIn_Equipment())) {
			finder.append(" and t.in_equipment =:in_equipment").setParam("in_equipment", tsEmergencyMaterialSum.getIn_Equipment());
		}
			return super.queryForList(finder, TsEmergencyMaterialSum.class, page);
		}

		@Override
		public List<TsEmePlanFiling> finderTsEmePlanFilingForList(Page page, TsEmePlanFiling tsEmePlanFiling ,List<String> listCompany) throws Exception {
			if(CollectionUtils.isEmpty(listCompany)){
				return null;
			}
			Finder finder = new Finder();
			finder.append("SELECT * FROM `ts_eme_plan_filing` t  where  t.bak1=:eme and t.company_id in (:companyId)").setParam("eme", "1").setParam("companyId", listCompany);
			if (StringUtils.isNoneBlank(tsEmePlanFiling.getCompany_name())) {
				finder.append(" and t.company_name like:name").setParam("name", "%" + tsEmePlanFiling.getCompany_name() + "%");
			}
			return super.queryForList(finder, TsEmePlanFiling.class, page);
		}
		
		@Override
		public List<TsCompanyInfo> finderTsCompanyInfoForList(Page page, TsCompanyInfo tsCompanyInfo) throws Exception {
			Finder finder = new Finder();
			finder.append("SELECT * FROM `ts_company_info` t where t.bak1=:eme").setParam("eme", "1");
			if (StringUtils.isNoneBlank(tsCompanyInfo.getCompanyName())) {
				finder.append(" and t.companyName like:name").setParam("name", "%" + tsCompanyInfo.getCompanyName() + "%");
			}
			return super.queryForList(finder, TsCompanyInfo.class, page);
		}
		
		@Override
		public List<TsMsgEnviroRisk> finderTsMsgEnviroRiskForList(Page page, TsMsgEnviroRisk tsMsgEnviroRisk,List<String> listCompany)
				throws Exception {
			if(CollectionUtils.isEmpty(listCompany)){
				return null;
			}
			Finder finder = new Finder();
			finder.append("SELECT * FROM `ts_msg_enviro_risk` t where t.bak1=:eme and t.companyId in (:companyId) ").setParam("eme", "1").setParam("companyId", listCompany);
			if (StringUtils.isNoneBlank(tsMsgEnviroRisk.getRiskUnitName())) {
				finder.append(" and t.riskUnitName like:name").setParam("name", "%" + tsMsgEnviroRisk.getRiskUnitName()+ "%");
			}
			if (StringUtils.isNoneBlank(tsMsgEnviroRisk.getRiskUnitTypeName())) {
				finder.append(" and t.riskUnitTypeName like:name").setParam("name", "%" + tsMsgEnviroRisk.getRiskUnitTypeName() + "%");
			}
			return super.queryForList(finder, TsMsgEnviroRisk.class, page);
		}

}
