package org.springrain.nybusiness.environment.service.impl;

import java.io.File;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.springframework.stereotype.Service;
import org.springrain.nybusiness.environment.entity.TsEnvironmentSensitivePoint;
import org.springrain.nybusiness.environment.service.ITsEnvironmentSensitivePointService;
import org.springrain.frame.entity.IBaseEntity;
import org.springrain.frame.util.Finder;
import org.springrain.frame.util.Page;
import org.springrain.system.service.BaseSpringrainServiceImpl;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 10:25:22
 * @see org.springrain.nybusiness.environment.service.impl.TsEnvironmentSensitivePoint
 */
@Service("tsEnvironmentSensitivePointService")
public class TsEnvironmentSensitivePointServiceImpl extends BaseSpringrainServiceImpl implements ITsEnvironmentSensitivePointService {

   
    @Override
	public String  save(Object entity ) throws Exception{
	      TsEnvironmentSensitivePoint tsEnvironmentSensitivePoint=(TsEnvironmentSensitivePoint) entity;
	       return super.save(tsEnvironmentSensitivePoint).toString();
	}

    @Override
	public String  saveorupdate(Object entity ) throws Exception{
	      TsEnvironmentSensitivePoint tsEnvironmentSensitivePoint=(TsEnvironmentSensitivePoint) entity;
		 return super.saveorupdate(tsEnvironmentSensitivePoint).toString();
	}
	
	@Override
    public Integer update(IBaseEntity entity ) throws Exception{
	 TsEnvironmentSensitivePoint tsEnvironmentSensitivePoint=(TsEnvironmentSensitivePoint) entity;
	return super.update(tsEnvironmentSensitivePoint);
    }
    @Override
	public TsEnvironmentSensitivePoint findTsEnvironmentSensitivePointById(Object id) throws Exception{
	 return super.findById(id,TsEnvironmentSensitivePoint.class);
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
	 * @param page 分页对象
	 * @param tsEnvironmentSensitivePoint 查询条件
	 * @param listCompany  公司权限
	 * @return TsEnvironmentSensitivePoint
	 */
	@Override
	public List<TsEnvironmentSensitivePoint> findTsEnvironmentSensitivePointByDetail(Page page,
			TsEnvironmentSensitivePoint tsEnvironmentSensitivePoint, List<String> listCompany) throws Exception {
		if(CollectionUtils.isEmpty(listCompany)){
			return null;
		}
		Finder finder = new Finder();
		//1.查询条件：公司id
		finder.append("SELECT * FROM `ts_environment_sensitive_point` t where t.companyId in (:companyId)").setParam("companyId", listCompany);
		
		String envirElementName = tsEnvironmentSensitivePoint.getEnvirElementName();
		System.out.println("环境敏感点名称envirElementName= "+envirElementName);		
		if(envirElementName != null && !envirElementName.equals("")) {
			finder.append(" and t.envirElementName like:envirElementName").setParam("envirElementName", "%"+envirElementName+"%");
		}
		String createUserName = tsEnvironmentSensitivePoint.getCreateUserName();
		if(createUserName != null && !createUserName.equals("")) {
			finder.append(" and t.createUserName like:createUserName").setParam("createUserName", "%"+createUserName+"%");
		}
		System.out.println("环境敏感点查询sql   "+finder.getSql());
		return super.queryForList(finder, TsEnvironmentSensitivePoint.class, page);
	}

}
