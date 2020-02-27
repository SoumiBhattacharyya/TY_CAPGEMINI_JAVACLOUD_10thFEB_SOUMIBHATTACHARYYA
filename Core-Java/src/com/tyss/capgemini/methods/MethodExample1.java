package com.tyss.capgemini.methods;

public class MethodExample1 { // called method
	
	public static void displayMessage() { // after each and every methods we have parenthesis, they have a name, and
		System.out.println("Execution comes to displayMessage"); // they should have a return type.
		System.out.println("Hello World");
		System.out.println("End of displayMessage method"); // void methods does not return anything
		// public determines that this can be accessed from anywhere
	}
 public void hi() {
	 System.out.println("hiiii");
 }

	// calling method
	public static void main(String[] args) {
		System.out.println("displayMessage method is called");
		displayMessage();
MethodExample1 me=new MethodExample1();
		
		
		
		me.hi();
		System.out.println("End of main method");

	}
	

	/*
	 * for block commenting press ctrl+shift+/ for single line commenting press
	 * ctrl+/ public static void name() { public static void name1() {
	 * 
	 * } }
	 */

}

// we'll only be able to create a method within the scope of a class/interface
//we can call a method from a method but creating a method within the method is not possible.

//return statement is used to return the execution flow back to the calling method.