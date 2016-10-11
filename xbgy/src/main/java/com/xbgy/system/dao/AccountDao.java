package com.xbgy.system.dao;

import java.io.Serializable;

import com.xbgy.core.dao.BaseDao;
import com.xbgy.system.model.Account;

public interface AccountDao extends BaseDao<Account, Serializable>{

	public Account getAccountByUsername(String username);	//根据用户名获取账户信息
	
	public Account getAccountWithRolesByUsername(String username);	//根据用户名获取账户信息
}
