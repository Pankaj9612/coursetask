class Ac
{
	String brand;
	double price;
	int ton;
	int maxTemp;
	int minTemp;
	int ambTemp;


	public void displayAc()
	{
		System.out.println("Brand: "+brand);
		System.out.println("price: "+price);
		System.out.println("Ton: "+ton);
	}

	public void displayMaxtemp()
	{
		System.out.println("MaxTemp: "+maxTemp);
	}

	public void displayMintemp()
	{
		System.out.println("MinTemp: "+minTemp);
	}

	public void displayAtemp()
	{
		System.out.println("AmdTemp: "+ambTemp);
	}

}