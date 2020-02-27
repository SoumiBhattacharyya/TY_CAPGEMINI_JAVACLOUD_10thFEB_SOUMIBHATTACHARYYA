package com.tyss.capgemini.exceptions;

public class TryCatchFinally {
	public static void main(String[] args) {

		try {
			System.out.println(10 / 0);
			
		} catch (StringIndexOutOfBoundsException e) {
			System.err.println("Exceptions caught in the code...");
			return;
//			System.exit(0); // terminates the currently running jvm itself.
		} catch (Exception e) {
			System.err.println("catch(Exception e)");
//			System.exit(0);
		} finally {
			System.out.println("Code to be executed be there any exceptions or not .");
		}
		System.out.println("Hello");
	}

}

/*
 * if we are not handling the exception then the lines after finally wont be
 * executed. //else of exceptions are being handled then the lines after the
 * finally block will be executed.
 */


