package application;

public class LPendrive {
	String brand;
	int memory;
	int speed;
	double price;
	
	
	public LPendrive() {
		// TODO Auto-generated constructor stub
	}
	
	LPendrive(String brand,int memeory,int speed,double price)
	{
		this.brand=brand;
		this.memory=memory;
		this.speed=speed;
		this.price=price;
		
	}
	
	public void displayPendrive()
	{
		System.out.println(brand);
		System.out.println(memory);
		System.out.println(speed);
		System.out.println(price);
	}
}
