package  org.springrain.nybusiness.resourceAudit.web;

import java.io.File;
import java.util.ArrayList;
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
import org.springrain.nybusiness.company.service.ITsCompanyInfoService;
import org.springrain.nybusiness.resourceAudit.entity.TsExplorerGatherInfo;
import org.springrain.nybusiness.resourceAudit.service.ITsExplorerGatherInfoService;
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
 * @version  2018-11-24 13:28:27
 * @see org.springrain.nybusiness.resourceAudit.web.TsExplorerGatherInfo
 */
@Controller
@RequestMapping(value="/tsexplorergatherinfo")
public class TsExplorerGatherInfoController  extends BaseController {
	@Resource
	private ITsExplorerGatherInfoService tsExplorerGatherInfoService;
	
	@Resource
	private ITsCompanyInfoService tsCompanyInfoService;
	private String listurl="/nybusiness/resourceAudit/tsexplorergatherinfo/tsexplorergatherinfoList";
	
	
	   
	/**
	 * 列表数据,调用listjson方法,保证和app端数据统一
	 * 
	 * @param request
	 * @param model
	 * @param tsExplorerGatherInfo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public String list(HttpServletRequest request, Model model,TsExplorerGatherInfo tsExplorerGatherInfo) 
			throws Exception {
		ReturnDatas returnObject = listjson(request, model, tsExplorerGatherInfo);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return listurl;
	}
	
	/**
	 * json数据,为APP提供数据
	 * 
	 * @param request
	 * @param model
	 * @param tsExplorerGatherInfo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list/json")
	@ResponseBody   
	public  ReturnDatas listjson(HttpServletRequest request, Model model,TsExplorerGatherInfo tsExplorerGatherInfo) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		java.lang.String companyid=request.getParameter("companyid");
		// ==构造分页请求
		Page page = newPage(request);
		// ==执行分页查询
		List<String> listCompany = new ArrayList<String>();
		if(StringUtils.isNoneBlank(companyid)){
				listCompany.add(companyid);
		}else{
			listCompany=tsCompanyInfoService.finderCompanyIdByUserId(SessionUser.getUserId());
		}
		List<TsExplorerGatherInfo> datas=tsExplorerGatherInfoService.findListData(page, tsExplorerGatherInfo,listCompany);
		returnObject.setQueryBean(tsExplorerGatherInfo);
	returnObject.setPage(page);
	returnObject.setData(datas);
		returnObject.setPage(page);
		returnObject.setData(datas);
		return returnObject;
	}
	
	@RequestMapping("/list/export")
	public void listexport(HttpServletRequest request,HttpServletResponse response, Model model,TsExplorerGatherInfo tsExplorerGatherInfo) throws Exception{
		// ==构造分页请求
		Page page = newPage(request);
	
		File file = tsExplorerGatherInfoService.findDataExportExcel(null,listurl, page,TsExplorerGatherInfo.class,tsExplorerGatherInfo);
		String fileName="tsExplorerGatherInfo"+GlobalStatic.excelext;
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
		return "/nybusiness/resourceAudit/tsexplorergatherinfo/tsexplorergatherinfoLook";
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
		  TsExplorerGatherInfo tsExplorerGatherInfo = tsExplorerGatherInfoService.findTsExplorerGatherInfoById(id);
		   returnObject.setData(tsExplorerGatherInfo);
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
	public ReturnDatas saveorupdate(Model model,TsExplorerGatherInfo tsExplorerGatherInfo,HttpServletRequest request,HttpServletResponse response) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		returnObject.setMessage(MessageUtils.UPDATE_SUCCESS);
		try {
		
			java.lang.String id =tsExplorerGatherInfo.getId();
			if(StringUtils.isBlank(id)){
			  tsExplorerGatherInfo.setId(null);
			}
		
			tsExplorerGatherInfoService.saveorupdate(tsExplorerGatherInfo);
			
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
		return "/nybusiness/resourceAudit/tsexplorergatherinfo/tsexplorergatherinfoCru";
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
				tsExplorerGatherInfoService.deleteById(id,TsExplorerGatherInfo.class);
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
			tsExplorerGatherInfoService.deleteByIds(ids,TsExplorerGatherInfo.class);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return new ReturnDatas(ReturnDatas.ERROR,MessageUtils.DELETE_ALL_FAIL);
		}
		return new ReturnDatas(ReturnDatas.SUCCESS,MessageUtils.DELETE_ALL_SUCCESS);
		
		
	}
	
	/**
	 * json数据,为地图统计使用
	 * 
	 * @param request
	 * @param model
	 * @param tsExplorerGatherInfo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value= "/find/json")
	@ResponseBody   
	public  ReturnDatas findThreeWastes(HttpServletRequest request, Model model,TsExplorerGatherInfo tsExplorerGatherInfo) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		// ==构造分页请求
		Page page = newPage(request);
		// ==执行分页查询
		List<TsExplorerGatherInfo> datas=tsExplorerGatherInfoService.findThreeWastesData(page, tsExplorerGatherInfo);
		returnObject.setQueryBean(tsExplorerGatherInfo);
		returnObject.setPage(page);
		returnObject.setData(datas);
		return returnObject;
	}

}
