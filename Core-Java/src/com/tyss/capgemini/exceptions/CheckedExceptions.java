package com.tyss.capgemini.exceptions;

import java.io.FileReader;
import java.util.Properties;

public class CheckedExceptions {		//compile time exceptions.
	public static void main(String[] args) {
		
	Properties properties=new Properties();
	
	
	try {
		properties.load(new FileReader("application.properties"));
		properties.load(new FileReader("application.properties"));
		System.out.println();
	}catch (Exception e){
		System.err.println("Exception caught in try...");
		e.printStackTrace();
	}finally {
		System.out.println("Code in finally block.....");
	}
	}

	
}


