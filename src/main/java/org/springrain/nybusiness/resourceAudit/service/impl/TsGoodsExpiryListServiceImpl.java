package org.springrain.nybusiness.resourceAudit.service.impl;

import java.io.File;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springrain.nybusiness.ergency.entity.TsEmergencyEquipmentSum;
import org.springrain.nybusiness.resourceAudit.entity.TsGoodsExpiryList;
import org.springrain.nybusiness.resourceAudit.entity.TsPrepareApprovl;
import org.springrain.nybusiness.resourceAudit.service.ITsGoodsExpiryListService;
import org.springrain.frame.entity.IBaseEntity;
import org.springrain.frame.util.Finder;
import org.springrain.frame.util.Page;
import org.springrain.system.service.BaseSpringrainServiceImpl;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-14 22:59:33
 * @see org.springrain.nybusiness.resourceAudit.service.impl.TsGoodsExpiryList
 */
@Service("tsGoodsExpiryListService")
public class TsGoodsExpiryListServiceImpl extends BaseSpringrainServiceImpl implements ITsGoodsExpiryListService {

   
    @Override
	public String  save(Object entity ) throws Exception{
	      TsGoodsExpiryList tsGoodsExpiryList=(TsGoodsExpiryList) entity;
	       return super.save(tsGoodsExpiryList).toString();
	}

    @Override
	public String  saveorupdate(Object entity ) throws Exception{
	      TsGoodsExpiryList tsGoodsExpiryList=(TsGoodsExpiryList) entity;
		 return super.saveorupdate(tsGoodsExpiryList).toString();
	}
	
	@Override
    public Integer update(IBaseEntity entity ) throws Exception{
	 TsGoodsExpiryList tsGoodsExpiryList=(TsGoodsExpiryList) entity;
	return super.update(tsGoodsExpiryList);
    }
    @Override
	public TsGoodsExpiryList findTsGoodsExpiryListById(Object id) throws Exception{
	 return super.findById(id,TsGoodsExpiryList.class);
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
        	
        finder.append("select id,name as goods_name ,type_Specifications as goods_type,"
        		+ "company_id as company ,quantity as goods_num,remarks as comments FROM"
        		+ " ts_ergency_investigation where Final_validity_time< CURDATE()");
        	
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
	public List<TsGoodsExpiryList> findListData(Page page, TsGoodsExpiryList tsGoodsExpiryList) throws Exception {
		Finder finder = new Finder();
		  finder.append("select a.id,a.name as goods_name ,a.type_Specifications as goods_type,  b.companyName as company ,"
		  		+ "a.quantity as goods_num,a.remarks as comments FROM ts_ergency_investigation a LEFT JOIN ts_company_info b "
		  		+ "on a.company_id=b.id where Final_validity_time< CURDATE() ");
		  return super.queryForList(finder, TsGoodsExpiryList.class, page);
	}

}
