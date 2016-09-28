package com.xbgy.system.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.xbgy.core.dao.BaseDao;
import com.xbgy.system.model.Account;

public interface AccountSerivce extends BaseDao<Account>{

	public Account getAccountByUsername(String username);
}
