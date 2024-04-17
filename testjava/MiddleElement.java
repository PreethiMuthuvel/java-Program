package com.testjava;

public class MiddleElement {
	Node head;

	public void linkedListCreate(int data) {
		Node newNode = new Node(data);
		if (head == null) {
			head = newNode;
			return;
		}
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	public int findMiddleElement() {
		Node slow = head;
		Node fast = head.next;
 		while (fast != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}
}
