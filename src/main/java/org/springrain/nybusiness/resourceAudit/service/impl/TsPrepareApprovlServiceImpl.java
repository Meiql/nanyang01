package org.springrain.nybusiness.resourceAudit.service.impl;

import java.io.File;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springrain.nybusiness.company.entity.TsCompanyInfo;
import org.springrain.nybusiness.ergency.entity.TsEmePlanFiling;
import org.springrain.nybusiness.ergency.entity.TsEmergencyEquipmentSum;
import org.springrain.nybusiness.msg.entity.TsMsgEnviroRisk;
import org.springrain.nybusiness.resourceAudit.entity.TsPrepareApprovl;
import org.springrain.nybusiness.resourceAudit.entity.TsPreparegoodsNum;
import org.springrain.nybusiness.resourceAudit.service.ITsPrepareApprovlService;
import org.springrain.frame.entity.IBaseEntity;
import org.springrain.frame.util.Finder;
import org.springrain.frame.util.Page;
import org.springrain.system.service.BaseSpringrainServiceImpl;

/**
 * TODO 在此加入类描述
 * 
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version 2018-11-14 22:30:47
 * @see org.springrain.nybusiness.resourceAudit.service.impl.TsPrepareApprovl
 */
@Service("tsPrepareApprovlService")
public class TsPrepareApprovlServiceImpl extends BaseSpringrainServiceImpl implements ITsPrepareApprovlService {

	@Override
	public String save(Object entity) throws Exception {
		TsPrepareApprovl tsPrepareApprovl = (TsPrepareApprovl) entity;
		return super.save(tsPrepareApprovl).toString();
	}

	@Override
	public String saveorupdate(Object entity) throws Exception {
		TsPrepareApprovl tsPrepareApprovl = (TsPrepareApprovl) entity;
		return super.saveorupdate(tsPrepareApprovl).toString();
	}

	@Override
	public Integer update(IBaseEntity entity) throws Exception {
		TsPrepareApprovl tsPrepareApprovl = (TsPrepareApprovl) entity;
		return super.update(tsPrepareApprovl);
	}

	@Override
	public TsPrepareApprovl findTsPrepareApprovlById(Object id) throws Exception {
		return super.findById(id, TsPrepareApprovl.class);
	}

	/**
	 * 列表查询,每个service都会重载,要把sql语句封装到service中,Finder只是最后的方案
	 * 
	 * @param finder
	 * @param page
	 * @param clazz
	 * @param o
	 * @return
	 * @throws Exception
	 */
	@Override
	public <T> List<T> findListDataByFinder(Finder finder, Page page, Class<T> clazz, Object o) throws Exception {
		return super.findListDataByFinder(finder, page, clazz, o);
	}

	/**
	 * 根据查询列表的宏,导出Excel
	 * 
	 * @param finder 为空则只查询 clazz表
	 * @param ftlurl 类表的模版宏
	 * @param page   分页对象
	 * @param clazz  要查询的对象
	 * @param o      querybean
	 * @return
	 * @throws Exception
	 */
	@Override
	public <T> File findDataExportExcel(Finder finder, String ftlurl, Page page, Class<T> clazz, Object o)
			throws Exception {
		return super.findDataExportExcel(finder, ftlurl, page, clazz, o);
	}

	@Override
	public List<TsPrepareApprovl> findListData(TsPrepareApprovl tsPrepareApprovl) throws Exception {

		Finder finder = new Finder();
		finder.append("select :id").setParam("id", "2");
		finder.append(
				",a.company as goods_name ,b.emergency as company ,c.enviro as numbers ,d.filing as bak1  from (select count(id) company from ts_company_info where bak1=:company")
				.setParam("company", "2");
		finder.append(" ORDER BY id) a,(select count(id) emergency from ts_emergency_equipment_sum where bak1=:eme")
				.setParam("eme", "2");
		finder.append(" ORDER BY id) b,"
				+ "(select count(id) enviro from ts_msg_enviro_risk where bak1=:enviro").setParam("enviro", "2"); finder.append(" ORDER BY id) c,(select count(id) filing from ts_eme_plan_filing where bak1=:fil")
				.setParam("fil", "2");
		finder.append(" ORDER BY id) d");
		return super.queryForList(finder, TsPrepareApprovl.class);
	}

