package com.tyss.capgemini.inheritance;

public class FunctionalInterfaceLambdaExpressions {

	static String string = "Lambda Expression Example for FunctionalInterfaceExample";

	static FunctionalInterfaceExample functionalInterfaceExample = // global variables can be used anywhere in the scope
																	// of the class.
			() -> {
				System.out.println(string);
				System.out.println("Another line of impl..");
			};

	static FunctionalInterfaceExample2 functionalInterfaceExample2 = (i, j) -> i + j;

	public static void main(String[] args) {
		functionalInterfaceExample.displayMessage();
		functionalInterfaceExample.showMessage();

		FunctionalInterfaceExample.printMessage();

		System.out.println("**************************************************");

		functionalInterfaceExample2.messageDisplay();
		System.out.println(functionalInterfaceExample2.add(12, 13));

		FunctionalInterfaceExample2.print();
	}

}
