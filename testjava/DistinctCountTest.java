package com.testjava;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class DistinctCountTest {
		
	DintinctCount distinctCount = new DintinctCount();
		
		@Test
		public void findDistinctCount() {
			int[] arr1= {1,2,3,1,4,5,6,3,2};
			int actual = distinctCount.calculateDistinct(arr1);
			int expected= 3;
			//assertTrue(Arrays.equals(expected, actual));
			assertEquals(expected,actual);
		}
		
		@Test
		public void findDistinctCount1() {
			int[] arr1= {1,2,3,4};
			int actual = distinctCount.calculateDistinct(arr1);
			int expected= 4;
			//assertTrue(Arrays.equals(expected, actual));
			assertEquals(expected,actual);
		}
		
	
	

}
