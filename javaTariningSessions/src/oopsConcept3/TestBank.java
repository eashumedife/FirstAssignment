package oopsConcept3;

public class TestBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		System.out.println(USBank.min_bal);
		
		HDFCBank obj = new HDFCBank();
		
		obj.credit();
		obj.savings();
		obj.transfer();
		obj.educationloan();
		obj.carloan();
		obj.currentAccount();
		
		
		//this is called dynamic polymorphisam
		// child class object can be referred by parent interface reference variable
		
		USBank ub = new HDFCBank();
		
		ub.credit();
		ub.savings();
		ub.transfer();
		// child class object can be referred by parent interface reference variable
		
		BrazilBank bb =  new HDFCBank();
		
		bb.currentAccount();
		
	}

}
