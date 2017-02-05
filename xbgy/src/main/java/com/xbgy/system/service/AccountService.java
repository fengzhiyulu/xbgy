package com.xbgy.system.service;

import javax.annotation.Resource;

import org.springframework.security.authentication.encoding.Md5PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;

import com.xbgy.core.service.BaseServiceImpl;
import com.xbgy.core.utils.CodingUtil;
import com.xbgy.system.dao.AccountDao;
import com.xbgy.system.model.Account;

@Service("accountService")
public class AccountService extends BaseService{
	@Resource
	private AccountDao accountDao;

	public Account getAccountByUsername(String username) {
		return accountDao.getAccountByUsername(username);
	}
	public Account getAccountWithRolesByUsername(String username) {
		return accountDao.getAccountWithRolesByUsername(username);
	}
	public void register(Account account) throws Exception {
		if(isAccountExists(account.getUsername())){
			throw new Exception("111");
		}
		
		account.setPassword(CodingUtil.encodingByMd5(account.getPassword()));	//MD5 º”√‹
		accountDao.insert(account);
	}
	public void changePassword(String username , String password ,String newPassword) {
	}
	public boolean isAccountExists(String username) {
		return accountDao.getAccountByUsername(username) != null;
	}
	public boolean login(Account account){
		account = accountDao.getAccountByUsernameAndPassword(account);
		return account != null;
	}
}
