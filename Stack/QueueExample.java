package Stack;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();

		queue.add("Preethi");
		queue.add("saran");
		queue.add("kavitha");

		String frontElement = queue.remove();
		System.out.println("Removed element " + frontElement);

		String peekedElement = queue.peek();
		System.out.println("Peeked element: " + peekedElement);

	}

}
