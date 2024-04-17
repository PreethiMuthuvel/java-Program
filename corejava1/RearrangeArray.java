package com.preethi.test;

public class RearrangeArray {
	public static void main(String args[]) {
		int nums[] = { 28,-41,22,-8,-37,46,35,-9,18,-6,19,-26,-37,-10,-9,15,14,31 };
		/*
		 * for (int i = 0; i < nums.length - 1; i++) { if ((i % 2 == 0 && nums[i] < 0)
		 * || (i % 2 != 0 && nums[i] > 0)) { for (int j = i + 1; j <= nums.length - 1;
		 * j++) { if ((nums[j] > 0 && i % 2 == 0) || (nums[j] < 0 && i % 2 != 0)) { int
		 * temp = nums[i]; nums[i] = nums[j]; nums[j] = temp; break; } } } }
		 */

		int[] ans = new int[nums.length];
		int i = 0, j = 1;
		for(int n:nums){
            if(n>0){
                ans[i] = n;
                i+=2;
            }
            else{
                ans[j] = n;
                j+=2;
            }
        }
		for (int number : ans) {
			System.out.print(number + " ");
		}
	}
}
