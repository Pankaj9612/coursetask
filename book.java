package application;

public class book {
	String publication;
	String name;
	int pages;
	double price;
	String author;
	
	book()
	{
		
	}

	public book(String publication, String name, int pages, double price, String author) {
		super();
		this.publication = publication;
		this.name = name;
		this.pages = pages;
		this.price = price;
		this.author = author;
	}
	
	public void displaybook()
	{
		System.out.println(publication);
		System.out.println(name);
		System.out.println(pages);
		System.out.println(price);;
		System.out.println(author);
	}
}
