package com.preethi.test;

public class PowerOfTwo {

	public static void main(String[] args) {
		int n=64;
		boolean op=isPower(n);
		System.out.println(op);
	}

	private static boolean isPower(int n) {
		/* if(n==1){
	            return true;
	        }
	        while(n>1){
	            if(n%2!=0){
	                return false;
	            }
	            n=n/2;
	            
	        }
	      return true;*/
		if(n==1)
		return true;
		while(n>1) {
			if(n%2!=0) {
				return false;
			}
			n=n/2;
		}
		return true;
	}
}
