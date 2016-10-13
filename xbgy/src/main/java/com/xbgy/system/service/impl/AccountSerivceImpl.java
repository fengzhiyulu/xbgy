package com.xbgy.system.service.impl;

import javax.annotation.Resource;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.xbgy.core.service.BaseServiceImpl;
import com.xbgy.core.utils.CodingUtil;
import com.xbgy.system.dao.AccountDao;
import com.xbgy.system.model.Account;
import com.xbgy.system.service.AccountService;

@Service("accountService")
public class AccountSerivceImpl extends BaseServiceImpl<Account> implements AccountService{
	@Resource
	private AccountDao accountDao;

	@Override
	public Account getAccountByUsername(String username) {
		return accountDao.getAccountByUsername(username);
	}
	@Override
	public Account getAccountWithRolesByUsername(String username) {
		return accountDao.getAccountWithRolesByUsername(username);
	}
	@Override
	public void register(Account account) throws Exception {
		if(isAccountExists(account.getUsername())){
			throw new Exception("111");
		}
		
		account.setPassword(CodingUtil.encodingByMd5(account.getPassword()));	//MD5 ����
		accountDao.insert(account);
	}
	@Override
	public void changePassword(String username , String password ,String newPassword) {
	}
	@Override
	public boolean isAccountExists(String username) {
		return accountDao.getAccountByUsername(username) != null;
	}
}
