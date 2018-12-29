package org.springrain.nybusiness.front.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springrain.frame.util.GlobalStatic;
import org.springrain.frame.util.ReturnDatas;
import org.springrain.nybusiness.tsInfoDetail.entity.TsInfoDetails;

/**
 * 政府企业登陆后的默认页面
 * @author Administrator
 *
 */
@Controller
@RequestMapping(value="/myfirst")
public class MyFirst {
	private String listurl="/nybusiness/front/zf_first";
	
	@RequestMapping("/list")
	public String list(HttpServletRequest request, Model model,TsInfoDetails tsInfoDetails) 
			throws Exception {
		/*ReturnDatas returnObject = listjson(request, model, tsInfoDetails);
		model.addAttribute(GlobalStatic.returnDatas, returnObject);*/
		return listurl;
	}
}
