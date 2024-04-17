package com.testjava;

public class StringReverse {
	public String reverseString(String string) {
		char[] charArr=string.toCharArray();
		reverse(charArr,0,charArr.length-1);
		int start=0;
		for(int i=0;i<charArr.length;i++) {
			if(charArr[i]==' ' || i==charArr.length-1) {
				int end=(i==charArr.length-1)?i:i-1;
				reverse(charArr, start, end);
                start = i + 1;
                
			}
			
		}
		return new String(charArr);
	}
	private static void reverse(char[] charArr, int start, int end) {
		 while (start < end) {
	            char temp = charArr[start];
	            charArr[start] = charArr[end];
	            charArr[end] = temp;
	            start++;
	            end--;
	}
	}
}
