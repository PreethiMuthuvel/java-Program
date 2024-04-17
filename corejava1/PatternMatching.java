package com.preethi.test;

import java.util.HashMap;
import java.util.Map;

public class PatternMatching {

	public boolean wordPattern(String pattern, String s) {
		Map<Character, String> charToWord = new HashMap<Character, String>();
		// Map<String, Character> wordToChar = new HashMap<String, Character>();
		char[] chars = pattern.toCharArray();
		String[] words = s.split(" ");
		if (chars.length != words.length) {
			return false;
		}
		int i = 0;
		for (String word : words) {
			char c = chars[i];
			if (charToWord.containsKey(c) && !word.equals(charToWord.get(c))) {
				return false;
			}
			/*
			 * else if (wordToChar.containsKey(word) && c != wordToChar.get(word)) { return
			 * false; }
			 */

			charToWord.put(c, word);
			// wordToChar.put(word, c);
			++i;
		}
		return true;
	}
	public static void main(String args[]) {

		String pattern = "abba";
		String s = "dog cat cat dog";
		PatternMatching solution = new PatternMatching();
		boolean result = solution.wordPattern(pattern, s);
		System.out.println(result);

	}
}




















