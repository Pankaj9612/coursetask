package application;

public class Car1Driver {
	
	public static void main(String[] args) {
		
		Car1 c1= new Car1();
		System.out.println(c1.brand);
		System.out.println(c1.type);
		
		c1.displayCar1();
		c1.displayvehicle();
		
		Vehicle v1= new Vehicle();
		System.out.println(v1.type);
		v1.displayvehicle();
	}
}
