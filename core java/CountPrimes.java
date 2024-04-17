package com.preethi.test;

public class CountPrimes {
	public static void main(String[] args) {
            int count=0;
            int n=100;
            for (int i = 2; i <= n; i++) {
                boolean isPrime = true; 
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
    			if (isPrime==true) {
    				count++;
    			}
    		}
		System.out.println("The number of prime numbers between 2 and 100 is: " + count);
	}
}


