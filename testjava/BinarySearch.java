package com.testjava;

public class BinarySearch {
	public int findElement(int[] arr, int searchElement, int low, int high) {
		if (low <= high) {
			int mid = (low + high) / 2;
			if (searchElement == arr[mid]) {
				return mid;
			}
			if (searchElement > arr[mid]) {
				return findElement(arr, searchElement, mid + 1, high);
			} else if (searchElement < arr[mid]) {
				return findElement(arr, searchElement, low, mid - 1);
			}

		}
		return -1;
	}
}
