package com.testjava;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class LinkAddTest {
		
		ListAdd listAdd = new ListAdd();
		
		@BeforeEach
		public void linkedListCreate() {
			listAdd.linkedListCreate(9);
			listAdd.linkedListCreate(9);
			listAdd.linkedListCreate(9);
		}
		@Test
		public void listAfterAdd() { 
		Node result=listAdd.listAfterAdd();
		Node expected = new Node(1);
		expected.next = new Node(7);
		expected.next.next = new Node(0);
		expected.next.next.next = new Node(0);
		assertEquals(expected.data, result.data);
		System.out.println(expected.data+","+result.data);
		assertEquals(expected.next.data, result.next.data);
		System.out.println(expected.next.data+","+result.next.data);
		assertEquals(expected.next.next.data, result.next.next.data);
		System.out.println(expected.next.next.data+","+result.next.next.data);
		}

}
