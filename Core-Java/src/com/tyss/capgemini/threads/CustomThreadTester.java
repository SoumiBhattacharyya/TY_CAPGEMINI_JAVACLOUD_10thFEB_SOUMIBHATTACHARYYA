package com.tyss.capgemini.threads;

public class CustomThreadTester {
	public static void main(String[] args) {
		
		System.out.println("**********Main started************");
		new CustomThread1("Chandler","Monica").start();
		
		new CustomThread2("Chandler","Monica").start();
		
		
		
		
		
		System.out.println("************Main ended*************");
	}

}
