package LinkedList;

public class JoinTwoList {

	public static void main(String args[]) {
		Node head1 = new Node(1);
		head1.next = new Node(5);
		head1.next.next = new Node(7);
		head1.next.next.next = new Node(8);
		Node head2 = new Node(2);
		head2.next = new Node(4);
		head2.next.next = new Node(6);
		Node resullt = JoinTwoList.concateList(head1, head2);
		System.out.println(resullt);

	}

	private static Node concateList(Node head1, Node head2) {
		if (head1 == null) {
			return head2;
		}
		if (head2 == null) {
			return head1;
		}
		Node mergeList = null;
		Node temp1 = head1;
		Node temp2 = head2;

		if (temp1.data < temp2.data) {
			mergeList = temp1;
			mergeList.next = concateList(temp1.next, temp2);
			
		} else {
			mergeList = temp2;
			mergeList.next = concateList(temp2.next, temp1);
			//temp2 = temp2.next;
		}

		/*
		 * if (temp1.data < temp2.data) { mergeList = temp1; temp1 = temp1.next; } else
		 * { mergeList = temp2; temp2 = temp2.next; } Node current = mergeList; while
		 * (temp1 != null && temp2 != null) { if (temp1.data < temp2.data) {
		 * current.next = temp1; temp1 = temp1.next; } else { current.next = temp2;
		 * temp2 = temp2.next; } current = current.next; } if (temp1 != null) {
		 * current.next = temp1; } else { current.next = temp2; }
		 */
		return mergeList;
	}
}