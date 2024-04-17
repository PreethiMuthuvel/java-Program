package com.testjava;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindIndex {
	public int findIndexfromString(String string1, String string2) {//two methods are correct
	if (string1.length() < string2.length()) {
			return -1;
		}
		int j = 0;
		int i = 0;
		for (i = 0; i < string1.length(); i++) {
			for (j = 0; j < string2.length(); j++) {
				if (string1.charAt(i+j) != string2.charAt(j)) {
					break;
				}
			}
			if (j == string2.length()) {
				return i;
			}
		}
		return -1;
	}
}
/*class Solution {
    public int strStr(String haystack, String needle) {*/
       /* if(string1.contains(string2)){
            return string1.indexOf(string2);
        }
            return -1;
		
}*/
