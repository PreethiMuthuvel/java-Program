package com.testjava;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class OddEvenTest {
	OddEven oddEven=new OddEven();
	@Test
	public void testOdd() {
		int[] arr1= {1,9,2,3,8,7};
		int[] actual = oddEven.oddEvenArray(arr1);
		int[] expected= {1,9,7,3,8,2};
		//assertTrue(Arrays.equals(expected, actual));
		assertArrayEquals(expected,actual);
	}
	@Test
	public void testEven() {
		int[] arr1= {1,9,2,3,8,7,20};
		int[] actual = oddEven.oddEvenArray(arr1);
		int[] expected= {1,9,7,3,8,2,20};
		//assertTrue(Arrays.equals(expected, actual));
		assertArrayEquals(expected,actual);
	}
	@Test
	public void testEven1() {
		int[] arr1= {1,9,2,3,60,19,8,7,20,11};
		int[] actual = oddEven.oddEvenArray(arr1);
		int[] expected= {1,9,11,3,7,19,8,60,20,2};
		//assertTrue(Arrays.equals(expected, actual));
		assertArrayEquals(expected,actual);
	}
	

}
