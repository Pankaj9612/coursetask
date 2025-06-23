package application;

public class BDriver {
	
	public static void main(String[] args) {
		
		A a1= new A();
		a1.displayA();
		//a1.ch; CTE
		//a1.displayB(); CTE
		
		B b1= new B();
		b1.displayB();
		b1.displayA();
		System.out.println(b1.ch);
		System.out.println(b1.a);
	}
}
