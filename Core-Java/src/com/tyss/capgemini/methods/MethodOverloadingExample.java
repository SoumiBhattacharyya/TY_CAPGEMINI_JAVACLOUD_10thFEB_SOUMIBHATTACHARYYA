package com.tyss.capgemini.methods;

public class MethodOverloadingExample {
	
	//overloaded method
	public static void displayMessage() {
		System.out.println("public static void displayMessage() ...");
	}
	//Overloaded Method
	public void displayMessage(String string) {
		System.out.println("public void displayMessage(String string)");
	}
	//Overloaded Method
	public void displayMessage(String string,int i) {
		System.out.println("public void displayMessage(String string,int i) {");
	}
	//Overloaded Method
	public void displayMessage(int i,String string) {
		System.out.println("public void displayMessage(String string,int i) {");
	}
	
	public static void main(String[] args) {
		MethodOverloadingExample methodOverloadingExample = new MethodOverloadingExample();
		MethodOverloadingExample.displayMessage();
		displayMessage();
		methodOverloadingExample.displayMessage("AnyString",123);
		methodOverloadingExample.displayMessage(123, "Hello");
		
		methodOverloadingExample.getClass();
		methodOverloadingExample.hashCode();
		
		
	}
}

/*
 * Method overloading can be done using both combination of static and
 * non-static method. If the method is in the same class we can call it directly
 * using the method name. Else if in different class , then we have to
 * instantiate a new object for it.
 * 
 * If the method is non-static , irrespective of the fact that whereever it is present , we need to create an object for it.
 * 
 * object class is the parent class of all the classes  or the supermost class in java and this relation we term it as inheritance in java.
 */