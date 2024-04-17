package com.testjava;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class SubArrayTest {
		
	SubArray subArray = new SubArray();
		
		@Test
		public void subArray() {
			int[] arr1= {1,2,3};
			int target=3;
			int actual = subArray.countSubArray(arr1,target);
			int expected= 2;
			assertEquals(expected,actual);
		}
		@Test
		public void subArray1() {
			int[] arr1= {1,1,1};
			int target=2;
			int actual = subArray.countSubArray(arr1,target);
			int expected= 2;
			assertEquals(expected,actual);
		}
		

}
