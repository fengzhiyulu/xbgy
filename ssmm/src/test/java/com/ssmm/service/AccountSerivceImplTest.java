package com.ssmm.service;

import static org.junit.Assert.*;

import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssmm.service.impl.AccountSerivceImpl;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-mybatis.xml" })
public class AccountSerivceImplTest extends AccountSerivceImpl{

	@Test
	public void testLoadUserByUsername() {
//		UserDetails loadUserByUsername = super.loadUserByUsername("test01");
//		String username = loadUserByUsername.getUsername();
//		String password = loadUserByUsername.getPassword();
//		
//		assertEquals("test01", password);
	}

}
