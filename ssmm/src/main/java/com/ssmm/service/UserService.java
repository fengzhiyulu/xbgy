package com.ssmm.service;

import com.ssmm.model.Account;
import com.xbgy.core.dao.BaseDao;

public interface UserService{
	public Account getUserById(int id);
	
	public void saveUser(Account user);
}
