package com.ssmm.service.impl;

import javax.annotation.Resource;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ssmm.dao.AccountMapper;
import com.ssmm.service.AccountSerivce;

@Service("accountService")
public class AccountSerivceImpl implements AccountSerivce{
	@Resource
	private AccountMapper accountMapper;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return accountMapper.getAccountByUsername(username);
	}

}
