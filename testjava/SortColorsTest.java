package com.testjava;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

public class SortColorsTest {
		
	SortColors sortColors = new SortColors();
		
		@Test
		public void sortColorArray() {
			int[] arr= {2,0,2,1,1,0};
			int[] actual=sortColors.sortColors(arr); 
			int[] expected= {0,0,1,1,2,2};
			assertArrayEquals(expected,actual);
		    
			
		}
		@Test
		public void sortColorArray1() {
			int[] arr= {2,0,1};
			int[] actual=sortColors.sortColors(arr); 
			int[] expected= {0,1,2};
			assertArrayEquals(expected,actual);
		    
			
		}
		
}
