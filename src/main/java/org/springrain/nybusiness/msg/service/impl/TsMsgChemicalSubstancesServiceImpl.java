package org.springrain.nybusiness.msg.service.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;
import org.springrain.nybusiness.msg.entity.TsMsgChemicalSubstances;
import org.springrain.nybusiness.msg.entity.TsMsgEnviroRisk;
import org.springrain.nybusiness.msg.service.ITsMsgChemicalSubstancesService;
import org.springrain.frame.entity.IBaseEntity;
import org.springrain.frame.util.Finder;
import org.springrain.frame.util.Page;
import org.springrain.system.service.BaseSpringrainServiceImpl;

import freemarker.template.utility.StringUtil;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:44:12
 * @see org.springrain.nybusiness.msg.service.impl.TsMsgChemicalSubstances
 */
@Service("tsMsgChemicalSubstancesService")
public class TsMsgChemicalSubstancesServiceImpl extends BaseSpringrainServiceImpl implements ITsMsgChemicalSubstancesService {

   
    @Override
	public String  save(Object entity ) throws Exception{
	      TsMsgChemicalSubstances tsMsgChemicalSubstances=(TsMsgChemicalSubstances) entity;
	       return super.save(tsMsgChemicalSubstances).toString();
	}

    @Override
	public String  saveorupdate(Object entity ) throws Exception{
	      TsMsgChemicalSubstances tsMsgChemicalSubstances=(TsMsgChemicalSubstances) entity;
		 return super.saveorupdate(tsMsgChemicalSubstances).toString();
	}
	
	@Override
    public Integer update(IBaseEntity entity ) throws Exception{
	 TsMsgChemicalSubstances tsMsgChemicalSubstances=(TsMsgChemicalSubstances) entity;
	return super.update(tsMsgChemicalSubstances);
    }
    @Override
	public TsMsgChemicalSubstances findTsMsgChemicalSubstancesById(Object id) throws Exception{
	 return super.findById(id,TsMsgChemicalSubstances.class);
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
	/**
	 * 根据权限查询
	*/
	@Override
	public List<TsMsgChemicalSubstances> finderTsMsgChemicalSubstances(Page page,
			TsMsgChemicalSubstances tsMsgChemicalSubstances, List<String> listCompany) throws Exception {
		if(CollectionUtils.isEmpty(listCompany)){
			return null;
		}
		Finder finder = new Finder();
		//1.查询条件：公司id
		finder.append("SELECT * FROM `ts_msg_chemical_substances` t where t.companyId in (:companyId)")
		.setParam("companyId", listCompany);
		
		//2.查询条件：化学名称
		String chemistryName = tsMsgChemicalSubstances.getChemistryName();
		if(chemistryName != null && !chemistryName.equals("")) {
			finder.append(" and t.chemistryName like:chemistryName").setParam("chemistryName", "%"+chemistryName+"%");
		}
		System.out.println("化学物质条件查询 sql：   "+finder.getSql());
		return super.queryForList(finder, TsMsgChemicalSubstances.class, page);
	}
  /**
   * 查询公司名称
   */
	@Override
	public String finderCompanyNameByCompanyId(String companyId) throws Exception {
		if(companyId.isEmpty()){
			return null;
		}
		Finder finder = new Finder();
		finder.append("SELECT t.companyName  FROM `ts_company_info` t where t.id =:companyId")
		.setParam("companyId", companyId);
		System.out.println("公司名称查询 sql：   "+finder.getSql());
		Map<String , Object> map = super.queryForObject(finder);		
	    String companyName = (String) map.get("companyName");
	    System.out.println("查询公司名称为："+companyName);
		return companyName;
	}

}
