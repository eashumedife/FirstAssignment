package javaBasics;

public class IfElseConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		int a =40;
		int b =30;
		
		
		if (a>b) {
			
			System.out.println("A is greater than b ");
		}
		else {
			
			System.out.println("B is greater than a ");
		}
		
		
		//comparison operators
		
		
		int c =100;
		int d= 100;
		
		if (c==d) {
			
			System.out.println("C and D are equal");
			
			
		}else {
			
			System.out.println("C and D are not equal");
		}
		
		int a1=300;
		int b1 =200;
		int c1=500;
		
		if(a1>b1 & a1>c1) {
			
			System.out.println("a1 is greater");
		}else if (b1>c1 & b1>a1){
			
			System.out.println("b1 is greater");
		}else {
			System.out.println("c1 is greater");
		}
		
		
		
		
		
		
	}
	}


