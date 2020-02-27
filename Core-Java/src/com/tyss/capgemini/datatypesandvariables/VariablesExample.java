package com.tyss.capgemini.datatypesandvariables;

@SuppressWarnings("unused")
public class VariablesExample {

	// Global-variables
	static byte sGByte;
	static short sGShort;
	static int sGInt;
	static long sGLong;
	static float sGFloat;
	static double sGDouble;
	static char sGChar;
	static boolean sGIsTrue;
	static String sGString;

	public static void main(String[] args) {

		// Local-variables
		byte lByte;
		short lShort;
		int lInt;
		long lLong;
		float lFloat;
		double lDouble;
		char lChar;
		boolean lIsTrue;
		String lString;

		System.out.println(sGByte);
		System.out.println(sGShort);
		System.out.println(sGInt);
		System.out.println(sGLong);
		System.out.println(sGFloat);
		System.out.println(sGDouble);
		System.out.println(sGChar); // empty space is default value for char
		System.out.println(sGIsTrue);
		System.out.println(sGString);

		/*
		 * Local variables must be initialized before we can utilize them .
		 * 
		 * 
		 * System.out.println(lByte); System.out.println(lShort);
		 * System.out.println(lInt); System.out.println(lLong);
		 * System.out.println(lFloat); System.out.println(lDouble);
		 * System.out.println(lChar); //empty space is default value for char
		 * System.out.println(lIsTrue); System.out.println(lString);
		 */
	}

}
