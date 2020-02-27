package com.tyss.capgemini.methods;

public class VaragsInputExample { // variable arguments

	public int add(int... input) { // array
		int sum = 0;
		for (int i = 0; i < input.length; i++) {
			sum += input[i];
			// sum =sum+input[i];
		}
		return sum;
	}

	public static void main(String[] args) {

		System.out.println("Sum : " + new VaragsInputExample().add(1, 2, 8967, 363, 927, 353, 3748, 26));
	}

}

//oca and i compass test question.