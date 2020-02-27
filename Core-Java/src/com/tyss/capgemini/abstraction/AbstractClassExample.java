package com.tyss.capgemini.abstraction;

import com.tyss.capgemini.polymorphism.MethodsInterface;

public abstract class AbstractClassExample implements MethodsInterface {

	abstract String display(); // a method with no body is abstract method.

	abstract String print();

	@Override
	public String printMessage() {
		
		return "printMessage() of MethodsInterface";
	}
		
	}