	@Override
	public void updateTsEmergencyEquipmentSumPass(String id, String type) throws Exception {
		TsEmergencyEquipmentSum tsEmergencyEquipmentSum = super.findById(id, TsEmergencyEquipmentSum.class);
		if (type.equals("pass")) {
		tsEmergencyEquipmentSum.setBak1("3");
		}else {
			tsEmergencyEquipmentSum.setBak1("4");
		}
		super.update(tsEmergencyEquipmentSum);
	}

	@Override
	public List<TsEmergencyEquipmentSum> finderTsEmergencyForList(Page page,
			TsEmergencyEquipmentSum tsEmergencyEquipmentSum) throws Exception {

		Finder finder = new Finder();
		finder.append("SELECT * FROM `ts_emergency_equipment_sum` t where t.bak1=:eme").setParam("eme", "2");
		if (StringUtils.isNoneBlank(tsEmergencyEquipmentSum.getName())) {
			finder.append(" and t.name like:name").setParam("name", "%" + tsEmergencyEquipmentSum.getName() + "%");
		}
		if (tsEmergencyEquipmentSum.getCategory() != null && tsEmergencyEquipmentSum.getCategory() != 0) {
			finder.append(" and t.category =:category").setParam("category", tsEmergencyEquipmentSum.getCategory());
		}
		return super.queryForList(finder, TsEmergencyEquipmentSum.class, page);
	}

	@Override
	public List<TsEmePlanFiling> finderTsEmePlanFilingForList(Page page, TsEmePlanFiling tsEmePlanFiling) throws Exception {

		Finder finder = new Finder();
		finder.append("SELECT * FROM `ts_eme_plan_filing` t where t.bak1=:eme").setParam("eme", "2");
		if (StringUtils.isNoneBlank(tsEmePlanFiling.getCompany_name())) {
			finder.append(" and t.name like:name").setParam("name", "%" + tsEmePlanFiling.getCompany_name() + "%");
		}
		return super.queryForList(finder, TsEmePlanFiling.class, page);
	}

	@Override
	public void updateTsEmePlanFilingPass(String id, String type) throws Exception {
		TsEmePlanFiling tsEmePlanFiling = super.findById(id, TsEmePlanFiling.class);
		if (type.equals("pass")) {
			tsEmePlanFiling.setBak1("3");
		} else {
			tsEmePlanFiling.setBak1("4");
		}
		super.update(tsEmePlanFiling);

	}

	@Override
	public List<TsCompanyInfo> finderTsCompanyInfoForList(Page page, TsCompanyInfo tsCompanyInfo) throws Exception {
		Finder finder = new Finder();
		finder.append("SELECT * FROM `ts_company_info` t where t.bak1=:eme").setParam("eme", "2");
		return super.queryForList(finder, TsCompanyInfo.class, page);
	}

	@Override
	public void updateTsCompanyInfoPass(String id, String type) throws Exception {
		Finder finder = new Finder();
		if (type.equals("pass")) {
			finder.append("UPDATE `ts_company_info` t SET t.bak1=:bak1")
			.setParam("bak1", "3").append(" where t.id=:id").setParam("id", id);
		} else {
			finder.append("UPDATE `ts_company_info` t SET t.bak1=:bak1")
			.setParam("bak1", "4").append(" where t.id=:id").setParam("id", id);
		}
		super.update(finder);
		
	}

	@Override
	public List<TsMsgEnviroRisk> finderTsMsgEnviroRiskForList(Page page, TsMsgEnviroRisk tsMsgEnviroRisk)
			throws Exception {
		Finder finder = new Finder();
		finder.append("SELECT * FROM `ts_msg_enviro_risk` t where t.bak1=:eme").setParam("eme", "2");
		return super.queryForList(finder, TsMsgEnviroRisk.class, page);
	}

	@Override
	public void updateTsMsgEnviroRiskPass(String id, String type) throws Exception {
		//TsMsgEnviroRisk tsMsgEnviroRisk = super.findById(id, TsMsgEnviroRisk.class);
		Finder finder = new Finder();
		if (type.equals("pass")) {
			finder.append("UPDATE `ts_msg_enviro_risk` t SET t.bak1=:bak1")
			.setParam("bak1", "3").append(" where t.id=:id").setParam("id", id);
		} else {
			finder.append("UPDATE `ts_msg_enviro_risk` t SET t.bak1=:bak1")
			.setParam("bak1", "4").append(" where t.id=:id").setParam("id", id);
		}
		super.update(finder);
		
	}

}
