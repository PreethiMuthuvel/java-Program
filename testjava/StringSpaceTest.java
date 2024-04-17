package com.testjava;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class StringSpaceTest {
		
	SpaceString stringSpace = new SpaceString();
		
		@Test
		public void stringSpace() {
			String string = "IamPreethi";
			StringBuilder actual=stringSpace.space(string);
			StringBuilder expected = new StringBuilder("Iam Preethi");
			assertEquals(actual.toString(), expected.toString());
		}
		@Test
		public void stringSpaceNumber() {
			String string = "Iam1Preethi";
			StringBuilder actual=stringSpace.space(string);
			StringBuilder expected = new StringBuilder("Iam 1 Preethi");
			assertEquals(actual.toString(), expected.toString());
		}
		@Test
		public void stringSpaceSymbol() {
			String string = "Iam#Preethi";
			StringBuilder actual=stringSpace.space(string);
			StringBuilder expected = new StringBuilder("Iam # Preethi");
			assertEquals(actual.toString(), expected.toString());
		}
		
}
