package  org.springrain.nybusiness.msg.web;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springrain.frame.common.SessionUser;
import org.springrain.frame.controller.BaseController;
import org.springrain.frame.util.GlobalStatic;
import org.springrain.frame.util.MessageUtils;
import org.springrain.frame.util.Page;
import org.springrain.frame.util.ReturnDatas;
import org.springrain.nybusiness.company.service.ITsCompanyInfoService;
import org.springrain.nybusiness.msg.entity.TsMsgEnviroRisk;
import org.springrain.nybusiness.msg.service.ITsMsgChemicalSubstancesService;
import org.springrain.nybusiness.msg.service.ITsMsgEnviroRiskService;


/**
 * TODO 环境风险表 
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:44:38
 * @see org.springrain.nybusiness.msg.web.TsMsgEnviroRisk
 */
@Controller
@RequestMapping(value="/tsmsgenvirorisk")
public class TsMsgEnviroRiskController  extends BaseController {
	@Resource
	private ITsMsgEnviroRiskService tsMsgEnviroRiskService;
	@Resource
	private ITsMsgChemicalSubstancesService tsMsgChemicalSubstancesService;
	@Resource
	private ITsCompanyInfoService tsCompanyInfoService;
	
	private String listurl="/nybusiness/msg/tsmsgenvirorisk/tsmsgenviroriskList";
	
	
	   
