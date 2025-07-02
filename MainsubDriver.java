package application;

public class MainsubDriver {
	
	public static void main(String[] args) {
		
		Main m1=new Main();
		
		m1.displayMain();
		
		
		Sub s1= new Sub();
		
		s1.displayMain();
		s1.displaySub();
		
		Main m2= new Sub();
		
		m2.displayMain();
		//m2.displaySub();//CTE
	}
}
