package com.xbgy.system.dao;

import java.io.Serializable;

import com.xbgy.core.dao.BaseDao;
import com.xbgy.system.model.Account;

public interface AccountDao extends BaseDao<Account, Serializable>{

	public Account getAccountByUsername(String username);	//�����û�����ȡ�˻���Ϣ
	
	public Account getAccountWithRolesByUsername(String username);	//�����û�����ȡ�˻���Ϣ
}
