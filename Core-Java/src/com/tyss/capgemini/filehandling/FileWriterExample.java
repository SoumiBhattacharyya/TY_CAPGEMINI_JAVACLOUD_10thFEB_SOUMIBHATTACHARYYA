package com.tyss.capgemini.filehandling;

import java.io.*;

public class FileWriterExample {
	public static void main(String[] args) throws IOException {

		try (FileWriter fileWriter = new FileWriter("newFile.txt");) {

			fileWriter.write("This is the FileWriter example of writing data....");
			fileWriter.append("This is the filewriter example of writing 2nd data....");

			System.out.println("Data has been written in the file .....");
		} catch (Exception e) {

			e.printStackTrace();
		}

	}

}
