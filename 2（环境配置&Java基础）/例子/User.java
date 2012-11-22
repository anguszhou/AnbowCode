package com.ambow.corejava.day2;
/**
 * 
 * @author allandou
 * @测试this关键字
 */
public class User {
	/* id一般不能自己设定*/
	private int id;
	/* 用户名*/
	private String name;
	
	/*密码*/
	private String password;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	public User() {
	}
	public User(int id, String name) {
		this.id = id;
		this.name = name;
		System.out.println("User.User()1111");
	}
	public User(int id, String name, String password) {
		this(id,name);
		this.password = password;
		
		System.out.println("User.User()2222");
	
	}
	public static void main(String[] args) {
		
		//User user = new User(1,"icexu","444");
		User user = new User();
		System.out.println(user.getName());
	}
	

}








