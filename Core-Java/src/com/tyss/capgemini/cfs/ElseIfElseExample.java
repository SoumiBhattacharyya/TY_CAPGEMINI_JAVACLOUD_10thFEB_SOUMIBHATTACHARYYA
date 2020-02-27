package com.tyss.capgemini.cfs;

public class ElseIfElseExample {
	public static void main(String[] args) {

		int t = 99; // else-if-else example
					// they are like a radio player here the consistency is not good overall unlike
					// the switch case statements. they can go for range of values as well as equality.

		if (t <= 20) {
			System.out.println("Panipuri");
		} else if (t >= 40 && t <= 60) {
			System.out.println("Pav-Bhaji");

		} else if (t > 60 && t <= 80) {
			System.out.println("Chicken Roll");
		}

		else if (t > 80 && t <= 100) {
			System.out.println("Burger");
		} else {
			System.out.println("Pizza");
		}

	}
}
