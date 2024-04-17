package com.testjava;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class RotateArrayShift {
		
	RotateArray rotateArray = new RotateArray();
		
		@Test
		public void testAdd() {
			int[] arr1= {1,2,3,4,5,6,7};
			int k=3;
			int[] actual = rotateArray.rotateArray(arr1, k);
			int[] expected= {5,6,7,1,2,3,4};
			//assertTrue(Arrays.equals(expected, actual));
			assertArrayEquals(expected,actual);
		}
		@Test
		public void testAddDiffDigit() {
			int[] arr1= {-1,-100,3,99};
			int k=2;
			int[] actual = rotateArray.rotateArray(arr1, k);
			int[] expected= {3,99,-1,-100};
			assertArrayEquals(expected,actual);
		    
		}

	

}
