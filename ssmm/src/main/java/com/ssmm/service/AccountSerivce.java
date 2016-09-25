package com.ssmm.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.ssmm.core.dao.BaseDao;
import com.ssmm.model.Account;

public interface AccountSerivce extends BaseDao<Account>{

	public Account getAccountByUsername(String username);
}
