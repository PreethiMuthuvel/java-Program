package com.preethi.test;

public class RemoveEnd {
	public static void main(String[] args) {
		String string = "aabccabba";
		int start = 0;
		int end = string.length()-1;
		while (start < end) {
			
			if (string.charAt(start) != string.charAt(end)) {
				break;
			}
			char compare = string.charAt(start);
			while (start<=end && string.charAt(start) == compare) {
				start++;
			}
			while (start<=end && string.charAt(end) == compare) {
				end--;
			}
		}
		System.out.println(end - start + 1);

		/*
		 * int start=0; int end=s.length()-1; while(start<end ) {
		 * if(s.charAt(start)!=s.charAt(end)){ break; } char compare=s.charAt(start);
		 * while(start<=end && s.charAt(start)==compare) { start++; } while(start<=end
		 * && s.charAt(end)==compare ) { end--; }
		 * 
		 * } return end-start+1;
		 */
	}
}
