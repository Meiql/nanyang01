package org.springrain.nybusiness.waste.service.impl;

import java.io.File;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springrain.frame.common.SessionUser;
import org.springrain.frame.entity.IBaseEntity;
import org.springrain.frame.util.Finder;
import org.springrain.frame.util.Page;
import org.springrain.nybusiness.waste.entity.TsWasteAirMsg;
import org.springrain.nybusiness.waste.service.ITsWasteAirMsgService;
import org.springrain.system.service.BaseSpringrainServiceImpl;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:47:16
 * @see org.springrain.nybusiness.waste.service.impl.TsWasteAirMsg
 */
@Service("tsWasteAirMsgService")
public class TsWasteAirMsgServiceImpl extends BaseSpringrainServiceImpl implements ITsWasteAirMsgService {

   
    @Override
	public String  save(Object entity ) throws Exception{
	      TsWasteAirMsg tsWasteAirMsg=(TsWasteAirMsg) entity;
	       return super.save(tsWasteAirMsg).toString();
	}

    @Override
	public String  saveorupdate(Object entity ) throws Exception{
	      TsWasteAirMsg tsWasteAirMsg=(TsWasteAirMsg) entity;
		 return super.saveorupdate(tsWasteAirMsg).toString();
	}
	
	@Override
    public Integer update(IBaseEntity entity ) throws Exception{
	 TsWasteAirMsg tsWasteAirMsg=(TsWasteAirMsg) entity;
	return super.update(tsWasteAirMsg);
    }
    @Override
	public TsWasteAirMsg findTsWasteAirMsgById(Object id) throws Exception{
	 return super.findById(id,TsWasteAirMsg.class);
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
		public List<TsWasteAirMsg> finderTsMaillistForList(Page page,
				TsWasteAirMsg tsWasteAirMsg, List<String> listCompany) throws Exception {
			if(CollectionUtils.isEmpty(listCompany)){
				return null;
			}
			Finder finder = new Finder();
			finder.append("SELECT * FROM `ts_waste_air_msg` t where t.companyid in (:companyId)")
			.setParam("companyId", listCompany);
			if(StringUtils.isNoneBlank(tsWasteAirMsg.getWgProcessingMethod())) {
				finder.append(" and t.wgProcessingMethod like:name").setParam("name", "%"+tsWasteAirMsg.getWgProcessingMethod()+"%");
			}
			return super.queryForList(finder, TsWasteAirMsg.class, page);
		}
		@Override
		public List<TsWasteAirMsg> listFinderTsWasteAirMsg() throws Exception {
			String companyid=SessionUser.getCompanyid();
			Finder finder = Finder.getSelectFinder(TsWasteAirMsg.class);
			if (StringUtils.isBlank(companyid)) {
				finder=null;
			}else{
				finder.append("where companyId =:companyId").setParam("companyId", companyid);
			}
			return super.queryForList(finder, TsWasteAirMsg.class);
		}
}
