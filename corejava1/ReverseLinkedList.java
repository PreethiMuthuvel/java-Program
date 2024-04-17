package com.preethi.test;

public class ReverseLinkedList {
	static Nodee head;
	public static void main(String args[]) {
		ReverseLinkedList.addElement(1);
		ReverseLinkedList.addElement(2);
		ReverseLinkedList.addElement(3);
		ReverseLinkedList.addElement(4);
		ReverseLinkedList.addElement(5);
		ReverseLinkedList.display();
		ReverseLinkedList.reverseList();
		ReverseLinkedList.display();
		
	}
	private static void addElement(int data) {
		Nodee newNode=new Nodee(data);
		if(head==null) {
			head=newNode;
			return;
		}
		Nodee temp=head;
		while(temp.next!=null) {
			temp=temp.next;
		}
		temp.next=newNode;
	}
	private static void display() {
		Nodee temp=head;
		while(temp!=null) {
			System.out.print(temp.data+"->");
			temp=temp.next;
		}
		System.out.println();
	}
	private static void reverseList() {
		Nodee temp=head;
		Nodee next;
		Nodee prev=null;
		while(temp!=null) {
			next=temp.next;
			temp.next=prev;
			prev=temp;
			temp=next;
		}
		head=prev;
		
	}
}
