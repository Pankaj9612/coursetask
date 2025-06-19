package application;

public class Engine {
	String brand;
	String name;
	double price;

	
	Engine() 
	{
	}
	
	
	public Engine(String brand, String name, double price) {
		super();
		this.brand = brand;
		this.name = name;
		this.price = price;
		
	}


	public void displayengine()
	{
		System.out.println(brand);
		System.out.println(name);
		System.out.println(price);
	
	}
}
