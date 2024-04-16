package LinkedList;

public class LinkedListMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList list=new LinkedList();
		
	/*	list.addAtBeginning(5);
		list.addAtBeginning(4);
		list.addAtBeginning(3);
		list.addAtBeginning(2);*/
		list.addAtBeginning(1);
		list.insertAtEnd(8);
		
		list.display();
		list.reverseLinkedList();
		System.out.println();
		list.display();
		//list.size();
		//list.insertrAtPositition(1,6);
	//	list.insertrAtPositition(5,6);
	//	list.display();
		
	}

}
