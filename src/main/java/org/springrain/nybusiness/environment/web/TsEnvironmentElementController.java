package  org.springrain.nybusiness.environment.web;

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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springrain.frame.common.SessionUser;
import org.springrain.frame.controller.BaseController;
import org.springrain.frame.util.DateUtils;
import org.springrain.frame.util.Finder;
import org.springrain.frame.util.GlobalStatic;
import org.springrain.frame.util.MessageUtils;
import org.springrain.frame.util.Page;
import org.springrain.frame.util.ReturnDatas;
import org.springrain.nybusiness.company.entity.TsCompanyInfo;
import org.springrain.nybusiness.company.service.ITsCompanyInfoService;
import org.springrain.nybusiness.environment.entity.TsEnvironmentElement;
import org.springrain.nybusiness.environment.service.ITsEnvironmentElementService;
import org.springrain.nybusiness.facility.entity.TsFacilityInfo;
import org.springrain.nybusiness.waste.entity.TsWasteWaterMsg;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 10:25:09
 * @see org.springrain.nybusiness.environment.web.TsEnvironmentElement
 */
@Controller
@RequestMapping(value="/tsenvironmentelement")
public class TsEnvironmentElementController  extends BaseController {
	@Resource
	private ITsEnvironmentElementService tsEnvironmentElementService;
	@Resource
	private ITsCompanyInfoService tsCompanyInfoService;
	private String listurl="/nybusiness/environment/tsenvironmentelement/tsenvironmentelementList";
	
	
	   
	/**
	 * 列表数据,调用listjson方法,保证和app端数据统一
	 * 
	 * @param request
	 * @param model
	 * @param tsEnvironmentElement
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public String list(HttpServletRequest request, Model model,TsEnvironmentElement tsEnvironmentElement) 
			throws Exception {
		//.
		ReturnDatas returnObject = listjson(request, model, tsEnvironmentElement);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return listurl;
	}
	/**
	 * 详情
	 * 
	 * @param request
	 * @param model
	 * @param tsFacilityInfo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/detail")
	public String detail(Model model,HttpServletRequest request,HttpServletResponse response) 
			throws Exception {
		ReturnDatas returnObject = lookjson(model,request,response);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return "/nybusiness/environment/tsenvironmentelement/tsenvironmentelementCru2";
	}
	/**
	 * json数据,为APP提供数据
	 * 
	 * @param request
	 * @param model
	 * @param tsEnvironmentElement
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list/json")
	@ResponseBody   
	public  ReturnDatas listjson(HttpServletRequest request, Model model,TsEnvironmentElement tsEnvironmentElement) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		// ==构造分页请求
		Page page = newPage(request);
		// ==执行分页查询
		List<String> listCompany = tsCompanyInfoService.finderCompanyIdByUserId(SessionUser.getUserId());
		List<TsEnvironmentElement> datas=tsEnvironmentElementService.finderTsEnvironmentElementForList(page, tsEnvironmentElement, listCompany);
			returnObject.setQueryBean(tsEnvironmentElement);
		returnObject.setPage(page);
		returnObject.setData(datas);
		returnObject.setUserType(String.valueOf(SessionUser.getUserType()));
		return returnObject;
	}
	
	@RequestMapping("/list/export")
	public void listexport(HttpServletRequest request,HttpServletResponse response, Model model,TsEnvironmentElement tsEnvironmentElement) throws Exception{
		// ==构造分页请求
		Page page = newPage(request);
	
		File file = tsEnvironmentElementService.findDataExportExcel(null,listurl, page,TsEnvironmentElement.class,tsEnvironmentElement);
		String fileName="tsEnvironmentElement"+GlobalStatic.excelext;
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
		return "/nybusiness/environment/tsenvironmentelement/tsenvironmentelementLook";
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
		  TsEnvironmentElement tsEnvironmentElement = tsEnvironmentElementService.findTsEnvironmentElementById(id);
		   returnObject.setData(tsEnvironmentElement);
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
	public ReturnDatas saveorupdate(Model model,TsEnvironmentElement tsEnvironmentElement,HttpServletRequest request,HttpServletResponse response) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		returnObject.setMessage(MessageUtils.UPDATE_SUCCESS);
		try {
		
			java.lang.String id =tsEnvironmentElement.getId();
			if(StringUtils.isBlank(id)){
			  tsEnvironmentElement.setId(null);
			}
			if(StringUtils.isBlank(tsEnvironmentElement.getCreateUser())){
				tsEnvironmentElement.setCreateUser(SessionUser.getUserId());
			}
			if(StringUtils.isBlank(tsEnvironmentElement.getCreateName())){
				tsEnvironmentElement.setCreateName(SessionUser.getUserName());
			}
			if(StringUtils.isBlank(tsEnvironmentElement.getCreateTime())){
				tsEnvironmentElement.setCreateTime(DateUtils.convertDate2String("yyyy-MM-dd HH:mm:ss", new Date()));
			}
			java.lang.String companyId = SessionUser.getCompanyid(); 
			tsEnvironmentElement.setCompanyId(companyId);
			tsEnvironmentElementService.saveorupdate(tsEnvironmentElement);
			
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
		return "/nybusiness/environment/tsenvironmentelement/tsenvironmentelementCru";
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
				tsEnvironmentElementService.deleteById(id,TsEnvironmentElement.class);
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
			tsEnvironmentElementService.deleteByIds(ids,TsEnvironmentElement.class);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return new ReturnDatas(ReturnDatas.ERROR,MessageUtils.DELETE_ALL_FAIL);
		}
		return new ReturnDatas(ReturnDatas.SUCCESS,MessageUtils.DELETE_ALL_SUCCESS);
		
		
	}

}
