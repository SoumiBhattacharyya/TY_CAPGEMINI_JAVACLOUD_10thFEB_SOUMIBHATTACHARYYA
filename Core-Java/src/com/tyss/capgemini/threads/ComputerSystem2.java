package com.tyss.capgemini.threads;

public class ComputerSystem2 extends Thread{
	
PrintingApplication printingApplication;
	
	public ComputerSystem2(PrintingApplication localprintingApplication) {
		this.printingApplication=localprintingApplication;
	}
	
	@Override
	public void run() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.err.println(">>>> Printing from ComputerSystem2...>");
		printingApplication.printingDocuments("SomeOtherDocument.pdf", 10);
	}
}
