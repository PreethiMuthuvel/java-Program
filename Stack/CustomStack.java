package Stack;

public class CustomStack {

	int[] data;
	private static final int default_size = 10;

	int ptr = -1;

	CustomStack() {

		this(default_size);
	}

	CustomStack(int size) {

		this.data = new int[size];
	}

	public int addElement(int element) {
		// TODO Auto-generated method stub

		if (isFull()) {
			System.out.println("Stack is full");
			
		}
		 ptr++;;
		data[ptr] = element;
		
		return element;
	}

	private boolean isFull() {
		// TODO Auto-generated method stub

		return ptr == data.length - 1;
	}

	public int removeElement() {
		// TODO Auto-generated method stub
		if (isEmpty()) {
			System.out.println("Stack is empty");
          
		}
		int removed = data[ptr];
		ptr--;
		return removed;

	}

	private boolean isEmpty() {
		// TODO Auto-generated method stub
		return ptr == -1;
	}

	public int peekElement() {
		if (isEmpty()) {
			System.out.println("Stack is empty");

		}
		System.out.println("Peeke element is "+data[ptr]);
		return data[ptr];
		

	}

	public void display() {
		// TODO Auto-generated method stub
		
		for(int number : data) {
			System.out.print(number+",");
			
		}
		System.out.println();
	}

	public int searchElement(int element) {
		// TODO Auto-generated method stub
		int index=0;
		for(int i=0;i<data.length;i++) {
			if(data[i]==element) {
				 index=i;
			}
		}
		return index;
		
	}

}
