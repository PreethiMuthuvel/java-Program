package Stack;

public class CustomStackExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomStack customStack=new CustomStack();
		CustomStack customStack2=new CustomStack(5);
		customStack2.addElement(4);
		customStack2.addElement(56);
		customStack2.addElement(23);
		customStack2.addElement(41);
		customStack.addElement(5);
		customStack2.removeElement();
		customStack2.peekElement();
		customStack2.display();
		int index=customStack2.searchElement(56);
		System.out.println("index is"+index);
		

	}

}
