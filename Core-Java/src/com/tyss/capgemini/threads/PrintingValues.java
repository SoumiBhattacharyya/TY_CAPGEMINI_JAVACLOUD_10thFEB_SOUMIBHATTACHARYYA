package com.tyss.capgemini.threads;

public class PrintingValues {
	public static void main(String[] args) {

		System.out.println("******************Application Started*********************");
		
		PrintingMethodClass1 printingMethodClass1 = new PrintingMethodClass1();
		try {
			
			printingMethodClass1.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		printingMethodClass1.start();
		
		Thread thread = new Thread(new PrintingMethodClass2());
		try {
			thread.join();
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		thread.start();
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e1) {
		
			e1.printStackTrace();
		}

//		new PrintingMethodClass2().start();
		System.out.println("******************Application Ended*********************");
	}
}

//Everything happening inside this program is a single thread. 
//So, the program or app takes so much of time to load, or the program hangs.