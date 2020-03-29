package com.tyss.capgemini.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class ArrayListExample {
	public static void main(String[] args) {

		ArrayList al = new ArrayList();

		al.add(10);
		al.add("Chandler");
		al.add('C');
		al.add(123.67);
		al.add(null);
		al.add(10);

		System.out.println(al.indexOf('C'));
		System.out.println("***************For-each loop*****************");
		for (Object i : al) {
			System.out.println(i);
		}
		System.out.println("***************For loop*****************");
		for (int i = 0; i < al.size(); i++) {
			System.out.println(al.get(i));
		}
		System.out.println("***************Iterator*****************");
		Iterator<Object> it = al.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("***************List-Iterator*****************");
		ListIterator<Object> li = al.listIterator();
		for (int i = 0; i < al.size(); i++) {
			System.out.println(li.next());
			
			
			Collections.rotate(al, -(al.size()-1));
			
			System.out.println("****************************************");
			System.out.println(al);
		}
	}
}
