package com.testjava;

import java.util.ArrayList;
import java.util.List;

public class SubArray {
	public int countSubArray(int[] arr, int target) {
		List<int[]> subArrayList = new ArrayList<>();

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == target) {
				subArrayList.add(new int[] { arr[i] });
			} else {
				for (int j = i + 1; j < arr.length; j++) {
					if (target == arr[i] + arr[j]) {
						subArrayList.add(new int[] { arr[i], arr[j] });
					}
				}
			}
		}
		return subArrayList.size();
	}
}
