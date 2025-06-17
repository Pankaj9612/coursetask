package application;

public class Cell {
	String Brand;
	int Terminal;
	String electrolytes;
	double price;
	
	Cell()
	{
		
	}
	
	Cell(String Brand,int Terminal,String electrolytes,double price)
	{
		this.Brand=Brand;
		this.Terminal=Terminal;
		this.electrolytes=electrolytes;
		this.price=price;
	}
	
	public void displayCell()
	{
		System.out.println(Brand);
		System.out.println(Terminal);
		System.out.println(electrolytes);
		System.out.println(price);
	}
}
