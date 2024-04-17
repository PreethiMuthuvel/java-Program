package com.preethi.test;

import java.util.Arrays;
import java.util.List;

public class ArrayExample {

	public static void main(String[] args) {

		String originalString = "hello";// String literal
		String originalString1 = "hello";
		int n = originalString.length();

		System.out.println(n);
		// originalString.charAt(0);
		System.out.println(originalString.charAt(0));
		System.out.println(originalString.substring(0, 2));
		System.out.println(originalString.substring(2));
		String a = "world";
		System.out.println(originalString.concat(a));
		System.out.println(originalString.lastIndexOf("l"));
		boolean isEqual1 = originalString.equalsIgnoreCase(originalString1);
		System.out.println("str1 equals str2: " + isEqual1);

		System.out.println(originalString1.toUpperCase());
		System.out.println(originalString.toLowerCase());
		String trimmedString = originalString;
		System.out.println(trimmedString);
		System.out.println(originalString.contains("y"));
		System.out.println(originalString.replace("e", "a"));
		String originalString4 = "apple@orange@banana@grape";
		String[] fruitsArray = originalString4.split("@");
		for (String a1 : fruitsArray) {
			System.out.println(a1);
		}

		int output = originalString.compareTo(originalString1);
		System.out.println(output);
		char[] charArr = originalString.toCharArray();
		for (char a1 : charArr) {
			System.out.println(a1);
		}
	}

}
