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

import org.springrain.nybusiness.ergency.entity.TsEmergencyEquipmentSum;
import org.springrain.nybusiness.ergency.entity.TsErgencyInvestigation;
import org.springrain.nybusiness.ergency.service.ITsEmergencyEquipmentSumService;
import org.springrain.frame.common.SessionUser;
import org.springrain.frame.controller.BaseController;
import org.springrain.frame.util.DateUtils;
import org.springrain.frame.util.GlobalStatic;
import org.springrain.frame.util.MessageUtils;
import org.springrain.frame.util.Page;
import org.springrain.frame.util.ReturnDatas;
import org.springrain.nybusiness.company.service.ITsCompanyInfoService;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-05 21:01:39
 * @see org.springrain.nybusiness.ergency.web.TsEmergencyEquipmentSum
 */
@Controller
@RequestMapping(value="/tsemergencyequipmentsum")
public class TsEmergencyEquipmentSumController  extends BaseController {
	@Resource
	private ITsEmergencyEquipmentSumService tsEmergencyEquipmentSumService;
	@Resource
	private ITsCompanyInfoService tsCompanyInfoService;
	private String listurl="/nybusiness/ergency/tsemergencyequipmentsum/tsemergencyequipmentsumList";
	
	
	   
	/**
	 * 列表数据,调用listjson方法,保证和app端数据统一
	 * 
	 * @param request
	 * @param model
	 * @param tsEmergencyEquipmentSum
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public String list(HttpServletRequest request, Model model,TsEmergencyEquipmentSum tsEmergencyEquipmentSum) 
			throws Exception {
		ReturnDatas returnObject = listjson(request, model, tsEmergencyEquipmentSum);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return listurl;
	}
	
	/**
	 * json数据,为APP提供数据
	 * 
	 * @param request
	 * @param model
	 * @param tsEmergencyEquipmentSum
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list/json")
	@ResponseBody   
	public  ReturnDatas listjson(HttpServletRequest request, Model model,TsEmergencyEquipmentSum tsEmergencyEquipmentSum) throws Exception{
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
		return returnObject;
	}
	
	@RequestMapping("/list/export")
	public void listexport(HttpServletRequest request,HttpServletResponse response, Model model,TsEmergencyEquipmentSum tsEmergencyEquipmentSum) throws Exception{
		// ==构造分页请求
		Page page = newPage(request);
	
		File file = tsEmergencyEquipmentSumService.findDataExportExcel(null,listurl, page,TsEmergencyEquipmentSum.class,tsEmergencyEquipmentSum);
		String fileName="tsEmergencyEquipmentSum"+GlobalStatic.excelext;
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
		return "/nybusiness/ergency/tsemergencyequipmentsum/tsemergencyequipmentsumLook";
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
		  TsEmergencyEquipmentSum tsEmergencyEquipmentSum = tsEmergencyEquipmentSumService.findTsEmergencyEquipmentSumById(id);
		   returnObject.setData(tsEmergencyEquipmentSum);
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
	public ReturnDatas saveorupdate(Model model,TsEmergencyEquipmentSum tsEmergencyEquipmentSum,HttpServletRequest request,HttpServletResponse response) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		returnObject.setMessage(MessageUtils.UPDATE_SUCCESS);
		try {
		
			java.lang.String id =tsEmergencyEquipmentSum.getId();
			if(StringUtils.isBlank(id)){
			  tsEmergencyEquipmentSum.setId(null);
			}
			
			if("1".equals(tsEmergencyEquipmentSum.getIn_Equipment())) {
				tsEmergencyEquipmentSum.setOut_Equipment(null);
				tsEmergencyEquipmentSum.setOutside_company(null);
				tsEmergencyEquipmentSum.setOutside_people(null);
				tsEmergencyEquipmentSum.setOutside_tel(null);
			}
			tsEmergencyEquipmentSum.setBak1("1");
			if(StringUtils.isBlank(tsEmergencyEquipmentSum.getCreate_user())){
				tsEmergencyEquipmentSum.setCreate_user(SessionUser.getUserId());
			}
			if(StringUtils.isBlank(tsEmergencyEquipmentSum.getCreate_time())){
				tsEmergencyEquipmentSum.setCreate_time(DateUtils.convertDate2String("yyyy-MM-dd HH:mm:ss", new Date()));
			}
			java.lang.String companyId = SessionUser.getCompanyid(); 
			tsEmergencyEquipmentSum.setCompany_id(companyId);
			tsEmergencyEquipmentSumService.saveorupdate(tsEmergencyEquipmentSum);
			
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
		return "/nybusiness/ergency/tsemergencyequipmentsum/tsemergencyequipmentsumCru";
	}
	/**
	 * 进入修改页面,APP端可以调用 lookjson 获取json格式数据
	 */
	@RequestMapping(value = "/detail")
	public String detail(Model model,HttpServletRequest request,HttpServletResponse response)  throws Exception{
		ReturnDatas returnObject = lookjson(model, request, response);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return "/nybusiness/ergency/tsemergencyequipmentsum/tsemergencyequipmentsumCru2";
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
			tsEmergencyEquipmentSumService.updateTsEmergencyEquipmentSum(id);
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
				tsEmergencyEquipmentSumService.deleteById(id,TsEmergencyEquipmentSum.class);
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
			tsEmergencyEquipmentSumService.deleteByIds(ids,TsEmergencyEquipmentSum.class);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return new ReturnDatas(ReturnDatas.ERROR,MessageUtils.DELETE_ALL_FAIL);
		}
		return new ReturnDatas(ReturnDatas.SUCCESS,MessageUtils.DELETE_ALL_SUCCESS);
		
		
	}

}
