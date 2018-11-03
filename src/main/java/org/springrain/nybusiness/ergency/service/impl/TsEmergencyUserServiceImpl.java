package org.springrain.nybusiness.ergency.service.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springrain.frame.entity.IBaseEntity;
import org.springrain.frame.util.Finder;
import org.springrain.frame.util.Page;
import org.springrain.nybusiness.ergency.entity.TsEmergencyOrg;
import org.springrain.nybusiness.ergency.entity.TsEmergencyUser;
import org.springrain.nybusiness.ergency.service.ITsEmergencyUserService;
import org.springrain.system.service.BaseSpringrainServiceImpl;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-03 10:32:33
 * @see org.springrain.nybusiness.ergency.service.impl.TsEmergencyUser
 */
@Service("tsEmergencyUserService")
public class TsEmergencyUserServiceImpl extends BaseSpringrainServiceImpl implements ITsEmergencyUserService {

   
    @Override
	public String  save(Object entity ) throws Exception{
	      TsEmergencyUser tsEmergencyUser=(TsEmergencyUser) entity;
	       return super.save(tsEmergencyUser).toString();
	}

    @Override
	public String  saveorupdate(Object entity ) throws Exception{
	      TsEmergencyUser tsEmergencyUser=(TsEmergencyUser) entity;
		 return super.saveorupdate(tsEmergencyUser).toString();
	}
	
	@Override
    public Integer update(IBaseEntity entity ) throws Exception{
	 TsEmergencyUser tsEmergencyUser=(TsEmergencyUser) entity;
	return super.update(tsEmergencyUser);
    }
    @Override
	public TsEmergencyUser findTsEmergencyUserById(Object id) throws Exception{
	 return super.findById(id,TsEmergencyUser.class);
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
	public List<TsEmergencyUser> finderListForPage(Page page,
			TsEmergencyUser tsEmergencyUser) throws Exception {
		if(StringUtils.isEmpty(tsEmergencyUser.getEmergencyOrgId())){
			return null;
		}
		Finder f = new Finder();
		f.append("select * from ts_emergency_org t where t.pid =:pid");
		f.setParam("pid", tsEmergencyUser.getEmergencyOrgId());
		List<TsEmergencyOrg> listOrg = super.queryForList(f, TsEmergencyOrg.class);
		String orgId = "";
		List<String> listStr = new ArrayList<String>();
		if(CollectionUtils.isNotEmpty(listOrg)){
			for(int i = 0 ;  i<listOrg.size();i++ ){
				listStr.add(listOrg.get(i).getId());
			}
		}
		listStr.add(tsEmergencyUser.getEmergencyOrgId());
		
		Finder finder = new Finder();
		finder.append("select * from ts_emergency_user where 1=1 ");
		finder.append(" and emergencyOrgId in (:emergencyOrgIds) order by emergencyOrgId");
		finder.setParam("emergencyOrgIds",listStr);
		List<TsEmergencyUser> list = super.queryForList(finder, TsEmergencyUser.class);
		return super.queryForList(finder, TsEmergencyUser.class,page);
	}

	@Override
	public TsEmergencyUser finderObject() throws Exception {
		Finder finder = new Finder();
		finder.append("select min(t.emergencyOrgId) as emergencyOrgId  from ts_emergency_user t  order by t.emergencyOrgId desc ");
		return super.queryForObject(finder, TsEmergencyUser.class);
	}

}
