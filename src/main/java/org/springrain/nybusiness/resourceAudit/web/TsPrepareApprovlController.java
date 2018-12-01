package  org.springrain.nybusiness.resourceAudit.web;

import java.io.File;
import java.util.Arrays;
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
import org.springrain.nybusiness.company.entity.TsCompanyInfo;
import org.springrain.nybusiness.company.service.ITsCompanyInfoService;
import org.springrain.nybusiness.ergency.entity.TsEmePlanFiling;
import org.springrain.nybusiness.ergency.entity.TsEmergencyEquipmentSum;
import org.springrain.nybusiness.ergency.entity.TsEmergencyMaterialSum;
import org.springrain.nybusiness.ergency.service.ITsEmePlanFilingService;
import org.springrain.nybusiness.ergency.service.ITsEmergencyEquipmentSumService;
import org.springrain.nybusiness.msg.entity.TsMsgEnviroRisk;
import org.springrain.nybusiness.msg.service.ITsMsgEnviroRiskService;
import org.springrain.nybusiness.resourceAudit.entity.TsPrepareApprovl;
import org.springrain.nybusiness.resourceAudit.entity.TsPreparegoodsNum;
import org.springrain.nybusiness.resourceAudit.service.ITsPrepareApprovlService;
import org.springrain.frame.common.SessionUser;
import org.springrain.frame.controller.BaseController;
import org.springrain.frame.util.GlobalStatic;
import org.springrain.frame.util.MessageUtils;
import org.springrain.frame.util.Page;
import org.springrain.frame.util.ReturnDatas;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-14 22:30:47
 * @see org.springrain.nybusiness.resourceAudit.web.TsPrepareApprovl
 */
@Controller
@RequestMapping(value="/tsprepareapprovl")
public class TsPrepareApprovlController  extends BaseController {
	@Resource
	private ITsPrepareApprovlService tsPrepareApprovlService;
	@Resource
	private ITsEmergencyEquipmentSumService tsEmergencyEquipmentSumService;
	@Resource	
	private ITsCompanyInfoService tsCompanyInfoService;
	@Resource
	private ITsEmePlanFilingService tsEmePlanFilingService;
	
	@Resource
	private ITsMsgEnviroRiskService tsMsgEnviroRiskService;
	
	private String listurl="/nybusiness/resourceAudit/tsprepareapprovl/tsprepareapprovlList";
	
	
	   
