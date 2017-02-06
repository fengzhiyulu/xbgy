package com.xbgy.system.dao;

import java.io.Serializable;
import java.util.Map;

import com.xbgy.core.dao.BaseDao;
import com.xbgy.system.model.Account;

public interface AccountDao extends BaseDao<Account, Serializable>{

	public Account getAccountByUsernameAndPassword(Map<String, Object> map);
	
	public Account getAccountByUsername(String username);	//�����û�����ȡ�˻���Ϣ
	
	public Account getAccountWithRolesByUsername(String username);	//�����û�����ȡ�˻���Ϣ
}
