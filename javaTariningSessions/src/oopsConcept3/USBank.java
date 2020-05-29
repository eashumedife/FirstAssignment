package oopsConcept3;

public interface USBank {

	int min_bal =500;
	
	public void credit();
	
	public void savings();
	
	public void transfer();
	
	// final and static in nature(interface variables)
	// variables default static
	// methods will not have a body
	// methods can't be static 
	//can't create object of interface 
	// Interface abstract nature
	// interface will not have a main method 
}
