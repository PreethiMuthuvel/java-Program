package com.testjava;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class RectangleOverLapTest {
		
	RectangleOverLap overLap = new RectangleOverLap();
		
		@Test
		public void overLap() {
			int[] arr1= {0,0,2,2};
			int[] arr2= {1,1,3,3};
			boolean actual = overLap.isRectangleOverLap(arr1, arr2);
			boolean expected= true;
			assertEquals(expected,actual);
		}
		@Test
		public void overLap1() {
			int[] arr1= {0,0,1,1};
			int[] arr2= {1,0,2,1};
			boolean actual = overLap.isRectangleOverLap(arr1, arr2);
			boolean expected= false;
			assertEquals(expected,actual);
		}
		@Test
		public void overLap2() {
			int[] arr1= {0,0,1,1};
			int[] arr2= {2,2,3,3};
			boolean actual = overLap.isRectangleOverLap(arr1, arr2);
			boolean expected= false;
			assertEquals(expected,actual);
		}

		@Test
		public void overLap3() {
			int[] arr1=  {1, 1, 6, 6};
			int[] arr2={2, 2, 5, 5};
			boolean actual = overLap.isRectangleOverLap(arr1, arr2);
			boolean expected= true;
			assertEquals(expected,actual);
		}
		@Test
		public void overLap4() {
			int[] arr1={1,1,3,3};
			int[] arr2= {0,0,2,2};
			boolean actual = overLap.isRectangleOverLap(arr1, arr2);
			boolean expected= true;
			assertEquals(expected,actual);
		}

}
