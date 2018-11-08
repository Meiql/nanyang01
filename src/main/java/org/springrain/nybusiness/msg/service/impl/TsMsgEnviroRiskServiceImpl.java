package org.springrain.nybusiness.msg.service.impl;

import java.io.File;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springrain.nybusiness.msg.entity.TsMsgEnviroRisk;
import org.springrain.nybusiness.msg.service.ITsMsgEnviroRiskService;
import org.springrain.frame.entity.IBaseEntity;
import org.springrain.frame.util.Finder;
import org.springrain.frame.util.Page;
import org.springrain.system.service.BaseSpringrainServiceImpl;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:44:24
 * @see org.springrain.nybusiness.msg.service.impl.TsMsgEnviroRisk
 */
@Service("tsMsgEnviroRiskService")
public class TsMsgEnviroRiskServiceImpl extends BaseSpringrainServiceImpl implements ITsMsgEnviroRiskService {

   
    @Override
	public String  save(Object entity ) throws Exception{
	      TsMsgEnviroRisk tsMsgEnviroRisk=(TsMsgEnviroRisk) entity;
	       return super.save(tsMsgEnviroRisk).toString();
	}

    @Override
	public String  saveorupdate(Object entity ) throws Exception{
	      TsMsgEnviroRisk tsMsgEnviroRisk=(TsMsgEnviroRisk) entity;
		 return super.saveorupdate(tsMsgEnviroRisk).toString();
	}
	
	@Override
    public Integer update(IBaseEntity entity ) throws Exception{
	 TsMsgEnviroRisk tsMsgEnviroRisk=(TsMsgEnviroRisk) entity;
	return super.update(tsMsgEnviroRisk);
    }
    @Override
	public TsMsgEnviroRisk findTsMsgEnviroRiskById(Object id) throws Exception{
	 return super.findById(id,TsMsgEnviroRisk.class);
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
	public TsMsgEnviroRisk saveTsMsgEnviroRisk(TsMsgEnviroRisk tsMsgEnviroRisk) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
