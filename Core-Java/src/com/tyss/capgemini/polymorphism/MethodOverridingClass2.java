package com.tyss.capgemini.polymorphism;

public class MethodOverridingClass2 implements MethodsInterface {

	@Override
	public String displayMessage() {

		return "Overridden displayMessage() of MethodsInterface from MethodOverridingClass2";
	}

	@Override
	public String printMessage() {

		return "Overridden printMessage() of MethodsInterface from MethodOverridingClass2";
	}

}
