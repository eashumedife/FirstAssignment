package oopsConcept;

public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
	// TODO Auto-generated method stub

		
		// Can't create method inside method
		// duplicate methods are not allowed with same method name and parameters/data types are not allowed in class
		// we can overload main method 
		MethodOverloading method = new MethodOverloading();
		
		method.sum();
		method.sum(10);
		method.sum(20, "reddy");
		
	}

	public void sum() {
		
		System.out.println("printing sum method");
	}
	
	public void sum(double i) {
		
		System.out.println("printing sum method");
	}
	public void sum(int i) {
		
		System.out.println("printing one parameter method + i is " +i);
	}
	
public void sum(int i, String eashu) {
		
		System.out.println("printing two parameter method  " +  i +  eashu);
	}
		
	}

