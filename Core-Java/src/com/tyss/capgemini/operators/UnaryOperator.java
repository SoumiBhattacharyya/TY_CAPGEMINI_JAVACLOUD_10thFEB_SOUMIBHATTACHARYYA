package com.tyss.capgemini.operators;

public class UnaryOperator {
	public static void main(String[] args) {
		
		  int i=10;
		  int j=10;
		  boolean isTrue=true;
		  
		 
		  System.out.println(-i);
		  System.out.println(!isTrue);
		  
		  
		  System.out.println("Value of i with pre-increment :" + ++i);    //pre-increment operator
		  System.out.println("Value of i :"+ i);
		  
		  System.out.println("Value of j with post-increment :" + j++);    //post-increment operator
		  System.out.println("Value of j : "+ j);
		  
		  System.out.println("Value of i with pre-decrement :"+ --i);    //pre-decrement operator
		  System.out.println("Value of i :"+i);
		  
		  System.out.println("Value of i with pre-decrement :" + j--);    //post-decrement operator
		  System.out.println("Value of j :"+j);
		
		  
	}

}
