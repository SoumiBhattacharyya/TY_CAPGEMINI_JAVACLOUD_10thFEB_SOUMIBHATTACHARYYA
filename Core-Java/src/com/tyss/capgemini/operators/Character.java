package com.tyss.capgemini.operators;

public class Character {
	public static void main(String[] args) {

		char a = 'A';
		char b = 'A';

		System.out.println(++a); // pre increment with char
		System.out.println(a);

		System.out.println(a++); // post increment with char
		System.out.println(a);

		System.out.println(--b); // pre decrement with char
		System.out.println(b);

		System.out.println(b--); // post decrement with char
		System.out.println(b);

	}
}
