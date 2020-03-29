package com.tyss.capgemini.filehandling;

import java.io.FileWriter;
import java.util.Properties;

public class SetPropertiesExample {
	public static void main(String[] args) throws Exception {
		
		Properties properties=new Properties();
		
		properties.put("batch", "JAVA CLOUD");
		properties.put("Tech", "Web Basics, Java-Full Stack, Java Frameworks");
		properties.put("batchStrength", "28");
		
		properties.store(new FileWriter("batch.properties"), "Batch Details");
		
		System.out.println("Properties File Created");
	}
}
