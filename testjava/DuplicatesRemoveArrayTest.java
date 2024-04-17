package com.testjava;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class DuplicatesRemoveArrayTest {
		
	DuplicatesRemoveArray array = new DuplicatesRemoveArray();
		
		@Test
		public void testDuplicateArray() {
			int[] arr= {1,1,2};
			int result=array.removeDuplicatesFromArray(arr);
			int expectedArray=2;
			assertEquals(result,expectedArray,"length");
		}
		@Test
		public void testDuplicateArrayLong() {
			int[] arr= {0,0,1,1,1,2,2,3,3,4};
			int result=array.removeDuplicatesFromArray(arr);
			System.out.println(result);
			int expectedArray=5;
			assertEquals(result,expectedArray,"length");
		}
}
