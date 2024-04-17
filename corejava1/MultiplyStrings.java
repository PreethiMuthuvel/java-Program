package com.preethi.test;

public class MultiplyStrings {
	public static void main(String[] args) {
		String num1 = "123";
		String num2 = "456";
		int start1 = 0;
		int start2 = 0;
		int end1 = num1.length() - 1;
		int end2 = num2.length() - 1;
		int[] array = new int[num1.length()];
		for (int i = end1; i >= start1; i--) {
			int carry = 0;
			StringBuilder sb = new StringBuilder();
			for (int j = end2; j >= start2; j--) {
				int digitValue1 = (i >= start1) ? num1.charAt(i) - '0' : 0;
				int digitValue2 = (j >= start2) ? num2.charAt(j) - '0' : 0;
				int product = digitValue1 * digitValue2 + carry;
				sb.append(product % 10);
				carry = product / 10;
			}
			if (carry != 0) {
				sb.append(carry);
			}
			sb.reverse();
			String str = sb.toString();
			int num = Integer.parseInt(str);
			array[i] = num;
		}
		int resultSum = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
