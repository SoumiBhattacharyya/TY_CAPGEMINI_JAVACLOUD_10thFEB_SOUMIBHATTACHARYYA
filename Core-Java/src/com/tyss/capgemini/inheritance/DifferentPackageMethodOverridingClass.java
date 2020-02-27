package com.tyss.capgemini.inheritance;

import com.tyss.capgemini.methods.Methods;

public class DifferentPackageMethodOverridingClass extends Methods {
	
	@Override
	public String printMessage() {
		return "Hello !";
	}
	
	@Override
	protected String welcomeMessage() {
		return "Welcome !";
	}
	
	
	public static void main(String[] args) {
		DifferentPackageMethodOverridingClass differentPackageMethodOverridingClass=new DifferentPackageMethodOverridingClass();
		System.out.println(differentPackageMethodOverridingClass.printMessage());
		System.out.println(differentPackageMethodOverridingClass.displayMessage()); //static cannot be overridden.
	}
	
	
	
}
