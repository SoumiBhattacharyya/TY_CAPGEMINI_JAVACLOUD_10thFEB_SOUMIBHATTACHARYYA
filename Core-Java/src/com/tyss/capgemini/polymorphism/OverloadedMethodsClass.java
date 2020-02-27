package com.tyss.capgemini.polymorphism;

public class OverloadedMethodsClass {
	public int add(int i, int j) { // 2integers
		return i + j;
	}

	public int add(int i, int j, int k) { // 3integers (overloading)
		return i + j + k;

	}

	public double add(int i, double d) { // int with double (overloading)
		return i + d;
	}

	public double add(double d, int i) { // double with int (overloading)
		return d + i;
	}
}

/*
 * name of method should be same but with diff method signatures as in
 * parameters , datatype, sequence, return type etc.
 */