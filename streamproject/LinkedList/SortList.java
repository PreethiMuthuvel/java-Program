package LinkedList;

import java.util.ArrayList;
import java.util.List;

import LinkedList.DeleteDuplicates;
import LinkedList.Node;

public class SortList {
	public static void main(String[] args) {
		Nodee node1 = new Nodee(1);
		Nodee node2 = new Nodee(1);
		Nodee node3 = new Nodee(1);
		Nodee node4 = new Nodee(5);
		Nodee node5 = new Nodee(6);
		node1.next = node2;
		node1.next.next = node3;
		node1.next.next.next = node4;
		node1.next.next.next.next = node5;
		Nodee resultList=sortList(node1);
}

	
		 private static  Nodee sortList(Nodee head) {
		        List<Integer> list=new ArrayList<Integer>();
		        if(head==null)
		         return head;
		         Nodee mid=middleNode(head);
		         Nodee left=head;
		         Nodee right=mid.next;
		          return merge(sortList(left),sortList(right));
		      
		    }
		    public static  Nodee  merge(Nodee left,Nodee right){
		        Nodee node=new Nodee(-1);
		        Nodee temp=node;
		        while(left!=null && right!=null){
		            if(left.data<right.data){
		                temp.next=left;
		                left=left.next;
		                temp=temp.next;
		            }
		            else{
		                temp.next=right;
		                right=right.next;
		                temp=temp.next;
		            }
		        }
		        while(left!=null){
		            temp.next=left;
		            left=left.next;
		            temp=temp.next;
		        }
		        while(right!=null){
		            temp.next=right;
		            right=right.next;
		            temp=temp.next;
		        }
		        return node;
		    }

		    public static Nodee middleNode(Nodee head)
		      {
		         Nodee temp=head;
		         Nodee slow=head;
		         Nodee fast=head;
		 		 while (fast != null) {
					slow = slow.next;
					fast = fast.next.next;
				}
				return slow;
			}     
		}