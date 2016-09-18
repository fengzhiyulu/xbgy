package com.ssmm.service;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.alibaba.fastjson.JSON;
import com.ssmm.model.Account;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-mybatis.xml" })
public class TestUserService {
	private static final Logger logger = Logger
			.getLogger(TestUserService.class);

	@Autowired
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@Test
	public void getUserById(){
//		閰嶇疆浜嗙紦瀛橈紝鐩稿悓鏌ヨ鍙細鎵ц涓�
		Account user = userService.getUserById(2);
		logger.info(JSON.toJSONString(user));
		Account user2 = userService.getUserById(2);
		logger.info(JSON.toJSONString(user2));
		Account user3 = userService.getUserById(2);
		logger.info(JSON.toJSONString(user3));
	}
	
	@Test
	public void saveUser(){
		Account user = new Account();
		user.setUsername("test05");
		user.setPassword("123456");
		
		userService.saveUser(user);
	}

}
