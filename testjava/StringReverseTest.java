package com.testjava;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StringReverseTest {
		
	StringReverse stringReverse = new StringReverse();
		
		@Test
		public void stringReverse() {
			String string = "I am preethi";
			String actual=stringReverse.reverseString(string);
			String expected="preethi am I";
			assertEquals(expected, actual);
		}
		@Test
		public void stringReverse1() {
			String string = "saran and preethi";
			String actual=stringReverse.reverseString(string);
			String expected="preethi and saran";
			assertEquals(expected, actual);
		}
}
