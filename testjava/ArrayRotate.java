package com.testjava;

import java.util.Arrays;

public class ArrayRotate {
	public boolean isRotated(int[] arr) {
		/*
		 * int rotateIndex = 0; for (int i = 1; i < arr.length; i++) { if (arr[i - 1] >
		 * arr[i]) { rotateIndex = i; break; } } for(int
		 * i=rotateIndex;i<arr.length-1;i++) { if(arr[i]>arr[i+1]) { return false; } }
		 * for(int i=0;i<rotateIndex-1;i++) { if(arr[i]>arr[i+1]) { return false; } }
		 * 
		 * return true; } }
		 */
		int rotatedIndex = findRotateIndex(arr);
		int rotationCount=arr.length-rotatedIndex;
		int[] rotatedArray=new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			rotatedArray[(i+rotationCount)%arr.length]=arr[i];
		}
		Arrays.sort(arr);
		return Arrays.equals(arr, rotatedArray);
	}

	private int findRotateIndex(int[] arr) {
		int start = 0;
		int end = arr.length - 1;
		int rotateIndex = 0;
		while (start <= end) {
			int mid = (start + end) / 2;
			if (arr[mid] > arr[mid + 1]) {
				rotateIndex = mid+1;
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return rotateIndex;
	}
}