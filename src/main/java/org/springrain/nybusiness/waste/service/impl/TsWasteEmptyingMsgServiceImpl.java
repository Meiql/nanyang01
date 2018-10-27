package org.springrain.nybusiness.waste.service.impl;

import java.io.File;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springrain.nybusiness.waste.entity.TsWasteEmptyingMsg;
import org.springrain.nybusiness.waste.service.ITsWasteEmptyingMsgService;
import org.springrain.frame.entity.IBaseEntity;
import org.springrain.frame.util.Finder;
import org.springrain.frame.util.Page;
import org.springrain.system.service.BaseSpringrainServiceImpl;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:47:29
 * @see org.springrain.nybusiness.waste.service.impl.TsWasteEmptyingMsg
 */
@Service("tsWasteEmptyingMsgService")
public class TsWasteEmptyingMsgServiceImpl extends BaseSpringrainServiceImpl implements ITsWasteEmptyingMsgService {

   
    @Override
	public String  save(Object entity ) throws Exception{
	      TsWasteEmptyingMsg tsWasteEmptyingMsg=(TsWasteEmptyingMsg) entity;
	       return super.save(tsWasteEmptyingMsg).toString();
	}

    @Override
	public String  saveorupdate(Object entity ) throws Exception{
	      TsWasteEmptyingMsg tsWasteEmptyingMsg=(TsWasteEmptyingMsg) entity;
		 return super.saveorupdate(tsWasteEmptyingMsg).toString();
	}
	
	@Override
    public Integer update(IBaseEntity entity ) throws Exception{
	 TsWasteEmptyingMsg tsWasteEmptyingMsg=(TsWasteEmptyingMsg) entity;
	return super.update(tsWasteEmptyingMsg);
    }
    @Override
	public TsWasteEmptyingMsg findTsWasteEmptyingMsgById(Object id) throws Exception{
	 return super.findById(id,TsWasteEmptyingMsg.class);
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

}
