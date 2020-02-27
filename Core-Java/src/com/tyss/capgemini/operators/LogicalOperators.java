package com.tyss.capgemini.operators;

public class LogicalOperators {
	public static void main(String[] args) {

		int i = 10;
		int j = 20;
		int k = 30;

		//And logical operator
		System.out.println((i > j) && (j > k));
		System.out.println((i > j) && (j < k));
		System.out.println((i < j) && (j > k));
		System.out.println((i < j) && (j < k));

		System.out.println("*******************************************");
		
		//OR logical operator
		System.out.println((i > j) || (j > k));
		System.out.println((i > j) || (j < k));
		System.out.println((i < j) || (j > k));
		System.out.println((i < j) || (j < k));
		
		//Not Operator

	}

}
