package com.testjava;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CommonPrefixTest {
		
	CommonPrefix commonPrefix = new CommonPrefix();
		
		@Test
		public void testCommonPrefix() {
			String strArr[] = {"flight","fly","flow","fish","flower"};
			String actual=commonPrefix.stringCommonPrefix(strArr);
			String expected="f";
			assertEquals(expected, actual);
		}
		@Test
		public void testNonCommonPrefix() {
			String strArr[] = {"dog","fly","eck"};
			String actual=commonPrefix.stringCommonPrefix(strArr);
			String expected="";
			assertEquals(expected, actual);
		}
}
