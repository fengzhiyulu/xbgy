package com.xbgy.system.dao.impl;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import com.xbgy.core.dao.BaseDaoImpl;
import com.xbgy.system.dao.AccountDao;
import com.xbgy.system.model.Account;

@Repository("accountDao")
public class AccountDaoImpl extends BaseDaoImpl<Account, Serializable> implements AccountDao{

	@Override
	public Account getAccountByUsername(String username) {
		return getSqlSession().getMapper(AccountDao.class)
					.getAccountByUsername(username);
	}

	@Override
	public Account getAccountWithRolesByUsername(String username) {
		return getSqlSession().getMapper(AccountDao.class)
				.getAccountWithRolesByUsername(username);
	}

}
