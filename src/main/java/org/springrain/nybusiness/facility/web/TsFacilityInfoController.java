package  org.springrain.nybusiness.facility.web;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springrain.nybusiness.company.entity.TsCompanyInfo;
import org.springrain.nybusiness.facility.entity.TsFacilityInfo;
import org.springrain.nybusiness.facility.service.ITsFacilityInfoService;
import org.springrain.nybusiness.waste.entity.TsWasteAirMsg;
import org.springrain.system.entity.Role;
import org.springrain.system.entity.User;
import org.springrain.system.entity.UserRole;
import org.springrain.system.service.IUserRoleMenuService;
import org.springrain.system.service.IUserService;
import org.springrain.frame.common.SessionUser;
import org.springrain.frame.controller.BaseController;
import org.springrain.frame.util.DateUtils;
import org.springrain.frame.util.Finder;
import org.springrain.frame.util.GlobalStatic;
import org.springrain.frame.util.MessageUtils;
import org.springrain.frame.util.Page;
import org.springrain.frame.util.ReturnDatas;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-28 16:52:21
 * @see org.springrain.nybusiness.company.web.TsFacilityInfo
 */
@Controller
@RequestMapping(value="/tsfacilityinfo")
public class TsFacilityInfoController  extends BaseController {
	@Resource
	private ITsFacilityInfoService tsFacilityInfoService;
	private String listurl="/nybusiness/tsfacilityinfo/tsfacilityinfoList";
	
	
	   
	/**
	 * 列表数据,调用listjson方法,保证和app端数据统一
	 * 
	 * @param request
	 * @param model
	 * @param tsFacilityInfo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list")
	public String list(HttpServletRequest request, Model model,TsFacilityInfo tsFacilityInfo) 
			throws Exception {
		ReturnDatas returnObject = listjson(request, model, tsFacilityInfo);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return listurl;
	}
	
	/**
	 * json数据,为APP提供数据
	 * 
	 * @param request
	 * @param model
	 * @param tsFacilityInfo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list/json")
	@ResponseBody   
	public  ReturnDatas listjson(HttpServletRequest request, Model model,TsFacilityInfo tsFacilityInfo) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		String companyid=SessionUser.getUserId();
		Finder finder;
		finder = Finder.getSelectFinder(TsWasteAirMsg.class);
		if (StringUtils.isBlank(companyid)) {
			finder=null;
		}else{
			finder.append("where companyId =:companyId").setParam("companyId", companyid);
		}
		// ==构造分页请求
		Page page = newPage(request);
		// ==执行分页查询
		List<TsFacilityInfo> datas=tsFacilityInfoService.findListDataByFinder(null,page,TsFacilityInfo.class,tsFacilityInfo);
			returnObject.setQueryBean(tsFacilityInfo);
		returnObject.setPage(page);
		returnObject.setData(datas);
		return returnObject;
	}
	
	@RequestMapping("/list/export")
	public void listexport(HttpServletRequest request,HttpServletResponse response, Model model,TsFacilityInfo tsFacilityInfo) throws Exception{
		// ==构造分页请求
		Page page = newPage(request);
	
		File file = tsFacilityInfoService.findDataExportExcel(null,listurl, page,TsFacilityInfo.class,tsFacilityInfo);
		String fileName="tsFacilityInfo"+GlobalStatic.excelext;
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
		return "/nybusiness/tsfacilityinfo/tsfacilityinfoLook";
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
		  TsFacilityInfo tsFacilityInfo = tsFacilityInfoService.findTsFacilityInfoById(id);
		   returnObject.setData(tsFacilityInfo);
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
	public ReturnDatas saveorupdate(Model model,TsFacilityInfo tsFacilityInfo,HttpServletRequest request,HttpServletResponse response) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		returnObject.setMessage(MessageUtils.UPDATE_SUCCESS);
		try {
		
			java.lang.String id =tsFacilityInfo.getId();
			if(StringUtils.isBlank(id)){
			  tsFacilityInfo.setId(null);
			}
			if(StringUtils.isBlank(tsFacilityInfo.getCreateUser())){
				tsFacilityInfo.setCreateUser(SessionUser.getUserId());
			}
			if(StringUtils.isBlank(tsFacilityInfo.getCreateTime())){
				tsFacilityInfo.setCreateTime(DateUtils.convertDate2String("yyyy-MM-dd HH:mm:ss", new Date()));
			}
			java.lang.String companyId = SessionUser.getCompanyid(); 
			tsFacilityInfo.setCompanyId(companyId);
			tsFacilityInfoService.saveorupdate(tsFacilityInfo);
			
		} catch (Exception e) {
			e.printStackTrace();
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
		return "/nybusiness/tsfacilityinfo/tsfacilityinfoCru";
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
				tsFacilityInfoService.deleteById(id,TsFacilityInfo.class);
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
			tsFacilityInfoService.deleteByIds(ids,TsFacilityInfo.class);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
			return new ReturnDatas(ReturnDatas.ERROR,MessageUtils.DELETE_ALL_FAIL);
		}
		return new ReturnDatas(ReturnDatas.SUCCESS,MessageUtils.DELETE_ALL_SUCCESS);
		
		
	}
	
	@RequestMapping("/getinfo")
	@ResponseBody
	public ReturnDatas gethttp(HttpServletRequest request,HttpServletResponse response,Model model) throws Exception {
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		String companyid=request.getParameter("companyid");
				Finder finder;
				finder = Finder.getSelectFinder(TsFacilityInfo.class);
				finder.append("where companyId =:companyId").setParam("companyId", companyid);
				List<TsFacilityInfo> list=tsFacilityInfoService.queryForList(finder,TsFacilityInfo.class);
				if(list.size()==0){
					returnObject.setStatus(ReturnDatas.ERROR);
				}else{
				String str=httpTest(list);
				str=StringUtils.remove(str,"\"{data=");
				str=str.substring(0,str.lastIndexOf(','));
				str=StringUtils.remove(str,"[{");
				str=StringUtils.remove(str,"}]");
				/*
				str=str.replace("=", "\":\"");
				str=str.replace("{", "{\"");
				str=str.replace(",", "\",\"");
				str=str.replace("}\",\" {", "\"},{");
				str=str.replace("}]","\"}]");
				str=str.replaceAll(" ", "");
				JSONArray json=new JSONArray(str);
				System.out.println(json);*/
				returnObject.setStatus(ReturnDatas.SUCCESS);
				returnObject.setData(str);
				}
		return returnObject;
	}
	
	
	
	public String httpTest(List<TsFacilityInfo> list) throws ClientProtocolException, IOException {
		//"{\"dev_id_list\":\"503790188\",\"36272217\"}";
		String json = "{\"dev_id_list\":";
		if(list.size()==1){
			json+="\"";
			json+=list.get(0).getDeviceNumber();
			json+="\"}";
		}
		else if(list.size()>1){
			json+="\"";
			for(int i=0;i<list.size();i++){
				json+=list.get(i).getDeviceNumber();
				if(i!=list.size()-1){
					json+=",";
				}
			}
			json+="\"}";
		}
		HttpClient httpClient = new DefaultHttpClient();
		HttpPost post = new HttpPost("http://116.255.158.88:8082/bsa-admin-api/oneNet/queryData");
		StringEntity postingString = new StringEntity(json);// json传递
		post.setEntity(postingString);
		post.setHeader("Content-type", "application/json");
		HttpResponse response = httpClient.execute(post);
		String content = EntityUtils.toString(response.getEntity());
		System.out.println(content);
		return content;
	}
	}
