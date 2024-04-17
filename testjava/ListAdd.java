package com.testjava;
public class ListAdd {
	Node head;
	int number=0;
	int count=0;
	public void linkedListCreate(int data) {
		Node newNode=new Node(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Node temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
	}
	public Node listAfterAdd() {
		Node temp=head;
		while(temp!=null) {
			System.out.println(temp.data+"->");
			number=number*10+temp.data;
			temp=temp.next;
			count++;
		}
		number=number+1;
		while(number>0) {
			int rem=number%10;
			overrideNodeData(count,rem);
			count--;
			number=number/10;
		}
	    temp = head;
		System.out.println(head);
		return head;
	}
	 public void overrideNodeData(int position, int newData) {
	        Node temp = head;
	        int currentPosition = 1;
	        while (temp != null) {
	            if (currentPosition == position) {
	                temp.data = newData;
	                break;
	            }
	            temp = temp.next;
	            currentPosition++;
	        }
	    }
}
