package com.tyss.capgemini.methods;

public class MethodExample2 {
	public void displayMessage() { // Method declaration
		System.out.println("Start of displayMessage()");
		System.out.println("Hello World");
		System.out.println("End of displayMessage");
		System.out.println("Returning to calling method...");
	}

	public static void main(String[] args) { 
		MethodExample2 methodExample2 = new MethodExample2();
		System.out.println("Called display message via object...");
		methodExample2.displayMessage();
		System.out.println("End of main method");

		
	}

}
/*
 * whenever we have a non-static method doesn't matter from where we are calling
 * it same class or different class we need to create an object for it the static
 * members gets loaded onto the memory area known as static pool only once as
 * soon as the class loads into the memory so we say static elements belongs to
 * class.
 * 
 * But in case of non-static objects they are loaded into the memory heap
 * area only when their objects are created else they are not at all loaded in
 * the memory , it happens as many times the obj creation takes place as in
 * multiple times. non-static elements belongs to objects.
 */