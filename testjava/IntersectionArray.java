package com.testjava;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class IntersectionArray {
	public int[] insertionArray(int[] arr1, int[] arr2) {
		// List<Integer> numberList = new ArrayList<>();
		/*
		 * for (int number : arr2) { if (numberList.contains(number)) {
		 * numberSet.add(number); } }
		 */
		Set<Integer> numberSet = new LinkedHashSet<>();
		Set<Integer> resultSet = new LinkedHashSet<>();
		for (int number : arr1) {
			numberSet.add(number);
		}
		for (int number : arr2) {
			if (!numberSet.add(number)) {
				resultSet.add(number);
			}
		}
		int[] resultArray = new int[resultSet.size()];
		int i = 0;
		for (int number : resultSet) {
			resultArray[i++] = number;
		}
		return resultArray;
	}
}
