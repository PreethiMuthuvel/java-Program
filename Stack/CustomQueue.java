package Stack;

import java.util.Arrays;

public class CustomQueue {
	private int[] data;
	private  static final int default_size=10;
	
	
	public int[] getData() {
		return data;
	}

	public void setData(int[] data) {
		this.data = data;
	}

	CustomQueue() {

		this(default_size);
	}

	CustomQueue(int size) {

		this.data = new int[size];
	}

	@Override
	public String toString() {
		return "CustomQueue [data=" + Arrays.toString(data) + "]";
	}
	


}
