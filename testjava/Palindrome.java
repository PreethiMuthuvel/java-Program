package com.testjava;



public class Palindrome {
	
	
		public  boolean isPalindrome(String string) {
			int start=0;
			int end=string.length()-1;
			boolean isPalindrome=true;
			while(start<end) {
				if(string.charAt(start)==string.charAt(end)) {
					start++;
					end--;
				}
				else {
					isPalindrome=false;
					break;
				}
			}
			return isPalindrome;
		}
	


}
