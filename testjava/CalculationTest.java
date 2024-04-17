package com.testjava;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculationTest {
		
		Calculation calculation = new Calculation();
		
		@Test
		public void testAdd() {
			int sum = calculation.add(10, 20);
			assertEquals(30, sum);
		}

	

}
