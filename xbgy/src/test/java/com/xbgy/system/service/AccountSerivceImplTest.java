package com.xbgy.system.service;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xbgy.system.model.Account;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-mybatis.xml" })
public class AccountSerivceImplTest{

	@Resource
	public AccountService accountService;
	
	@Test
	public void testLoadUserByUsername() {
//		UserDetails loadUserByUsername = super.loadUserByUsername("test01");
//		String username = loadUserByUsername.getUsername();
//		String password = loadUserByUsername.getPassword();
//		
//		assertEquals("test01", password);
	}
	
	@Test
	public void testRegister() throws Exception{
		Account account = new Account("adminTest","adminTest");
		accountService.register(account);
	}
	
	@Test
	public void testLogin() throws Exception{
		Account account = accountService.getAccountWithRolesByUsername("test01");
		System.out.println(account);
	}

}
