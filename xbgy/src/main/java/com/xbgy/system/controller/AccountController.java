package com.xbgy.system.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.xbgy.system.model.Account;
import com.xbgy.system.service.AccountService;

@Controller
@RequestMapping("/user")
public class AccountController{

	@Resource
	private AccountService accountService;
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(Account accout ,HttpSession session,Model model){
		String result = "";
		if(accountService.login(accout)){
			result = "redirect:/home/index";
			session.setAttribute("userInfo", accout);
		}else{
			result = "user/login";
			model.addAttribute("error", "’À∫≈√‹¬Î¥ÌŒÛ");
		}
		return result;
	}
	
	@RequestMapping(value = "/logout",method = RequestMethod.GET)
	public String logout(HttpSession session){
		String result = "redirect:/user/login";
		session.removeAttribute("userInfo");
		return result;
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(){
		return "user/login";
	}
}
