package com.tyss.capgemini.exceptions;

import java.util.Scanner;

public class CustomExceptionTester {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws InvalidNumberCustomExceptions {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		if (num >= 0 && num <= 10) {
			sc.close();
			System.out.println(num * 10);
		} else
			throw new InvalidNumberCustomExceptions("InvalidNumberCustomExceptions Exception");

	}

}
