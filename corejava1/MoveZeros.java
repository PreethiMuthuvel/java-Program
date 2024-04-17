package com.preethi.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveZeros {
	public static void main(String args[]) {
		int[] numberArray = { 0, 1, 0, 3, 12 };
		int index = 0;
		for (int i = 0; i < numberArray.length; i++) {
			if (numberArray[i] != 0) {
				numberArray[index++] = numberArray[i];
			}
		}
		for (int j = index; j < numberArray.length; j++) {
			numberArray[index++] = 0;
		}
		for (int number : numberArray) {
			System.out.print(number + ",");
		}

	}
}