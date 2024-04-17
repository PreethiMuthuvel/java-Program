package com.testjava;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MiddleElementTest {

	MiddleElement midElement = new MiddleElement();

	@BeforeEach
	public void linkedListCreate() {
		midElement.linkedListCreate(9);
		midElement.linkedListCreate(3);
		midElement.linkedListCreate(9);

	}

	@Test
	public void fineMiddle() {
		int result = midElement.findMiddleElement();
		int expected = 3;
		assertEquals(expected, result);
	}

	@Test
	public void fineMiddleElement() {
		midElement.linkedListCreate(3);
		midElement.linkedListCreate(4);
		midElement.linkedListCreate(45);
		midElement.linkedListCreate(8);
		midElement.linkedListCreate(10);
		midElement.linkedListCreate(11);
		midElement.linkedListCreate(12);
		midElement.linkedListCreate(13);
		int result = midElement.findMiddleElement();
		int expected = 45;
		assertEquals(expected, result);
	}

}
