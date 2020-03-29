package com.tyss.capgemini.collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListExample {
	public static void main(String[] args) {

		LinkedList llist = new LinkedList();

		llist.add(23);
		llist.add("rachel");
		llist.add(123);
		llist.add('C');
		llist.add(123.565757);
		llist.add(23);
		llist.add(null);

		System.out.println(llist.size());
		System.out.println("*******************************************");
		llist.addFirst(5);
		llist.addLast("hey!");
		
		System.out.println(llist.size());
		System.out.println("*******************************************");
		
		
		System.out.println("***************For-each****************");
		for (Object i : llist) {
			System.out.println(i);
		}
		System.out.println("***************For loop*****************");
		for (int i = 0; i < llist.size(); i++) {
			System.out.println(llist.get(i));
		}
		System.out.println("***************Iterator*****************");
		Iterator<Object> it = llist.iterator();
		
		
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("***************List-Iterator*****************");
		ListIterator<Object> li = llist.listIterator();
		for (int i = 0; i < llist.size(); i++) {
			System.out.println(li.next());
		}
		
		System.out.println("*******************************************");
		System.out.println(llist.peek());
		System.out.println("*******************************************");
		System.out.println(llist.peekFirst());
		System.out.println("*******************************************");
		System.out.println(llist.peekLast());
		


	}

}
