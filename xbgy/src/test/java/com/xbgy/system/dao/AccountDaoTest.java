package com.xbgy.system.dao;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xbgy.system.model.Account;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-mybatis.xml" })
public class AccountDaoTest{

	@Resource(name = "accountDao")
	public AccountDao accountDao;
	
	@Test
	public void selectOne() {
		Account account = accountDao.selectByPrimaryKey(1);
		Assert.assertEquals(account.getUsername(), "test01");
		Assert.assertEquals(account.getPassword(), "test01");
	}
	
	@Test
	public void insert(){
		Account acc = accountDao.getAccountByUsername("admin");
		if(acc != null){
			accountDao.delete(acc.getAccountId());
		}
		Account account = new Account();
		account.setUsername("admin");
		account.setPassword("amdin");
		account.setFullName("Grubby");
		accountDao.insert(account);
	}
	
	@Test
	public void delete(){
		Account acc = accountDao.getAccountByUsername("admin");
		if(acc != null){
			accountDao.delete(acc.getAccountId());
		}
	}

}
