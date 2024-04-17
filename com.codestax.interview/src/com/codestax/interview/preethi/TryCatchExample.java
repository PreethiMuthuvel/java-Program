package com.codestax.interview.preethi;

public class TryCatchExample {

	public static void main(String[] args) {
		int a = 4;
		int b = 0;
		try {
			if(a<18)
			throw new CustomExceptionClass("preethi alagi");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("preethi cuty");
		}
		ThrowsExaxmple.name();
		
		
	}
	
	public void handleThrows() throws CustomExceptionClass,ArithmeticException {
		int a = 4;
		int b = 0;
		
			//if(a<18)
			//throw new CustomExceptionClass("preethi is  beautiful");
			int c=a/b;
			
			
	}
	
}
class ThrowsExaxmple{
	public static void name() {
		TryCatchExample throwsExaxmple=new TryCatchExample();
		try {
		throwsExaxmple.handleThrows();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	
}
