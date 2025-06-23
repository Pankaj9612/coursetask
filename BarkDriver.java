package application;

public class BarkDriver {
	
	public static void main(String[] args) {
		
		Dog d1= new Dog();
		System.out.println(d1.name);
		d1.displayDog();
		
		Bark b1= new Bark();
		b1.displayBark();
		b1.displayDog();
		
		System.out.println(b1.expression);
		System.out.println(b1.name);
	}
}
