package  org.springrain.nybusiness.front.controller;

import java.util.ArrayList;
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
import org.springrain.frame.util.Page;
import org.springrain.frame.util.ReturnDatas;
import org.springrain.nybusiness.company.entity.TsCompanyInfo;
import org.springrain.nybusiness.ergency.entity.TsErgencyInvestigation;
import org.springrain.nybusiness.tsInfoDetail.entity.TsInfoPortal;
import org.springrain.nybusiness.tsInfoDetail.service.ITsInfoPortalService;
import org.springrain.nybusiness.tsInfoDetail.entity.TsInfoDetails;
import org.springrain.nybusiness.tsInfoDetail.service.ITsInfoDetailsService;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-11-04 21:31:43
 * @see org.springrain.nybusiness.company.web.TsCompanyInfo
 */
@Controller
@RequestMapping(value="/front")
public class FrontInfoController  extends BaseController {
	@Resource
	private ITsInfoPortalService tsInfoPortalService;
	@Resource
	private ITsInfoDetailsService tsInfoDetailsService;
	private String listurl="/nybusiness/front/index";
	
	
	   
	/**
	 * 列表数据,调用listjson方法,保证和app端数据统一
	 * 
	 * @param request
	 * @param model
	 * @param tsCompanyInfo
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/index")
	public String index(HttpServletRequest request, Model model,TsCompanyInfo tsCompanyInfo) 
			throws Exception {
		return listurl;
	}
	@RequestMapping("/list")
	public String list(HttpServletRequest request, Model model,TsInfoPortal tsInfoPortal,String typeId) 
			throws Exception {
//		ReturnDatas returnObject = listjson(request, model, tsInfoPortal);
//		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		
		return "/nybusiness/front/list";
	}
	
	/**
	 * meiql 根据类型查询list
	 * 
	 * @param request
	 * @param model
	 * @param TsInfoPortal
	 * @return
	 * @throws Exception
	 */
	@RequestMapping("/list/json")
	@ResponseBody   
	public  ReturnDatas listjson(HttpServletRequest request, Model model,TsInfoPortal tsInfoPortal,String typeId) throws Exception{
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		//String typeId = "1";
		List<TsInfoPortal> datas=tsInfoPortalService.finderListForList(typeId);
		returnObject.setData(datas);
		return returnObject;
	}
	
	
	@RequestMapping("/newdetail")
	public String newdetail(Model model,HttpServletRequest request,HttpServletResponse response,String detailsId) 
			throws Exception {
		System.out.println(detailsId);
		ReturnDatas returnObject = lookjson(model, request, response,detailsId);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);
		return "/nybusiness/front/new";
	}
	
	/**
	 * 查看的Json格式数据,为APP端提供数据
	 */
	@RequestMapping(value = "/look/json")
	@ResponseBody      
	public ReturnDatas lookjson(Model model,HttpServletRequest request,HttpServletResponse response,String detailsId) throws Exception {
		ReturnDatas returnObject = ReturnDatas.getSuccessReturnDatas();
		//java.lang.String protalId= detailsId;
		//java.lang.String protalId=request.getParameter("detailsId");
		if(StringUtils.isNotBlank(detailsId)){
			List<TsInfoDetails> datas= tsInfoDetailsService.findTsInfoDetailByProtalId(detailsId);
			System.out.println(datas);
			//TsInfoDetails tsInfoDetails = datas[0];
		   returnObject.setData(datas);
		}else{
		returnObject.setStatus(ReturnDatas.ERROR);
		}
		return returnObject;
		
	}
	
	
	
}
