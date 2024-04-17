package com.preethi.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

public class groupAnagram {
	static Map<String, List<String>> groupAnagramMap = new HashMap<>();

	public static void main(String[] args) {
		String[] stringArray = new String[] { "eat", "tea", "tan", "ate", "nat", "bat" };

		groupAnagram.groupOfAnagrams(stringArray);
	}

	private static void groupOfAnagrams(String[] stringArray) {

		for (String string : stringArray) {
			char[] characterArray = string.toCharArray();
			Arrays.sort(characterArray);
			String sortedString = String.valueOf(characterArray);
			List<String> anagramList = groupAnagramMap.getOrDefault(sortedString, new ArrayList<String>());
			anagramList.add(string);
			groupAnagramMap.put(sortedString, anagramList);
		}
		for (Map.Entry<String, List<String>> entry : groupAnagramMap.entrySet()) {
			System.out.println(entry.getValue());
		}

	}

}
