package school.xzit.mapper;

import java.util.List;

import school.xzit.bean.Info;
import school.xzit.bean.User;

public interface UserMapper {
	
	
	User selectByUsername(String username);

	void registerUser(User user);

	Info findAllByName(String username);
	
	Info selectByDriverName(String username);

	void updateDriver(Info info);
	

}
