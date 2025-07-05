package application;
// Method Overriding
public class FatherSon2Driver {
	
	public static void main(String[] args) {
		Father2 f= new Son2();// upcasting 
		
		f.finance();
		f.name();
	}
	
	
}
