package com.xbgy.system.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController{
	/**
	 * 通用页面跳转方法
	 * @param floder
	 * @param page
	 * @param model
	 * @return
	 */
	@RequestMapping(value="/{floder}/{page}",method=RequestMethod.GET)
    public String printMessage1(@PathVariable String floder,@PathVariable String page,HttpSession session) {
		if(!"user".equals(floder)){
			Object attribute = session.getAttribute("userInfo");
			if(attribute == null){
				return "redirect:/user/login";
			}
		}
		return floder + "/" + page;
    }
}
