package LinkedList;

public class reverseLinkedList {
	static Node head = null;

	public static void main(String[] args) {

		reverseLinkedList.addItem(5);
		reverseLinkedList.addItem(6);
		reverseLinkedList.addItem(7);
		reverseLinkedList.addItem(9);
		reverseLinkedList.addItem(10);
		reverseLinkedList.Display();
		reverseLinkedList.reverseList();
		reverseLinkedList.Display();
	}

	private static void Display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + "->");
			temp = temp.next;
		}
		System.out.println();

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

	private static void reverseList() {
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
