package com.tyss.capgemini.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimplePatternMatching {
	public static void main(String[] args) {
		
		Pattern pattern=Pattern.compile("\\d"); 		//single digit input , e.g-> 0-9
		Matcher matcher= pattern.matcher("1");
		System.out.println(matcher.matches());
	}

}
