package com.testjava;

public class Power {
	public boolean isPower(int n) {
		
		while(n>1) {
			int rem=n%10;
			if(rem!=0) {
				return false;
			}
			n=n/10;
			
		}
		if(n==1 ) {
			return true;
		}
		return false;
	}

}
