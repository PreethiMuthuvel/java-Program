package LinkedList;

public class CheckCircularList {
	
	public boolean checkNodeCircular(Node currentNode) {
		if (currentNode == null) { 
	            return false; 
	        } 
		Node slow = currentNode; 
        Node fast = currentNode.next; 
        while ( fast!=null && fast.next != null) { 
            if (slow == fast) { 
                return true; 
            } 
            slow = slow.next; 
            fast = fast.next.next; 
        }
		return false; 
	}
}
