package oopsConcept;

public class NonStaticAndStaticMethod {
		
		int age = 25;
		static String name = "eashu";
		
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
	// static methods/variables can be called directly or with classname
			//Static methods/variables can also be called by obj reference
			
			
			sub();
			NonStaticAndStaticMethod.sub();
			System.out.println(name);
			System.out.println(NonStaticAndStaticMethod.name);
			
			
			
			NonStaticAndStaticMethod nonstatic = new NonStaticAndStaticMethod();
			
			
			nonstatic.sum();
			
			System.out.println(nonstatic.age);
		}
		
		public static void sub() {
			
			System.out.println("static method");
		}
		//non static methods/variables can only be called by object reference
		public void sum() {
			
			System.out.println("not static method");
		}
		
	}
