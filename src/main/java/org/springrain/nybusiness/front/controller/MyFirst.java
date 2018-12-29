package org.springrain.nybusiness.front.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springrain.frame.common.SessionUser;
import org.springrain.frame.util.GlobalStatic;
import org.springrain.frame.util.Page;
import org.springrain.frame.util.ReturnDatas;
import org.springrain.frame.controller.BaseController;

import org.springrain.nybusiness.company.service.ITsCompanyInfoService;
import org.springrain.nybusiness.ergency.entity.TsEmePlanFiling;
import org.springrain.nybusiness.ergency.service.ITsEmePlanFilAdjustmentService;
import org.springrain.nybusiness.ergency.service.ITsEmePlanFilingService;
import org.springrain.nybusiness.tsInfoDetail.entity.TsInfoDetails;

/**
 * 政府企业登陆后的默认页面
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value="/myfirst")
public class MyFirst extends BaseController {
	@Resource
	private ITsEmePlanFilingService tsEmePlanFilingService;
	@Resource
	private ITsEmePlanFilAdjustmentService tsEmePlanFilAdjustmentService;
	
	@Resource
	private ITsCompanyInfoService tsCompanyInfoService;
	private String listurl="/nybusiness/front/zf_first";
	
	@RequestMapping("/list")
	public String list(HttpServletRequest request, Model model,TsInfoDetails tsInfoDetails) 
			throws Exception {
		/*ReturnDatas returnObject = listjson(request, model, tsInfoDetails);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);*/
		return listurl;
	}
	
	
	@RequestMapping("/tsemeplanfilingList")
	public String list(HttpServletRequest request, Model model,TsEmePlanFiling tsEmePlanFiling,String type) 
			throws Exception {
		ReturnDatas returnObject = listjson(request, model, tsEmePlanFiling,type);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return "/nybusiness/ergency/tsemeplanfiling/tsemeplanfilingList";
	}
	
	/**
	 * json数据,为APP提供数据
	 * 
	 * @param request
	 * @param model
	 * @param tsEmePlanFiling
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list/json")
	@ResponseBody   
	public  ReturnDatas listjson(HttpServletRequest request, Model model,TsEmePlanFiling tsEmePlanFiling,String type) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		Page page = newPage(request);
		if(StringUtils.isBlank(type)){
		 type=request.getParameter("type");
		}
		Calendar  calendar = Calendar.getInstance(); 
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
		String today=df.format(new Date());
		calendar.setTime(df.parse(today));
		List<String> listCompany = tsCompanyInfoService.finderCompanyIdByUserId(SessionUser.getUserId());
		List<TsEmePlanFiling> datas=tsEmePlanFilingService.finderForList(tsEmePlanFiling, listCompany);
		List<TsEmePlanFiling> data=new ArrayList<TsEmePlanFiling>();
		if(StringUtils.isNoneBlank(type)){
				for(int i=0;i<datas.size();i++){
					if(StringUtils.isNoneBlank(datas.get(i).getApprTime())){
					Calendar  calendar2 = Calendar.getInstance(); 
					calendar2.setTime(df.parse(datas.get(i).getApprTime()));
					if(type.equals("预警")){
						calendar2.add(Calendar.YEAR,+3);
					 if(!calendar2.equals(calendar)&&!calendar.after(calendar2)){
						calendar2.add(Calendar.WEEK_OF_YEAR,-3);
					 if(calendar2.before(calendar)){
						 data.add(datas.get(i)); 
					 }
					}
				}else if(type.equals("报警")){
					calendar2.add(Calendar.YEAR,+3);
				 if(calendar2.equals(calendar)||calendar.after(calendar2)){
					 data.add(datas.get(i)); 
				 }
				}
			}
			}
		}
		page.setTotalCount(data.size());
		returnObject.setPage(page);
		returnObject.setData(data);
		return returnObject;
	}
}
