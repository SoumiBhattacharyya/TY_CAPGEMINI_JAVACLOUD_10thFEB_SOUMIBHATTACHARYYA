package com.tyss.capgemini.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {
	public static void main(String[] args) {
		
		LinkedHashSet lh=new LinkedHashSet();
		lh.add(123);
		lh.add(34);
		lh.add("Monica");
		lh.add(56.90);
		lh.add('c');
		lh.add(34);
		lh.add(null);
		
		System.out.println("*******************for each*******************");
		for(Object i:lh) {
			System.out.println(i);
		}
		
		System.out.println("**********************Iterator****************************");
		
		Iterator it=lh.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("**************************************************");

		System.out.println(lh.isEmpty());
		
		
		
	}

}
