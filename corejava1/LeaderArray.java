package com.preethi.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class LeaderArray {
	public static void main(String[] args) {
		int[] arr = { 16, 17, 4, 3, 5, 2 };
		int n = arr.length - 1;
		/*int temp = arr[n];
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			int[] subArray = Arrays.copyOfRange(arr, i, n);
			Arrays.sort(subArray);
			int last = subArray[subArray.length - 1];
			if (arr[i] == last) {
				result.add(arr[i]);
			}
		}
		result.add(temp);
		for (int n1 : result) {
			System.out.println(n1);
		}*/
		Stack<Integer> stack=new Stack<>();
        stack.push(arr[n]);
        for (int i = n - 1; i >= 0; i--) {
            if (arr[i] >= stack.peek()) {
                stack.push(arr[i]);
            }
        }
        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }
	}
}
