package com.tyss.capgemini.loops;

import java.util.Scanner;

public class Assignment1 {
	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		 Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		if(n%2==0) {
			for(int i=1;i<=n;i++)
			System.out.println("The Number is Even");
		}
		else
			System.out.println("Odd number");
		sc.close();
	}

}
