package com.preethi.test;

import java.util.Arrays;

public class ArrayEqualSum {

	public static void main(String[] args) {
		int[] arr = {4,1,2,1,1,1};
		int start = 0;
		int end = arr.length - 1;
		int mid = arr.length / 2;
		int sum1 = 0;
		for (int i = start; i < mid; i++) {
			sum1 = sum1 + arr[i];
		}
		int sum2 = 0;
		for (int i = mid; i <= end; i++) {
			sum2 = sum2 + arr[i];
		}
		while (start <= end) {
			if (sum1 == sum2) {
				int[] leftArr = Arrays.copyOfRange(arr, start, mid);
				int[] rightArr = Arrays.copyOfRange(arr, mid, end + 1);
				for (int n1 : leftArr) {
					System.out.print(n1);
				}
				System.out.println();
				for (int n2 : rightArr) {
					System.out.print(n2);
				}
				return;
			} else if (sum1 < sum2) {
				sum2 = sum2 - arr[mid];
				sum1 = sum1 + arr[mid];
				mid=mid+1;
			} else {
				sum1 = sum1 - arr[mid];
				sum2 = sum2 + arr[mid];
				mid=mid-1;
			}
			
		}
	}
}
