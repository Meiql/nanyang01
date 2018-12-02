package org.springrain.nybusiness.company.service.impl;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springrain.frame.common.SessionUser;
import org.springrain.frame.entity.IBaseEntity;
import org.springrain.frame.util.Finder;
import org.springrain.frame.util.Page;
import org.springrain.frame.util.SecUtils;
import org.springrain.nybusiness.company.entity.TsCompanyInfo;
import org.springrain.nybusiness.company.service.ITsCompanyInfoService;
import org.springrain.nybusiness.constants.SysStateEnum;
import org.springrain.nybusiness.constants.SysStateEnum.chuShiRoleEnum;
import org.springrain.nybusiness.waste.entity.TsWasteEmptyingMsg;
import org.springrain.system.entity.Org;
import org.springrain.system.entity.User;
import org.springrain.system.entity.UserOrg;
import org.springrain.system.entity.UserRole;
import org.springrain.system.service.BaseSpringrainServiceImpl;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-04 21:31:43
 * @see org.springrain.nybusiness.company.service.impl.TsCompanyInfo
 */
@Service("tsCompanyInfoService")
public class TsCompanyInfoServiceImpl extends BaseSpringrainServiceImpl implements ITsCompanyInfoService {

   
    @Override
	public String  save(Object entity ) throws Exception{
	      TsCompanyInfo tsCompanyInfo=(TsCompanyInfo) entity;
	       return super.save(tsCompanyInfo).toString();
	}

    @Override
	public String  saveorupdate(Object entity ) throws Exception{
	      TsCompanyInfo tsCompanyInfo=(TsCompanyInfo) entity;
		 return super.saveorupdate(tsCompanyInfo).toString();
	}
	
