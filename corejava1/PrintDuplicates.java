package com.preethi.test;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class PrintDuplicates {
	static Set<Integer> numberSet = new HashSet<Integer>();
	static Set<Integer> duplicateSet = new HashSet<Integer>();

	public static void main(String args[]) {
		int numberArray[] = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the element");
		int n = sc.nextInt();
		System.out.println("enter the elements");
		for (int i = 0; i < n; i++) {
			numberArray[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			if (!numberSet.add(numberArray[i])) {
				duplicateSet.add(numberArray[i]);
			}
		}
		System.out.println(duplicateSet);
	}
}
