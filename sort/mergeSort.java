package com.sort;

import java.util.Arrays;

public class mergeSort {

	public static int[] mergeSort(int[] numberArray3) {
		if (numberArray3.length == 1)
			return numberArray3;

		int midValue = numberArray3.length / 2;
		int[] leftArray =mergeSort(Arrays.copyOfRange(numberArray3, 0, midValue));
		int[] rightArray = mergeSort(Arrays.copyOfRange(numberArray3, midValue, numberArray3.length));

		return merge(leftArray, rightArray);

	}

	private static int[] merge(int[] leftArray, int[] rightArray) {

		int[] joinedArray = new int[leftArray.length + rightArray.length];
		int i = 0;
		int j = 0;
		int k = 0;
		while (i < leftArray.length && j < rightArray.length) {
			if (leftArray[i] < rightArray[j]) {
				joinedArray[k++] = leftArray[i++];
			} else {
				joinedArray[k++] = rightArray[j++];
				
			}
		}

		while (i < leftArray.length) {
			joinedArray[k++] = leftArray[i++];
		}
		while (j < rightArray.length) {
			joinedArray[k++] = rightArray[j++];
		}
		//System.out.println(Arrays.toString(joinedArray));
		return joinedArray;
		

	}

}




