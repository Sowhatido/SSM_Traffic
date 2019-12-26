package school.xzit.service;

import java.util.List;

import school.xzit.bean.Info;
import school.xzit.bean.User;

public interface IUserService {

	User login(String username,String password,String permission);
	
	void registerUser(User user);
	
	boolean isExist(String username);
	
	Info findAllByName(String username);
	
	Info showDriverInfo(String username);
	
}
