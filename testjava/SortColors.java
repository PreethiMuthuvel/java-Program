package com.testjava;

public class SortColors {
	public int[] sortColors(int[] arr) {
		int first=0;
		int leftIndex=0;
		int last=arr.length-1;
		while(first<=last) {
			if(arr[first]==0) {
				int temp=arr[first];
				arr[first]=arr[leftIndex];
				arr[leftIndex]=temp;
				first++;
				leftIndex++;
			}
			else if(arr[first]==2){
				int temp=arr[first];
				arr[first]=arr[last];
				arr[last]=temp;
				last--;
			}
			else {
				first++;
			}
		}
		return arr;
	}

}
