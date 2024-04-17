package com.codestax.interview.preethi;

import java.util.Comparator;

public class CombinedMaxComparator implements Comparator<String> {
	@Override
	public int compare(String num1, String num2) {
		String num1num2 = num1+num2;
        String num2num1 = num2+num1;
        return num2num1.compareTo(num1num2);
	}
}
