package com.testjava;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class FindindexTest {
		
	FindIndex findIndex = new FindIndex();
		
		@Test
		public void findIndex() {
			String arr1= "leetcode";
			String arr2= "leeto";
			int actual = findIndex.findIndexfromString(arr1, arr2);
			int expected= -1;
			//assertTrue(Arrays.equals(expected, actual));
			assertEquals(expected,actual);
		}
		@Test
		public void findIndexStart() {
			String arr1= "sadbutsad";
			String arr2= "sad";
			int actual = findIndex.findIndexfromString(arr1, arr2);
			int expected= 0;
			//assertTrue(Arrays.equals(expected, actual));
			assertEquals(expected,actual);
		}
		@Test
		public void findIndexMiddle() {
			String arr1= "butsadg";
			String arr2= "sad";
			int actual = findIndex.findIndexfromString(arr1, arr2);
			int expected= 3;
			//assertTrue(Arrays.equals(expected, actual));
			assertEquals(expected,actual);
		}
	

}
