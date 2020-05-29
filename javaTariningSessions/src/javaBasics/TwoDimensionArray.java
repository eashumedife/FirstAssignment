package javaBasics;

public class TwoDimensionArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String x[][] = new String [3][5];
		
		System.out.println(x.length); // Will give number of rows 
		
		System.out.println(x[0].length); // will give first row column numbers
		
		
		x[0][0]= "A";
		x[0][1]= "b";
		x[0][2]= "c";
		x[0][3]= "d";
		x[0][4]= "e";
		
		x[1][0]= "Ay";
		x[1][1]= "bfd";
		x[1][2]= "cvf";
		x[1][3]= "dv";
		x[1][4]= "e";
		
		x[2][0]= "A54";
		x[2][1]= "bgfh";
		x[2][2]= "c6";
		x[2][3]= "dhg";
		x[2][4]= "e4yg";
		
		
		//System.out.println(x[0][1]);
		//System.out.println(x[1][2]);
		//System.out.println(x[2][3]);
		
		
		for (int row=0; row<x.length;row++) {
			
			for (int col =0; col<x[0].length; col++) {
				
				System.out.print(x[row][col]);
			}
			System.out.println();
			System.out.println("*************");
		}
		
	}
		
		
	}
