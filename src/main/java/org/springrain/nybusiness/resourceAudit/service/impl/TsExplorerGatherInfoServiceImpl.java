package org.springrain.nybusiness.resourceAudit.service.impl;

import java.io.File;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springrain.nybusiness.ergency.entity.TsEmergencyMaterialSum;
import org.springrain.nybusiness.resourceAudit.entity.TsExplorerGatherInfo;
import org.springrain.nybusiness.resourceAudit.service.ITsExplorerGatherInfoService;
import org.springrain.frame.entity.IBaseEntity;
import org.springrain.frame.util.Finder;
import org.springrain.frame.util.Page;
import org.springrain.system.service.BaseSpringrainServiceImpl;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-24 13:28:27
 * @see org.springrain.nybusiness.resourceAudit.service.impl.TsExplorerGatherInfo
 */
@Service("tsExplorerGatherInfoService")
public class TsExplorerGatherInfoServiceImpl extends BaseSpringrainServiceImpl implements ITsExplorerGatherInfoService {

   
    @Override
	public String  save(Object entity ) throws Exception{
	      TsExplorerGatherInfo tsExplorerGatherInfo=(TsExplorerGatherInfo) entity;
	       return super.save(tsExplorerGatherInfo).toString();
	}

    @Override
	public String  saveorupdate(Object entity ) throws Exception{
	      TsExplorerGatherInfo tsExplorerGatherInfo=(TsExplorerGatherInfo) entity;
		 return super.saveorupdate(tsExplorerGatherInfo).toString();
	}
	
	@Override
    public Integer update(IBaseEntity entity ) throws Exception{
	 TsExplorerGatherInfo tsExplorerGatherInfo=(TsExplorerGatherInfo) entity;
	return super.update(tsExplorerGatherInfo);
    }
    @Override
	public TsExplorerGatherInfo findTsExplorerGatherInfoById(Object id) throws Exception{
	 return super.findById(id,TsExplorerGatherInfo.class);
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
	public List<TsExplorerGatherInfo> findListData(Page page, TsExplorerGatherInfo tsExplorerGatherInfo, List<String> listCompany)
			throws Exception {
		if(CollectionUtils.isEmpty(listCompany)){
			return null;
		}
		Finder finder = new Finder();
		finder.append("select t.id,info.orgid as competentOrganization,info.companyName as companyname,t.flueGasDealTon ,t.wasteWaterDealTon,t.hazardousWastesProduceTon,t.hazardousWastesDealTon,t.goodsType  from (SELECT t.id,t.companyId,t.wgprocessingCapacity as flueGasDealTon ,:nullvalue as wasteWaterDealTon,:nullvalue as hazardousWastesProduceTon, :nullvalue as hazardousWastesDealTon,:F1 as goodsType  FROM `ts_waste_air_msg` t union all select t.id ,t.companyId,:nullvalue as flueGasDealTon,t.processingCapacity ,:nullvalue as hazardousWastesProduceTon, :nullvalue as hazardousWastesDealTon,:F2 as goodsType  from `ts_waste_water_msg` t union all select t.id,t.companyId,:nullvalue as flueGasDealTon, :nullvalue as wasteWaterDealTon,t.hwproductNum , t.hwhandleNum ,:F3 as goodsType from ts_waste_material_msg t  )t left join ts_company_info info on t.companyId=info.id where t.companyId in (:companyId)")
		.setParam("companyId", listCompany).setParam("nullvalue", "").setParam("F1", "废气").setParam("F2", "废水").setParam("F3", "危险废物");
		
		if(StringUtils.isNoneBlank(tsExplorerGatherInfo.getGoodsType())) {
			finder.append(" and t.goodsType like:goodsType").setParam("goodsType", "%"+tsExplorerGatherInfo.getGoodsType()+"%");
		}
		if(StringUtils.isNoneBlank(tsExplorerGatherInfo.getCompetentOrganization())) {
			finder.append(" and info.orgid like:orgid").setParam("orgid", "%"+tsExplorerGatherInfo.getCompetentOrganization()+"%");
		}
	
		
		return super.queryForList(finder, TsExplorerGatherInfo.class, page);
	}

}
