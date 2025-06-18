package application;

public class Bag {
	String brand;
	String name;
	double price;
	int cap;
	book b1;
	
	Bag()
	{
		
	}

	public Bag(String brand, String name, double price, int cap) {
		super();
		this.brand = brand;
		this.name = name;
		this.price = price;
		this.cap = cap;
	}
	
	public void displaybag()
	{
		System.out.println(brand);
		System.out.println(name);
		System.out.println(price);
		System.out.println(cap);
	}
	
	public void insertBook(String publisher,String name,int pages,double price,String author)
	{
		b1= new book(publisher,name,pages,price,author);
		System.out.println("book put in the bag");
	}
}
