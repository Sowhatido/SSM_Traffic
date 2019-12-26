package test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import school.xzit.bean.User;
import school.xzit.mapper.UserMapper;
import school.xzit.service.IUserService;




public class test {
	
	ApplicationContext ac = new ClassPathXmlApplicationContext("application-dao.xml","application-service.xml");
	IUserService us = ac.getBean("userServiceImpl", IUserService.class);
	UserMapper um = ac.getBean("userMapper", UserMapper.class);
	
	@Test
	public void testlogin(){
		User user = um.selectByUsername("张三");
		System.out.println(user);
		
		User user2 = us.login("张三", "123", "车主");
		System.out.println(user2);
	}
}
