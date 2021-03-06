package org.springrain.nybusiness.ergency.service.impl;

import java.io.File;
import java.util.Date;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springrain.nybusiness.ergency.entity.TsDeclare;
import org.springrain.nybusiness.ergency.service.ITsDeclareService;
import org.springrain.frame.entity.IBaseEntity;
import org.springrain.frame.util.DateUtils;
import org.springrain.frame.util.Finder;
import org.springrain.frame.util.Page;
import org.springrain.system.service.BaseSpringrainServiceImpl;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-20 11:16:28
 * @see org.springrain.nybusiness.company.service.impl.TsDeclare
 */
@Service("tsDeclareService")
public class TsDeclareServiceImpl extends BaseSpringrainServiceImpl implements ITsDeclareService {

   
    @Override
	public String  save(Object entity ) throws Exception{
	      TsDeclare tsDeclare=(TsDeclare) entity;
	       return super.save(tsDeclare).toString();
	}

    @Override
	public String  saveorupdate(Object entity ) throws Exception{
	      TsDeclare tsDeclare=(TsDeclare) entity;
		 return super.saveorupdate(tsDeclare).toString();
	}
	
	@Override
    public Integer update(IBaseEntity entity ) throws Exception{
	 TsDeclare tsDeclare=(TsDeclare) entity;
	return super.update(tsDeclare);
    }
    @Override
	public TsDeclare findTsDeclareById(Object id) throws Exception{
	 return super.findById(id,TsDeclare.class);
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
		public List<TsDeclare> finderTsDeclareForList(Page page,
				TsDeclare tsDeclare, List<String> listCompany) throws Exception {
			if(CollectionUtils.isEmpty(listCompany)){
				return null;
			}
			Finder finder = new Finder();
			finder.append("select t.*,t1.name as createName FROM `ts_declare` t,t_user t1 where t.createUser=t1.id  and t.companyid in (:companyId)")
			.setParam("companyId", listCompany);
			if(StringUtils.isNoneBlank(tsDeclare.getMaterialName())) {
				finder.append(" and t.materialName like:name").setParam("name", "%"+tsDeclare.getMaterialName()+"%");
			}
			if(StringUtils.isNoneBlank(tsDeclare.getCreateName())) {
				finder.append(" and t1.name like:createName").setParam("createName", "%"+tsDeclare.getCreateName()+"%");
			}
			if(StringUtils.isNoneBlank(tsDeclare.getBak1())){
				finder.append(" and t.bak1 =:bak1").setParam("bak1",tsDeclare.getBak1());
			}
			if(StringUtils.isNoneBlank(tsDeclare.getBak2())){
				finder.append(" and t.bak2 =:bak2").setParam("bak2", "2");
			}
			if(StringUtils.isNoneBlank(tsDeclare.getDeclareTime())){
				if(tsDeclare.getDeclareTime().length()==4){
					finder.append(" and left(declareTime,4) like:declareTime").setParam("declareTime", "%"+tsDeclare.getDeclareTime()+"%");
				}
				if(tsDeclare.getDeclareTime().length()==7){
					finder.append(" and left(declareTime,7) like:declareTime").setParam("declareTime", "%"+tsDeclare.getDeclareTime()+"%");
				}
			}
			return super.queryForList(finder, TsDeclare.class, page);
		}
		@Override
		public void updateTsDeclare(String id,String type,String userid,String userName)throws Exception {
			TsDeclare  tsDeclare= super.findById(id, TsDeclare.class);
			if(StringUtils.isBlank(type)){
			tsDeclare.setBak2("2");
			}else if(type.equals("pass")){
				tsDeclare.setBak2("3");
			}else{
				tsDeclare.setBak2("4");
			}
			if(StringUtils.isNoneBlank(userName)){
			tsDeclare.setAuditorName(userName);
			}
			if(StringUtils.isNoneBlank(userid)){
			tsDeclare.setAuditor(userid);
			tsDeclare.setAuditorTime(DateUtils.convertDate2String("yyyy-MM-dd HH:mm:ss", new Date()));
				}
			super.update(tsDeclare);
		}
}
