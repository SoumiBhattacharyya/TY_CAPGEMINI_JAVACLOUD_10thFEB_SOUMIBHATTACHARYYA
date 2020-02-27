package com.tyss.capgemini.collections;

import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class VectorListExample {
	public static void main(String[] args) {
		
	Vector v=new Vector();
	
	v.add("Ross");
	v.add(123);
	v.add(123.4534);
	v.add('M');
	v.add(0, 45);
	v.add(null);
	v.add(123);
	
	System.out.println("*********************For each **********************");
	for(Object i:v) {
		System.out.println(i);
	}
	System.out.println("*********************For loop **********************");

	for(int i=0;i<v.size();i++) {
		System.out.println(v.get(i));
	}
	System.out.println("*********************Iterator **********************");

	Iterator it=v.iterator();
	while(it.hasNext()) {
		System.out.println(it.next());
	}
	System.out.println("*********************List iterator **********************");

	ListIterator lit=v.listIterator();
	while(lit.hasNext()) {
		System.out.println(lit.next());
		}
	}

}
