package com.tyss.capgemini.classesandobjects;

public class ClassExample {
	// Zero-argument constructor
	public ClassExample() {
		System.out.println("Zero Argument Constructor.");
	}

	public ClassExample(String string) {
		System.out.println("Constructor with one string argument.");
	}

	// Parameterized constructor ; constructor overloading
	public ClassExample(int i, String string) {
		System.out.println("Constructor with one integer and one string argument.");
	}

	// Parameterized constructor ; constructor overloading
	public ClassExample(String string, int i) {
		System.out.println("Constructor with one string and one integer argument.");
	}

	public static void main(String[] args) {
		ClassExample classExample1 = new ClassExample(); // Only and only when we do not create any contructors then
															// only the compiler will create a constructor of its own.
		ClassExample classExample2 = new ClassExample("Any String");
		ClassExample classExample3 = new ClassExample(5678, "Any String");
		ClassExample classExample4 = new ClassExample("Any String", 1234);
	}

}

/*
 * ClassExample classExample = new ClassExample();
 *
 * Right side ClassExample() is a constructor, each and every concrete class
 * will have a constructor, they can be user-defined but anyway in every class a
 * default constructor exists. Constructors don't have any return type , they
 * have the same name as class name.
 * 
 * Inside default constructor we have nothing. Default constructor creates an
 * object and remains as it is. but in default constructor we can write anything
 * . A class can have n number of constructors, but the input argument should be
 * different. Java compiler doesn't allow us to create more than one zero
 * argument constructor.
 * 
 * Whenever we have an input argument for a constructor , we call it as a
 * parameterized constructor.
 * 
 * No of parameters , order of parameters and type of parameters must be
 * different in the same class. Known as Constructor Overloading.
 */