package application;

public class LComputer {
	String brand;
	int ram;
	int rom;
	String processor;
	double price;
	LPendrive p;
	
	
	public LComputer() {
		// TODO Auto-generated constructor stub
	}
	
	public LComputer(String brand, int ram, int rom, String processor, double price) {
		
		this.brand = brand;
		this.ram = ram;
		this.rom = rom;
		this.processor = processor;
		this.price = price;
		System.out.println("Coumputer Created");
	}
	
	
	public void displayComputer()
	{
		System.out.println(brand);
		System.out.println(ram);
		System.out.println(rom);
		System.out.println(processor);
		System.out.println(price);
		System.out.println("---------------------------------");
	}
	
	public void insertPendrive(String brand,int memory,int speed,double price)
	{
		p = new LPendrive(brand,memory,speed,price);
		System.out.println("Pendrive Inserted");
	}
	
}
