package com.preethi.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MaximumCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Character, Integer> characterMap = new HashMap();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the  String");
		String firstString = sc.next();
		char[] FirstStringToArray = firstString.toCharArray();
		for (char character : FirstStringToArray) {
			if (characterMap.containsKey(character)) {
				characterMap.put(character, characterMap.get(character) + 1);
			} else {
				characterMap.put(character, 1);
			}

		}
		
		 Set<Map.Entry<Character,Integer>>  entrySet=characterMap.entrySet();
			
			for (Map.Entry<Character, Integer> characterSet : entrySet) {
				char character = characterSet.getKey();
				
				int count = characterSet.getValue();
				System.out.println(character + " " + count);
			}
		char maximum =firstString.charAt(0) ;
		//System.out.println(maximum);
		for (Character character : characterMap.keySet()) {
			
			if (characterMap.get(maximum) < characterMap.get(character)) {

				maximum =character;

			}
			
		}
		System.out.println("maximum occuring character is "+ maximum);
		
	}

}
