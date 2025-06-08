class Mango
{
	String  name;
	String origin;
	int price;


	public Mango printName()
	{
		System.out.println("Name: "+name);
		return this;
	}

	public Mango printPrice()
	{
		System.out.println("Price: "+price);
		return this;
	}

	public Mango printOrigin()
	{
		System.out.println("Origin: "+origin);
		return this;
	}
}