	/**
	 * 列表数据,调用listjson方法,保证和app端数据统一
	 * 
	 * @param request
	 * @param model
	 * @param tsPrepareApprovl
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public String list(HttpServletRequest request, Model model,TsPrepareApprovl tsPrepareApprovl) 
			throws Exception {
		ReturnDatas returnObject = listjson(request, model, tsPrepareApprovl);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return listurl;
	}
	
	/**
	 * json数据,为APP提供数据
	 * 
	 * @param request
	 * @param model
	 * @param tsPrepareApprovl
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list/json")
	@ResponseBody   
	public  ReturnDatas listjson(HttpServletRequest request, Model model,TsPrepareApprovl tsPrepareApprovl) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		// ==构造分页请求
		Page page = newPage(request);
		// ==执行分页查询
		//List<TsPrepareApprovl> datas=tsPrepareApprovlService.findListDataByFinder(null,page,TsPrepareApprovl.class,tsPrepareApprovl);
		List<TsPrepareApprovl> datas=tsPrepareApprovlService.findListData(tsPrepareApprovl);
			returnObject.setQueryBean(tsPrepareApprovl);
		returnObject.setPage(page);
		returnObject.setData(datas);
		return returnObject;
	}
	
	@RequestMapping("/list/export")
	public void listexport(HttpServletRequest request,HttpServletResponse response, Model model,TsPrepareApprovl tsPrepareApprovl) throws Exception{
		// ==构造分页请求
		Page page = newPage(request);
	
		File file = tsPrepareApprovlService.findDataExportExcel(null,listurl, page,TsPrepareApprovl.class,tsPrepareApprovl);
		String fileName="tsPrepareApprovl"+GlobalStatic.excelext;
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
		return "/nybusiness/resourceAudit/tsprepareapprovl/tsprepareapprovlLook";
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
		  TsPrepareApprovl tsPrepareApprovl = tsPrepareApprovlService.findTsPrepareApprovlById(id);
		   returnObject.setData(tsPrepareApprovl);
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
	public ReturnDatas saveorupdate(Model model,TsPrepareApprovl tsPrepareApprovl,HttpServletRequest request,HttpServletResponse response) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		returnObject.setMessage(MessageUtils.UPDATE_SUCCESS);
		try {
		
			java.lang.String id =tsPrepareApprovl.getId();
			if(StringUtils.isBlank(id)){
			  tsPrepareApprovl.setId(null);
			}
		
			tsPrepareApprovlService.saveorupdate(tsPrepareApprovl);
			
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
		return "/nybusiness/resourceAudit/tsprepareapprovl/tsprepareapprovlCru";
	}
	/**
	 * 进入应急物资申报审核界面，先查询结果，在审核
	 */
	@RequestMapping(value = "/emergency/app")
	public String emergencyapp(HttpServletRequest request, Model model,TsEmergencyMaterialSum tsEmergencyMaterialSum)  throws Exception{
//		ReturnDatas returnObject = listjsonEmergency(request, model, tsEmergencyEquipmentSum);
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		// ==构造分页请求
		Page page = newPage(request);
		// ==执行分页查询
		//List<TsEmergencyEquipmentSum> datas=tsEmergencyEquipmentSumService.findListDataByFinder(null,page,TsEmergencyEquipmentSum.class,tsEmergencyEquipmentSum);
			//returnObject.setQueryBean(tsEmergencyEquipmentSum);
		
		List<TsEmergencyMaterialSum> datas=tsPrepareApprovlService.finderTsEmergencyForList(page, tsEmergencyMaterialSum);
			returnObject.setQueryBean(tsEmergencyMaterialSum);
		
		returnObject.setPage(page);
		returnObject.setData(datas);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		//return listurl;
		//return "/nybusiness/ergency/tsemergencyequipmentsum/tsemergencyequipmentsumList";
		return "/nybusiness/resourceAudit/tsprepareapprovl/emergencyappr";
	}
	
	/**
	 * 进入应急预案备案审核界面，先查询结果，在审核
	 */
	@RequestMapping(value = "/planfiling/app")
	public String planfilingapp(HttpServletRequest request, Model model,TsEmePlanFiling tsEmePlanFiling)  throws Exception{
//		ReturnDatas returnObject = listjsonEmergency(request, model, tsEmergencyEquipmentSum);
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		// ==构造分页请求
		Page page = newPage(request);
		// ==执行分页查询
		List<TsEmePlanFiling> datas=tsPrepareApprovlService.finderTsEmePlanFilingForList(page, tsEmePlanFiling);
		
		returnObject.setPage(page);
		returnObject.setData(datas);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return "/nybusiness/resourceAudit/tsprepareapprovl/planfilingappr";
	}
	
	
	/**
	 * 进入公司申报审核界面，先查询结果，在审核
	 */
	@RequestMapping(value = "/company/app")
	public String companyapp(HttpServletRequest request, Model model,TsCompanyInfo tsCompanyInfo)  throws Exception{
//		ReturnDatas returnObject = listjsonEmergency(request, model, tsEmergencyEquipmentSum);
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		// ==构造分页请求
		Page page = newPage(request);
		// ==执行分页查询
		List<TsCompanyInfo> datas=tsPrepareApprovlService.finderTsCompanyInfoForList(page, tsCompanyInfo);
		
		returnObject.setPage(page);
		returnObject.setData(datas);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return "/nybusiness/resourceAudit/tsprepareapprovl/companyappr";
	}
	
