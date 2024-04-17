package com.preethi.test;

public class AddStrings {

	public static void main(String[] args) {
		String input1="10";
		String input2="99";
		StringBuilder sb=new StringBuilder();
		int start1=0;
		int start2=0;
		int end1=input1.length()-1;
		int end2=input2.length()-1;
		int carry=0;
		while(start1<=end1 || start2<=end2) {
			int digitValue1 =(end1 >= start1) ? input1.charAt(end1) - '0' : 0;
			int digitValue2 =(end2 >= start2) ? input2.charAt(end2) - '0' : 0;
			int sum=digitValue1+digitValue2+carry;
			sb.append(sum%10);
			carry=sum/10;
			end1--;
			end2--;
		}
		if(carry!=0) {
		sb.append(carry);
		}
		sb.reverse();
		System.out.println(sb.toString());
	}
}
