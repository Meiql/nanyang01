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
import org.springrain.nybusiness.ergency.service.ITsEmePlanFilAdjustmentService;
import org.springrain.nybusiness.ergency.service.ITsEmePlanFilingService;
import org.springrain.nybusiness.ergency.service.ITsEmergencyEquipmentSumService;
import org.springrain.nybusiness.msg.entity.TsMsgEnviroRisk;
import org.springrain.nybusiness.msg.service.ITsMsgEnviroRiskService;
import org.springrain.nybusiness.resourceAudit.entity.TsPrepareGoodsReturn;
import org.springrain.nybusiness.resourceAudit.service.ITsPrepareGoodsReturnService;
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
 * @version  2018-11-14 22:54:36
 * @see org.springrain.nybusiness.resourceAudit.web.TsPrepareGoodsReturn
 */
@Controller
@RequestMapping(value="/tspreparegoodsreturn")
public class TsPrepareGoodsReturnController  extends BaseController {
	@Resource
	private ITsPrepareGoodsReturnService tsPrepareGoodsReturnService;
	
	@Resource
	private ITsCompanyInfoService tsCompanyInfoService;
	
	@Resource
	private ITsEmergencyEquipmentSumService tsEmergencyEquipmentSumService;
	@Resource
	private ITsEmePlanFilingService tsEmePlanFilingService;
	@Resource
	private ITsEmePlanFilAdjustmentService tsEmePlanFilAdjustmentService;
	@Resource
	private ITsMsgEnviroRiskService tsMsgEnviroRiskService;
	private String listurl="/nybusiness/resourceAudit/tspreparegoodsreturn/tspreparegoodsreturnList";
	
	
	   
	/**
	 * 列表数据,调用listjson方法,保证和app端数据统一
	 * 
	 * @param request
	 * @param model
	 * @param tsPrepareGoodsReturn
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public String list(HttpServletRequest request, Model model,TsPrepareGoodsReturn tsPrepareGoodsReturn) 
			throws Exception {
		ReturnDatas returnObject = listjson(request, model, tsPrepareGoodsReturn);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return listurl;
	}
	
	/**
	 * json数据,为APP提供数据
	 * 
	 * @param request
	 * @param model
	 * @param tsPrepareGoodsReturn
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list/json")
	@ResponseBody   
	public  ReturnDatas listjson(HttpServletRequest request, Model model,TsPrepareGoodsReturn tsPrepareGoodsReturn) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		// ==构造分页请求
		Page page = newPage(request);
		// ==执行分页查询
		List<TsPrepareGoodsReturn> datas=tsPrepareGoodsReturnService.findListData(tsPrepareGoodsReturn);
			returnObject.setQueryBean(tsPrepareGoodsReturn);
		//returnObject.setPage(page);
		returnObject.setData(datas);
		return returnObject;
	}
	
	@RequestMapping("/list/export")
	public void listexport(HttpServletRequest request,HttpServletResponse response, Model model,TsPrepareGoodsReturn tsPrepareGoodsReturn) throws Exception{
		// ==构造分页请求
		Page page = newPage(request);
	
		File file = tsPrepareGoodsReturnService.findDataExportExcel(null,listurl, page,TsPrepareGoodsReturn.class,tsPrepareGoodsReturn);
		String fileName="tsPrepareGoodsReturn"+GlobalStatic.excelext;
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
		return "/nybusiness/resourceAudit/tspreparegoodsreturn/tspreparegoodsreturnLook";
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
		  TsPrepareGoodsReturn tsPrepareGoodsReturn = tsPrepareGoodsReturnService.findTsPrepareGoodsReturnById(id);
		   returnObject.setData(tsPrepareGoodsReturn);
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
	public ReturnDatas saveorupdate(Model model,TsPrepareGoodsReturn tsPrepareGoodsReturn,HttpServletRequest request,HttpServletResponse response) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		returnObject.setMessage(MessageUtils.UPDATE_SUCCESS);
		try {
		
			java.lang.String id =tsPrepareGoodsReturn.getId();
			if(StringUtils.isBlank(id)){
			  tsPrepareGoodsReturn.setId(null);
			}
		
			tsPrepareGoodsReturnService.saveorupdate(tsPrepareGoodsReturn);
			
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
		return "/nybusiness/resourceAudit/tspreparegoodsreturn/tspreparegoodsreturnCru";
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
				tsPrepareGoodsReturnService.deleteById(id,TsPrepareGoodsReturn.class);
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
			tsPrepareGoodsReturnService.deleteByIds(ids,TsPrepareGoodsReturn.class);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return new ReturnDatas(ReturnDatas.ERROR,MessageUtils.DELETE_ALL_FAIL);
		}
		return new ReturnDatas(ReturnDatas.SUCCESS,MessageUtils.DELETE_ALL_SUCCESS);
		
		
	}
	
	/**
	 * 进入应急物资申报界面
	 */
	@RequestMapping(value = "/emergency/look")
	public String emergencyapp(HttpServletRequest request, Model model,TsEmergencyEquipmentSum tsEmergencyEquipmentSum)  throws Exception{
//		ReturnDatas returnObject = listjsonEmergency(request, model, tsEmergencyEquipmentSum);
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		// ==构造分页请求
		Page page = newPage(request);
		// ==执行分页查询
		//List<TsEmergencyEquipmentSum> datas=tsEmergencyEquipmentSumService.findListDataByFinder(null,page,TsEmergencyEquipmentSum.class,tsEmergencyEquipmentSum);
			//returnObject.setQueryBean(tsEmergencyEquipmentSum);
		
		
		List<String> listCompany = tsCompanyInfoService.finderCompanyIdByUserId(SessionUser.getUserId());
		List<TsEmergencyEquipmentSum> datas=tsEmergencyEquipmentSumService.finderTsMaillistForList(page, tsEmergencyEquipmentSum, listCompany);
			returnObject.setQueryBean(tsEmergencyEquipmentSum);
		
		returnObject.setPage(page);
		returnObject.setData(datas);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		//return listurl;
		return "/nybusiness/ergency/tsemergencyequipmentsum/tsemergencyequipmentsumList";
		//return "/nybusiness/resourceAudit/tsprepareapprovl/emergencyappr";
	}
	
