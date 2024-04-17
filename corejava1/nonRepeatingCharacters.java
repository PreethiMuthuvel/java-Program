package com.preethi.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class nonRepeatingCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the name");
		String name = sc.next();
		char[] nameArray = name.toCharArray();
		Map<Character, Integer> characterCountMap = new LinkedHashMap<Character, Integer>();
		for (char character : nameArray) {
			if (characterCountMap.containsKey(character)) {
				characterCountMap.put(character, characterCountMap.get(character) + 1);

			} else {
				characterCountMap.put(character, 1);
			}

		}
		System.out.println(characterCountMap);

		for (Map.Entry<Character, Integer> entryMap : characterCountMap.entrySet()) {
			char nonRepeatingCharacter = entryMap.getKey();
			int count = entryMap.getValue();
			if (count == 1) {
				System.out.println("The first Non repeating character is " + nonRepeatingCharacter);
				break;
			}
		}
	}
}
