package com.preethi.test;

import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
	public static void main(String[] args) {
		String string1 = "paper";
		String string2 = "tiale";
		Map<Character, Character> charMap = new HashMap<Character, Character>();
		int i = 0;
		int j = 0;
		if (string1.length() != string2.length()) {
			System.out.println(false);
		}
		while (i <= string1.length() - 1 && j <= string2.length() - 1) {
			if (charMap.containsKey(string1.charAt(i))) {
				char value = charMap.get(string1.charAt(i));
				if (value != string2.charAt(i)) {
					System.out.println(false);
				}
				else {
					if (charMap.containsValue(string2.charAt(j))) {
						System.out.println(false);
					}
				}
			}
			charMap.put(string1.charAt(i), string2.charAt(j));
			i++;
			j++;
		}
		System.out.println(true);
	}
}
