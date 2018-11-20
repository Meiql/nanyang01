package org.springrain.nybusiness.msg.service.impl;

import java.io.File;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springrain.nybusiness.mail.entity.TsMailListInside;
import org.springrain.nybusiness.msg.entity.TsMsgEnviroRisk;
import org.springrain.nybusiness.msg.service.ITsMsgEnviroRiskService;
import org.springrain.frame.entity.IBaseEntity;
import org.springrain.frame.util.Finder;
import org.springrain.frame.util.Page;
import org.springrain.system.service.BaseSpringrainServiceImpl;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:44:24
 * @see org.springrain.nybusiness.msg.service.impl.TsMsgEnviroRisk
 */
@Service("tsMsgEnviroRiskService")
public class TsMsgEnviroRiskServiceImpl extends BaseSpringrainServiceImpl implements ITsMsgEnviroRiskService {

   
    @Override
	public String  save(Object entity ) throws Exception{
	      TsMsgEnviroRisk tsMsgEnviroRisk=(TsMsgEnviroRisk) entity;
	       return super.save(tsMsgEnviroRisk).toString();
	}

    @Override
	public String  saveorupdate(Object entity ) throws Exception{
	      TsMsgEnviroRisk tsMsgEnviroRisk=(TsMsgEnviroRisk) entity;
		 return super.saveorupdate(tsMsgEnviroRisk).toString();
	}
	
	@Override
    public Integer update(IBaseEntity entity ) throws Exception{
	 TsMsgEnviroRisk tsMsgEnviroRisk=(TsMsgEnviroRisk) entity;
	return super.update(tsMsgEnviroRisk);
    }
    @Override
	public TsMsgEnviroRisk findTsMsgEnviroRiskById(Object id) throws Exception{
	 return super.findById(id,TsMsgEnviroRisk.class);
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
	public TsMsgEnviroRisk saveTsMsgEnviroRisk(TsMsgEnviroRisk tsMsgEnviroRisk) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 根据权限查询
	 */
	@Override
	public List<TsMsgEnviroRisk> finderTsEnvirolistForList(Page page, TsMsgEnviroRisk tsMsgEnviroRisk,
			List<String> listCompany) throws Exception {
		if(CollectionUtils.isEmpty(listCompany)){
			return null;
		}
		Finder finder = new Finder();
		//1.查询条件：公司id
		finder.append("SELECT * FROM `ts_msg_enviro_risk` t where t.companyId in (:companyId)")
		.setParam("companyId", listCompany);
		
		String riskUnitName = tsMsgEnviroRisk.getRiskUnitName();
		String bak1 = tsMsgEnviroRisk.getBak1();
		//2.查询条件：风险单元名称
		if(riskUnitName != null && !riskUnitName.equals("")) {
			finder.append(" and t.riskUnitName like:riskUnitName").setParam("riskUnitName", "%"+riskUnitName+"%");
		}
		//3.查询条件：风险单元类别
		if(bak1 != null && !bak1.equals("")) {
			finder.append(" and t.bak1 like:bak1").setParam("bak1", "%"+bak1+"%");
		}
		System.out.println("环境风险单元查询sql   "+finder.getSql());
		return super.queryForList(finder, TsMsgEnviroRisk.class, page);
	}
	/**
	 * 更新提交状态bak1
	 */
	@Override
	public void updateBak1(String id, Class<TsMsgEnviroRisk> class1)  throws Exception {
		Finder finder = new Finder();
		String bak1 = "2";
		finder.append("UPDATE `ts_msg_enviro_risk` t SET t.bak1=:bak1")
		.setParam("bak1", bak1).append(" where t.id=:id").setParam("id", id);
		super.update(finder);
	System.out.println("环境风险提交状态更新 sql  "+finder.getSql());			
	}

}
