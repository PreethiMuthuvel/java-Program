package com.testjava;

public class ProductArray {

	public int[] productArrayExceptSelf(int[] arr) {
		int[] result = new int[arr.length];
		/*
		 * for (int i = 0; i < arr.length; i++) { int product1 = product(arr, 0, i - 1);
		 * int product2 = product(arr, i + 1, arr.length - 1); product[i] = product1 *
		 * product2; } return product; }
		 * 
		 * private int product(int[] arr, int start, int end) { int product = 1; for
		 * (int i = start; i <= end; i++) { product *= arr[i]; }
		 */
		int prefixProduct = 1;
		int suffixProduct = 1;
		int[] product1 = new int[arr.length];
		int[] product2 = new int[arr.length];
		product1[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			product1[i] = prefixProduct * arr[i - 1];
			prefixProduct = product1[i];
		}
		int n = arr.length - 1;
		product2[n] = 1;
		for (int j = n - 1; j >= 0; j--) {
			product2[j] = suffixProduct * arr[j + 1];
			suffixProduct = product2[j];
		}
		for (int i = 0; i < result.length; i++) {
			result[i] = product1[i] * product2[i];
		}

		return result;
	}
}