	/**
	 * 列表数据,调用listjson方法,保证和app端数据统一
	 * 
	 * @param request
	 * @param model
	 * @param TsMsgEnviroRisk
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public String list(HttpServletRequest request, Model model,TsMsgEnviroRisk tsMsgEnviroRisk) 
			throws Exception {
		ReturnDatas returnObject = listjson(request, model, tsMsgEnviroRisk);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return listurl;
	}
	
	/**
	 * json数据,为APP提供数据
	 * 
	 * @param request
	 * @param model
	 * @param TsMsgEnviroRisk
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list/json")
	@ResponseBody   
	public  ReturnDatas listjson(HttpServletRequest request, Model model,TsMsgEnviroRisk TsMsgEnviroRisk) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		// ==构造分页请求
		Page page = newPage(request);
		//首先查询companyId
		List<String> listCompany = tsCompanyInfoService.finderCompanyIdByUserId(SessionUser.getUserId());
		// ==执行分页查询
//		List<TsMsgEnviroRisk> datas=tsMsgEnviroRiskService.findListDataByFinder(null,page,TsMsgEnviroRisk.class,TsMsgEnviroRisk);
//			returnObject.setQueryBean(TsMsgEnviroRisk);
			
		List<TsMsgEnviroRisk> datas=tsMsgEnviroRiskService.finderTsEnvirolistForList(page,TsMsgEnviroRisk,listCompany);
		returnObject.setQueryBean(TsMsgEnviroRisk);
		returnObject.setPage(page);
		returnObject.setData(datas);
		return returnObject;
	}
	
	@RequestMapping("/list/export")
	public void listexport(HttpServletRequest request,HttpServletResponse response, Model model,TsMsgEnviroRisk TsMsgEnviroRisk) throws Exception{
		// ==构造分页请求
		Page page = newPage(request);
	
		File file = tsMsgEnviroRiskService.findDataExportExcel(null,listurl, page,TsMsgEnviroRisk.class,TsMsgEnviroRisk);
		String fileName="TsMsgEnviroRisk"+GlobalStatic.excelext;
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
		return "/nybusiness/msg/TsMsgEnviroRisk/TsMsgEnviroRiskLook";
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
		  TsMsgEnviroRisk TsMsgEnviroRisk = tsMsgEnviroRiskService.findTsMsgEnviroRiskById(id);
		   returnObject.setData(TsMsgEnviroRisk);
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
	public ReturnDatas saveorupdate(Model model,TsMsgEnviroRisk tsMsgEnviroRisk,HttpServletRequest request,HttpServletResponse response) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		returnObject.setMessage(MessageUtils.UPDATE_SUCCESS);
		try {
			java.lang.String id =tsMsgEnviroRisk.getId();
			if(StringUtils.isBlank(id)){
				tsMsgEnviroRisk.setId(null);
			}
			Date date = new Date();
			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String formatStr =formatter.format(date);
			System.out.println("系统时间为 ："+ formatStr);
			//1.创建时间
			if(StringUtils.isBlank(tsMsgEnviroRisk.getCreateTime())){
				tsMsgEnviroRisk.setCreateTime(formatStr);
			}
			//2.创建用户id
			if(StringUtils.isBlank(tsMsgEnviroRisk.getCreateUser())){
				tsMsgEnviroRisk.setCreateUser(SessionUser.getUserId());
			}
			//3.创建用户公司name
			java.lang.String companyId = SessionUser.getCompanyid(); 
			String CompanyName = tsMsgChemicalSubstancesService.finderCompanyNameByCompanyId(companyId);
			if(StringUtils.isBlank(tsMsgEnviroRisk.getCreateUserName())){
				tsMsgEnviroRisk.setCreateUserName(CompanyName);
			}
			//4.公司代码 
			if(StringUtils.isBlank(tsMsgEnviroRisk.getCompanyId())){			
				tsMsgEnviroRisk.setCompanyId(companyId);
			}
			//5.数据状态
			if(StringUtils.isBlank(tsMsgEnviroRisk.getBak1())){				
				tsMsgEnviroRisk.setBak1("1");
			}						
			tsMsgEnviroRiskService.saveorupdate(tsMsgEnviroRisk);
			
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			e.printStackTrace();
			returnObject.setStatus(ReturnDatas.ERROR);
			returnObject.setMessage(MessageUtils.UPDATE_ERROR);
		}
		return returnObject;
	
	}
	/**
	 * 提交操作
	 * @return 
	 */ 
	@RequestMapping("/updateBak1")
	@ResponseBody    
	public ReturnDatas updateBak1(String id) throws Exception {
		System.out.println("环境风险执行提交");
			// 执行提交
		try {
		if(StringUtils.isNotBlank(id)){
			tsMsgEnviroRiskService.updateBak1(id,TsMsgEnviroRisk.class);
				return new ReturnDatas(ReturnDatas.SUCCESS,MessageUtils.UPDATE_SUCCESS);
			} else {
				return new ReturnDatas(ReturnDatas.WARNING,MessageUtils.UPDATE_ERROR);
			}
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		}
		return new ReturnDatas(ReturnDatas.WARNING, MessageUtils.DELETE_WARNING);
	}
	/**
	 * 进入修改页面,APP端可以调用 lookjson 获取json格式数据
	 */
	@RequestMapping(value = "/update/pre")
	public String updatepre(Model model,HttpServletRequest request,HttpServletResponse response)  throws Exception{
		ReturnDatas returnObject = lookjson(model, request, response);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return "/nybusiness/msg/TsMsgEnviroRisk/TsMsgEnviroRiskCru";
	}
	
	/**
	 * 进入详情页面
	 */
	@RequestMapping(value = "/details")
	public String details(Model model,HttpServletRequest request,HttpServletResponse response)  throws Exception{
		ReturnDatas returnObject = lookjson(model, request, response);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return "/nybusiness/msg/TsMsgEnviroRisk/TsMsgEnviroRiskCru1";
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
			tsMsgEnviroRiskService.deleteById(id,TsMsgEnviroRisk.class);
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
			tsMsgEnviroRiskService.deleteByIds(ids,TsMsgEnviroRisk.class);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return new ReturnDatas(ReturnDatas.ERROR,MessageUtils.DELETE_ALL_FAIL);
		}
		return new ReturnDatas(ReturnDatas.SUCCESS,MessageUtils.DELETE_ALL_SUCCESS);
		
		
	}

}
