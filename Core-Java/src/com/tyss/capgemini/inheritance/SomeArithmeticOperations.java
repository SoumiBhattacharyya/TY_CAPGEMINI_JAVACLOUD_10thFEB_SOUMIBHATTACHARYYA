package com.tyss.capgemini.inheritance;

import com.tyss.capgemini.methods.BasicArithmeticOperations;

public class SomeArithmeticOperations extends BasicArithmeticOperations {

	public SomeArithmeticOperations() {
		super();
		//super("A"); // Whatever the constructor there might be , we can call the super keyword only
					// once that too in the first line of the code.
		System.out.println("SomeArithmeticOperations()");
	}

	public static void main(String[] args) {

		SomeArithmeticOperations someArithmeticOperations = new SomeArithmeticOperations();

		System.out.println("Add method of super class :" + add(12, 24));
		System.out.println("Sub method of super class :" + sub(67, 21));
		System.out.println("Div method of super class :" + div(24, 4));
		System.out.println("Mul method of super class : " + mul(9, 7));
	}
    
}
//we cannot make changes in a default constructor but we can make changes in a zero parameterized constructor.
