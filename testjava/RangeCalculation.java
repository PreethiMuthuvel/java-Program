package com.testjava;

public class RangeCalculation {
	public int findValueInRange(int start, int end) {
		
		// String i=null;
		int count = 0;
		for (int i = start; i < end; i++) {
		//	String j = Integer.toString(i);
			int lastDigit=i%10;
			if(lastDigit==2 || lastDigit==3 || lastDigit==9) {
				count++;
			}
					
		}
		return count;
	}
}