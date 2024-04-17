package com.preethi.test;

import java.util.Scanner;

public class LengthLastWord {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = sc.nextLine();
		int length = 0;
		int size = string.length();
		while (size > 0 && string.charAt(size - 1) == ' ') {
			size--;
			//System.out.println(size);
		}
		while (size >0 && string.charAt(size - 1) != ' ') {
			size--;
			length++;
		}
		System.out.println(length);
	}
}