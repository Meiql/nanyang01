package org.springrain.nybusiness.resourceAudit.service.impl;

import java.io.File;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springrain.nybusiness.company.entity.TsCompanyInfo;
import org.springrain.nybusiness.ergency.entity.TsEmergencyMaterialSum;
import org.springrain.nybusiness.resourceAudit.entity.TsGoodsInventory;
import org.springrain.nybusiness.resourceAudit.service.ITsGoodsInventoryService;
import org.springrain.frame.entity.IBaseEntity;
import org.springrain.frame.util.Finder;
import org.springrain.frame.util.Page;
import org.springrain.system.service.BaseSpringrainServiceImpl;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-08 23:33:54
 * @see org.springrain.nybusiness.resourceAudit.service.impl.TsGoodsInventory
 */
@Service("tsGoodsInventoryService")
public class TsGoodsInventoryServiceImpl extends BaseSpringrainServiceImpl implements ITsGoodsInventoryService {

   
    @Override
	public String  save(Object entity ) throws Exception{
	      TsGoodsInventory tsGoodsInventory=(TsGoodsInventory) entity;
	       return super.save(tsGoodsInventory).toString();
	}

    @Override
	public String  saveorupdate(Object entity ) throws Exception{
	      TsGoodsInventory tsGoodsInventory=(TsGoodsInventory) entity;
		 return super.saveorupdate(tsGoodsInventory).toString();
	}
	
	@Override
    public Integer update(IBaseEntity entity ) throws Exception{
	 TsGoodsInventory tsGoodsInventory=(TsGoodsInventory) entity;
	return super.update(tsGoodsInventory);
    }
    @Override
	public TsGoodsInventory findTsGoodsInventoryById(Object id) throws Exception{
	 return super.findById(id,TsGoodsInventory.class);
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
	public List<TsGoodsInventory> finderTsGoodsInventoryForList(Page page, TsGoodsInventory tsGoodsInventory,
			List<String> listCompany) throws Exception {
		if(CollectionUtils.isEmpty(listCompany)){
			return null;
		}
		Finder finder = new Finder();
		finder.append("select t.id,t.category as goods_type,t.`name` as goods_name,t.Unit as useful_life_num ,t.quantity as goods_num,t.type_Specifications as expiry_date_num,info.companyName as comments from (SELECT t.id ,t.category,t.serial_number,t.`name`,t.quantity,t.Unit,:nullvalue as in_Equipment,t.company_id,t.type_Specifications,t.bak1 FROM `ts_ergency_investigation` t union all SELECT t.id ,t.category,t.Serial_number,t.`name`,t.quantity,t.unit,t.in_Equipment,t.company_id, :nullvalue as type_Specifications,t.bak1 FROM `ts_emergency_equipment_sum` t )t left join ts_company_info info on t.company_id=info.id where t.bak1=:eme   and  t.company_id in (:companyId)")
			.setParam("companyId", listCompany).setParam("nullvalue", "").setParam("eme", "3");

		if(StringUtils.isNoneBlank(tsGoodsInventory.getGoods_type())) {
			finder.append(" and t.`name` like:goodsname").setParam("goodsname", "%"+tsGoodsInventory.getGoods_type()+"%");
		}
		if(StringUtils.isNoneBlank(tsGoodsInventory.getComments())) {
			finder.append(" and info.companyName like:companyName").setParam("companyName", "%"+tsGoodsInventory.getComments()+"%");
		}
		System.out.println(finder.toString());
		return super.queryForList(finder, TsGoodsInventory.class, page);
	}

}
