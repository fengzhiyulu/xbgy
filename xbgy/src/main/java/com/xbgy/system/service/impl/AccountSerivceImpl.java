package com.xbgy.system.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.xbgy.core.service.BaseServiceImpl;
import com.xbgy.system.dao.AccountDao;
import com.xbgy.system.model.Account;
import com.xbgy.system.service.AccountSerivce;

@Service("accountService")
public class AccountSerivceImpl extends BaseServiceImpl<Account> implements AccountSerivce{
	@Resource
	private AccountDao accountDao;

	@Override
	public Account getAccountByUsername(String username) {
		return accountDao.getAccountByUsername(username);
	}

	@Override
	public Account getAccountWithRolesByUsername(String username) {
		// TODO Auto-generated method stub
		return accountDao.getAccountWithRolesByUsername(username);
	}
	
	

}
