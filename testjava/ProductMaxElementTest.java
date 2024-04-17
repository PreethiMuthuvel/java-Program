package com.testjava;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class ProductMaxElementTest {
	ProductMaxElement product = new ProductMaxElement();
		@Test
		public void prodcut1() {
			int[] arr1= {1,2,3,4};
			int actual = product.product(arr1);
			int expected= 24;
			//assertTrue(Arrays.equals(expected, actual));
			assertEquals(expected,actual);
		}
		@Test
		public void prodcut2() {
			int[] arr1= {1,2,3};
			int actual = product.product(arr1);
			int expected= 6;
			//assertTrue(Arrays.equals(expected, actual));
			assertEquals(expected,actual);
		}
		@Test
		public void prodcut3() {
			int[] arr1= {-1,-2,-3,6,-4};
			int actual = product.product(arr1);
			int expected= 72;
			//assertTrue(Arrays.equals(expected, actual));
			assertEquals(expected,actual);
		}
		

}
