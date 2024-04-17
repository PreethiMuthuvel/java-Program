package com.preethi.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencySorting {

	public static void main(String[] args) {
		String string = "trrree";
		String output = frequencySort(string);
		System.out.println(output);
	} 

	private static String frequencySort(String string) {
		Map<Character, Integer> charCount = new HashMap<>();
		for (char c : string.toCharArray()) {
			charCount.put(c, charCount.getOrDefault(c, 0) + 1);
		}
		List<Character> charList = new ArrayList<>(charCount.keySet());
		charList.sort((a, b) -> charCount.get(b) - charCount.get(a));
		StringBuilder result = new StringBuilder();
		for (char c : charList) {
			int frequency = charCount.get(c);
			for (int i = 0; i < frequency; i++) {
				result.append(c);
			}
		}

		return result.toString();

	}

}
