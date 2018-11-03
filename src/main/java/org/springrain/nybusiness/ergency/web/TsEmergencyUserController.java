package  org.springrain.nybusiness.ergency.web;

import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springrain.nybusiness.ergency.entity.TsEmergencyUser;
import org.springrain.nybusiness.ergency.service.ITsEmergencyUserService;
import org.springrain.frame.common.SessionUser;
import org.springrain.frame.controller.BaseController;
import org.springrain.frame.util.DateUtils;
import org.springrain.frame.util.GlobalStatic;
import org.springrain.frame.util.MessageUtils;
import org.springrain.frame.util.Page;
import org.springrain.frame.util.ReturnDatas;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-03 10:32:33
 * @see org.springrain.nybusiness.ergency.web.TsEmergencyUser
 */
@Controller
@RequestMapping(value="/tsemergencyuser")
public class TsEmergencyUserController  extends BaseController {
	@Resource
	private ITsEmergencyUserService tsEmergencyUserService;
	
	private String listurl="/nybusiness/ergency/tsemergencyuser/tsemergencyuserList";
	
	
	   
	/**
	 * 列表数据,调用listjson方法,保证和app端数据统一
	 * 
	 * @param request
	 * @param model
	 * @param tsEmergencyUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public String list(HttpServletRequest request, Model model,TsEmergencyUser tsEmergencyUser) 
			throws Exception {
		ReturnDatas returnObject = listjson(request, model, tsEmergencyUser);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return listurl;
	}
	
	/**
	 * json数据,为APP提供数据
	 * 
	 * @param request
	 * @param model
	 * @param tsEmergencyUser
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list/json")
	@ResponseBody   
	public  ReturnDatas listjson(HttpServletRequest request, Model model,TsEmergencyUser tsEmergencyUser) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		// ==构造分页请求
		Page page = newPage(request);
		// ==执行分页查询
		List<TsEmergencyUser> datas=tsEmergencyUserService.finderListForPage(page, tsEmergencyUser);
		if(StringUtils.isEmpty(tsEmergencyUser.getEmergencyOrgId())){
			TsEmergencyUser emergencyUser = tsEmergencyUserService.finderObject();
			if(emergencyUser!=null &&StringUtils.isNotBlank(emergencyUser.getEmergencyOrgId())){
				tsEmergencyUser.setEmergencyOrgId(emergencyUser.getEmergencyOrgId());
			}
		}
		returnObject.setQueryBean(tsEmergencyUser);
		returnObject.setPage(page);
		returnObject.setData(datas);
		return returnObject;
	}
	
	@RequestMapping("/list/export")
	public void listexport(HttpServletRequest request,HttpServletResponse response, Model model,TsEmergencyUser tsEmergencyUser) throws Exception{
		// ==构造分页请求
		Page page = newPage(request);
	
		File file = tsEmergencyUserService.findDataExportExcel(null,listurl, page,TsEmergencyUser.class,tsEmergencyUser);
		String fileName="tsEmergencyUser"+GlobalStatic.excelext;
		downFile(response, file, fileName,true);
		return;
	}
	
		/**
	 * 查看操作,调用APP端lookjson方法
	 */
	@RequestMapping(value = "/look")
	public String look(Model model,HttpServletRequest request,HttpServletResponse response)  throws Exception {
		ReturnDatas returnObject = lookjson(model, request, response);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return "/nybusiness/ergency/tsemergencyuser/tsemergencyuserLook";
	}

	
	/**
	 * 查看的Json格式数据,为APP端提供数据
	 */
	@RequestMapping(value = "/look/json")
	@ResponseBody      
	public ReturnDatas lookjson(Model model,HttpServletRequest request,HttpServletResponse response) throws Exception {
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		java.lang.String id=request.getParameter("id");
		if(StringUtils.isNotBlank(id)){
		  TsEmergencyUser tsEmergencyUser = tsEmergencyUserService.findTsEmergencyUserById(id);
		   returnObject.setData(tsEmergencyUser);
		}else{
			returnObject.setStatus(ReturnDatas.ERROR);
		}
		return returnObject;
		
	}
	
	
	/**
	 * 新增/修改 操作吗,返回json格式数据
	 * 
	 */
	@RequestMapping("/update")
	@ResponseBody      
	public ReturnDatas saveorupdate(Model model,TsEmergencyUser tsEmergencyUser,HttpServletRequest request,HttpServletResponse response) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		returnObject.setMessage(MessageUtils.UPDATE_SUCCESS);
		try {
		
			java.lang.String id =tsEmergencyUser.getId();
			if(StringUtils.isBlank(id)){
			  tsEmergencyUser.setId(null);
			}
			if(StringUtils.isBlank(tsEmergencyUser.getCreateUser())){
				tsEmergencyUser.setCreateUser(SessionUser.getUserId());
			}
			if(StringUtils.isBlank(tsEmergencyUser.getCreateTime())){
				tsEmergencyUser.setCreateTime(DateUtils.convertDate2String("yyyy-MM-dd HH:mm:ss", new Date()));
			}
			tsEmergencyUserService.saveorupdate(tsEmergencyUser);
			
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			returnObject.setStatus(ReturnDatas.ERROR);
			returnObject.setMessage(MessageUtils.UPDATE_ERROR);
		}
		return returnObject;
	
	}
	
	/**
	 * 进入修改页面,APP端可以调用 lookjson 获取json格式数据
	 */
	@RequestMapping(value = "/update/pre")
	public String updatepre(Model model,HttpServletRequest request,HttpServletResponse response)  throws Exception{
		ReturnDatas returnObject = lookjson(model, request, response);
		String emergencyOrgId = request.getParameter("emergencyOrgId");
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		model.addAttribute("emergencyOrgId", emergencyOrgId);
		return "/nybusiness/ergency/tsemergencyuser/tsemergencyuserCru";
	}
	
	/**
	 * 删除操作
	 */
	@RequestMapping(value="/delete")
	@ResponseBody      
	public  ReturnDatas delete(HttpServletRequest request) throws Exception {

			// 执行删除
		try {
		java.lang.String id=request.getParameter("id");
		if(StringUtils.isNotBlank(id)){
				tsEmergencyUserService.deleteById(id,TsEmergencyUser.class);
				return new ReturnDatas(ReturnDatas.SUCCESS,MessageUtils.DELETE_SUCCESS);
			} else {
				return new ReturnDatas(ReturnDatas.WARNING,MessageUtils.DELETE_WARNING);
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return new ReturnDatas(ReturnDatas.WARNING, MessageUtils.DELETE_WARNING);
	}
	
	/**
	 * 删除多条记录
	 * 
	 */
	@RequestMapping("/delete/more")
	@ResponseBody      
	public ReturnDatas deleteMore(HttpServletRequest request, Model model) {
		String records = request.getParameter("records");
		if(StringUtils.isBlank(records)){
			 return new ReturnDatas(ReturnDatas.ERROR,MessageUtils.DELETE_ALL_FAIL);
		}
		String[] rs = records.split(",");
		if (rs == null || rs.length < 1) {
			return new ReturnDatas(ReturnDatas.ERROR,MessageUtils.DELETE_NULL_FAIL);
		}
		try {
			List<String> ids = Arrays.asList(rs);
			tsEmergencyUserService.deleteByIds(ids,TsEmergencyUser.class);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return new ReturnDatas(ReturnDatas.ERROR,MessageUtils.DELETE_ALL_FAIL);
		}
		return new ReturnDatas(ReturnDatas.SUCCESS,MessageUtils.DELETE_ALL_SUCCESS);
		
		
	}

}
