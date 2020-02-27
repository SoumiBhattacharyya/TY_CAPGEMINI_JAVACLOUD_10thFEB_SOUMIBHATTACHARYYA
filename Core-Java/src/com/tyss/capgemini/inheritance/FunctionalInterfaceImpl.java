package com.tyss.capgemini.inheritance;

public class FunctionalInterfaceImpl implements FunctionalInterfaceExample, FunctionalInterfaceExample2 {

	@Override
	public void showMessage() {
		System.out.println("Overridden showMessage() of FunctionalInterfaceExample");

	}

	@Override
	public int add(int i, int j) {
		return i + j;
	}

	public static void main(String[] args) {

		FunctionalInterfaceImpl functionalInterfaceImpl = new FunctionalInterfaceImpl();

		functionalInterfaceImpl.displayMessage(); // local variable cannot be used outside this main method / the method
													//it is defined in.	
		functionalInterfaceImpl.showMessage();
		FunctionalInterfaceExample.printMessage();
		System.out.println("*****************************");
		System.out.println(functionalInterfaceImpl.add(5, 4));
		functionalInterfaceImpl.messageDisplay();
		FunctionalInterfaceExample2.print();
	}

}
