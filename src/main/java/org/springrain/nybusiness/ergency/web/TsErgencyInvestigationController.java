package  org.springrain.nybusiness.ergency.web;

import java.io.File;
import java.util.ArrayList;
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
import org.springrain.nybusiness.company.service.ITsCompanyInfoService;
import org.springrain.nybusiness.ergency.entity.TsErgencyInvestigation;
import org.springrain.nybusiness.ergency.service.ITsErgencyInvestigationService;

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
 * @version  2018-11-05 16:24:44
 * @see org.springrain.nybusiness.ergency.web.TsErgencyInvestigation
 */
@Controller
@RequestMapping(value="/tsergencyinvestigation")
public class TsErgencyInvestigationController  extends BaseController {
	@Resource
	private ITsErgencyInvestigationService tsErgencyInvestigationService;
	@Resource
	private ITsCompanyInfoService tsCompanyInfoService;
	private String listurl="/nybusiness/ergency/tsergencyinvestigation/tsergencyinvestigationList";
	
	
	   
	/**
	 * 列表数据,调用listjson方法,保证和app端数据统一
	 * 
	 * @param request
	 * @param model
	 * @param tsErgencyInvestigation
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public String list(HttpServletRequest request, Model model,TsErgencyInvestigation tsErgencyInvestigation) 
			throws Exception {
		ReturnDatas returnObject = listjson(request, model, tsErgencyInvestigation);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return listurl;
	}
	
	/**
	 * json数据,为APP提供数据
	 * 
	 * @param request
	 * @param model
	 * @param tsErgencyInvestigation
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list/json")
	@ResponseBody   
	public  ReturnDatas listjson(HttpServletRequest request, Model model,TsErgencyInvestigation tsErgencyInvestigation) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		String companyid=request.getParameter("companyid");
		String Bak1=request.getParameter("Bak1");
		String category=request.getParameter("category");
		List<String> listCompany = new ArrayList<String>();
		if(StringUtils.isNoneBlank(companyid)&&StringUtils.isNoneBlank(Bak1)&&StringUtils.isNoneBlank(category)){
			listCompany.add(companyid);
			tsErgencyInvestigation.setBak1("3");
			tsErgencyInvestigation.setCategory((long) 2);
		}else{
			listCompany= tsCompanyInfoService.finderCompanyIdByUserId(SessionUser.getUserId());
		}
		// ==构造分页请求
		Page page = newPage(request);
		// ==执行分页查询
		//List<TsErgencyInvestigation> datas=tsErgencyInvestigationService.findListDataByFinder(null,page,TsErgencyInvestigation.class,tsErgencyInvestigation);
			//returnObject.setQueryBean(tsErgencyInvestigation);
		
			List<TsErgencyInvestigation> datas=tsErgencyInvestigationService.finderTsMaillistForList(page, tsErgencyInvestigation, listCompany);
				returnObject.setQueryBean(tsErgencyInvestigation);
			
		returnObject.setPage(page);
		returnObject.setData(datas);
		return returnObject;
	}
	
	@RequestMapping("/list/export")
	public void listexport(HttpServletRequest request,HttpServletResponse response, Model model,TsErgencyInvestigation tsErgencyInvestigation) throws Exception{
		// ==构造分页请求
		Page page = newPage(request);
	
		File file = tsErgencyInvestigationService.findDataExportExcel(null,listurl, page,TsErgencyInvestigation.class,tsErgencyInvestigation);
		String fileName="tsErgencyInvestigation"+GlobalStatic.excelext;
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
		return "/nybusiness/ergency/tsergencyinvestigation/tsergencyinvestigationLook";
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
		  TsErgencyInvestigation tsErgencyInvestigation = tsErgencyInvestigationService.findTsErgencyInvestigationById(id);
		   returnObject.setData(tsErgencyInvestigation);
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
	public ReturnDatas saveorupdate(Model model,TsErgencyInvestigation tsErgencyInvestigation,HttpServletRequest request,HttpServletResponse response) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		returnObject.setMessage(MessageUtils.UPDATE_SUCCESS);
		try {
		
			java.lang.String id =tsErgencyInvestigation.getId();
			if(StringUtils.isBlank(id)){
				tsErgencyInvestigation.setId(null);
			}
			/**
			 * 1:已保存 2：审批中  3：已通过 4：未通过
			 */
			tsErgencyInvestigation.setBak1("1");
			if(StringUtils.isBlank(tsErgencyInvestigation.getCreate_user())){
				tsErgencyInvestigation.setCreate_user(SessionUser.getUserId());
			}
			if(StringUtils.isBlank(tsErgencyInvestigation.getCreate_time())){
				tsErgencyInvestigation.setCreate_time(DateUtils.convertDate2String("yyyy-MM-dd HH:mm:ss", new Date()));
			}
			java.lang.String companyId = SessionUser.getCompanyid(); 
			tsErgencyInvestigation.setCompany_id(companyId);
			
			
			tsErgencyInvestigationService.saveorupdate(tsErgencyInvestigation);
			
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
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return "/nybusiness/ergency/tsergencyinvestigation/tsergencyinvestigationCru";
	}
	
	/**
	 * 进入修改页面,APP端可以调用 lookjson 获取json格式数据
	 */
	@RequestMapping(value = "/detail")
	public String detail(Model model,HttpServletRequest request,HttpServletResponse response)  throws Exception{
		ReturnDatas returnObject = lookjson(model, request, response);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return "/nybusiness/ergency/tsergencyinvestigation/tsergencyinvestigationCru2";
	}
	
	/**
	 * 上报操作
	 */
	@RequestMapping(value="/ajax/approv/json")
	@ResponseBody      
	public  ReturnDatas approv(HttpServletRequest request) throws Exception {
		ReturnDatas returnDatas = ReturnDatas.getSuccessReturnDatas();
			// 执行上报
		try {
		java.lang.String id=request.getParameter("id");
		if(StringUtils.isNotBlank(id)){
			tsErgencyInvestigationService.updateTsErgencyInvestigation(id);
			} 
		returnDatas.setMessage("已上报");
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return returnDatas;
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
				tsErgencyInvestigationService.deleteById(id,TsErgencyInvestigation.class);
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
			tsErgencyInvestigationService.deleteByIds(ids,TsErgencyInvestigation.class);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return new ReturnDatas(ReturnDatas.ERROR,MessageUtils.DELETE_ALL_FAIL);
		}
		return new ReturnDatas(ReturnDatas.SUCCESS,MessageUtils.DELETE_ALL_SUCCESS);
		
		
	}

}
