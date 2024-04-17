package com.preethi.test;

public class Matrix {
	public static void main(String args[])
	
	

}
void palindrome(String string){
	
	int start=0;
	int end=string.length()-1;
	while(start<=end) {
		if(string.charAt(start)!=string.charAt(end)) {
		return false;
		}
	start++;
	end--;
	}
	return true;
}