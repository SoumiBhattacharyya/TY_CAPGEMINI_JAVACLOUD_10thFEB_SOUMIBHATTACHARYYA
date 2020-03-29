package com.tyss.capgemini.collections;

import java.util.HashMap;

import com.tyss.capgemini.encapsulation.User;

public class UserHashMap {
	public static void main(String[] args) {

		HashMap<String, User> userHashMap = new HashMap<String, User>();
		User user1 = new User();
		User user2 = new User();
		User user3 = new User();
		User user4 = new User();

		user1.setUserid(101);
		user1.setUsername("Chandler");
		user1.setPassword("qwerty1");

		user2.setUserid(102);
		user2.setUsername("Monica");
		user2.setPassword("qwerty2");

		user3.setUserid(103);
		user3.setUsername("Ross");
		user3.setPassword("qwerty3");

		user4.setUserid(104);
		user4.setUsername("Rachel");
		user4.setPassword("qwerty4");

		userHashMap.put("1st user", user1);
		userHashMap.put("2nd user", user2);
		userHashMap.put("3rd user", user3);
		userHashMap.put("4th user", user4);

		// retrieval of users
		System.out.println(userHashMap);
		System.out.println("**********************************************************");

		// update of user data
		user4.setPassword("qwerty123");
		userHashMap.put("4th user", user4);
		System.out.println("**********************************************************");

		// retrieval of users after update
		System.out.println(userHashMap);
		System.out.println("**********************************************************");

		// deletion of user
		userHashMap.remove("3rd user");
		System.out.println(userHashMap);
		System.out.println("**********************************************************");

	}

}
