package com.preethi.test;

public class LengthString {

	public static void main(String[] args) {
       String string="preethii";
       char[] charArr=string.toCharArray();
       int length=0;
       for(char character :charArr) {
    	   length++;
       }
       System.out.println(length);
	}

}
