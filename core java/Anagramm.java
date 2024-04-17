package com.preethi.test;

import java.util.HashMap;
import java.util.Map;

public class Anagramm {
	
	public static void main(String args[]) {
		String string1="silent";
		String string2="listen";
		boolean isAnagram=Anagramm.isAnagram(string1,string2);
		System.out.println(isAnagram);
	}

	private static boolean isAnagram(String string1, String string2) {
		Map<Character,Integer> characterMap=new HashMap<Character,Integer>();
		char[] characterArray1=string1.toCharArray();
		char[] characterArray2=string2.toCharArray();
		
		for(char character :characterArray1) {
			characterMap.put(character, characterMap.getOrDefault(character, 0)+1);
		}
		for(char character :characterArray2) {
			//characterMap.put(character, characterMap.getOrDefault(character, null))
			if(characterMap.containsKey(character)) {
				int count=characterMap.get(character)-1;
				characterMap.put(character, count);
			}
			else {
				return false;
			}
		}
		for(Map.Entry<Character, Integer> entry : characterMap.entrySet()) {
			if(entry.getValue()!=0) {
				return false;
				
			}
			
		}
		return true;
				
		
	}

	
}
