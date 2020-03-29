package com.tyss.capgemini.filehandling;

import java.io.FileReader;
import java.util.Properties;

public class PropertiesExample {
	public static void main(String[] args) {
		
		try {
		Properties properties=new Properties();
		properties.load(new FileReader("application.properties"));
		System.out.println(properties.getProperty("name"));
		properties.setProperty("batch", "JAVA CLOUD");
		System.out.println(properties.getProperty("batch"));
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
