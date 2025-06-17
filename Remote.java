package application;

public class Remote {
	String brand;
	String type;
	double price;
	
	Cell c1= new Cell("cello",2,"electro",4.5);
	
	Remote()
	{
		
	}
	
	Remote(String brand,String type,double price)
	{
		this.brand=brand;
		this.type=type;
		this.price=price;
	}
	
	
	public void displayRemote()
	{
		System.out.println(brand);
		System.out.println(type);
		System.out.println(price);
	}
	
}
