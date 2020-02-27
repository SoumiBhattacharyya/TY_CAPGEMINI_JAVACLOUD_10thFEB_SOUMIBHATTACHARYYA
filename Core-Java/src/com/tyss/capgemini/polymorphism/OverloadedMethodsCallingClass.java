package com.tyss.capgemini.polymorphism;

public class OverloadedMethodsCallingClass {
	public static void main(String[] args) {

		OverloadedMethodsClass overloadedMethodsClass = new OverloadedMethodsClass();

		System.out.println("add(int i+int j) :" + overloadedMethodsClass.add(5, 6)); 			//integer 
		System.out.println("add(int i+int j +int k) :" + overloadedMethodsClass.add(5, 6, 7));	//integer 
		System.out.println("add(int i+double j) :" + overloadedMethodsClass.add(5, 6.89));		//double
		System.out.println("add(double i+int j) :" + overloadedMethodsClass.add(5.7654, 6));	//double
	}

}

//line number 8, 9 are overloaded with each other. same for the next 2 .