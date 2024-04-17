package com.testjava;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ProductArrayTest {
		
	ProductArray poduct = new ProductArray();
		
		@Test
		public void prductArrayNonZero() {
			int[] arr1= {1,2,3,4};
			int[] actual = poduct.productArrayExceptSelf(arr1);
			int[] expected= {24,12,8,6};
			assertArrayEquals(expected,actual);
		}
		@Test
		public void prductArrayZero() {
			int[] arr1= {-1,1,0,-3,3};
			int[] actual = poduct.productArrayExceptSelf(arr1);
			int[] expected= {0,0,9,0,0};
			assertArrayEquals(expected,actual);
		}
		
}
