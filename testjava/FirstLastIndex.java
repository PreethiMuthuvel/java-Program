package com.testjava;

public class FirstLastIndex {
	public int[] findFirstLastIndex(int[] arr, int low, int high, int target) {
		int first = FirstLastIndex.findFirstIndex(arr, 0, arr.length - 1, target);
		System.out.println(first);
		int last = FirstLastIndex.findLastIndex(arr, 0, arr.length - 1, target);
		System.out.println(last);
		return new int[] { first, last };
	}

	private static int findFirstIndex(int[] arr, int low, int high, int target) {
		int result = 0;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == target) {
				result = mid;
				low = mid + 1;
			} else if (arr[mid] < target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}
		return result;

	}

	private static int findLastIndex(int[] arr, int low, int high, int target) {
		int result = 0;
		while (low <= high) {
			int mid = (low + high) / 2;
			if (arr[mid] == target) {
				result = mid;
				high = mid - 1;
			} else if (arr[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}

		return result;
	}

}