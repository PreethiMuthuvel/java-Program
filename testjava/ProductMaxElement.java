package com.testjava;

import java.util.Arrays;

public class ProductMaxElement {
	public int product(int[] arr) {
		Arrays.sort(arr);
		int n=arr.length-1;
		int product1=arr[n]*arr[n-1]*arr[n-2];
		int product2=arr[n]*arr[0]*arr[1];
        return Math.max(product1, product2);
	}
}
