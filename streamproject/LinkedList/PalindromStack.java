package LinkedList;

public class PalindromStack {
	
	
	public static void main(String args[]) {
		
		StackPalindromeTest palindromee=new StackPalindromeTest();
	
	palindromee.addElement(3);
	palindromee.addElement(2);
	palindromee.addElement(5);
	palindromee.addElement(5);
	palindromee.addElement(2);
	palindromee.addElement(3);
	palindromee.displayList();
	int size=palindromee.findSize();
	//System.out.println(size);
   boolean checkk=	palindromee.checkPalindromee(size);
	System.out.println(checkk);
	
	
	
	}
	

}
