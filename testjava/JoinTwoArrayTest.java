package com.testjava;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class JoinTwoArrayTest {
		
	JoinTwoArray joinArray = new JoinTwoArray();
		
		@Test
		public void testjoinArray() {
			int[] arr1= {1,3,5};
			int[] arr2= {2,4,6};
			int[] resultArray=joinArray.joinedArray(arr1, arr2);
			for(int number :resultArray) {
				System.out.println(number);
			}
			int[] expectedArray= {1,2,3,4,5,6};
			assertTrue(Arrays.equals(resultArray, expectedArray));
		    
			
		}
		@Test
		public void testjoinArraywithDuplicates() {
			int[] arr1= {7,3,5};
			int[] arr2= {2,3,4,6};
			int[] resultArray=joinArray.joinedArray(arr1, arr2);
			for(int number :resultArray) {
				System.out.println(number);
			}
			int[] expectedArray= {2,3,3,4,5,6,7};
			assertTrue(Arrays.equals(resultArray, expectedArray));
		}

	

}
