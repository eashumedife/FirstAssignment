package listConceptCollections;

import java.util.ArrayList;

public class ArrayListConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList ar = new ArrayList();
		
		ar.add(100);
		
		ar.add(200);
		
		ar.add(300);
		
		ar.add(400);
		
		ar.add('e');
		
		ar.add("eashu");
		
		ar.add(10.2);
		
		ar.add(true);
		
	   System.out.println(ar.size());
	   
	   System.out.println(ar.get(1));
	   
	   
	   for (int i =0; i<ar.size();i++) {
		   
		   System.out.println(ar.get(i));
	   }
		
	   
	   ArrayList <Integer> ar1 = new ArrayList <Integer>();
	   
	   ar1.add(200);
	   ArrayList <String> ar2 = new ArrayList <String>();
	   
	   ar2.add("Eashu");
	   
	}

}
