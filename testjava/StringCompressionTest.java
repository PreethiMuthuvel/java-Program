package com.testjava;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class StringCompressionTest {
		
	StringCompression stringCompression = new StringCompression();
		
		@Test
		public void stringCompression() {
			char[] arr1= {'a','a','b','b','c','c'};
			
			int actual = stringCompression.stringCompression(arr1);
			int expected=6;
			//assertTrue(Arrays.equals(expected, actual));
			assertEquals(expected,actual);
		}
		@Test
		public void stringCompressionSingle() {
			char[] arr1= {'a'};
			int actual = stringCompression.stringCompression(arr1);
			int expected=1;
			//assertTrue(Arrays.equals(expected, actual));
			assertEquals(expected,actual);
		}
		@Test
		public void findIndex() {
			char[] arr1= {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
			int actual = stringCompression.stringCompression(arr1);
			int expected=4;
			//assertTrue(Arrays.equals(expected, actual));
			assertEquals(expected,actual);
		}
		
}
