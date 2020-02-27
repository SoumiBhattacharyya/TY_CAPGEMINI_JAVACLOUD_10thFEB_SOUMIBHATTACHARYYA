package com.tyss.capgemini.inheritance;

@FunctionalInterface
public interface FunctionalInterfaceExample {
	
	public void showMessage() ;
	/*
	 * public void displayMessage();
	 *  public void printMessage();
	 */ 
	
	public static void printMessage() {
		System.out.println("public static printMessage() of FunctionalInterfaceExample");
	}
	
	default void displayMessage() {
		System.out.println("default displayMessage() of FunctionalInterfaceExample ");
	}
	
}
