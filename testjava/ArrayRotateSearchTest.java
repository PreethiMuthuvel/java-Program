package com.testjava;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ArrayRotateSearchTest {
	ArrayRotateSearch search=new ArrayRotateSearch();
	
	@Test
	public void binarySearch() {
		int[] arr1 = { 4,5,6,7,0,1,2,3 };
		int searchElement = 0;
		int actual = search.search(arr1, searchElement);
		int expected = 4;
		assertEquals(expected, actual);
	
}
	/*@Test
	public void binarySearch1() {
		int[] arr1 = { 4,5,6,7,0,1,2 };
		int searchElement = 3;
		int actual = search.search(arr1, searchElement);
		int expected = -1;
		assertEquals(expected, actual);
}*/
	/*@Test
	public void binarySearch2() {
		int[] arr1 = { 10,13,6,7,8,9 };
		int searchElement = 9;
		int actual = search.search(arr1, searchElement);
		int expected = 5;
		assertEquals(expected, actual);
}
	@Test
	public void binarySearch3() {
		int[] arr1 = {1};
		int searchElement = 0;
		int actual = search.search(arr1, searchElement);
		int expected = -1;
		assertEquals(expected, actual);
	
}*/}