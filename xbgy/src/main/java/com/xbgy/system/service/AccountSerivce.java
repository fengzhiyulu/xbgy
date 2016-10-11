package com.xbgy.system.service;

import com.xbgy.core.service.BaseService;
import com.xbgy.system.model.Account;

public interface AccountSerivce extends BaseService<Account>{

	public Account getAccountByUsername(String username);
	
	public Account getAccountWithRolesByUsername(String username);	//根据用户名获取账户信息
}
