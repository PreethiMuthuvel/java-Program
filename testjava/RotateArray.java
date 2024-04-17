package com.testjava;

public class RotateArray {
	public int[] rotateArray(int[] arr,int k) {
		int n=arr.length-1;
		/* while(k>0) {
	        	int lastElement = arr[n];
	        for (int i = n ; i > 0; i--) {
	            arr[i] = arr[i - 1];
	        }
	        arr[0] = lastElement;
	        k--;
	    }
		return arr;*/
		
		 reverse(arr, 0, arr.length - 1);
	     reverse(arr, 0, k - 1);
	     reverse(arr, k, arr.length - 1);
		return arr;
	}

	private void reverse(int[] arr, int start, int end) {
		while(start<end) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
}
