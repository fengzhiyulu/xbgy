package com.xbgy.system.service;

import com.xbgy.core.service.BaseService;
import com.xbgy.system.model.Account;

public interface AccountSerivce extends BaseService<Account>{

	public Account getAccountByUsername(String username);
	
	public Account getAccountWithRolesByUsername(String username);	//根据用户名获取账户信息
	
	public void register(Account account) throws Exception;
	
	public void changePassword(String username , String password ,String newPassword);			//TODO 可以做成FLOW
	
	public boolean isAccountExists(String username);
}
