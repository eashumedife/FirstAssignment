package listConceptCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class EmployeeUserDefinedClass {

	String name;
	int age ;
	String department ;
	
	
	EmployeeUserDefinedClass(String name, int age, String department){
		
		this.age = age;
		this.department = department;
		this.name = name ;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EmployeeUserDefinedClass E1 = new EmployeeUserDefinedClass("eashu",27,"QA");
		EmployeeUserDefinedClass E2 = new EmployeeUserDefinedClass("tom",28,"Dev");
		EmployeeUserDefinedClass E3 = new EmployeeUserDefinedClass("kay",29,"Ops");
		
		
		ArrayList <EmployeeUserDefinedClass> ae = new ArrayList<EmployeeUserDefinedClass>();
		
		ae.add(E1);
		ae.add(E2);
		ae.add(E3);
		
	        Iterator it = ae.iterator();
	        
	        while(it.hasNext()) {
	        	
	        	EmployeeUserDefinedClass emp =	(EmployeeUserDefinedClass) it.next();
	        	System.out.print(emp.age +"  ");
	        	System.out.print(emp.name +"  ");
	        	System.out.print(emp.department + "  ");
	        	
	        	System.out.println();
	        	
	        	
	        }
		
		
	}

}
