package com.tyss.capgemini.exceptions;

import java.util.Scanner;

public class CustomExceptionTester2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number....");
		int number = sc.nextInt();

		sc.close();

		try {
			System.out.println(10 / number);
		} catch (Exception e) { 	//catch exception class not the custom exception such that the compiler can get hold of all the exceptions
			throw new InvalidNumberCustomExceptions("Any Message"); // but throw the custom exc
		}

	}

}
