package com.preethi.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class duplicateMissingNumber {
	static Map<Integer,Integer> numberMap=new HashMap<Integer,Integer>();
	public static void main(String args[]) {

		int[] numberArray = {1,2,3,4,5,5};
		duplicateMissingNumber.findDuplicateMissing(numberArray);
	}

	private static void findDuplicateMissing(int[] numberArray) {
		for(int number : numberArray) {
			numberMap.put(number, numberMap.getOrDefault(number, 0)+1);
		}
		for(int number :numberMap.keySet()) {
			if(numberMap.get(number)>1){
				System.out.println("Duplicate Number "+number);
			}
		}
		for(int i=1 ; i<=numberArray.length;i++) {
			if(!numberMap.containsKey(i)) {
				System.out.println("Missing number is "+i);
			}
		}
 	}
}
