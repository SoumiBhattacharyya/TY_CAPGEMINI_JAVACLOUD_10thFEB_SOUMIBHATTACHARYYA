package com.tyss.capgemini.methods;

public class Methods {
	public static String displayMessage() {
		return "Static displayMessage()";

	}

	public String printMessage() {
		return "non-static printMessage()";
	}

	int addingTwoIntegers(int i, int j) { // default access-specifier is package level
		return i + j;
	}

	protected String welcomeMessage() {
		return "Hello World";
	}

	private String messageDisplay() { // private cannot be overridden
		return "private messageDisplay()";
	}
}
