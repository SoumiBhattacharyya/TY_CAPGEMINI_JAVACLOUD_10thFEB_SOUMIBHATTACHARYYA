package com.tyss.capgemini.exceptions;

import java.util.Scanner;

public class TryWithResouces {
	public static void main(String[] args) {

		try (Scanner sc = new Scanner(System.in)) {
			int i = 10;
			int j = sc.nextInt();
			if (j == 0)
				System.out.println("Should not divide number by zero");
			else
				System.out.println(i / j);
		}
	}
}
//			catch (Exception e) {
//			System.err.println("Should not divide the number by zero");
////			System.err.println(e.getMessage());
//		}
