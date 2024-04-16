package LinkedList;

import java.util.Scanner;

public class MiddleNode {
	static Node head = null;

	public static void main(String[] args) {
		MiddleNode.addItem(5);
		MiddleNode.addItem(6);
		MiddleNode.addItem(7);
		MiddleNode.addItem(9);
		MiddleNode.addItem(11);
		MiddleNode.addItem(12);
		MiddleNode.addItem(14);
		MiddleNode.addItem(13);
		MiddleNode.Display();
		int size = MiddleNode.listSize();
	//	MiddleNode.findMiddleNode(size);
		//MiddleNode.deletedNode(size, 6);
		//MiddleNode.deleteNodeTwoPointer(8);
		MiddleNode.deleteNodeTwoPointer1(3);
		MiddleNode.Display();
	}

	private static void deleteNodeTwoPointer(int number) {
		Node firstPtr=head;
		Node secondPtr=head;
		Node prev = null;
		int i=1;
		while(firstPtr!=null && i<=number) {
			firstPtr=firstPtr.next;
			i++;
		}
		while(firstPtr!=null) {
			firstPtr=firstPtr.next;
			prev=secondPtr;
			secondPtr=secondPtr.next;
		}
		if(prev==null) {
			head=secondPtr.next;
		}
		else {
			prev.next=secondPtr.next;
		}
		
		
	}
	private static void deleteNodeTwoPointer1(int number) {
		Node firstPtr=head;
		Node secondPtr=head;
		int i=1;
		while(firstPtr!=null && i<=number) {
			firstPtr=firstPtr.next;
			i++;
		}
		
		if(firstPtr==null) {
			head=secondPtr.next;
			return;
		}
		
		while(firstPtr.next!=null) {
			firstPtr=firstPtr.next;
			secondPtr=secondPtr.next;
		}
			secondPtr.next=secondPtr.next.next;
		
		
	}


	private static void deletedNode(int size, int n) {

		int beforedeleteNode = size - n;
		Node prev = null;
		Node temp = head;
		int start = 0;
		while (temp != null && start < beforedeleteNode) {
			prev = temp;
			temp = temp.next;
			start++;
		}
		prev.next = temp.next;

	}

	private static void findMiddleNode(int size) {
		Node temp = head;
		int mid = size / 2;
		int start = 1;
		while (temp != null && start <= mid) {
			temp = temp.next;
			start++;
		}
		System.out.println("Middle node is " + temp.data);

	}

	private static int listSize() {
		Node temp = head;
		int size = 0;
		while (temp != null) {
			size++;
			temp = temp.next;
		}
		return size;

	}

	private static void addItem(int value) {
		Node newNode = new Node(value);
		Node temp = head;
		if (head == null) {
			head = newNode;
			return;
		}
		while (temp.next != null) {
			temp = temp.next;
		}
		temp.next = newNode;
	}

	private static void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println();

	}

}
