package org.springrain.nybusiness.mail.service.impl;

import java.io.File;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springrain.frame.entity.IBaseEntity;
import org.springrain.frame.util.Finder;
import org.springrain.frame.util.Page;
import org.springrain.nybusiness.mail.entity.TsMailListInside;
import org.springrain.nybusiness.mail.service.ITsMailListInsideService;
import org.springrain.system.service.BaseSpringrainServiceImpl;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:43:02
 * @see org.springrain.nybusiness.mail.service.impl.TsMailListInside
 */
@Service("tsMailListInsideService")
public class TsMailListInsideServiceImpl extends BaseSpringrainServiceImpl implements ITsMailListInsideService {

   
    @Override
	public String  save(Object entity ) throws Exception{
	      TsMailListInside tsMailListInside=(TsMailListInside) entity;
	       return super.save(tsMailListInside).toString();
	}

    @Override
	public String  saveorupdate(Object entity ) throws Exception{
	      TsMailListInside tsMailListInside=(TsMailListInside) entity;
		 return super.saveorupdate(tsMailListInside).toString();
	}
	
	@Override
    public Integer update(IBaseEntity entity ) throws Exception{
	 TsMailListInside tsMailListInside=(TsMailListInside) entity;
	return super.update(tsMailListInside);
    }
    @Override
	public TsMailListInside findTsMailListInsideById(Object id) throws Exception{
	 return super.findById(id,TsMailListInside.class);
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
	public List<TsMailListInside> finderTsMaillistForList(Page page,
			TsMailListInside tsMailListInside, List<String> listCompany)
			throws Exception {
		if(CollectionUtils.isEmpty(listCompany)){
			return null;
		}
		Finder finder = new Finder();
		finder.append("SELECT t.* ,t1.companyName as companyName FROM `ts_mail_list_inside` t ,ts_company_info t1 where t.companyId = t1.id  and t.companyId in (:companyId)")
		.setParam("companyId", listCompany);
		if(StringUtils.isNoneBlank(tsMailListInside.getUnitName())){
			finder.append(" and t.unitName like:unitName").setParam("unitName", "%"+tsMailListInside.getUnitName()+"%");
		}
		if(StringUtils.isNoneBlank(tsMailListInside.getCompanyId())){
			finder.append(" and t.companyId =:companyId").setParam("companyId", tsMailListInside.getCompanyId());
		}
		finder.append("  order by t.companyId , t.createTime desc");
		return super.queryForList(finder, TsMailListInside.class, page);
	}

}
