package com.xbgy.system.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/user")
public class AccountController{

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(String username , String password ,Model model){
		return "user/login";
	}
	
	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(Model model){
		return "user/logout";
	}
}
