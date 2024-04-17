package com.preethi.test;

import java.util.HashMap;
import java.util.Map;

public class LongestIdenticalSubstring {

	public static void main(String[] args) {
		String str="aabbbbbccddb";
		Map<Character,Integer> characterCountMap=new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++) {
			characterCountMap.put(str.charAt(i), characterCountMap.get(str.charAt(i))+1);
		}
        
	}

}
