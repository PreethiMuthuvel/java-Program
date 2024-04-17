package com.testjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public class StringCompression {
	public int stringCompression(char[] chars) {
		Map<Character, Integer> charMap = new HashMap<>();
		Stack<Integer> stack = new Stack<Integer>();
		char charValue = '\0';
		for (Character character : chars) {
			charMap.put(character, charMap.getOrDefault(character, 0) + 1);
		}
		List<Character> resultLlist = new ArrayList<>();
		for (Character charStr : chars) {
			if (!resultLlist.contains(charStr)) {
				resultLlist.add(charStr);
			} 
			else {
				int value = charMap.get(charStr);
				if (value > 1) {
                    for (char c : String.valueOf(value).toCharArray()) {
                    	resultLlist.add(c);
                    }
                
				}
			}
		}
		return resultLlist.size();
	}
}
