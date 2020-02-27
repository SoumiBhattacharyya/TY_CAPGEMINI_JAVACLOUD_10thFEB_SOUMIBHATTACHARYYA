package com.tyss.capgemini.exceptions;

public class ExceptionsExample {
	public static void main(String[] args) {

		String str = "";

		try {

			int i = 10 / 0;
			System.out.println(str.charAt(3)); // runtime exceptions.
			System.out.println(i);
		}

		catch (StringIndexOutOfBoundsException e) {
			System.err.println("charAt(int index) should not be called on null Strings");
			e.getCause();
			System.out.println(e.getClass());
			System.out.println(e.getCause());
			System.err.println(e.getMessage());
		} catch (Exception e) {
			System.err.println("Should not be divided by zero");
			System.out.println(e.getClass());
			System.out.println(e.getCause());
			System.err.println(e.getMessage());
		} /*
			 * catch (Exception e) { System.err.println("Exception Caught in the code..");
			 * System.out.println(e.getClass()); System.out.println(e.getMessage());
			 * 
			 * }
			 */

	}
}
