package oopsConcept;

public class Wrapper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String i ="20";
		
		int c = Integer.parseInt(i);
		int x= 100;
		System.out.println(x+c);
		
		
		String j = "300.2";
		double y = 10.2;
		
	double q =	Double.parseDouble(j);
		
		System.out.println(y+q);
		
		String s = "true";
		
		boolean b=	Boolean.parseBoolean(s);
		
		System.out.println(b);
		
		
		System.out.println("********");
         int m = 20;
		String v =String.valueOf(m);
		
		String l = "gg";
		System.out.println(l+v);
		
	}

}
