package com.tyss.capgemini.validation;

public class Validation {

	public static boolean isStringOnlyAlphabet(String str) {
		
		return ((str != null) && (!str.equals("")) && (str.matches("^[a-zA-Z]*$")));
	}

	public static boolean passwordValidation(String str) {
		//System.out.println("Inside insert password validation");
		

		return ((str != null) && (!str.equals("")) && (str.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{6,20})")));
		
	}
	
	public static boolean emailValidation(String str) {
		//System.out.println("Inside insert password validation");
		

		return ((str != null) && (!str.equals("")) && (str.matches("^(.+)@(.+)$")));
		
	}

	
	

}
