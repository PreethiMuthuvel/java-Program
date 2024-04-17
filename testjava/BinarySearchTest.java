package com.testjava;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class BinarySearchTest {

	BinarySearch binarySearch = new BinarySearch();

	@Test
	public void binarySearch() {
		int[] arr1 = { 1, 2, 3, 7, 9 };
		int searchElement = 3;
		int actual = binarySearch.findElement(arr1, searchElement, 0, arr1.length - 1);
		int expected = 2;
		assertEquals(expected, actual);
	}
	@Test
	public void binarySearchRight() {
		int[] arr1 = { 1, 2, 3, 7, 8,9,49};
		int searchElement = 8;
		int actual = binarySearch.findElement(arr1, searchElement, 0, arr1.length - 1);
		int expected = 4;
		assertEquals(expected, actual);
	}
	@Test
	public void binarySearchLeft() {
		int[] arr1 = { 1, 2, 3, 7, 8,9,49};
		int searchElement = 2;
		int actual = binarySearch.findElement(arr1, searchElement, 0, arr1.length - 1);
		int expected = 1;
		assertEquals(expected, actual);
	}

}
