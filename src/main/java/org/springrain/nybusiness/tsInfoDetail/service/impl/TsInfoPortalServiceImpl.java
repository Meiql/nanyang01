package org.springrain.nybusiness.tsInfoDetail.service.impl;

import java.io.File;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springrain.nybusiness.ergency.entity.TsErgencyInvestigation;
import org.springrain.nybusiness.tsInfoDetail.entity.TsInfoPortal;
import org.springrain.nybusiness.tsInfoDetail.service.ITsInfoPortalService;
import org.springrain.frame.entity.IBaseEntity;
import org.springrain.frame.util.Finder;
import org.springrain.frame.util.Page;
import org.springrain.system.service.BaseSpringrainServiceImpl;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-12-11 22:30:58
 * @see org.springrain.nybusiness.tsInfoDetail.service.impl.TsInfoPortal
 */
@Service("tsInfoPortalService")
public class TsInfoPortalServiceImpl extends BaseSpringrainServiceImpl implements ITsInfoPortalService {

   
    @Override
	public String  save(Object entity ) throws Exception{
	      TsInfoPortal tsInfoPortal=(TsInfoPortal) entity;
	       return super.save(tsInfoPortal).toString();
	}

    @Override
	public String  saveorupdate(Object entity ) throws Exception{
	      TsInfoPortal tsInfoPortal=(TsInfoPortal) entity;
		 return super.saveorupdate(tsInfoPortal).toString();
	}
	
	@Override
    public Integer update(IBaseEntity entity ) throws Exception{
	 TsInfoPortal tsInfoPortal=(TsInfoPortal) entity;
	return super.update(tsInfoPortal);
    }
    @Override
	public TsInfoPortal findTsInfoPortalById(Object id) throws Exception{
	 return super.findById(id,TsInfoPortal.class);
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
		 * meiql: 查询不同种类的list
		 * @param page
		 * @param typeId
		 * @return
		 * @throws Exception
		 */
		@Override
		public List<TsInfoPortal> finderListForList(String typeId) throws Exception {

			Finder finder = new Finder();
			finder.append("SELECT t.*  FROM `ts_info_portal` t where t.typeId = :typeId")
			.setParam("typeId", typeId);
			
			return super.queryForList(finder, TsInfoPortal.class, null);
		}
		
		@Override
		public List<TsInfoPortal> listInfo() throws Exception {
			Finder finder = new Finder();
			/*finder.append("SELECT * FROM `ts_company_info` t where t.state=:state")
			.setParam("state", 1);*/
			String sql="SELECT a.* FROM ts_info_portal AS a WHERE (SELECT COUNT(*) FROM ts_info_portal AS b WHERE b.typeId = a.typeId AND b.id >= a.id) <= 6 ORDER BY a.typeId ASC , a.create_time ASC";
			finder.append("SELECT a.* FROM ts_info_portal AS a WHERE (SELECT COUNT(*) FROM ts_info_portal AS b WHERE b.typeId = a.typeId AND b.id >= a.id) <= 6 ORDER BY a.typeId ASC , a.create_time ASC");
			return super.queryForList(finder, TsInfoPortal.class);
		}

		@Override
		public List<Map<String, Object>> finderDetailId(String detailID) throws Exception {
			Finder finder = new Finder();
			finder.append("SELECT t.*  FROM `ts_info_portal` t where t.detailsId = :detailID")
			.setParam("detailID", detailID);
			System.out.println("查询门户详情sql："+finder.getSql());
			return super.queryForList(finder);
		}
		
		@Override
		public List<TsInfoPortal> stick() throws Exception {
			Finder finder = new Finder();
			int  _stick=1;
			String sql="select t.* from ts_info_portal t where t.stick=:_stick and t.flag=:_flag ORDER BY t.create_time ASC LIMIT 8";
			finder.append(sql);
			finder.setParam("_stick", _stick);
			finder.setParam("_flag", _stick);
			return super.queryForList(finder, TsInfoPortal.class);
		}

}
