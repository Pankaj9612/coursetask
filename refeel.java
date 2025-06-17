package application;

public class refeel {
	String  name;
	String type;
	double price;
	
	refeel()
	{
		
	}
	
	refeel(String name,String type,double price)
	{
		this.name=name;
		this.type=type;
		this.price=price;
		
		System.out.println("refeel loaded");
	}
	
	public  void displayrefeel()
	{
		System.out.println(name);
		System.out.println(type);
		System.out.println(price);
	}
}
