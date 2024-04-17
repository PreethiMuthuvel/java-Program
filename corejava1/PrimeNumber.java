package com.preethi.test;

public class PrimeNumber {

	public static void main(String[] args) {
		int num=17;
		boolean isPrime=true;
		for(int i=2;i<=Math.round(Math.sqrt(num));i++) {
			if(num%i==0) {
				isPrime=false;
				break;
			}
		}
		if(isPrime) {
			System.out.println("this is prime");
		}
		else {
			System.out.println("this is not a prime");
		}
	}
}
