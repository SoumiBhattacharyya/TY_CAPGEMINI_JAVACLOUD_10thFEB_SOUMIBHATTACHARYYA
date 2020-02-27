package com.tyss.capgemini.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
	public static void main(String[] args) {
		
		HashSet h=new HashSet();
		h.add("Joey");
		h.add(12);
		h.add(90.87);
		h.add('S');
		h.add(12);
		h.add(null);
		
		System.out.println("*********************For each **********************");
		for(Object i:h) {
			System.out.println(i);
		}
		System.out.println("*********************Iterator **********************");
		Iterator<Object> it=h.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
