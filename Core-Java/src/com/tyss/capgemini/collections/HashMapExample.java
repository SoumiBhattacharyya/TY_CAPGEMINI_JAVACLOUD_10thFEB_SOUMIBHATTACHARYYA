package com.tyss.capgemini.collections;

import java.util.HashMap;

public class HashMapExample {
	public static void main(String[] args) {
		
		HashMap<String, Integer> hashMap=new HashMap<String, Integer>();
		
		System.out.println("Size of hashmap :"+ hashMap.size());
		System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
		
		hashMap.put("1st key", 1);
		hashMap.put("2nd key", 2);
		hashMap.put("3rd key", 3);
		
		System.out.println("Size of hashmap after put : " + hashMap.size());
		System.out.println("**********************************************");
		
		System.out.println(hashMap);
		System.out.println("***********************************************");
		
		System.out.println(hashMap.isEmpty());
		System.out.println("***********************************************");
		
		System.out.println(hashMap.remove("1st key"));
		System.out.println("***********************************************");
		
		System.out.println(hashMap);
		System.out.println("***********************************************");
		
		System.out.println(hashMap.size());
		System.out.println("***********************************************");
	}

}
