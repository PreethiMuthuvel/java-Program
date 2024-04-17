package com.preethi.test;

public class AddtwoArray {

	public static void main(String[] args) {
		int[] arr1= {9,9,9};
		int[] arr2= {1};
		int start1=0;
		int start2=0;
		StringBuffer sb=new StringBuffer();
		int end1=arr1.length-1;
		int end2=arr2.length-1;
		int carry=0;
		while(start1<=end1 || start2<=end2) {
			int digit1=(start1<=end1) ? arr1[end1]:0;
			int digit2=(start2<=end2) ? arr2[end2]:0;
			int sum=digit1+digit2+carry;
			sb.append(sum%10);
		    carry=sum/10;
		    end1--;
		    end2--;
			
		}
		if(carry!=0) {
			sb.append(carry);
		}
		sb.reverse();
		String str=sb.toString();
		int number = Integer.parseInt(str); 
		System.out.println(number);
		
	}

}
