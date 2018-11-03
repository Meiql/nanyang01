package org.springrain.nybusiness.ergency.service.impl;

import java.io.File;
import java.util.List;

import javax.annotation.Resource;

import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springrain.frame.entity.IBaseEntity;
import org.springrain.frame.util.Finder;
import org.springrain.frame.util.Page;
import org.springrain.nybusiness.ergency.entity.TsEmergencyOrg;
import org.springrain.nybusiness.ergency.service.ITsEmergencyOrgService;
import org.springrain.system.service.BaseSpringrainServiceImpl;
import org.springrain.system.service.ITableindexService;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-03 10:32:40
 * @see org.springrain.nybusiness.ergency.service.impl.TsEmergencyOrg
 */
@Service("tsEmergencyOrgService")
public class TsEmergencyOrgServiceImpl extends BaseSpringrainServiceImpl implements ITsEmergencyOrgService {
	@Resource
	private ITableindexService tableindexService;
   
    @Override
	public String  save(Object entity ) throws Exception{
	      TsEmergencyOrg tsEmergencyOrg=(TsEmergencyOrg) entity;
	       return super.save(tsEmergencyOrg).toString();
	}

    @Override
	public String  saveorupdate(Object entity ) throws Exception{
	      TsEmergencyOrg tsEmergencyOrg=(TsEmergencyOrg) entity;
		 return super.saveorupdate(tsEmergencyOrg).toString();
	}
	
	@Override
    public Integer update(IBaseEntity entity ) throws Exception{
	 TsEmergencyOrg tsEmergencyOrg=(TsEmergencyOrg) entity;
	return super.update(tsEmergencyOrg);
    }
    @Override
	public TsEmergencyOrg findTsEmergencyOrgById(Object id) throws Exception{
	 return super.findById(id,TsEmergencyOrg.class);
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
	public String findOrgNewComcode(String id, String pid) throws Exception {

		if (StringUtils.isEmpty(id)) {
			return null;
		}

		String comcode = null;
		Finder f_p_c = Finder.getSelectFinder(TsEmergencyOrg.class, "comcode")
				.append(" WHERE id=:pid ").setParam("pid", pid);
		String p_c = super.queryForObject(f_p_c, String.class);
		// 如果没有上级部门
		if (StringUtils.isEmpty(p_c)) {
			p_c = ",";
		}

		comcode = p_c + id + ",";

		return comcode;
	}

	@Override
	public String saveTsEmergencyOrg(TsEmergencyOrg entity) throws Exception {

		String id = null;
		if (StringUtils.isNotBlank(entity.getId())) { 
			id=entity.getId();
		} else {
			id = tableindexService.updateNewId(TsEmergencyOrg.class);
		}
		entity.setId(id); 

		String comcode = findOrgNewComcode(id, entity.getPid());

		entity.setComcode(comcode);

		super.save(entity);


		return id;
	}

	@Override
	public Integer updateTsEmergencyOrg(TsEmergencyOrg entity) throws Exception {
		String pid = entity.getPid();
		entity.setComcode(null);
		String id = entity.getId();
		if (StringUtils.isEmpty(id)) {
			return null;
		}

		Finder f_old_c = Finder.getSelectFinder(TsEmergencyOrg.class, "comcode")
				.append(" WHERE id=:id ").setParam("id", id);

		String old_c = super.queryForObject(f_old_c, String.class);

		String new_c = findOrgNewComcode(id, pid);

		if (new_c.equalsIgnoreCase(old_c)) {// 编码没有改变
			return super.update(entity, true);

		}
		entity.setComcode(new_c);
		Integer update = super.update(entity, true);
		// 级联更新
		Finder f_s_list = Finder.getSelectFinder(TsEmergencyOrg.class, "id,comcode")
				.append(" WHERE comcode like :comcode and id<>:id ")
				.setParam("comcode", old_c + "%").setParam("id", id);
		List<TsEmergencyOrg> list = super.queryForList(f_s_list, TsEmergencyOrg.class);
		if (CollectionUtils.isEmpty(list)) {
			return update;
		}

		for (TsEmergencyOrg org : list) {
			String _id = org.getId();
			String _c = findOrgNewComcode(_id, id);
			org.setComcode(_c);
			org.setPid(id);

		}

		super.update(list, true);

		return update;
	}

}
