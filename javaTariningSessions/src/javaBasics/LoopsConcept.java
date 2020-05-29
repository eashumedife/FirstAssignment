package javaBasics;

public class LoopsConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// TODO Auto-generated method stub

				//1. While loop // Disadvantage of while is it will create infinite loop if 
				// dont give incremental /decremental condition
				
				int i = 1;
				while (i<=10) {
					
					System.out.println(i);
					i = 1+i;
					for(int z=1; z<=10; z++ ) {
						
						System.out.println("Z value is"+z);
						
					}
				}
				System.out.println("************");
				//2. for loop
				
				for(int j=1; j<=10; j++ ) {
					
					System.out.println(j);
					
				}
				System.out.println("************"); 
				for (int k =10; k>=-10; k--) {
					
					System.out.println(k);
				}
				
			}
	}

