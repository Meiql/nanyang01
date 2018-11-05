package org.springrain.nybusiness.mail.service.impl;

import java.io.File;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;
import org.springrain.frame.entity.IBaseEntity;
import org.springrain.frame.util.Finder;
import org.springrain.frame.util.Page;
import org.springrain.nybusiness.mail.entity.TsMailListOutside;
import org.springrain.nybusiness.mail.service.ITsMailListOutsideService;
import org.springrain.system.service.BaseSpringrainServiceImpl;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:42:46
 * @see org.springrain.nybusiness.mail.service.impl.TsMailListOutside
 */
@Service("tsMailListOutsideService")
public class TsMailListOutsideServiceImpl extends BaseSpringrainServiceImpl implements ITsMailListOutsideService {

   
    @Override
	public String  save(Object entity ) throws Exception{
	      TsMailListOutside tsMailListOutside=(TsMailListOutside) entity;
	       return super.save(tsMailListOutside).toString();
	}

    @Override
	public String  saveorupdate(Object entity ) throws Exception{
	      TsMailListOutside tsMailListOutside=(TsMailListOutside) entity;
		 return super.saveorupdate(tsMailListOutside).toString();
	}
	
	@Override
    public Integer update(IBaseEntity entity ) throws Exception{
	 TsMailListOutside tsMailListOutside=(TsMailListOutside) entity;
	return super.update(tsMailListOutside);
    }
    @Override
	public TsMailListOutside findTsMailListOutsideById(Object id) throws Exception{
	 return super.findById(id,TsMailListOutside.class);
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
	public List<TsMailListOutside> finderTsMaillistForList(Page page,
			TsMailListOutside tsMailListOutside, List<String> listCompany)
			throws Exception {
		if(CollectionUtils.isEmpty(listCompany)){
			return null;
		}
		Finder finder = new Finder();
		finder.append("SELECT * FROM `ts_mail_list_outside` t where t.companyId in (:companyId)")
		.setParam("companyId", listCompany);
		return super.queryForList(finder, TsMailListOutside.class, page);
	}

}
