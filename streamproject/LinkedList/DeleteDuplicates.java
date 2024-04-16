package LinkedList;

public class DeleteDuplicates {
	public static void main(String args[]) {
		Node node1 = new Node(1);
		Node node2 = new Node(1);
		Node node3 = new Node(1);
		Node node4 = new Node(5);
		Node node5 = new Node(6);
		node1.next = node2;
		node1.next.next = node3;
		node1.next.next.next = node4;
		node1.next.next.next.next = node5;
		Node resultList=DeleteDuplicates.removeDuplicates(node1);
		System.out.println("Print datas after duplicates");
		DeleteDuplicates.printList(resultList);

	}

	private static void printList(Node resultList) {
		Node temp=resultList;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		
	}

	private static Node removeDuplicates(Node node1) {//sortedLinkedList
		Node temp = node1;
		while (temp != null && temp.next != null) {
			if (temp.data == temp.next.data) {
				temp.next = temp.next.next;
				temp=temp.next.next;
			}
			else {
			temp = temp.next;}
		}
		return node1;
	}
}
