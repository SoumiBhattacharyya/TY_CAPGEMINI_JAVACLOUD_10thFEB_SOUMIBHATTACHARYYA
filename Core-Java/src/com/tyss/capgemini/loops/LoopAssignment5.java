package com.tyss.capgemini.loops;

import java.util.Scanner;

public class LoopAssignment5 { //Hcf of two numbers
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the range within which you want to find hcf");
		int hcf=sc.nextInt();
		
		System.out.println("Enter two numbers");
		int a=sc.nextInt();
		int b=sc.nextInt();
		
		
		for(int i=1;i<hcf;i++) {
			if(a%i==0 && b%i==0 ) {
				System.out.println(i);
				
				
			}
			sc.close();
		}
	
	
	}
}