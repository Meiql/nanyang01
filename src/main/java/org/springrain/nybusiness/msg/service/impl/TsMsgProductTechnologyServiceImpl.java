package org.springrain.nybusiness.msg.service.impl;

import java.io.File;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;
import org.springrain.nybusiness.msg.entity.TsMsgEnviroRisk;
import org.springrain.nybusiness.msg.entity.TsMsgProductTechnology;
import org.springrain.nybusiness.msg.service.ITsMsgProductTechnologyService;
import org.springrain.frame.entity.IBaseEntity;
import org.springrain.frame.util.Finder;
import org.springrain.frame.util.Page;
import org.springrain.system.service.BaseSpringrainServiceImpl;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:45:34
 * @see org.springrain.nybusiness.msg.service.impl.TsMsgProductTechnology
 */
@Service("tsMsgProductTechnologyService")
public class TsMsgProductTechnologyServiceImpl extends BaseSpringrainServiceImpl implements ITsMsgProductTechnologyService {

   
    @Override
	public String  save(Object entity ) throws Exception{
	      TsMsgProductTechnology tsMsgProductTechnology=(TsMsgProductTechnology) entity;
	       return super.save(tsMsgProductTechnology).toString();
	}

    @Override
	public String  saveorupdate(Object entity ) throws Exception{
	      TsMsgProductTechnology tsMsgProductTechnology=(TsMsgProductTechnology) entity;
		 return super.saveorupdate(tsMsgProductTechnology).toString();
	}
	
	@Override
    public Integer update(IBaseEntity entity ) throws Exception{
	 TsMsgProductTechnology tsMsgProductTechnology=(TsMsgProductTechnology) entity;
	return super.update(tsMsgProductTechnology);
    }
    @Override
	public TsMsgProductTechnology findTsMsgProductTechnologyById(Object id) throws Exception{
	 return super.findById(id,TsMsgProductTechnology.class);
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
	public List<TsMsgProductTechnology> finderTsMsgProductTechnology(Page page,
			TsMsgProductTechnology tsMsgProductTechnology, List<String> listCompany) throws Exception {
		if(CollectionUtils.isEmpty(listCompany)){
			return null;
		}
		Finder finder = new Finder();
		//1.查询条件：公司id
		finder.append("SELECT * FROM `ts_msg_product_technology` t where t.companyId in (:companyId)")
		.setParam("companyId", listCompany);
		
		//2.查询条件：工艺类型名称
		String technologyName = tsMsgProductTechnology.getTechnologyName();
		if(technologyName != null && !technologyName.equals("")) {
			finder.append(" and t.technologyName like:technologyName").setParam("technologyName", "%"+technologyName+"%");
		}
		System.out.println("工艺类型综合信息查询sql   "+finder.getSql());
		return super.queryForList(finder, TsMsgProductTechnology.class, page);
	}

}
