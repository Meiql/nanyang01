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
import org.springrain.nybusiness.company.service.ITsCompanyInfoService;
import org.springrain.nybusiness.ergency.entity.TsDeclare;
import org.springrain.nybusiness.ergency.service.ITsDeclareService;
import org.springrain.nybusiness.waste.entity.TsWasteAirMsg;
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
 * @version  2018-11-20 11:16:28
 * @see org.springrain.nybusiness.company.web.TsDeclare
 */
@Controller
@RequestMapping(value="/tsdeclare")
public class TsDeclareController  extends BaseController {
	@Resource
	private ITsDeclareService tsDeclareService;
	@Resource
	private ITsCompanyInfoService tsCompanyInfoService;
	private String listurl="/nybusiness/ergency/tsdeclare/tsdeclareList";
	
	
	   
	/**
	 * 列表数据,调用listjson方法,保证和app端数据统一
	 * 
	 * @param request
	 * @param model
	 * @param tsDeclare
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public String list(HttpServletRequest request, Model model,TsDeclare tsDeclare) 
			throws Exception {
		ReturnDatas returnObject = listjson(request, model, tsDeclare);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return listurl;
	}
	
	/**
	 * json数据,为APP提供数据
	 * 
	 * @param request
	 * @param model
	 * @param tsDeclare
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list/json")
	@ResponseBody   
	public  ReturnDatas listjson(HttpServletRequest request, Model model,TsDeclare tsDeclare) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		// ==构造分页请求
		Page page = newPage(request);
		// ==执行分页查询
		List<String> listCompany = tsCompanyInfoService.finderCompanyIdByUserId(SessionUser.getUserId());
		List<TsDeclare> datas=tsDeclareService.finderTsDeclareForList(page, tsDeclare, listCompany);
			returnObject.setQueryBean(tsDeclare);
		returnObject.setPage(page);
		returnObject.setData(datas);
		return returnObject;
	}
	
	@RequestMapping("/list/export")
	public void listexport(HttpServletRequest request,HttpServletResponse response, Model model,TsDeclare tsDeclare) throws Exception{
		// ==构造分页请求
		Page page = newPage(request);
	
		File file = tsDeclareService.findDataExportExcel(null,listurl, page,TsDeclare.class,tsDeclare);
		String fileName="tsDeclare"+GlobalStatic.excelext;
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
		return "/nybusiness/ergency/tsdeclare/tsdeclareLook";
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
		  TsDeclare tsDeclare = tsDeclareService.findTsDeclareById(id);
		   returnObject.setData(tsDeclare);
		}else{
		returnObject.setStatus(ReturnDatas.ERROR);
		}
		return returnObject;
		
	}
	@RequestMapping(value = "/detail")
	public String detail(Model model,HttpServletRequest request,HttpServletResponse response)  throws Exception{
		ReturnDatas returnObject = lookjson(model, request, response);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return "/nybusiness/ergency/tsdeclare/tsdeclareCru2";
	}
	
	/**
	 * 新增/修改 操作吗,返回json格式数据
	 * 
	 */
	@RequestMapping("/update")
	@ResponseBody      
	public ReturnDatas saveorupdate(Model model,TsDeclare tsDeclare,HttpServletRequest request,HttpServletResponse response) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		returnObject.setMessage(MessageUtils.UPDATE_SUCCESS);
		try {
		
			java.lang.String id =tsDeclare.getId();
			if(StringUtils.isBlank(id)){
			  tsDeclare.setId(null);
			}
		
			if(StringUtils.isBlank(tsDeclare.getCreateUser())){
				tsDeclare.setCreateUser(SessionUser.getUserId());
			}
			if(StringUtils.isBlank(tsDeclare.getCreateTime())){
				tsDeclare.setCreateTime(DateUtils.convertDate2String("yyyy-MM-dd HH:mm:ss", new Date()));
			}
			java.lang.String companyId = SessionUser.getCompanyid(); 
			tsDeclare.setCompanyId(companyId);
			tsDeclareService.saveorupdate(tsDeclare);
			
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
		return "/nybusiness/ergency/tsdeclare/tsdeclareCru";
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
				tsDeclareService.deleteById(id,TsDeclare.class);
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
			tsDeclareService.deleteByIds(ids,TsDeclare.class);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return new ReturnDatas(ReturnDatas.ERROR,MessageUtils.DELETE_ALL_FAIL);
		}
		return new ReturnDatas(ReturnDatas.SUCCESS,MessageUtils.DELETE_ALL_SUCCESS);
		
		
	}

}
