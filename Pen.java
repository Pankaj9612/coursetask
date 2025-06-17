package application;

public class Pen {
	String name;
	String type;
	double price;
	double size;
	
	refeel r1=new refeel("amo","jel",4.0);
	
	Pen()
	{
		
	}
	
	Pen(String name,String type,double price,double size)
	{
		this.name=name;
		this.type=type;
		this.price=price;
		this.size=size;
		
	}
	
	public void displayPen()
	{
		System.out.println(name);
		System.out.println(type);
		System.out.println(price);
		System.out.println(size);
	}
}
