package school.xzit.service;

import java.util.List;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import school.xzit.bean.Info;
import school.xzit.bean.User;
import school.xzit.mapper.UserMapper;

@Service
public class UserServiceImpl implements IUserService{

	
	@Autowired
	private UserMapper userMapper;

	public User login(String username, String password, String permission) {
		
		
		
		User user = userMapper.selectByUsername(username);
		
		
		//2、user==null,抛出异常--用户不存在的异常
		if(user==null){
			throw new RuntimeException("此用户不存在");
		}else if(user.getUsername().equals(username) && user.getPassword().equals(password)&& !user.getPermission().equals(permission)){
			throw new RuntimeException("身份不匹配");
		}else if(user.getUsername().equals(username)&&user.getPassword().equals(password)&&user.getPermission().equals(permission)){
				return user;	
		}else{
			throw new RuntimeException("密码错误");
		}
		
		
		
		
	}

	public void registerUser(User user) {
		
		userMapper.registerUser(user);
		
	}

	public boolean isExist(String username) {
		
		User user = userMapper.selectByUsername(username);
		
		if(user==null){
			return false;//存在 true
		}else{
			return true; // 不存在 false
		}
	}

	public Info findAllByName(String username) {
		
		return userMapper.findAllByName(username);
	}

	@Override
	public Info showDriverInfo(String username) {
		// TODO Auto-generated method stub
		return userMapper.selectByDriverName(username);
	}

	public void updateDriver(Info info) {
		
		userMapper.updateDriver(info);
		
	}

	

	
	
	

}
