package com.tyss.capgemini.methods;

public class StaticMethodCallingClass {
	public static void main(String[] args) {

		// whenever a static method is present inside a class and it is to be called
		// from another class in java then we have to call it via its class name.
	
		System.out.println(BasicArithmeticOperations.sub(10, 8));
		System.out.println(BasicArithmeticOperations.add(13, 12));
		System.out.println(BasicArithmeticOperations.div(78, 23));
		System.out.println(BasicArithmeticOperations.mul(3, 6));
	}

}
