package com.testjava;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class PalindromeTest {
		
		Palindrome palindrome = new Palindrome();
		@Test
		public void testPalindromewithValid() {
			boolean isPalindrome=palindrome.isPalindrome("madam");
			assertEquals(true,isPalindrome);
		}
		@Test
		public void testPalindromewithInValid() {
			boolean isPalindrome=palindrome.isPalindrome("madamo");
			assertEquals(false,isPalindrome);
		}
		@Test
		public void testPalindromewithmiddletwo() {
			boolean isPalindrome=palindrome.isPalindrome("maddam");
			assertEquals(true,isPalindrome);
		}
}
