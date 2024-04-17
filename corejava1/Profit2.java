package com.preethi.test;

import java.util.ArrayList;
import java.util.List;

public class Profit2 {

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
	
		int maxProfit = 0;
		//int min=prices[0];
		/* for (int i = 1; i < prices.length; i++) {
	            int profit = prices[i] - min;
	            if (profit > 0) {
	                maxProfit += profit; 
	            }
	            min = prices[i]; 
	        }*/
		 for (int i = 1; i < prices.length; i++) {
			 if(prices[i]>prices[i-1]) {
				 maxProfit=maxProfit+(prices[i]-prices[i-1]);
			 }
		 }
		 System.out.println(maxProfit);
	}

}
