package com.tyss.capgemini.encapsulation;

public class UserTesterClass {

	private static User setUser(String username, String password, Integer userid) {
		return new User(username , password, userid);
	}

	public static void main(String[] args) {

		User user1 = new User("Mike", "qwerty", 101);
		User user2 = new User();

		user2.setUsername("Chandler");
		user2.setUserid(102);
		user2.setPassword("qwerty");

		System.out.println("Username : " + user1.getUsername());
		System.out.println("Userid : " + user1.getUserid());

		System.out.println(user2);

	}

}
