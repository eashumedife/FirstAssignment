package oopsConcept2;

public class TestCar {

	// TODO Auto-generated method stub
	// Same method is present in child class and parent class with same name same arguments
			// its called overriding
			// This is called static polymorphism // compile time polymorphism
			// has -a relationship 
	
	public static void main(String[] args) {
			BMW b = new BMW();
	
			b.start();// overridden method // called method overriding 
			b.stop();
			b.theftsafety();
			
			System.out.println("**********");
			Car c = new Car();
			
			c.start();
			c.stop();
			c.refule();
			c.engine();
			// top casting and called dynamic plymormhisam
			Car c1 = new BMW();
			
			c1.start();
			c1.engine();
			//top casting 
			// child class object can be referred by parent class reference variable
			// this is called dynamic polymorphism or run time polymorphism
			
			// only overriden methods from child class can be used 
		
		}
}
