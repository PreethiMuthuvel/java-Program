package Stack;

public class CustomQueueExample {
	int end = 0;
	CustomQueue queue = new CustomQueue();

	public static void main(String args[]) {

		CustomQueueExample queue = new CustomQueueExample();
		queue.addElement(5);
		queue.addElement(6);
		queue.deleteElement();
		queue.display();
	}

	private void display() {
		// TODO Auto-generated method stub
		for (int number : queue.getData()) {
			System.out.print(number + ",");
		}

	}

	private int deleteElement() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			System.out.println("Queue is empty");
		}

		int removed = queue.getData()[0];

		for (int i = 1; i < end; i++) {
			queue.getData()[i - 1] = queue.getData()[i];

		}
		end--;
		return removed;

	}

	private int addElement(int element) {
		// TODO Auto-generated method stub
		if (isFull()) {
			System.out.println("Queue is Full");
		}
		queue.getData()[end++] = element;
		return element;

	}

	private boolean isFull() {
		// TODO Auto-generated method stub

		// return end == data.length - 1;
		return end == queue.getData().length;
	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return end == 0;
	}

}
