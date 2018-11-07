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
import org.springrain.frame.controller.BaseController;
import org.springrain.frame.util.GlobalStatic;
import org.springrain.frame.util.MessageUtils;
import org.springrain.frame.util.Page;
import org.springrain.frame.util.ReturnDatas;
import org.springrain.nybusiness.msg.entity.TsMsgChemicalSubstances;
import org.springrain.nybusiness.msg.service.ITsMsgChemicalSubstancesService;


/**
 * TODO 化学物质处理
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:44:12
 * @see org.springrain.nybusiness.msg.web.TsMsgChemicalSubstances
 */
@Controller
@RequestMapping(value="/tsmsgchemicalsubstances")
public class TsMsgChemicalSubstancesController  extends BaseController {
	@Resource
	private ITsMsgChemicalSubstancesService tsMsgChemicalSubstancesService;
	
	private String listurl="/nybusiness/msg/tsmsgchemicalsubstances/tsmsgchemicalsubstancesList";
	
	
	   
	/**
	 * 列表数据,调用listjson方法,保证和app端数据统一
	 * 
	 * @param request
	 * @param model
	 * @param tsMsgChemicalSubstances
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public String list(HttpServletRequest request, Model model,TsMsgChemicalSubstances tsMsgChemicalSubstances) 
			throws Exception {
		ReturnDatas returnObject = listjson(request, model, tsMsgChemicalSubstances);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return listurl;
	}
	
	/**
	 * json数据,为APP提供数据
	 * 
	 * @param request
	 * @param model
	 * @param tsMsgChemicalSubstances
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list/json")
	@ResponseBody   
	public  ReturnDatas listjson(HttpServletRequest request, Model model,TsMsgChemicalSubstances tsMsgChemicalSubstances) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		// ==构造分页请求
		Page page = newPage(request);
		// ==执行分页查询
		List<TsMsgChemicalSubstances> datas=tsMsgChemicalSubstancesService.findListDataByFinder(null,page,TsMsgChemicalSubstances.class,tsMsgChemicalSubstances);
			returnObject.setQueryBean(tsMsgChemicalSubstances);
		returnObject.setPage(page);
		returnObject.setData(datas);
		return returnObject;
	}
	
	@RequestMapping("/list/export")
	public void listexport(HttpServletRequest request,HttpServletResponse response, Model model,TsMsgChemicalSubstances tsMsgChemicalSubstances) throws Exception{
		// ==构造分页请求
		Page page = newPage(request);
	
		File file = tsMsgChemicalSubstancesService.findDataExportExcel(null,listurl, page,TsMsgChemicalSubstances.class,tsMsgChemicalSubstances);
		String fileName="tsMsgChemicalSubstances"+GlobalStatic.excelext;
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
		return "/nybusiness/msg/tsmsgchemicalsubstances/tsmsgchemicalsubstancesLook";
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
		  TsMsgChemicalSubstances tsMsgChemicalSubstances = tsMsgChemicalSubstancesService.findTsMsgChemicalSubstancesById(id);
		   returnObject.setData(tsMsgChemicalSubstances);
		}else{
		returnObject.setStatus(ReturnDatas.ERROR);
		}
		return returnObject;
		
	}
	
	
	/**
	 * 新增/修改 操作吗,返回json格式数据
	 * 
	 */
	@RequestMapping(value = "/update")
	@ResponseBody      
	public ReturnDatas saveorupdate(Model model,TsMsgChemicalSubstances tsMsgChemicalSubstances,HttpServletRequest request,HttpServletResponse response) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		returnObject.setMessage(MessageUtils.UPDATE_SUCCESS);
		Date date = new Date();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String formatStr =formatter.format(date);
		System.out.println(formatStr);
		tsMsgChemicalSubstances.setCreateTime(formatStr);
		tsMsgChemicalSubstances.setCreateUser("gdy");
		try {
		
			java.lang.String id =tsMsgChemicalSubstances.getId();
			if(StringUtils.isBlank(id)){
			  tsMsgChemicalSubstances.setId(null);
			}
		
			tsMsgChemicalSubstancesService.saveorupdate(tsMsgChemicalSubstances);
			
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
		return "/nybusiness/msg/tsmsgchemicalsubstances/tsmsgchemicalsubstancesCru";
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
				tsMsgChemicalSubstancesService.deleteById(id,TsMsgChemicalSubstances.class);
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
			tsMsgChemicalSubstancesService.deleteByIds(ids,TsMsgChemicalSubstances.class);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return new ReturnDatas(ReturnDatas.ERROR,MessageUtils.DELETE_ALL_FAIL);
		}
		return new ReturnDatas(ReturnDatas.SUCCESS,MessageUtils.DELETE_ALL_SUCCESS);
		
		
	}

}
