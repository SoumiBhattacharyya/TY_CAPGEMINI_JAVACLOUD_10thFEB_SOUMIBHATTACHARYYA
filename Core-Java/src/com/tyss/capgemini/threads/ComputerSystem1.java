package com.tyss.capgemini.threads;

public class ComputerSystem1 extends Thread{
	
	PrintingApplication printingApplication;
	
	public ComputerSystem1(PrintingApplication localprintingApplication) {
		this.printingApplication=localprintingApplication;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.err.println(">>>> Printing from ComputerSystem1....>");
		printingApplication.printingDocuments("AnyDocument.pdf", 10);
	}
}
	
