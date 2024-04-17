package com.codestax.interview.preethi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMaxValue {
	public static void main(String[] args) {
		int[] nums = { 1,1000};
		String result = largestNumber(nums);
		System.out.println(result);
	}
	public static String largestNumber(int[] nums) {
		List<String> list = new ArrayList<String>();
		for (int number : nums) {
			list.add(String.valueOf(number));
		}
		Collections.sort(list, new CombinedMaxComparator());
		StringBuffer sb = new StringBuffer();
		for (String number : list) {
			sb.append(number);
		}
		return sb.toString();
	}
}
