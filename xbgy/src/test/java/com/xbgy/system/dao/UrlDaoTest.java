package com.xbgy.system.dao;

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
public class UrlDaoTest{

	@Resource
	private UrlDao urlDao; 

	@Test
	public void getRoleByUrl() {
		Url roleByUrl = urlDao.getRoleByUrl("/admin/save.jsp");
		Assert.assertEquals(roleByUrl.getUrlId().toString(),"1");
	}
	
	@Test
	public void selectOne() {
		Url selectOne = urlDao.selectByPrimaryKey(1);
		Assert.assertNotNull(selectOne);
	}
	

}
