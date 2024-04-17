package com.preethi.test;

public class Profit {

	public static void main(String[] args) {

		int[] prices = { 7, 1, 5, 3, 6, 4 };
		int min = prices[0];
		int diffVal = 0;
		for (int i = 1; i < prices.length; i++) {
			int profit = prices[i] - min;
			if (profit > diffVal) {
				diffVal = profit;
			}
			if (min > prices[i]) {
				min = prices[i];
			}
		}
		System.out.println(diffVal);
	}
}
