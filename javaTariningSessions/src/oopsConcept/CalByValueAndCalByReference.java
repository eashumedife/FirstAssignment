package oopsConcept;

public class CalByValueAndCalByReference {

		int p;
		int q;
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub

			int a =100;
			int b =200;
			
			CalByValueAndCalByReference obj = new CalByValueAndCalByReference();
			
			int c = obj.sum(a, b);
			
			System.out.println(c);
			
			obj.p = 50;
			obj.q = 60;
			
			
			System.out.println("after swap");
			
			obj.swap(obj);
			
			System.out.println(obj.p);
			System.out.println(obj.q);
		}
		
		public int sum(int x, int y) {
			
			
			System.out.println();
			
			int z= x+y;
			
			return z;
			
		}
		
		public void swap (CalByValueAndCalByReference t) {
			
			int temp ;
			
			temp = t.p;
			t.p = t.q;
			t.q = temp;
			
		}
		
		
		
	}


