package com.tyss.capgemini.methods;

public class BasicArithmeticOperations {
	
	public BasicArithmeticOperations() {
		System.out.println("BasicArithmeticOperations()");
	}
	
	public BasicArithmeticOperations(String string) {
		System.out.println("BasicArithmeticOperations(String string) ");
	}

	/**
	 * This method returns the sum of two given integers
	 * 
	 * @param a
	 * @param b
	 * @return int a+ int b
	 */
	public static int add(int a, int b) { // method declaration(the whole line), int add(int a,int b) this is method
											// signature
		/*
		 * return will return the execution back to the calling method and once return
		 * is performed , we cannot use any return statement again. therefore, a method
		 * can have only one return statement.
		 * 
		 * int sum=a+b; return sum;
		 * 
		 */
		return a + b; // method (body/definition)
	}

	/**
	 * This method returns the subtraction of two given integers
	 * 
	 * @param a
	 * @param b
	 * @return int a-int b
	 */
	public static int sub(int a, int b) {
		return a - b;
	}

	/**
	 * This method returns the division of two given values
	 * 
	 * @param a
	 * @param b
	 * @return double a/double b
	 */

	public static double div(double a, double b) {
		return (a / b) * 1.0;
	}

	/**
	 * This method returns the multiplication value of two given integers
	 * 
	 * @param a
	 * @param b
	 * @return int a*int b
	 */

	public static int mul(int a, int b) {
		return a * b;
	}

	public static void main(String[] args) {
		/*
		 * int sum = add(12,15); System.out.println(sum);
		 */
		System.out.println("Sum : " + add(36, 23));
		System.out.println("Sub : " + sub(36, 23));
		System.out.println("Div : " + div(56, 12));
		System.out.println("Mul : " + mul(12, 9));
	}
}
