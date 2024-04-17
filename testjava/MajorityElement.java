package com.testjava;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MajorityElement {
	public int findMajorityElement(int[] arr) {
		Map<Integer, Integer> numberCountMap = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			numberCountMap.put(arr[i], numberCountMap.getOrDefault(arr[i], 0)+1);
		}
		/*int maxValue = Collections.max(numberCountMap.values());
		for (Entry<Integer, Integer> entry : numberCountMap.entrySet()) {
			if (entry.getValue() == maxValue) {
				System.out.println(entry.getKey());
				return entry.getKey();
			}
		}*/
		int max=arr[0];
		for(int number : numberCountMap.keySet()) {
			if(numberCountMap.get(max)<numberCountMap.get(number)) {
				max=number;
			}
		}
		return max;
	}
}
