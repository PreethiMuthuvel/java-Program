package com.testjava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DintinctCount {
	public int calculateDistinct(int[] arr) {
		Map<Integer,Integer> countMap=new HashMap<>();
		for(int number:arr) {
			countMap.put(number, countMap.getOrDefault(number, 0)+1);
		}
		List<Integer> valueList=new ArrayList<>(countMap.values());
		int count=0;
		for(int number:valueList) {
		if(number==1) {
			count++;
		}
		}
		return count;
	}

}
