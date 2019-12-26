package school.xzit.bean;

public class Info {
	
	private String username;
	private String sex;
	private int age;
	private String permission;
	private String phone;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPermission() {
		return permission;
	}
	public void setPermission(String permission) {
		this.permission = permission;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Info(String username, String sex, int age, String permission, String phone) {
		super();
		this.username = username;
		this.sex = sex;
		this.age = age;
		this.permission = permission;
		this.phone = phone;
	}
	public Info() {
		super();
	}
	@Override
	public String toString() {
		return "Info [username=" + username + ", sex=" + sex + ", age=" + age + ", permission=" + permission
				+ ", phone=" + phone + "]";
	}
	
	

}
