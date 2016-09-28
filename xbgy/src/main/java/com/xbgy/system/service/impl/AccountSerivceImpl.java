package com.xbgy.system.service.impl;

import javax.annotation.Resource;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.xbgy.core.dao.BaseDaoImpl;
import com.xbgy.system.dao.AccountMapper;
import com.xbgy.system.model.Account;
import com.xbgy.system.service.AccountSerivce;

@Service("accountService")
public class AccountSerivceImpl extends BaseDaoImpl<Account> implements AccountSerivce{
	@Resource
	private AccountMapper accountMapper;

	@Override
	public Account getAccountByUsername(String username) {
		return accountMapper.getAccountByUsername(username);
	}
	
	

}
