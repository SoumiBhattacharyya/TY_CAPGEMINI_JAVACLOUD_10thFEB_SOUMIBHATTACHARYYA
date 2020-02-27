package com.tyss.capgemini.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		
		TreeSet<Integer> ts=new TreeSet<>();
		
		ts.add(1);
		ts.add(4323);
		ts.add(123456);
		ts.add(1212);
		//ts.add(ts); //gives class cast exception	
		ts.add(1);
		//ts.add(null);
		
		
		for(Integer i:ts) {
			System.out.println(i);
		}
		
		System.out.println("*************************Iterator*******************");
		Iterator<Integer> it=ts.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}


//we can only use generic values in tree set.