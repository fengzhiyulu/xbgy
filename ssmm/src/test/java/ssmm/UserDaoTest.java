package ssmm;

import static org.junit.Assert.fail;

import javax.annotation.Resource;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.ssmm.dao.UserMapper;
import com.ssmm.model.User;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring.xml","classpath:spring-mybatis.xml"})
public class UserDaoTest{
	@Resource
	private UserMapper userMapper;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
//		fail("Not yet implemented");
		User selectByPrimaryKey = userMapper.selectByPrimaryKey(12);
		Assert.assertNotNull(selectByPrimaryKey);
	}

}
