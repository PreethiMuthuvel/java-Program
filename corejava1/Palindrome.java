package com.preethi.test;

public class Palindrome {

	public static void main(String args[]) {

		Palindrome palindrome = new Palindrome();
		boolean check=palindrome.checkPalindrome();
		System.out.println(check);
		

	}

	private boolean checkPalindrome() {
		// TODO Auto-generated method stub
		String string = "madam";
		int start = 0;
		int end = string.length()-1;
		boolean isPalindrome=true;
		while (start < end) {

			if (string.charAt(start) == (string.charAt(end))) {
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