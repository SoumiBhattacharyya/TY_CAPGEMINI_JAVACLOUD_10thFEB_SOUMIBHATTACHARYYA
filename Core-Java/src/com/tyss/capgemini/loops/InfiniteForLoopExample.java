package com.tyss.capgemini.loops;

public class InfiniteForLoopExample {
	public static void main(String[] args) {

		/*
		 * int i = 10;
		 * 
		 * for (;;) { System.out.println(i); }
		 */
		// we cannot have any line of code after an infinite loop
		// System.out.println("Hello World");

		for (int i = 0; true; i++) {
			System.out.println(i); // if the condition is given as true it will always enter into an infinite loop.
		}
	}

}
