package LinkedList;

import java.util.Stack;

import LinkedList.Node;

public class StackPalindromeTest {

	Node head = null;

	Stack<Integer> stack = new Stack<Integer>();

	public void addElement(int element) {

		Node newNode = new Node(element);

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

	public void displayList() {
		Node temp = head;

		while (temp != null) {
			System.out.println(temp.data + " ");
			temp = temp.next;
		}

	}

	public boolean checkPalindromee(int size) {

		int middle = size / 2;
		int start = 0;
		Node temp = head;
		boolean isCheck = true;
		while (temp != null && start < middle) {

			stack.push(temp.data);
			start++;
			temp = temp.next;

		}

		// Node afterMiddleNode =temp;
		if (size % 2 != 0) {
			temp = temp.next;
		}

		while (temp != null) {

			if (temp.data == stack.peek()) {

				temp = temp.next;
				stack.pop();

			} else {
				isCheck = false;
				break;
			}

		}
		return isCheck;

	}

	public int findSize() {

		int count = 0;
		Node temp = head;

		while (temp != null) {
			count++;
			
			temp = temp.next;
		}
		System.out.println(count);
		return count;

	}

}
