package application;

public class Car {
	String brand;
	String name;
	double price;
	String type;
	double milege;
	Engine e1;
	
	
	Car()
	{
	}


	public Car(String brand, String name, double price, String type, double milege,String ebrand, String ename, double eprice) 
	{
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.type = type;
		this.milege = milege;
		e1= new Engine(ebrand,  ename, eprice);
		
	}
	
	public void displayCar()
	{
		System.out.println("Brand: "+brand);
		System.out.println("Nmae :"+name);
		System.out.println("Price :"+price);
		System.out.println("type :"+type);
		System.out.println("milege :"+milege);
	}
}
