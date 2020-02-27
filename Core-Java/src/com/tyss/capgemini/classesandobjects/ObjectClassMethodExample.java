package com.tyss.capgemini.classesandobjects;

import com.tyss.capgemini.methods.BasicArithmeticOperations;

public class ObjectClassMethodExample { //single level inheritance.
	public static void main(String[] args) {

		ObjectClassMethodExample objectClassMethodExample1 = new ObjectClassMethodExample();

		ObjectClassMethodExample objectClassMethodExample2 = new ObjectClassMethodExample();

		System.out.println(objectClassMethodExample1.getClass()); // gives the fully qualified path name of the class
		System.out.println(objectClassMethodExample1);
		System.out.println("With to-string :" + objectClassMethodExample1.toString());
		System.out.println(objectClassMethodExample2);
		System.out.println("With to-string :" + objectClassMethodExample2.toString());
		System.out.println(objectClassMethodExample1.hashCode());
		System.out.println(objectClassMethodExample2.hashCode());
		System.out.println(objectClassMethodExample1.equals(objectClassMethodExample2));

		BasicArithmeticOperations.add(9, 4);

	}
}

//return type of getclass is Object , but we will get a class representation of the object.
//java.lang package is by default imported in all the classes in java.
//System.out -> java.lang which calls the println from java.io package so we need not import the java.io method to print something.