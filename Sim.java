package application;

public class Sim {
	String brand;
	String type;
	double price;
	String range;
	
	Sim()
	{
		
	}
	
	public Sim(String brand, String type, double price, String range) {
		super();
		this.brand = brand;
		this.type = type;
		this.price = price;
		this.range = range;
	}
	
	public void displaySim()
	{
		System.out.println(brand);
		System.out.println(type);
		System.out.println(price);
		System.out.println(range);
	}
}
