package com.sort;

public class QuickSort {

	public static void quickSort(int[] numberArray4,int low,int high) {
		if(low>=high)
			return;
		int start=low;
		int end=high;
		int mid=(start+end)/2;
		int pivot=numberArray4[mid];
		while(start<=end) {
			while(numberArray4[start]<pivot) {
				start++;
			}
			while(numberArray4[end]>pivot) {
				end--;
			}
			if(start<=end) {
				int temp=numberArray4[start];
				numberArray4[start]=numberArray4[end];
				numberArray4[end]=temp;
				start++;
				end--;
			}
		}
			
		quickSort(numberArray4, low, end);
		quickSort(numberArray4,start, high);
		
		
		
		
	}

}
