package com.tyss.capgemini.methods;

public class MethodOverridingClass extends Methods {

	@Override
	public String printMessage() {
		return "non-static MethodOverridingClass.printMessage() ";
	}

//	@Override //static methods cannot be overridden
	public static String displayMessage() {
		return "static MethodOverridingClass.displayMessage()";
	}

	@Override
	int addingTwoIntegers(int i, int j) {
		return super.addingTwoIntegers(i, j);
	}

	@Override
	protected String welcomeMessage() {
		return "welcomeMessade() overridden ";
	}

	public static void main(String[] args) {
		MethodOverridingClass methodOverridingClass = new MethodOverridingClass();
		System.out.println(methodOverridingClass.printMessage()); // created an object and used it cause it's used
																	// only once.
		System.out.println(Methods.displayMessage());
		System.out.println(displayMessage());
		System.out.println(methodOverridingClass.addingTwoIntegers(12, 13));
		System.out.println(methodOverridingClass.welcomeMessage());

	}

}
