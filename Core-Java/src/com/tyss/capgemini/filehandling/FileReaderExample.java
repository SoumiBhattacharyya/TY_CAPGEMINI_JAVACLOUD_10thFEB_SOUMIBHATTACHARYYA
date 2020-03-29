package com.tyss.capgemini.filehandling;

import java.io.FileReader;

public class FileReaderExample {
	public static void main(String[] args) {
		
		try(FileReader fileReader=new FileReader("newfile.txt");){
			int charUnicode;
			
			while((charUnicode=fileReader.read())!= -1) {
				System.out.println(charUnicode);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
