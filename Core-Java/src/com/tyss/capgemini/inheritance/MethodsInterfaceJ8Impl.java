package com.tyss.capgemini.inheritance;

public class MethodsInterfaceJ8Impl implements MethodsInterface {
	
	@Override
	public void displayMessage() {
		System.out.println("Overridden displayMessage() of MethodsInterface");
		
	}
	
	@Override
	public void printMessage() {
		System.out.println("Overridden printMessage() of MethodsInterface");
		
	}
	
	
	
	public static void main(String[] args) {
		
		MethodsInterface methodsInterface=new MethodsInterfaceJ8Impl();
		methodsInterface.defaultMessage();
		methodsInterface.displayMessage();
		methodsInterface.printMessage();
		MethodsInterface.showMessage();
	}

}
