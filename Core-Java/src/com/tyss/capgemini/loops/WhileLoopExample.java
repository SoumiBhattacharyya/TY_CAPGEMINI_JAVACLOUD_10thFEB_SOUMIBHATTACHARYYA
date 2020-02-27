package com.tyss.capgemini.loops;

public class WhileLoopExample {
	public static void main(String[] args) {

		int i = 1;

		while (i<10) { // here the condition checking is done at first so if the c ondtn is false the
						// loop will be terminated then and there.
			System.out.println(i * 18);
			i++;
		}
		/*
		 * System.out.println("Infinite While Loop"); while (true) {
		 * System.out.println("Hello Java"); }
		 */
		// System.out.println(); // here this sentence becomes unreachable because of
		// the infinite loop in while
		// loop.
	}
}
