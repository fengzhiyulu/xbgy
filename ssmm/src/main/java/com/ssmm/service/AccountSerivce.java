package com.ssmm.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.ssmm.model.Account;

public interface AccountSerivce{

	public Account getAccountByUsername(String username);
}
