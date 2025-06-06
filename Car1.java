class Car1
{
	String brand="Tata";
	String model="Harrier";
	String tiers="Apollo";
	long price=3000000;
	double milege=24;

	public void  DisplayCar()
	{
		String model="safari";
		System.out.println("brand :"+brand);
		System.out.println("model: "+model);
		System.out.println("tiers: "+tiers);
		System.out.println("price: "+price);
		System.out.println("milege: "+milege);
	}

	public void  DisplayCar1()
	{
		String model="safari";
		System.out.println("brand :"+brand);
		System.out.println("model: "+this.model);
		System.out.println("tiers: "+tiers);
		System.out.println("price: "+price);
		System.out.println("milege: "+milege);
	}
}