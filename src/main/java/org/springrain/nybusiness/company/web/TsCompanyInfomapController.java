package  org.springrain.nybusiness.company.web;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springrain.frame.controller.BaseController;
import org.springrain.frame.util.GlobalStatic;
import org.springrain.frame.util.Page;
import org.springrain.frame.util.ReturnDatas;
import org.springrain.nybusiness.company.entity.TsCompanyInfo;
import org.springrain.nybusiness.company.service.ITsCompanyInfoService;


/**
 * TODO 在此加入类描述
 * @copyright {@link weicms.net}
 * @author springrain<Auto generate>
 * @version  2018-10-27 09:30:04
 * @see org.springrain.nybusiness.eme.web.TsEmePlanFiling
 */
@Controller
@RequestMapping(value="/tscompanyinfomap")
public class TsCompanyInfomapController  extends BaseController {
	@Resource
	private ITsCompanyInfoService tsCompanyInfoService;
	
	private String listurl="/nybusiness/tscompanyinfo/tscompanyinfomap";
	
	
	   
	/**
	 * 列表数据,调用listjson方法,保证和app端数据统一
	 * 
	 * @param request
	 * @param model
	 * @param tsEmePlanFiling
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
	 * @param tsEmePlanFiling
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
	
}
