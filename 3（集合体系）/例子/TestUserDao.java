package com.ambow.corejava.day3;

public class TestUserDao {

	public static void main(String[] args) {
		
		IUserDao dao = new UserDaoOracleImpl();
		
		User user = new User();
		
		dao.addUser(user);
	}
				
		
}
