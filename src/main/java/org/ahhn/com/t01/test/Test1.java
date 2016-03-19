package org.ahhn.com.t01.test;

import org.ahhn.com.t01.domain.User;
import org.ahhn.com.t01.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by XJX on 2016/3/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)//使用Spring的测试框架
@ContextConfiguration("/beans.xml")//加载Spring配置文件beans.xml
public class Test1 {

	@Autowired
	private UserMapper userMapper;

	@Test
	public void springMyBatisTest() {
		User user = new User(-1, "Tom", new Date(), 10001);
		userMapper.save(user);
	}
}
