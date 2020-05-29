package oopsConcept;

public class LocalVsGLOBALvariable {

		// TODO Auto-generated method stub
		
		
		int age =25;// global variable
		String name= "eashwar";
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			LocalVsGLOBALvariable obj = new LocalVsGLOBALvariable();
			System.out.println(obj.age);
			int age = 30;// local variable for main method
			System.out.println(obj.name);
			System.out.println(age);
			
			System.out.println(sub());
		}
		
		public static int sub() {
			
		int i =25;//local variable for this method
			String country= "india";
			
			System.out.println(i);
			System.out.println(country);
			
			int j =10;
			
			int k = i-j;
			
			return k;
		}

	}