	/**
	 * 进入环境分险审核界面，先查询结果，在审核
	 */
	@RequestMapping(value = "enviroment/app")
	public String enviromentapp(HttpServletRequest request, Model model,TsMsgEnviroRisk tsMsgEnviroRisk)  throws Exception{
//		ReturnDatas returnObject = listjsonEmergency(request, model, tsEmergencyEquipmentSum);
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		// ==构造分页请求
		Page page = newPage(request);
		// ==执行分页查询
		List<TsMsgEnviroRisk> datas=tsPrepareApprovlService.finderTsMsgEnviroRiskForList(page, tsMsgEnviroRisk);
		
		returnObject.setPage(page);
		returnObject.setData(datas);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return "/nybusiness/resourceAudit/tsprepareapprovl/enviromentappr";
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
				tsPrepareApprovlService.deleteById(id,TsPrepareApprovl.class);
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
			tsPrepareApprovlService.deleteByIds(ids,TsPrepareApprovl.class);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return new ReturnDatas(ReturnDatas.ERROR,MessageUtils.DELETE_ALL_FAIL);
		}
		return new ReturnDatas(ReturnDatas.SUCCESS,MessageUtils.DELETE_ALL_SUCCESS);
		
		
	}
	
	/**
	 * 应急物资审批操作
	 */
	@RequestMapping(value="/ajax/approv/pass")
	@ResponseBody      
	public  ReturnDatas approvpass(HttpServletRequest request) throws Exception {
		ReturnDatas returnDatas = ReturnDatas.getSuccessReturnDatas();
			// 执行上报
		try {
		java.lang.String id=request.getParameter("id");
		java.lang.String  type=request.getParameter("type");
		java.lang.String  source=request.getParameter("datasource");
		if(StringUtils.isNotBlank(id)){
			if(source.equals("F2")) {
			tsPrepareApprovlService.updateTsEmergencyEquipmentSumPass(id,type);
			} else {
				tsPrepareApprovlService.updateTsErgencyInvestigation(id,type);
			}
		returnDatas.setMessage("审批通过");
		}} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return returnDatas;
	}
	/**
	 * 应急预案备案审核
	 */
	@RequestMapping(value="/ajax/planfiling/pass")
	@ResponseBody      
	public  ReturnDatas planfilingpass(HttpServletRequest request) throws Exception {
		ReturnDatas returnDatas = ReturnDatas.getSuccessReturnDatas();
			// 执行上报
		try {
		java.lang.String id=request.getParameter("id");
		java.lang.String  type=request.getParameter("type");
		if(StringUtils.isNotBlank(id)){
			tsPrepareApprovlService.updateTsEmePlanFilingPass(id,type);
			} 
		returnDatas.setMessage("审批通过");
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return returnDatas;
	}
	/**
	 * 公司申报审核
	 */
	@RequestMapping(value="/ajax/company/pass")
	@ResponseBody      
	public  ReturnDatas companypass(HttpServletRequest request) throws Exception {
		ReturnDatas returnDatas = ReturnDatas.getSuccessReturnDatas();
			// 执行上报
		try {
		java.lang.String id=request.getParameter("id");
		java.lang.String  type=request.getParameter("type");
		if(StringUtils.isNotBlank(id)){
			tsPrepareApprovlService.updateTsCompanyInfoPass(id,type);
			} 
		returnDatas.setMessage("审批通过");
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return returnDatas;
	}
	
	/**
	 * 环境分险信息审核
	 */
	@RequestMapping(value="/ajax/enviroment/pass")
	@ResponseBody      
	public  ReturnDatas enviromentpass(HttpServletRequest request) throws Exception {
		ReturnDatas returnDatas = ReturnDatas.getSuccessReturnDatas();
			// 执行上报
		try {
		java.lang.String id=request.getParameter("id");
		java.lang.String  type=request.getParameter("type");
		if(StringUtils.isNotBlank(id)){
			tsPrepareApprovlService.updateTsMsgEnviroRiskPass(id,type);
			} 
		returnDatas.setMessage("审批通过");
		} catch (Exception e) {
			System.out.println(e.getMessage());
			logger.error(e.getMessage(), e);
		}
		return returnDatas;
	}

}
