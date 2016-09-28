package com.ssmm.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.ssmm.model.Account;
import com.xbgy.core.dao.BaseDao;

public interface AccountSerivce extends BaseDao<Account>{

	public Account getAccountByUsername(String username);
}
