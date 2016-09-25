package com.ssmm.dao;

import static org.junit.Assert.*;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssmm.model.Url;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-mybatis.xml" })
public class UrlMapperTest{

	@Resource
	private UrlMapper urlMapper; 

	@Test
	public void getRoleByUrl() {
		// TODO Auto-generated method stub
		Url roleByUrl = urlMapper.getRoleByUrl("/admin/save.jsp");
		System.out.println(roleByUrl);
	}

}
