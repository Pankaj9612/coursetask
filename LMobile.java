package application;

public class LMobile {
	String brand;
	String name;
	double price;
	int ram;
	int rom;
	Sim s;
	
	
	LMobile()
	{
		
	}


	public LMobile(String brand, String name, double price, int ram, int rom) {
		
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.ram = ram;
		this.rom = rom;
		System.out.println("Mobile created");
	}
	
	public void displaymobile()
	{
		System.out.println(brand);
		System.out.println(name);
		System.out.println(price);
		System.out.println(ram);
		System.out.println(rom);
	}
	
	public void insertSim(String brand,double price,String type,String range)
	{
		s= new Sim(brand, type,price, range);
		System.out.println("Sim inserted");
	}
}
