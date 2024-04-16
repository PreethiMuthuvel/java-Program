package LinkedList;

public class LinkedList {

	Node head;
	// Node prev;

	LinkedList() {
		head = null;
		// prev=null;
	}

	public void addAtBeginning(int data) {
		// TODO Auto-generated method stub
		Node newNode = new Node(data);// to create the object for new node
		// node.data=data;
		if (head == null) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void display() {
		// TODO Auto-generated method stub
		Node temp = head;// start from head
		while (temp != null) {// loop complete when it comes null
			System.out.print(temp.data + "->");
			temp = temp.next;// to move next node
		}

	}

	public void insertrAtPositition(int index, int value) {
		// TODO Auto-generated method stub

		if (index == 0) {
			addAtBeginning(value);
			return;
		}
		Node newNode = new Node(value);
		Node temp = head;
		for (int i = 0; i < index - 1; i++) {
			temp = temp.next;
			/*
			 * if(temp==null) { throw new IllegalArgumentException("Invalid Position"); }
			 */

		}
		newNode.next = temp.next;
		temp.next = newNode;

	}

	public void insertAtEnd(int value) {
		Node newNode = new Node(value);
		Node temp = head;
		// Node n=temp.next;
		while (temp.next != null) {
			temp = temp.next;

		}
		temp.next = newNode;
	}

	public void delete(int value) {
		Node temp = head;
		Node prev = null;
		if (temp.data == value) {
			head = temp.next;
		}
		while (temp != null && temp.data != value) {
			prev = temp;
			temp = temp.next;
		}
		if (temp == null) {
			return;
		}

		prev.next = temp.next;

	}

	public void reverseLinkedList() {
		// TODO Auto-generated method stub

		Node temp = head;
		Node prev = null;
		Node next;
		while (temp != null) {
			next = temp.next;
			temp.next = prev;
			prev = temp;
			temp = next;
		}
		head = prev;
	}

}
