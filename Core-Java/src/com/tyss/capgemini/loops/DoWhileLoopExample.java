package com.tyss.capgemini.loops;

public class DoWhileLoopExample {
	public static void main(String[] args) {

		int i = 1;

		do { 			// in do-while whatever the condition might be , the loop runs atleast once and
						// the value gets printed in the first time.
			System.out.println(i * 18);
			i++;
		} while (i <= 0);
	}

}
