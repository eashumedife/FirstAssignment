package oopsConcept;

public class FunctionsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		FunctionsInJava method = new FunctionsInJava();
		
		method.test();
		
		String name = method.concatination();
		
		System.out.println(name);
		
		int result = method.addition();
		
		System.out.println(result);
		
		Double DivisionValue = method.division(311, 8);
		
		System.out.println("DivisionValue is " + DivisionValue);
		
	}
 
	public void test() {
		
		System.out.print("Palla");
	}
	
	public int addition() {
		
		int a = 200;
		int b = 300;
		
		int c= a+b;
		return c;
		
		
	}
	
	public String concatination() {
		
		String a = " Eashweshawar";
		String b = " Reddy";
		
		String c = a+b;
		
		return c;
	}
	
	
	public double division(int a, int b) {
		
		int c= a/b;
	
	    return c;
				
	}
		
	}


