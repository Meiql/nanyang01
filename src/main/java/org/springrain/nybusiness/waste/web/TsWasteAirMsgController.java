package  org.springrain.nybusiness.waste.web;

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
import org.springrain.frame.util.GlobalStatic;
import org.springrain.frame.util.MessageUtils;
import org.springrain.frame.util.Page;
import org.springrain.frame.util.ReturnDatas;
import org.springrain.nybusiness.company.service.ITsCompanyInfoService;
import org.springrain.nybusiness.waste.entity.TsWasteAirMsg;
import org.springrain.nybusiness.waste.service.ITsWasteAirMsgService;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:47:16
 * @see org.springrain.nybusiness.waste.web.TsWasteAirMsg
 */
@Controller
@RequestMapping(value="/tswasteairmsg")
public class TsWasteAirMsgController  extends BaseController {
	@Resource
	private ITsWasteAirMsgService tsWasteAirMsgService;
	@Resource
	private ITsCompanyInfoService tsCompanyInfoService;
	private String listurl="/nybusiness/waste/tswasteairmsg/tswasteairmsgList";
	
	
	   
	/**
	 * 列表数据,调用listjson方法,保证和app端数据统一
	 * 
	 * @param request
	 * @param model
	 * @param tsWasteAirMsg
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public String list(HttpServletRequest request, Model model,TsWasteAirMsg tsWasteAirMsg) 
			throws Exception {
		ReturnDatas returnObject = listjson(request, model, tsWasteAirMsg);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return listurl;
	}
	
	/**
	 * json数据,为APP提供数据
	 * 
	 * @param request
	 * @param model
	 * @param tsWasteAirMsg
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list/json")
	@ResponseBody   
	public  ReturnDatas listjson(HttpServletRequest request, Model model,TsWasteAirMsg tsWasteAirMsg) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		
		/*String companyid=SessionUser.getCompanyid();
		Finder finder;
		finder = Finder.getSelectFinder(TsWasteAirMsg.class);
		if (StringUtils.isBlank(companyid)) {
			finder=null;
		}else{
			finder.append("where companyId =:companyId").setParam("companyId", companyid);
		}*/
		// ==构造分页请求
		Page page = newPage(request);
		// ==执行分页查询
		//List<TsWasteAirMsg> datas=tsWasteAirMsgService.findListDataByFinder(finder,page,TsWasteAirMsg.class,tsWasteAirMsg);
			//returnObject.setQueryBean(tsWasteAirMsg);
			
			
			
			List<String> listCompany = tsCompanyInfoService.finderCompanyIdByUserId(SessionUser.getUserId());
			List<TsWasteAirMsg> datas=tsWasteAirMsgService.finderTsMaillistForList(page, tsWasteAirMsg, listCompany);
				returnObject.setQueryBean(tsWasteAirMsg);
			

			
		returnObject.setPage(page);
		returnObject.setData(datas);
		return returnObject;
	}
	
	@RequestMapping("/list/export")
	public void listexport(HttpServletRequest request,HttpServletResponse response, Model model,TsWasteAirMsg tsWasteAirMsg) throws Exception{
		// ==构造分页请求
		Page page = newPage(request);
	
		File file = tsWasteAirMsgService.findDataExportExcel(null,listurl, page,TsWasteAirMsg.class,tsWasteAirMsg);
		String fileName="tsWasteAirMsg"+GlobalStatic.excelext;
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
		return "/nybusiness/waste/tswasteairmsg/tswasteairmsgLook";
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
		  TsWasteAirMsg tsWasteAirMsg = tsWasteAirMsgService.findTsWasteAirMsgById(id);
		   returnObject.setData(tsWasteAirMsg);
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
	public ReturnDatas saveorupdate(Model model,TsWasteAirMsg tsWasteAirMsg,HttpServletRequest request,HttpServletResponse response) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		returnObject.setMessage(MessageUtils.UPDATE_SUCCESS);
		try {
		
			java.lang.String id =tsWasteAirMsg.getId();
			if(StringUtils.isBlank(id)){
			  tsWasteAirMsg.setId(null);
			}
			if(StringUtils.isBlank(tsWasteAirMsg.getCreateUser())){
				tsWasteAirMsg.setCreateUser(SessionUser.getUserId());
			}
			if(StringUtils.isBlank(tsWasteAirMsg.getCreateTime())){
				tsWasteAirMsg.setCreateTime(DateUtils.convertDate2String("yyyy-MM-dd HH:mm:ss", new Date()));
			}
			java.lang.String companyId = SessionUser.getCompanyid(); 
			tsWasteAirMsg.setCompanyId(companyId);
			tsWasteAirMsgService.saveorupdate(tsWasteAirMsg);
			
		} catch (Exception e) {
			logger.error(e.getMessage(),e);
			returnObject.setStatus(ReturnDatas.ERROR);
			returnObject.setMessage(MessageUtils.UPDATE_ERROR);
		}
		return returnObject;
	
	}
	
	/**
	 * 详情
	 * @param model
	 * @param request
	 * @param response
	 * @return
	 * @throws Exception
	 */
	@RequestMapping(value = "/detail")
	public String detail(Model model,HttpServletRequest request,HttpServletResponse response)  throws Exception{
		ReturnDatas returnObject = lookjson(model, request, response);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return "/nybusiness/waste/tswasteairmsg/tswasteairmsgCru2";
	}
	
	/**
	 * 进入修改页面,APP端可以调用 lookjson 获取json格式数据
	 */
	@RequestMapping(value = "/update/pre")
	public String updatepre(Model model,HttpServletRequest request,HttpServletResponse response)  throws Exception{
		ReturnDatas returnObject = lookjson(model, request, response);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return "/nybusiness/waste/tswasteairmsg/tswasteairmsgCru";
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
				tsWasteAirMsgService.deleteById(id,TsWasteAirMsg.class);
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
			tsWasteAirMsgService.deleteByIds(ids,TsWasteAirMsg.class);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return new ReturnDatas(ReturnDatas.ERROR,MessageUtils.DELETE_ALL_FAIL);
		}
		return new ReturnDatas(ReturnDatas.SUCCESS,MessageUtils.DELETE_ALL_SUCCESS);
		
		
	}

}
