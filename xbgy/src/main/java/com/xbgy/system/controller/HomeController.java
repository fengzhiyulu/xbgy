package com.xbgy.system.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/home")
public class HomeController{

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String excute(HttpSession session){
		Object attribute = session.getAttribute("userInfo");
		if(attribute == null){
			return "redirect:/user/login";
		}
		return "manager/index";
	}
}
