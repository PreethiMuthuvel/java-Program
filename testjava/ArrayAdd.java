package com.testjava;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
public class ArrayAdd {
	public int[] arrayAdd(int[] arr1, int[] arr2) {
		int carry = 0;
		int firstIndex=arr1.length-1;
		int secondIndex=arr2.length-1;
		int length = Math.max(arr1.length, arr2.length);
		int resultArray[] = new int[length];
		int resultIndex=length-1;
		int newResultArray[]=new int[resultArray.length+1];
		while(firstIndex>=0 || secondIndex>=0) {
			int digit1 = (firstIndex>=0) ? arr1[firstIndex] : 0;
			int digit2 = (secondIndex>=0) ? arr2[secondIndex] : 0;
			int sum = digit1 + digit2 + carry;
			resultArray[resultIndex--] = sum % 10;
			carry = sum / 10;
			firstIndex--;
			secondIndex--;
		}
		if(carry>0) {
			newResultArray[0]=carry;
			for(int i=0;i<resultArray.length-1;i++) {
				newResultArray[i+1]=resultArray[i];
			}
			return newResultArray;
		}
		
		return  resultArray;
	}
}