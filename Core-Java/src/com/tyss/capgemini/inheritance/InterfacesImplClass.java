package com.tyss.capgemini.inheritance;

public class InterfacesImplClass implements MethodsInterface, AnotherMethodsInterface { // we can implement more than
																						// one interfaces. i.e it
																						// supports multiple
																						// inheritance.

	@Override
	public void messgaeDisplay() {
		System.out.println("Overridden messageDisplay() interface");

	}

	@Override
	public void displayMessage() {
		System.out.println("Overridden displayMessage() interface");

	}

	@Override
	public void printMessage() {
		System.out.println("Overridden printMessage() interface");

	}
	
	

	public static void main(String[] args) { // we cannot create an object of an interface

		/*
		 * MethodsInterface methodsInterface = new InterfacesImplClass();
		 * methodsInterface.displayMessage(); methodsInterface.printMessage();
		 * AnotherMethodsInterface anotherMethodsInterface = new InterfacesImplClass();
		 * anotherMethodsInterface.messgaeDisplay();
		 */
		
		InterfacesImplClass implClass=new InterfacesImplClass(); // child class =child class 
		implClass.displayMessage();
		implClass.messgaeDisplay();
		implClass.printMessage();
		implClass.defaultMessage();
		MethodsInterface.showMessage();

	}
}

//when a concrete class implements an interface it has to implement its all unimplemented methods.