package  org.springrain.nybusiness.front.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springrain.frame.controller.BaseController;
import org.springrain.nybusiness.company.entity.TsCompanyInfo;



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
	public String list(HttpServletRequest request, Model model,TsCompanyInfo tsCompanyInfo) 
			throws Exception {
		return "/nybusiness/front/list";
	}
	@RequestMapping("/newdetail")
	public String newdetail(HttpServletRequest request, Model model,TsCompanyInfo tsCompanyInfo) 
			throws Exception {
		return "/nybusiness/front/new";
	}
	
}
