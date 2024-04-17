package com.testjava;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class RangeCalculationTest {
		
	RangeCalculation rangeCalculation = new RangeCalculation();
		
		@Test
		public void testRangeCount() {
			int start=10;
			int end=30;
			int actual = rangeCalculation.findValueInRange(start,end);
			int expected= 6;
			//assertTrue(Arrays.equals(expected, actual));
			assertEquals(expected,actual);
		}
		@Test
		public void testRangeCount1() {
			int start=50;
			int end=60;
			int actual = rangeCalculation.findValueInRange(start,end);
			int expected= 3;
			//assertTrue(Arrays.equals(expected, actual));
			assertEquals(expected,actual);
		}
		
		

	

}
