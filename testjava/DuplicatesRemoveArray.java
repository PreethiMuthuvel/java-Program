package com.testjava;

public class DuplicatesRemoveArray {
	public int removeDuplicatesFromArray(int[] nums) {
		int index=1;
		for(int i=1;i<nums.length;i++) {
			if(nums[i]!=nums[i-1]) {
				nums[index++]=nums[i-1];
			}
		}
		return index;
}
}
