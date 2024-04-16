package LinkedList;

public class CircularList {
	public static void main(String args[]) {
		CheckCircularList list=new CheckCircularList();
		CycleList list1=new CycleList();
		Node node1 = new Node(2);
		/*Node node2 = new Node(3);
		Node node3 = new Node(3);
		Node node4 = new Node(5);
		Node node5 = new Node(6);
		Node node6 = new Node(7);*/
		//node1.next = node2;
		/*node1.next.next = node3;
		node1.next.next.next = node4;
		node1.next.next.next.next = node5;
		node1.next.next.next.next.next = node6;
		node1.next.next.next.next.next.next = node1;*/
		boolean isCircular=list.checkNodeCircular(node1);
		System.out.println("checkk"+isCircular);
		//boolean hasCycle=list1.isHasCycle(node1);//leetcode
	//	System.out.println("checkk"+hasCycle);
	}
}
