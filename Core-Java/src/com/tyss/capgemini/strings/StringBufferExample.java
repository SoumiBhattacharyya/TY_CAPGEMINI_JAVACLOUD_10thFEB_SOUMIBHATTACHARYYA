package com.tyss.capgemini.strings;

public class StringBufferExample {

	public static void main(String[] args) {

		String s1 = "Some String";

		StringBuffer stringBuffer = new StringBuffer(s1);

		System.out.println(stringBuffer.getClass());

		System.out.println(stringBuffer.length());

		System.out.println(stringBuffer.append(" hello"));

		System.out.println(stringBuffer); // string buffer is mutable.

		System.out.println(stringBuffer.reverse());

		System.out.println(stringBuffer.reverse());

		System.out.println(stringBuffer.replace(0, 1, "s"));

		System.out.println(stringBuffer.insert(5, "T"));

		System.out.println(stringBuffer.indexOf("XYZ")); // -1 determines the substring is not present in the string

		System.out.println(stringBuffer.delete(5, 8));
		
		
	}
}
