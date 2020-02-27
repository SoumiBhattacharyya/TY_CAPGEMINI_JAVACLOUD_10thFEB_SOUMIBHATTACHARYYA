package com.tyss.capgemini.strings;

public class StringMethodsExample {
	public static void main(String[] args) {

		String s1 = "Some String"; // init cap- case(initial capital)

		String s2 = "";
		String s3 = "SoMe sTrInG"; // camel case

		System.out.println(s1.length());
		System.out.println(s1.isEmpty());
		System.out.println(s2.length());
		System.out.println(s2.isEmpty());

		System.out.println(s1.charAt(s1.length() - 1));
//		System.out.println(s2.charAt(5));		//String Index Out of bounds exception

		System.out.println(s1.equals(s3));

		System.out.println(s1.equalsIgnoreCase(s3));

		System.out.println(s1.concat(" Concatenated string"));
		System.out.println(s1.toUpperCase());

		System.out.println(s1.toLowerCase());

		System.out.println(s1.trim());

		System.out.println(s1.replace('S', 'q'));

		System.out.println(s1.compareTo(s3));

		String s6 = String.valueOf(12345);

		System.out.println(s6);

		System.out.println(s1.substring(5));
		System.out.println(s1.substring(5, 9));

		System.out.println(s1.startsWith("A"));

		System.out.println(s1.endsWith("l"));

		System.out.println(s1); // even after performing so many operations value of string does not change as
								// it is immutable.
		

	}

}
