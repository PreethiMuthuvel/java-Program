package com.sort;

public class Sort {

	public void bubbleSort(int[] numberArray) {

		for (int i = 1; i <= numberArray.length; i++) {

			boolean isSwapped = false;
			for (int j = 0; j < numberArray.length - i; j++) {

				if (numberArray[j] > numberArray[j + 1]) {
					isSwapped = true;
					int temp = numberArray[j];
					numberArray[j] = numberArray[j + 1];
					numberArray[j + 1] = temp;
				}

			}
			if (!isSwapped) {
				break;
			}

		}

	}

	public void insertionSort(int[] numberArray) {

		for (int i = 1; i < numberArray.length; i++) {

			for (int j = i; j > 0; j--) {

				if (numberArray[j] < numberArray[j - 1]) {
					int temp = numberArray[j - 1];
					numberArray[j - 1] = numberArray[j];
					numberArray[j] = temp;
				} else {
					break;
				}
			}
		}

	}

	public void selectionSort(int[] numberArray) {

		for (int i = 0; i < numberArray.length; i++) {

			int minIndex = i;
			for (int j = i + 1; j < numberArray.length; j++) {

				if (numberArray[minIndex] > numberArray[j]) {
					minIndex = j;
				}
			}
			int temp = numberArray[i];
			numberArray[i] = numberArray[minIndex];
			numberArray[minIndex] = temp;

		}
	}
	
}
