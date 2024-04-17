package com.testjava;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ArrayAddTest {
		
	ArrayAdd arrAdd = new ArrayAdd();
		
		@Test
		public void testAdd() {
			int[] arr1= {1,2,3};
			int[] arr2= {9,4,7};
			int[] actual = arrAdd.arrayAdd(arr1, arr2);
			int[] expected= {1,0,7,0};
			//assertTrue(Arrays.equals(expected, actual));
			assertArrayEquals(expected,actual);
		}
		@Test
		public void testAddDiffDigit() {
			int[] arr1= {1,2,3,0};
			int[] arr2= {3,6,4};
			int[] actual = arrAdd.arrayAdd(arr1, arr2);
			int[] expected= {1,5,9,4};
			assertArrayEquals(expected,actual);
		    
		}

	

}
