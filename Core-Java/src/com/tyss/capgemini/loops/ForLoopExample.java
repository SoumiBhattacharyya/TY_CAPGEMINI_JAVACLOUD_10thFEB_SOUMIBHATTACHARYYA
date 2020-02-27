package com.tyss.capgemini.loops;

public class ForLoopExample {
	public static void main(String[] args) {

		// if we have an infinite loop it is okay , but we can't write any statement
		// outside the loop, as it will be showing unreachable
		// we can have infinite loop by having 'true' as condition or by not giving any
		// conditions inside the loop.

		System.out.println("*********************for-loop 1***************************");
		for (int i = 0; i < 10; i++) {
			System.out.println((i + 1) * 13);
		}
		for (int i = 0; i < 10; ++i) {
			System.out.println((i + 1) * 13);
		}
		System.out.println("*********************for-loop 2***************************");
		int j = 0;

		for (; j < 10; j++) {
			System.out.println((j + 1) * 12);
		}
		System.out.println("*********************for-loop 3****************************");

		int k = 0;
		for (; k < 10;) {
			System.out.println((k + 1) * 14);
			k++;
		}

	}

}
