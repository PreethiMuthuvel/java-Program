package com.preethi.test;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListSum {

	public static void main(String[] args) {
		Map<Integer, Integer> numberMap = new HashMap<Integer, Integer>();
		int[] numbers = { 3, 5, 2, 7, 6};
		int sum = 10;
		int value;
		for (int i = 0; i < numbers.length; i++) {
			value = sum - numbers[i];
			if (numberMap.containsKey(value)) {
				System.out.println(value + "," + numbers[i]);
			} else {
				numberMap.put(numbers[i], i);
				System.out.println(numberMap.toString());
			}
		}
	}
}
 