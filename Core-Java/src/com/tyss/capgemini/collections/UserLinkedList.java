package com.tyss.capgemini.collections;

import java.util.LinkedList;

import com.tyss.capgemini.encapsulation.User;

public class UserLinkedList {
	public static void main(String[] args) {
		
		LinkedList<User> linkedList=new LinkedList<User>();
		
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

		
		linkedList.add(user1);
		linkedList.add(user2);
		System.out.println("******************************************************************");
		
		linkedList.addFirst(user4);
		linkedList.addLast(user3);
		System.out.println("*********************************************************************");
		
		for(User user:linkedList) {
			System.out.println(user);
		}
		
		System.out.println("******************************************************************");
		
		System.out.println(linkedList.poll());
		System.out.println("******************************************************************");
		
		System.out.println(linkedList.peek());
		System.out.println("******************************************************************");
		
		
		
	}
}
