package collections;

import java.util.Iterator;
import java.util.LinkedList;

public class Linklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedList <String> ll = new LinkedList<String>();
		ll.add("eashu");
		
		ll.add("heheh");
		
		ll.add("djnf");
		
		ll.add(1, "reddy");
		
		System.out.println(ll);
		
		ll.addFirst("Palla");
		System.out.println(ll);
		ll.addLast("QA");
		
		System.out.println(ll);
		
		ll.remove(3);

		System.out.println(ll);
		
		
		for (String st : ll) {
			
			System.out.println(st);
		}
		
		
		Iterator<String> it = ll.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());
		}
		
		int num = 0;
		
		while (ll.size()>num) {
			
			System.out.println(ll.get(num));
			num++;
		}
	}

}
