package com.ssmm.service;

import com.ssmm.model.Account;

public interface UserService {
	public Account getUserById(int id);
	
	public void saveUser(Account user);
}
