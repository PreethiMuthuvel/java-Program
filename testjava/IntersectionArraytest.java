package com.testjava;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class IntersectionArraytest {
		
	IntersectionArray intersectArray = new IntersectionArray();
		
		@Test
		public void intersectArray() {
			int[] arr1= {1,2,2,1};
			int[] arr2= {2,2};
			int[] actual = intersectArray.insertionArray(arr1, arr2);
			int[] expected= {2};
			//assertTrue(Arrays.equals(expected, actual));
			assertArrayEquals(expected,actual);
		}
		
		@Test
		public void intersectArray1() {
			int[] arr1= {4,9,5};
			int[] arr2= {9,4,9,8,4};
			int[] actual = intersectArray.insertionArray(arr1, arr2);
			int[] expected= {9,4};
			//assertTrue(Arrays.equals(expected, actual));
			assertArrayEquals(expected,actual);
		}
		

	

}
