package com.xbgy.system.dao;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import com.xbgy.core.dao.BaseDaoImpl;
import com.xbgy.system.model.Account;

@Repository("accountDao")
public class AccountDaoImpl extends BaseDaoImpl<Account, Serializable> implements AccountDao{

	public AccountDaoImpl() {
		// TODO Auto-generated constructor stub
		System.out.println("***********************");
	}
	
	@Override
	public Account getAccountByUsername(String username) {
		return getSqlSession().getMapper(AccountDao.class)
					.getAccountByUsername(username);
	}

}
