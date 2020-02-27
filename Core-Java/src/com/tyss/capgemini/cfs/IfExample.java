package com.tyss.capgemini.cfs;

public class IfExample {
	public static void main(String[] args) {

		int age = 17; // if statementt

		if (age >= 18) { // if there are more than one line of code then using braces is necessary , else
							// the other lines which are supposed to be inside the braces will get executed,
							// but its okay to not use braces when there is only one line of code inside the
							// condition body.

			System.out.println("Allowed to vote");
			System.out.println("Another line inside if block");
		}

		System.out.println("Code outside the if block.....");
	}

}
