package javaBasics;

public class ArrayConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		int i[] = new int [4];
		
		 i[0] = 10;
		 i[1] = 20;
		 i[2] = 30;
		 i[3] = 40;
		 
		 System.out.println(i.length);
		 
		 for (int j=0; j<i.length;j++) {
			 
			 System.out.println(i[j]);
		 }
		
		 
		 double d[] = new double[4];
		 
		 d[0] = 1.2;
		 d[1] =2.2;
		 d[3] = 3.3;
	     d[2] = 4.4;
		 
		 char ch[] = new char[4];
		 
		 ch[0] = 'f';
		 ch[1] = 'p';
		 ch[2] = 'm';
		 
		 boolean b[] = new boolean[2];
		 
		 b[0] = true;
		 b[1] = false;
		 
		 
		 //String is not a data type its a class but still we can create string array
		 
		 String s[] = new String[2];
		 
		 System.out.println(s.length);
		 
		 
		///************///
		 
		 //Object is a super class of all the classes
		  // Object Array is class-- is used to store different data types values
		 
		 Object ob[] = new Object[6];
		 
		 ob[0] = 20;
		 ob[1] = 'd';
		 ob[2] = "Eashu";
		 
		 System.out.println(ob[2]);
		 System.out.println(ob.length);
		
		 
		 
		 
		 
		 
	}
		
		
	}

