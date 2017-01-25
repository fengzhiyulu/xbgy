package com.xbgy.system.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xbgy.system.model.Account;

@Controller
@RequestMapping("/home")
public class UserController{

	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public String login(HttpSession session){
		Object attribute = session.getAttribute("userInfo");
		if(attribute == null){
			return "redirect:/user/login";
		}
		Account account = (Account)	attribute;
		return "home/index";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Model model){
		return "user/logout";
	}
}
