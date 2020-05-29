package interviewQuestion;

import java.util.Scanner;

public class CheckNumberEvenOrOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner reader = new Scanner (System.in);
		
		double num = reader.nextDouble();
		
		if(num%2==0) {
			
			System.out.println("number is even");
		} else {
			
			System.out.println("number is odd");
		}
		
	
	}

}
