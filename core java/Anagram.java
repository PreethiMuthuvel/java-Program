package com.preethi.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the First String");
		String firstString = sc.next();
		System.out.println("enter the Second String");
		String secondString = sc.next();

		char[] FirstStringToArray = firstString.toCharArray();
		char[] secondStringToArray = secondString.toCharArray();
		Map<Character, Integer> firstCharacterCountMap = new HashMap();
		Map<Character, Integer> secondCharacterCountMap = new HashMap();
		for (char character : FirstStringToArray) {

			firstCharacterCountMap.put(character, firstCharacterCountMap.getOrDefault(character, 0) + 1);
		}
		for (char characterr : secondStringToArray) {

			secondCharacterCountMap.put(characterr, secondCharacterCountMap.getOrDefault(characterr, 0) + 1);
		}

		if (firstCharacterCountMap.equals(secondCharacterCountMap)) {
			System.out.println("This is an anagram");
		} else {
			System.out.println("This is not an  anagram");
		}
	}

}
