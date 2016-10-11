package com.xbgy.system.service;

import com.xbgy.core.service.BaseService;
import com.xbgy.system.model.Account;

public interface AccountSerivce extends BaseService<Account>{

	public Account getAccountByUsername(String username);
	
	public Account getAccountWithRolesByUsername(String username);	//�����û�����ȡ�˻���Ϣ
	
	public void register(Account account) throws Exception;
	
	public void changePassword(String username , String password ,String newPassword);			//TODO ��������FLOW
	
	public boolean isAccountExists(String username);
}
