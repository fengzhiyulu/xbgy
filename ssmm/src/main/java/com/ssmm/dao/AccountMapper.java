package com.ssmm.dao;

import com.ssmm.model.Account;

public interface AccountMapper {

	public Account getAccountByUsername(String username);	//根据用户名获取账户信息
}
