package com.tyss.capgemini.inheritance;

public interface MethodsInterface {
	public void displayMessage(); //public abstract method 
	public void printMessage();
	
	
	public static void showMessage() {
		System.out.println("public static showMessage() of Methods Interface");
	}
	
	default void defaultMessage() {
		System.out.println("default defaultMessage() of Methods Interface");
	}
}
