package com.testjava;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ArraySortedTest {
		
	ArrayRotate rotateArray = new ArrayRotate();
		
		@Test
		public void testjoinArray() {
			int[] arr= {3,4,5,1,2};
			
			boolean isRotated=rotateArray.isRotated(arr);
			boolean expected= true;
			assertEquals(expected,isRotated);
		    
			
		}
		@Test
		public void testjoinArray1() {
			int[] arr= {2,1,3,4};
			boolean isRotated=rotateArray.isRotated(arr);
			boolean expected= false;
			assertEquals(expected,isRotated);
		    
			
		}
		@Test
		public void testjoinArray2() {
			int[] arr= {1,2,3};
			boolean isRotated=rotateArray.isRotated(arr);
			boolean expected= true;
			assertEquals(expected,isRotated);
		    
			
		}
	

}
