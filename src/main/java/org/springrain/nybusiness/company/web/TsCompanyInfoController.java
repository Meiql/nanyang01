package  org.springrain.nybusiness.company.web;

import java.io.File;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springrain.frame.controller.BaseController;
import org.springrain.frame.util.GlobalStatic;
import org.springrain.frame.util.MessageUtils;
import org.springrain.frame.util.Page;
import org.springrain.frame.util.ReturnDatas;
import org.springrain.nybusiness.company.entity.TsCompanyInfo;
import org.springrain.nybusiness.company.service.ITsCompanyInfoService;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-04 21:31:43
 * @see org.springrain.nybusiness.company.web.TsCompanyInfo
 */
@Controller
@RequestMapping(value="/tscompanyinfo")
public class TsCompanyInfoController  extends BaseController {
	@Resource
	private ITsCompanyInfoService tsCompanyInfoService;
	
	private String listurl="/nybusiness/tscompanyinfo/tscompanyinfoList";
	
	
	   
	/**
	 * 列表数据,调用listjson方法,保证和app端数据统一
	 * 
	 * @param request
	 * @param model
	 * @param tsCompanyInfo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public String list(HttpServletRequest request, Model model,TsCompanyInfo tsCompanyInfo) 
			throws Exception {
		ReturnDatas returnObject = listjson(request, model, tsCompanyInfo);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return listurl;
	}
	
	/**
	 * json数据,为APP提供数据
	 * 
	 * @param request
	 * @param model
	 * @param tsCompanyInfo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list/json")
	@ResponseBody   
	public  ReturnDatas listjson(HttpServletRequest request, Model model,TsCompanyInfo tsCompanyInfo) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		// ==构造分页请求
		Page page = newPage(request);
		// ==执行分页查询
		List<TsCompanyInfo> datas=tsCompanyInfoService.findListDataByFinder(null,page,TsCompanyInfo.class,tsCompanyInfo);
			returnObject.setQueryBean(tsCompanyInfo);
		returnObject.setPage(page);
		returnObject.setData(datas);
		return returnObject;
	}
	/**
	 * 
	 * @Author ll
	 * @Date 2018年11月5日 下午12:49:18
	 * @Description 查询待审核的数据 
	 * @Fcunction examine
	 * @param request
	 * @param model
	 * @param tsCompanyInfo
	 * @return
	 * @throws Exception
	 *
	 */
	@RequestMapping("/examine")
	public String examine(HttpServletRequest request, Model model,TsCompanyInfo tsCompanyInfo) 
			throws Exception {
		ReturnDatas returnObject = examinejson(request, model, tsCompanyInfo);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return "/nybusiness/tscompanyinfo/tsexaminecompanyinfoList";
	}
	/**
	 * 
	 * @Author ll
	 * @Date 2018年11月5日 下午12:49:37
	 * @Description 查询待审核的数据  
	 * @Fcunction examinejson
	 * @param request
	 * @param model
	 * @param companyInfo
	 * @return
	 * @throws Exception
	 *
	 */
	@RequestMapping("/examine/json")
	@ResponseBody   
	public  ReturnDatas examinejson(HttpServletRequest request, Model model,TsCompanyInfo companyInfo) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		// ==构造分页请求
		List<TsCompanyInfo> datas = null;
		Page page = newPage(request);
		// ==执行分页查询
		try {
			 datas=tsCompanyInfoService.finderExamineCompany(page, companyInfo);
			returnObject.setQueryBean(companyInfo);
			returnObject.setPage(page);
			returnObject.setData(datas);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

		return returnObject;
	}
	
	/**
	 * 新增/修改 操作吗,返回json格式数据
	 * 
	 */
	@RequestMapping("/examineupdate")
	@ResponseBody      
	public ReturnDatas examineSaveorupdate(Model model,TsCompanyInfo tsCompanyInfo,HttpServletRequest request,HttpServletResponse response) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		returnObject.setMessage(MessageUtils.UPDATE_SUCCESS);
		try {
		
			java.lang.String id =tsCompanyInfo.getId();
			if(StringUtils.isBlank(id)){
			  tsCompanyInfo.setId(null);
			}
		
			tsCompanyInfoService.updateCompanyInfo(tsCompanyInfo);
			
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
	@RequestMapping(value = "/examineupdate/pre")
	public String examineupdatepre(Model model,HttpServletRequest request,HttpServletResponse response)  throws Exception{
		ReturnDatas returnObject = lookjson(model, request, response);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return "/nybusiness/tscompanyinfo/tsexaminecompanyinfoCru";
	}
	@RequestMapping("/list/export")
	public void listexport(HttpServletRequest request,HttpServletResponse response, Model model,TsCompanyInfo tsCompanyInfo) throws Exception{
		// ==构造分页请求
		Page page = newPage(request);
	
		File file = tsCompanyInfoService.findDataExportExcel(null,listurl, page,TsCompanyInfo.class,tsCompanyInfo);
		String fileName="tsCompanyInfo"+GlobalStatic.excelext;
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
		return "/nybusiness/company/tscompanyinfo/tscompanyinfoLook";
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
		  TsCompanyInfo tsCompanyInfo = tsCompanyInfoService.findTsCompanyInfoById(id);
		   returnObject.setData(tsCompanyInfo);
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
	public ReturnDatas saveorupdate(Model model,TsCompanyInfo tsCompanyInfo,HttpServletRequest request,HttpServletResponse response) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		returnObject.setMessage(MessageUtils.UPDATE_SUCCESS);
		try {
		
			java.lang.String id =tsCompanyInfo.getId();
			if(StringUtils.isBlank(id)){
			  tsCompanyInfo.setId(null);
			}
			tsCompanyInfoService.saveorupdate(tsCompanyInfo);
			
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
		return "/nybusiness/tscompanyinfo/tscompanyinfoCru";
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
				tsCompanyInfoService.deleteById(id,TsCompanyInfo.class);
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
			tsCompanyInfoService.deleteByIds(ids,TsCompanyInfo.class);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return new ReturnDatas(ReturnDatas.ERROR,MessageUtils.DELETE_ALL_FAIL);
		}
		return new ReturnDatas(ReturnDatas.SUCCESS,MessageUtils.DELETE_ALL_SUCCESS);
		
		
	}

}
