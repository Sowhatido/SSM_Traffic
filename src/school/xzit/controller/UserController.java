package school.xzit.controller;


import java.util.List;

import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import school.xzit.bean.Info;
import school.xzit.bean.ResponseResult;
import school.xzit.bean.User;
import school.xzit.service.UserServiceImpl;

@Controller
@RequestMapping("/user")
public class UserController {
	
	

	@Autowired
	private UserServiceImpl userService;
	
	
	@RequestMapping("/a.do")
	
	public String showJsp(){
		return "a";
	}
	

	
	@RequestMapping("/showLogin.do")
	public String showLogin(){
		return "login";
	}
	
	@RequestMapping("/showDriver.do")
	public String showDriver(){
		return "driver";
	}
	
	@RequestMapping("/showUser.do")
	public String showUser(){
		return "user";
	}
	
	
	@RequestMapping("/showSuperAdmin.do")
	public String showSuperAdmin(){
		return "superadmin";
	}
	
	
	@RequestMapping("/showAdmin.do")
	public String showAdmin(){
		return "admin";
	}
	
	
	@RequestMapping("/showRegister.do")
	public String showRegister(){
		return "register";
	}
	
	
	
	
	@RequestMapping(value="/userLogin.do",produces = "application/json;charset=utf-8")
	@ResponseBody
	public ResponseResult<Void> login(String username,String password,String permission,HttpSession session){
		
		
		
		System.out.println(username+"11");
		System.out.println(password+"22");
		System.out.println(permission+"33");
		
		ResponseResult<Void> rr = new ResponseResult<Void>();
		try {
			//session.removeAttribute("user");
			//session.removeAttribute("username");
			User user = userService.login(username,password,permission);
			session.setAttribute("user", user);
			session.setAttribute("username", username);
			//System.out.println(username+"sad");
			
			int p;
			
			if (permission.equals("车主")) {
				p = 1;
			}else if(permission.equals("货主")){
				p = 2;
			}else if(permission.equals("业务员")){
				p = 3;
			}else if(permission.equals("管理员")){
				p = 4;
			}else {
				p = 0;
			}
			
			//System.out.println(permission);
			//System.out.println(p);
			
			rr.setState(p);
			rr.setMessage("登陆成功！");
			
		} catch (Exception e) {
			rr.setState(0);
			rr.setMessage(e.getMessage());
		}
		return rr;
	}
	
	
	@RequestMapping("/userRegister.do")
	@ResponseBody
	public ResponseResult<Void> registerUser(String username,String password,String permission,HttpSession session){
		
		ResponseResult<Void> rr = new ResponseResult<Void>();
		try {
			
			//判断此用户是否已经存在
			boolean result = userService.isExist(username);
			if(result){
				rr.setState(0);
				rr.setMessage("此用户已存在，不能注册！");
			}else{

				User user = new User();
				user.setUsername(username);
				user.setPassword(password);
				user.setPermission(permission);
				userService.registerUser(user);
					
				rr.setState(1);
				rr.setMessage("注册成功！");
			}
			
			
			
			
		} catch (Exception e) {
			rr.setState(2);
			rr.setMessage(e.getMessage());
		}
		return rr;
	}
		
	
	@RequestMapping("/listDriverInfo.do")
	public String findAll(HttpSession session ){
		
		String username = (String) session.getAttribute("username");
		Info infos = userService.findAllByName(username);
		System.out.println(infos);
		session.setAttribute("infos", infos);
		return "listgerenrenwu";
	}
	
	
	
	@RequestMapping("/DriverInfo.do")
	public String showDriverInfo(HttpSession session){
		String username = (String) session.getAttribute("username");
		
		Info info = userService.showDriverInfo(username);
		session.setAttribute("info", info);
		return "driverinfo";
	}
	
	
	@RequestMapping("UpdateDriverInfo.do")
	public String updateDrievr(Info info,HttpSession session){
		
		Info info2 = new Info();
		String username = info.getUsername();
		String permission = info.getPermission();
		int age = info.getAge();
		String sex = info.getSex();
		String phone =  info.getPhone();
		
		System.out.println(info+"haha");
		
		info2.setUsername(username);
		info2.setPermission(permission);
		info2.setPhone(phone);
		info2.setSex(sex);
		info2.setAge(age);
		
		
		
		userService.updateDriver(info);
		
		
		return "driverinfo";
	}
	
	

}
