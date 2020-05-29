package interviewQuestion;

import java.util.Scanner;

public class VowelOrConconent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner reader = new Scanner (System.in);
		
		char c = reader.next(".").charAt(0);
		
		if (c=='a' ||c =='e' || c== 'i' || c == 'o' || c =='u' ) {
			
			System.out.println("Its a Vowel");
		}else {
			
			System.out.println("its a conconent");
		}
		
		
	}

}
