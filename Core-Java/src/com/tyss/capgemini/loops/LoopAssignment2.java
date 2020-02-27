package com.tyss.capgemini.loops;

public class LoopAssignment2 {
	public static void main(String[] args) {
		
		int sum=0;
		int n=50;
		
		if(n%2==0) {
		for(int i=0;i<=n;i+=2) {
			sum =sum+i;
			
		}
		System.out.println(sum);
	}
		else {
			System.out.println("Odd number");
		}
	}

}
