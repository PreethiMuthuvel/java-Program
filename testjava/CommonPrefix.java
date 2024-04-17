package com.testjava;

public class CommonPrefix {
	public String stringCommonPrefix(String[] arr) {
		String firstString = arr[0];
		String newString = "";
		int index=0;
		int prefixLength=0;
		if(arr.length==0) {
			return "";
		}
		int minLength=findMinStr(arr);
		while(index<minLength && isSame(arr,index++)) {
			prefixLength++;
		}
		return arr[0].substring(0, prefixLength);
	}

	private boolean isSame(String[] arr, int index) {
		char curChar=arr[0].charAt(index);
		boolean isSame=true;
		for(String temp :arr) {
			if(temp.charAt(index)!=curChar) {
				isSame=false;
				break;
			}
		}
		return isSame;
	}

	private int findMinStr(String[] arr) {
		int minimum=Integer.MAX_VALUE;
		for(String string : arr) {
			if(string.length()<minimum) {
				minimum=string.length();
			}
		}
		return minimum;
	}
}
