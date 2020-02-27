package com.tyss.capgemini.inheritance;

import com.tyss.capgemini.methods.BasicArithmeticOperations;

public class DifferentPackageMethodsExample extends BasicArithmeticOperations { // multi level inheritance.
	public static void main(String[] args) {

		DifferentPackageMethodsExample differentPackageMethodsExample = new DifferentPackageMethodsExample();

		System.out.println(differentPackageMethodsExample.toString());
		System.out.println(differentPackageMethodsExample.hashCode());

		System.out.println(add(8, 9));
		System.out.println(sub(45, 16));
		System.out.println(div(45, 7));
		System.out.println(mul(5, 13));

	}

}