	@Override
    public Integer update(IBaseEntity entity ) throws Exception{
	 TsCompanyInfo tsCompanyInfo=(TsCompanyInfo) entity;
	return super.update(tsCompanyInfo);
    }
    @Override
	public TsCompanyInfo findTsCompanyInfoById(Object id) throws Exception{
	 return super.findById(id,TsCompanyInfo.class);
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
	public void saveRegisterCompany(TsCompanyInfo tsCompanyInfo)
			throws Exception {
		
		//首先保存公司信息
		tsCompanyInfo.setState("0");
		String companyId =  super.save(tsCompanyInfo).toString();
		
		User user = new User();
		user.setPassword(SecUtils.encoderByMd5With32Bit(tsCompanyInfo.getPassword()));
		user.setAccount(tsCompanyInfo.getAccount());
		user.setEmail(tsCompanyInfo.getEamil());
		user.setMobile(tsCompanyInfo.getPhone());
		user.setName(tsCompanyInfo.getCompanyName());
		user.setConpanyid(companyId);
		user.setActive(1);
		user.setUserType(1);
		String userId = super.save(user).toString();
		
		UserRole userRole = new UserRole();
		userRole.setRoleId(chuShiRoleEnum.企业角色.getValue()); //固定角色
		userRole.setUserId(userId);
		
		super.save(userRole);
		
	}

	/** 
	 * @Description TODO
	 * @param page
	 * @param companyInfo
	 * @return
	 * @throws Exception 
	 *
	 */
	@Override
	public List<TsCompanyInfo> finderExamineCompany(Page page, TsCompanyInfo companyInfo) throws Exception {
		String userId = SessionUser.getUserId();
		//通过userid 查询部门
		Finder fog = new Finder();
		fog.append("select * from t_user_org t where t.userId = :userId").setParam("userId", userId);
		List<UserOrg> listUserOrg = super.queryForList(fog, UserOrg.class);
		List<String> listStr = new ArrayList<>();
		if(CollectionUtils.isEmpty(listUserOrg)){
			return null;
		}
		for(UserOrg userOrg :listUserOrg) {
			listStr.add(userOrg.getOrgId());
		}
		//查询自己或者字迹组织结构
		Finder finder = new Finder();
		finder.append("SELECT * FROM `t_org` t where t.id in(:listStr) or t.pid in (:listPid)")
		.setParam("listStr", listStr).setParam("listPid", listStr);
		
		List<Org> listOrg = super.queryForList(finder, Org.class);
		List<String> listStrOrg = new ArrayList<>();
		for(Org org :listOrg) {
			listStrOrg.add(org.getId());
		}
		//进行判断只能查看自己辖区的企业信息
		Finder f = new Finder();
		f.append("select * from ts_company_info t where  orgid in(:orgid) order by createTime desc ");
		f.setParam("orgid", listStrOrg);
		List<TsCompanyInfo> list = super.queryForList(f, TsCompanyInfo.class);
		return list;
	}

	@Override
	public void updateCompanyInfo(TsCompanyInfo tsCompanyInfo)
			throws Exception {
		TsCompanyInfo companyInfo = super.findById(tsCompanyInfo.getId(), TsCompanyInfo.class);
		companyInfo.setState(tsCompanyInfo.getState());
		companyInfo.setDismissal(tsCompanyInfo.getDismissal());
		super.update(companyInfo);
	}

	@Override
	public List<String> finderCompanyIdByUserId(String userId) throws Exception {
		List<String> listStr = new ArrayList<String>();
		User user = super.findById(userId, User.class);
		if(user == null){
			return listStr;
		}
		//如果是企业账号直接返回
		if(SysStateEnum.userTypeEnum.企业账户信息.getValue() == user.getUserType()){
			System.out.println("公司id"+SessionUser.getCompanyid());
			listStr.add(SessionUser.getCompanyid());
			return listStr;
		}
		
		//如果是政府用户，则首先查询orgid 然后通过orgid查询companyid 
		//通过userid 查询部门
		Finder fog = new Finder();
		fog.append("select * from t_user_org t where t.userId = :userId").setParam("userId", userId);
		List<UserOrg> listUserOrg = super.queryForList(fog, UserOrg.class);
		List<String> listStrUserOrg = new ArrayList<>();
		if(CollectionUtils.isEmpty(listUserOrg)){
			return null;
		}
		for(UserOrg userOrg :listUserOrg) {
			listStrUserOrg.add(userOrg.getOrgId());
		}
		//查询自己或者下属组织结构
		Finder finder = new Finder();
		finder.append("SELECT * FROM `t_org` t where t.id in(:listStr) or t.pid in (:listPid)")
		.setParam("listStr", listStrUserOrg).setParam("listPid", listStrUserOrg);
		
		List<Org> listOrg = super.queryForList(finder, Org.class);
		List<String> listStrOrg = new ArrayList<>();
		for(Org org :listOrg) {
			listStrOrg.add(org.getId());
		}
		//进行判断只能查看自己辖区的企业信息
		Finder f = new Finder();
		f.append("select * from ts_company_info t where t.state =:state and orgid in(:orgid) order by createTime desc ");
		f.setParam("state", "1").setParam("orgid", listStrOrg);
		List<TsCompanyInfo> listTsCompanyInfo = super.queryForList(f, TsCompanyInfo.class);
		
		if(CollectionUtils.isNotEmpty(listTsCompanyInfo)){
			for(TsCompanyInfo companyInfo:listTsCompanyInfo){
				listStr.add(companyInfo.getId());
			}
		}
		return listStr;
	}

	@Override
	public List<TsCompanyInfo> finderCompanyInfo(Page page,
			TsCompanyInfo companyInfo,List<String> listCompany) throws Exception {
		if(CollectionUtils.isEmpty(listCompany)){
			return null;
		}
		Finder finder = new Finder();
		finder.append("SELECT * FROM `ts_company_info` t where t.id in (:companyId)")
		.setParam("companyId", listCompany);
		if(StringUtils.isNoneBlank(companyInfo.getCompanyName())){
			finder.append(" and t.companyName like:companyName").setParam("companyName", "%"+companyInfo.getCompanyName()+"%");
		}
		return super.queryForList(finder, TsCompanyInfo.class, page);
	}

}
