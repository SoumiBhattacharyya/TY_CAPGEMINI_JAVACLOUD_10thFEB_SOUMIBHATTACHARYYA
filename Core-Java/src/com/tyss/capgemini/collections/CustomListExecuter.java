package com.tyss.capgemini.collections;

public class CustomListExecuter {
	public static void main(String[] args) {

		CustomList cs = new CustomList(4);
		cs.add("Chandler");
		cs.add("Monica");
		cs.add("Rachel");
		cs.add("Ross");
		cs.add("Phoebe");
		cs.add("Joey");
		cs.add("Central Perk");

		System.out.println("CustomList size : " + cs.size());

		for (int i = 0; i < cs.size(); i++) {
			System.out.println(cs.get(i));

		}
		System.out.println("**************************************");
		System.out.println("CustomList size : " + cs.size());
		
		
		System.out.println("**************************************");
		boolean isThere = cs.contains("Monica");
		System.out.println("CustomList.contains(Monica) : " + isThere);
		

		System.out.println("**************************************");
		System.out.println(cs.getIndex("Monica"));
	}

}
