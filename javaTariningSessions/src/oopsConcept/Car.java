package oopsConcept;

public class Car {


		// TODO Auto-generated method stub

		int mod;
		int wheel;	
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	//  New Car() is the object of Car class 
			// b and c is object reference variables
			// new keyword used to create object
			
			Car a = new Car();
			Car b = new Car();
			Car c = new Car();
			
			a.mod= 2014;
			a.wheel=8;
			
			b.mod = 2005;
			b.wheel= 4;
			
			c.mod = 2016;
			c.wheel = 6;
			
			System.out.println(a.mod);
			System.out.println(a.wheel);
			
			System.out.println(b.mod);
			System.out.println(b.wheel);
			
			System.out.println(c.mod);
			System.out.println(c.wheel);
	}

}
