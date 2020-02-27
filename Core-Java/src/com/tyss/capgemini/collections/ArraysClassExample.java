package com.tyss.capgemini.collections;

import java.util.Arrays;

public class ArraysClassExample {
	public static void main(String[] args) {

		int[] a = { 34, 89, 0, 423, 675, 980, 12, 45 };

		Arrays.sort(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}

		System.out.println("**************************************");

		int[] b = Arrays.copyOf(a, 8);
		for (int j = 0; j < b.length; j++) {
			System.out.println(b[j]);
		}

		System.out.println("******************************************");
//		Arrays.fill(b,8,10,0);
//		for(int j=0;j<b.length;j++) {
//			System.out.println(b[j]);
//		}

		System.out.println("***********************************************");

		System.out.println(a.equals(b));

		System.out.println(Arrays.equals(a, b));
	}
}
