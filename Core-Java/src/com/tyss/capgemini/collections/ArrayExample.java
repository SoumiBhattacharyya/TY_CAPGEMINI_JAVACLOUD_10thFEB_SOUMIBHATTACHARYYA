package com.tyss.capgemini.collections;

public class ArrayExample {
	public static void main(String[] args) {

//	int intArray1[]=new int[6]; Not the proper way of creating an array.
		int[] intArray = new int[6];
		int[] intArray2 = { 10, 20, 30, 40, 50, 60, 70 };

		intArray[0] = 1;
		intArray[1] = 2;
		intArray[2] = 3;
		intArray[3] = 4;
		intArray[4] = 5;
		intArray[5] = 6;
//		intArray[6] = 7; array index out of bounds exception
//		intArray[7] = null; primitive datatypes does not accept null value.

		// intArray[5]=Integer.parseInt("qwerty"); throws numberformatexception
		// intArray[5]=Integer.parseInt("1234567890");

		for (int i = 0; i <= intArray.length - 1; i++) {
			System.out.println("Element at index : " + i + " = " + intArray[i]);
		}

		for (Integer i : intArray2) {
			System.out.println("Element at index : " + i);
		}

	}

}

/**
 * array is a collection of buckets @ why is length a variable?
 */
