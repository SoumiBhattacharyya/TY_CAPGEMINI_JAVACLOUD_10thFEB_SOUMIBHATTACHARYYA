package com.tyss.capgemini.threads;

public class CustomThread1 extends Thread {
	 String resource1;
	 String resourse2;

	 public CustomThread1(String resource1,String resource2) {
			this.resource1=resource1;
			this.resourse2=resource2;
		}
	

	public void run() {
		synchronized (resource1) {
			System.out.println("Thread1: Locked resource1");
			try {
				Thread.sleep(500);
				resource1.wait();
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		
			
					synchronized (resourse2) {
			System.out.println("Thread2: Locked resource2");
					}
		}
		}
	
	}


