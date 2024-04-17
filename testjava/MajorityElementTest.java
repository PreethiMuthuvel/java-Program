package com.testjava;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class MajorityElementTest {
		
	MajorityElement majorityElement = new MajorityElement();
		@Test
		public void MajorityElementTest() {
			int arr[]= {3,2,3};
			int n=majorityElement.findMajorityElement(arr);
			assertEquals(3,n);
		}
		@Test
		public void MajorityElementTestLong() {
			int arr[] ={2,2,1,1,1,2,2};
			int n=majorityElement.findMajorityElement(arr);
			assertEquals(2,n);
		}
		@Test
		public void MajorityElementTestSingle() {
			int arr[] ={1,2,3};
			int n=majorityElement.findMajorityElement(arr);
			assertEquals(1,n);
		}
		
}
