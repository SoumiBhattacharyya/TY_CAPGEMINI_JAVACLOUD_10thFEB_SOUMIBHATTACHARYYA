package com.tyss.capgemini.threads;

public class PrintingApplication {
	
	synchronized public void printingDocuments(String document, int numOfCopies) {
		for(int i=1;i<=numOfCopies;i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(">>Printing "+ document + "#"+ i);
		}
	}

	

}
