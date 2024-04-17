
package com.preethi.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCount {
	public static void main(String args[]) {

		int[] arr = { 4, 4, 2, 2, 2, 2, 2, 3, 3, 1, 1, 6, 7, 5 };
		List<Integer> result = FrequencyCount.frequencySort(arr);
		System.out.println(result);
	}

	private static List<Integer> frequencySort(int[] arr) {
		Map<Integer, Integer> countMap = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			countMap.put(arr[i], countMap.getOrDefault(arr[i], 0) + 1);
		}
		List<Integer> frequencyList = new ArrayList<>(countMap.keySet());
		// List<Integer> frequencyList=new ArrayList<>(countMap.values());
		frequencyList.sort((a, b) -> countMap.get(b) - countMap.get(a));
		List<Integer> resultList = new ArrayList<Integer>();
		for (int n : frequencyList) {
			int frequency = countMap.get(n);
			for (int i = 0; i < frequency; i++) {
				resultList.add(n);
			}
		}
		return resultList;
	}

}