	/**
	 * 进入应急预案备案界面
	 */
	@RequestMapping(value = "/planfiling/look")
	public String planfilingapp(HttpServletRequest request, Model model,TsEmePlanFiling tsEmePlanFiling)  throws Exception{
//		ReturnDatas returnObject = listjsonEmergency(request, model, tsEmergencyEquipmentSum);
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		// ==构造分页请求
		Page page = newPage(request);
		// ==执行分页查询
		List<String> listCompany = tsCompanyInfoService.finderCompanyIdByUserId(SessionUser.getUserId());
		List<TsEmePlanFiling> datas=tsEmePlanFilingService.finderTsMaillistForList(page, tsEmePlanFiling, listCompany);
		
		returnObject.setPage(page);
		returnObject.setData(datas);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return "/nybusiness/ergency/tsemeplanfiling/tsemeplanfilingList";
	}
	
	
	/**
	 * 进入公司申报界面
	 */
	@RequestMapping(value = "/company/look")
	public String companyapp(HttpServletRequest request, Model model,TsCompanyInfo tsCompanyInfo)  throws Exception{
//		ReturnDatas returnObject = listjsonEmergency(request, model, tsEmergencyEquipmentSum);
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		// ==构造分页请求
		Page page = newPage(request);
		// ==执行分页查询
		List<TsCompanyInfo> datas=tsCompanyInfoService.findListDataByFinder(null,page,TsCompanyInfo.class,tsCompanyInfo);
		returnObject.setQueryBean(tsCompanyInfo);
		
		returnObject.setPage(page);
		returnObject.setData(datas);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return "/nybusiness/tscompanyinfo/tscompanyinfoList";
	}
	
	/**
	 * 进入环境分险界面
	 */
	@RequestMapping(value = "enviroment/look")
	public String enviromentapp(HttpServletRequest request, Model model,TsMsgEnviroRisk TsMsgEnviroRisk)  throws Exception{
//		ReturnDatas returnObject = listjsonEmergency(request, model, tsEmergencyEquipmentSum);
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		// ==构造分页请求
		Page page = newPage(request);
		// ==执行分页查询
		List<String> listCompany = tsCompanyInfoService.finderCompanyIdByUserId(SessionUser.getUserId());
		List<TsMsgEnviroRisk> datas=tsMsgEnviroRiskService.finderTsEnvirolistForList(page,TsMsgEnviroRisk,listCompany);
		returnObject.setQueryBean(TsMsgEnviroRisk);
		returnObject.setPage(page);
		returnObject.setData(datas);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return "/nybusiness/msg/tsmsgenvirorisk/tsmsgenviroriskList";
	}


}
