package org.springrain.nybusiness.tsInfoDetail.service.impl;

import java.io.File;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springrain.nybusiness.ergency.entity.TsErgencyInvestigation;
import org.springrain.nybusiness.tsInfoDetail.entity.TsInfoDetails;
import org.springrain.nybusiness.tsInfoDetail.service.ITsInfoDetailsService;
import org.springrain.frame.entity.IBaseEntity;
import org.springrain.frame.util.Finder;
import org.springrain.frame.util.Page;
import org.springrain.system.service.BaseSpringrainServiceImpl;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-12-11 22:31:15
 * @see org.springrain.nybusiness.tsInfoDetail.service.impl.TsInfoDetails
 */
@Service("tsInfoDetailsService")
public class TsInfoDetailsServiceImpl extends BaseSpringrainServiceImpl implements ITsInfoDetailsService {

   
    @Override
	public String  save(Object entity ) throws Exception{
	      TsInfoDetails tsInfoDetails=(TsInfoDetails) entity;
	       return super.save(tsInfoDetails).toString();
	}

    @Override
	public String  saveorupdate(Object entity ) throws Exception{
	      TsInfoDetails tsInfoDetails=(TsInfoDetails) entity;
		 return super.saveorupdate(tsInfoDetails).toString();
	}
	
	@Override
    public Integer update(IBaseEntity entity ) throws Exception{
	 TsInfoDetails tsInfoDetails=(TsInfoDetails) entity;
	return super.update(tsInfoDetails);
    }
    @Override
	public TsInfoDetails findTsInfoDetailsById(Object id) throws Exception{
	 return super.findById(id,TsInfoDetails.class);
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
	 * 
	 */
		 @Override
	public List<TsInfoDetails> findTsInfoDetailByProtalId(String protalId) throws Exception{
			 
		Finder finder = new Finder();
		finder.append("SELECT t.*,t1.title  FROM ts_info_details t,ts_info_portal t1  where t1.detailsid = t.protalid  and t.protalId = :protalId")
		.setParam("protalId", protalId); 
		return super.queryForList(finder, TsInfoDetails.class, null);

	}
}
