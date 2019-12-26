package school.xzit.bean;

public class User {
	private String username;
	private String password;
	private String permission;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getPermission() {
		return permission;
	}
	public void setPermission(String permission) {
		this.permission = permission;
	}
	public User(String username, String password, String permission) {
		super();
		this.username = username;
		this.password = password;
		this.permission = permission;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", permission=" + permission + "]";
	}
	
	
	
	

}
