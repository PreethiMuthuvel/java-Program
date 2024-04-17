package com.testjava;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PowerTest {
	Power power=new Power(); 
	@Test
	public void findPowerTwoDigit() {
		int number = 100;
		boolean actual=power.isPower(number);
		boolean expected=true;
		assertEquals(expected, actual);
	}
	@Test
	public void findPowerTwoDigit1() {
		int number = 900;
		boolean actual=power.isPower(number);
		boolean expected=false;
		assertEquals(expected, actual);
	}
	@Test
	public void findPowerThreeDigit() {
		int number = 11;
		boolean actual=power.isPower(number);
		boolean expected=false;
		assertEquals(expected, actual);
	}
	@Test
	public void findPowerThreeDigit2() {
		int number = 150;
		boolean actual=power.isPower(number);
		boolean expected=false;
		assertEquals(expected, actual);
	}

}
