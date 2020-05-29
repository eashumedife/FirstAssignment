package oopsConcept3;

public class HDFCBank implements USBank, BrazilBank {


	//if any class implementing any interface its mandate to define/override methods interface
	//with this we are achieving multiple inheritance 
	// is -a -relationship
   // first 3 methods overriding from us bank
	public void credit() 
    {
    	System.out.println("HDFC credit");
    }
	
	public void savings()
	{
		System.out.println("HDFC savings");
	}
	
	public void transfer() {
		System.out.println("HDFC transfer");
		
	}
	
	// separate methods/own methods of hdfc bank 

	public void educationloan() {
		
		System.out.println("HDFC education loan");
	}
	
	public void carloan() {
		System.out.println("HDFC car loan");
	}
	
	// below 2 methods from overiding from brazil bank 
	public void currentAccount() {
		
		System.out.println("Brazil bank current account ");
	}

}
