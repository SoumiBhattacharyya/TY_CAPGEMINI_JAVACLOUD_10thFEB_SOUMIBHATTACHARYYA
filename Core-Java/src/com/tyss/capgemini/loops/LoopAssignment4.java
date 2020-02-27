package com.tyss.capgemini.loops;

import java.util.Scanner;

public class LoopAssignment4 { // Fibonacci series
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int f=0;
		
		System.out.println("Enter a number");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		for (int i=0;i<=n;i++) {
			f=a+b;
			a=b;
			b=f;
			System.out.print(f+" ");
			sc.close();
		}
	}

}
