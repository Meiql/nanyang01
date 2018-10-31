package org.springrain.nybusiness.ergency.service.impl;

import java.io.File;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springrain.nybusiness.ergency.entity.TsEmeEquSumCategory;
import org.springrain.nybusiness.ergency.service.ITsEmeEquSumCategoryService;
import org.springrain.frame.entity.IBaseEntity;
import org.springrain.frame.util.Finder;
import org.springrain.frame.util.Page;
import org.springrain.system.service.BaseSpringrainServiceImpl;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-31 10:32:51
 * @see org.springrain.nybusiness.ergency.service.impl.TsEmeEquSumCategory
 */
@Service("tsEmeEquSumCategoryService")
public class TsEmeEquSumCategoryServiceImpl extends BaseSpringrainServiceImpl implements ITsEmeEquSumCategoryService {

   
    @Override
	public String  save(Object entity ) throws Exception{
	      TsEmeEquSumCategory tsEmeEquSumCategory=(TsEmeEquSumCategory) entity;
	       return super.save(tsEmeEquSumCategory).toString();
	}

    @Override
	public String  saveorupdate(Object entity ) throws Exception{
	      TsEmeEquSumCategory tsEmeEquSumCategory=(TsEmeEquSumCategory) entity;
		 return super.saveorupdate(tsEmeEquSumCategory).toString();
	}
	
	@Override
    public Integer update(IBaseEntity entity ) throws Exception{
	 TsEmeEquSumCategory tsEmeEquSumCategory=(TsEmeEquSumCategory) entity;
	return super.update(tsEmeEquSumCategory);
    }
    @Override
	public TsEmeEquSumCategory findTsEmeEquSumCategoryById(Object id) throws Exception{
	 return super.findById(id,TsEmeEquSumCategory.class);
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

}
