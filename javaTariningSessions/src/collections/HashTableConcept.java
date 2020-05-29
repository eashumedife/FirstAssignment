package collections;

import java.util.Hashtable;

public class HashTableConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Hashtable ht = new Hashtable();
		
		ht.put(1, 200);
		ht.put('e', "eashu");
		ht.put('n', 500);
		ht.put('c', 'm');
		ht.put("eashu", "hjgshd");
		ht.put("number", 500);
		
		System.out.println(ht.get(1));
		System.out.println(ht.get('e'));
		System.out.println(ht.get("eashu"));
		
		
		System.out.println(ht.size());
		
		
		
	}

}
