package com.preethi.test;

public class BinaryString {
	public static void main(String args[]) {
		String s = "0101";
		int oneCount = 0;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length() ; i++) {
			if (s.charAt(i) == '1') {
				oneCount++;
			}
		}
		int zeroCount = s.length() - oneCount;
		for (int i = 0; i < oneCount - 1; i++) {
			sb.append("1");
		}
		for (int i = 0; i < zeroCount; i++) {
			sb.append("0");
		}
		sb.append("1");
		
		System.out.println(sb.toString());
	}

}
