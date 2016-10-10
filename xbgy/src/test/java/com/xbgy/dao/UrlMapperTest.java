package com.xbgy.dao;

import javax.annotation.Resource;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.xbgy.system.dao.UrlDao;
import com.xbgy.system.model.Url;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml",
		"classpath:spring-mybatis.xml" })
public class UrlMapperTest{

	@Resource
	private UrlDao urlDao; 

	@Test
	public void getRoleByUrl() {
		// TODO Auto-generated method stub
		Url roleByUrl = urlDao.getRoleByUrl("/admin/save.jsp");
		System.out.println(roleByUrl);
	}
	
	@Test
	public void selectOne() {
		Url selectOne = urlDao.selectByPrimaryKey(1);
		Assert.assertNotNull(selectOne);
	}
	

}
