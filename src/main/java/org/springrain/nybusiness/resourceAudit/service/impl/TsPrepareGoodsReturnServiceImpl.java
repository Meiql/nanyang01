package org.springrain.nybusiness.resourceAudit.service.impl;

import java.io.File;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springrain.nybusiness.resourceAudit.entity.TsPrepareGoodsReturn;
import org.springrain.nybusiness.resourceAudit.entity.TsPreparegoodsNum;
import org.springrain.nybusiness.resourceAudit.service.ITsPrepareGoodsReturnService;
import org.springrain.frame.entity.IBaseEntity;
import org.springrain.frame.util.Finder;
import org.springrain.frame.util.Page;
import org.springrain.system.service.BaseSpringrainServiceImpl;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-14 22:54:36
 * @see org.springrain.nybusiness.resourceAudit.service.impl.TsPrepareGoodsReturn
 */
@Service("tsPrepareGoodsReturnService")
public class TsPrepareGoodsReturnServiceImpl extends BaseSpringrainServiceImpl implements ITsPrepareGoodsReturnService {

   
    @Override
	public String  save(Object entity ) throws Exception{
	      TsPrepareGoodsReturn tsPrepareGoodsReturn=(TsPrepareGoodsReturn) entity;
	       return super.save(tsPrepareGoodsReturn).toString();
	}

    @Override
	public String  saveorupdate(Object entity ) throws Exception{
	      TsPrepareGoodsReturn tsPrepareGoodsReturn=(TsPrepareGoodsReturn) entity;
		 return super.saveorupdate(tsPrepareGoodsReturn).toString();
	}
	
	@Override
    public Integer update(IBaseEntity entity ) throws Exception{
	 TsPrepareGoodsReturn tsPrepareGoodsReturn=(TsPrepareGoodsReturn) entity;
	return super.update(tsPrepareGoodsReturn);
    }
    @Override
	public TsPrepareGoodsReturn findTsPrepareGoodsReturnById(Object id) throws Exception{
	 return super.findById(id,TsPrepareGoodsReturn.class);
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
	public List<TsPrepareGoodsReturn> findListData(TsPrepareGoodsReturn tsPrepareGoodsReturn) throws Exception {
		Finder finder = new Finder();
		finder.append("select :id").setParam("id", "1");
		finder.append(
				",a.company as goods_name ,b.emergency as numbers ,c.enviro as bak1 ,d.filing as bak2  from (select count(id) company from ts_company_info where bak1=:company")
				.setParam("company", "4");
		finder.append(" ORDER BY id) a,(select count(id) emergency from ts_emergency_equipment_sum where bak1=:eme")
				.setParam("eme", "4");
		finder.append(" ORDER BY id) b,"
				+ "(select count(id) enviro from ts_msg_enviro_risk where bak1=:enviro").setParam("enviro", "4"); finder.append(" ORDER BY id) c,(select count(id) filing from ts_eme_plan_filing where bak1=:fil")
				.setParam("fil", "4");
		finder.append(" ORDER BY id) d");
		
		return super.queryForList(finder, TsPrepareGoodsReturn.class);
	
	}

}
