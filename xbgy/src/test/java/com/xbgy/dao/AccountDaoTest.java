package com.xbgy.dao;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xbgy.system.dao.AccountDao;
import com.xbgy.system.model.Account;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-mybatis.xml" })
public class AccountDaoTest {

	@Resource(name = "accountDao")
	public AccountDao accountDao;
	
	@Test
	public void selectOne() {
		Account selectOne = accountDao.selectByPrimaryKey(1);
		assertNotNull(selectOne);
		
		System.out.println(selectOne.getUsername());
		System.out.println(selectOne.getPassword());
	}

}
