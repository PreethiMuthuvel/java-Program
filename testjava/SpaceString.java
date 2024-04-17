package com.testjava;

import java.util.ArrayList;
import java.util.List;

public class SpaceString {
	public StringBuilder space(String string) {
		List<Character> smallCharLlist=new ArrayList<>();
		StringBuilder str=new StringBuilder();
		str.append(string.charAt(0));
		for(char character='a';character<='z';character++) {
			smallCharLlist.add(character);
		}
		for(int i=1;i<string.length();i++) {
			if(!smallCharLlist.contains(string.charAt(i))){
				str.append(" ");
			}
			str.append(string.charAt(i));
		}
		return str;
	}
}
