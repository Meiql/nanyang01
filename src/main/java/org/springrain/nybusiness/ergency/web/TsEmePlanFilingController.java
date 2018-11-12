package  org.springrain.nybusiness.ergency.web;

import java.io.File;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.UUID;

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
import org.springrain.nybusiness.company.entity.TsCompanyInfo;
import org.springrain.nybusiness.ergency.entity.TsEmePlanFilAdjustment;
import org.springrain.nybusiness.ergency.service.ITsEmePlanFilAdjustmentService;
import org.springrain.nybusiness.company.service.ITsCompanyInfoService;
import org.springrain.nybusiness.ergency.entity.TsEmePlanFiling;
import org.springrain.nybusiness.ergency.entity.TsEmergencyEquipmentSum;
import org.springrain.nybusiness.ergency.service.ITsEmePlanFilingService;
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
 * @version  2018-11-08 21:32:48
 * @see org.springrain.nybusiness.ergency.web.TsEmePlanFiling
 */
@Controller
@RequestMapping(value="/tsemeplanfiling")
public class TsEmePlanFilingController  extends BaseController {
	@Resource
	private ITsEmePlanFilingService tsEmePlanFilingService;
	@Resource
	private ITsEmePlanFilAdjustmentService tsEmePlanFilAdjustment;
	
	@Resource
	private ITsCompanyInfoService tsCompanyInfoService;
	private String listurl="/nybusiness/ergency/tsemeplanfiling/tsemeplanfilingList";
	
	
	   
	/**
	 * 列表数据,调用listjson方法,保证和app端数据统一
	 * 
	 * @param request
	 * @param model
	 * @param tsEmePlanFiling
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public String list(HttpServletRequest request, Model model,TsEmePlanFiling tsEmePlanFiling) 
			throws Exception {
		ReturnDatas returnObject = listjson(request, model, tsEmePlanFiling);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return listurl;
	}
	
	/**
	 * json数据,为APP提供数据
	 * 
	 * @param request
	 * @param model
	 * @param tsEmePlanFiling
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list/json")
	@ResponseBody   
	public  ReturnDatas listjson(HttpServletRequest request, Model model,TsEmePlanFiling tsEmePlanFiling) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		// ==构造分页请求
		Page page = newPage(request);
		// ==执行分页查询
		/*List<TsEmePlanFiling> datas=tsEmePlanFilingService.findListDataByFinder(null,page,TsEmePlanFiling.class,tsEmePlanFiling);
			returnObject.setQueryBean(tsEmePlanFiling);*/
		
		List<String> listCompany = tsCompanyInfoService.finderCompanyIdByUserId(SessionUser.getUserId());
		List<TsEmePlanFiling> datas=tsEmePlanFilingService.finderTsMaillistForList(page, tsEmePlanFiling, listCompany);
		//获取公司信息
		//List<TsCompanyInfo> dataCompany=tsEmePlanFilingService.finderCompanyInfo(listCompany);
		
			returnObject.setQueryBean(tsEmePlanFiling);
		returnObject.setPage(page);
		returnObject.setData(datas);
		//returnObject.setData(dataCompany);
		return returnObject;
	}
	
	@RequestMapping("/list/export")
	public void listexport(HttpServletRequest request,HttpServletResponse response, Model model,TsEmePlanFiling tsEmePlanFiling) throws Exception{
		// ==构造分页请求
		Page page = newPage(request);
	
		File file = tsEmePlanFilingService.findDataExportExcel(null,listurl, page,TsEmePlanFiling.class,tsEmePlanFiling);
		String fileName="tsEmePlanFiling"+GlobalStatic.excelext;
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
		return "/nybusiness/ergency/tsemeplanfiling/tsemeplanfilingLook";
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
		  TsEmePlanFiling tsEmePlanFiling = tsEmePlanFilingService.findTsEmePlanFilingById(id);
		   returnObject.setData(tsEmePlanFiling);
		}else{
			//获取公司信息
			//List<TsCompanyInfo> dataCompany=tsEmePlanFilingService.finderCompanyInfo(listCompany);
			 java.lang.String companyId = SessionUser.getCompanyid();
			 TsCompanyInfo tsCompanyInfo = tsEmePlanFilingService.findCompanyInfoById(companyId);
			 returnObject.setData(tsCompanyInfo);
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
	public ReturnDatas saveorupdate(Model model,TsEmePlanFiling tsEmePlanFiling,HttpServletRequest request,HttpServletResponse response) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		returnObject.setMessage(MessageUtils.UPDATE_SUCCESS);
		try {
		
			java.lang.String id =tsEmePlanFiling.getId();
			String[]  adjustment_catalog= request.getParameterValues("adjustment_catalog");
			System.out.println(adjustment_catalog);
			if(StringUtils.isBlank(id)){
				
			  tsEmePlanFiling.setId(null);
			  
			/*  String uuid = UUID.randomUUID().toString();
			  tsEmePlanFiling.setFile_directory(uuid);
			  TsEmePlanFilAdjustment tsEmePlanFilAdjustment = null ;
			  tsEmePlanFilAdjustment.setAdjustment_id(uuid);*/
			}
			
			if(StringUtils.isBlank(tsEmePlanFiling.getCreate_user())){
				tsEmePlanFiling.setCreate_user(SessionUser.getUserId());
			}
			if(StringUtils.isBlank(tsEmePlanFiling.getCreate_time())){
				tsEmePlanFiling.setCreate_time(DateUtils.convertDate2String("yyyy-MM-dd HH:mm:ss", new Date()));
			}
			java.lang.String companyId = SessionUser.getCompanyid(); 
			tsEmePlanFiling.setCompany_id(companyId);
			
			
			tsEmePlanFilingService.saveorupdate(tsEmePlanFiling);
			
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			returnObject.setStatus(ReturnDatas.ERROR);
			returnObject.setMessage(MessageUtils.UPDATE_ERROR);
		}
		return returnObject;
	
	}
	
	/**
	 * 进入新增,  新增
	 */
	@RequestMapping(value = "/add/pre")
	public String addpre(Model model,HttpServletRequest request,HttpServletResponse response)  throws Exception{
		ReturnDatas returnObject = lookjson(model, request, response);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return "/nybusiness/ergency/tsemeplanfiling/tsemeplanfilingCru";
	}
	
	/**
	 * 进入修改页面  
	 */
	@RequestMapping(value = "/update/pre")
	public String updatepre(Model model,HttpServletRequest request,HttpServletResponse response)  throws Exception{
		ReturnDatas returnObject = lookjson(model, request, response);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return "/nybusiness/ergency/tsemeplanfiling/tsemeplanfilingCru2";
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
				tsEmePlanFilingService.deleteById(id,TsEmePlanFiling.class);
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
			tsEmePlanFilingService.deleteByIds(ids,TsEmePlanFiling.class);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return new ReturnDatas(ReturnDatas.ERROR,MessageUtils.DELETE_ALL_FAIL);
		}
		return new ReturnDatas(ReturnDatas.SUCCESS,MessageUtils.DELETE_ALL_SUCCESS);
		
		
	}

}
