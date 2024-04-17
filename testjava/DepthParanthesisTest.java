package com.testjava;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DepthParanthesisTest {
	DepthParanthesis depthParanthesis = new DepthParanthesis();
	
	@Test
	public void findDistinctCount() {
		String s="(1+(2*3)+((8)/4))+1";
		int actual = depthParanthesis.maxDepth(s);
		int expected= 3;
		assertEquals(expected,actual);
	}
	
	@Test
	public void findDistinctCount1() {
		String s="(1)+((2))+(((3)))";
		int actual = depthParanthesis.maxDepth(s);
		int expected= 3;
		assertEquals(expected,actual);
	}

}
