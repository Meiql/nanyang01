package org.springrain.nybusiness.resourceAudit.service.impl;

import java.io.File;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springrain.nybusiness.ergency.entity.TsEmergencyMaterialSum;
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
				TsPreparegoodsNum tsPreparegoodsNum) throws Exception {

			Finder finder = new Finder();
			finder.append("select :id").setParam("id", "1");
			finder.append(",a.company,b.emergency ,c.enviro ,d.filing from (select count(id) company from ts_company_info  where bak1=:company ").setParam("company", "1");
			finder.append(" ORDER BY id) a,(select count(id) emergency from ts_emergency_equipment_sum where bak1=:eme").setParam("eme", "1"); finder.append(" ORDER BY id) b,"
					+ "(select count(id) enviro from ts_msg_enviro_risk where bak1=:enviro").setParam("enviro", "1"); finder.append(" ORDER BY id) c,(select count(id) filing from ts_eme_plan_filing where bak1=:fil").setParam("fil", "1"); 
					finder.append(" ORDER BY id) d");
			
			return super.queryForList(finder, TsPreparegoodsNum.class);
		}

}
