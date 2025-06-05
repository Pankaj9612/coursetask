class CarDriver
{
	public static void main(String[] args) {
		Car m1= new Car();
	System.out.println(m1);	

		m1.brand="BMW";
		m1.model="G20";
		m1.tiers="Apollo";
		m1.price=6000000;
		m1.milege=12;

		m1.DisplayCar();
		System.out.println("<--------------------------------------->");

		Car m2= new Car();
	System.out.println(m2);	

		m2.brand="Maruti Suzuki";
		m2.model="Nano";
		m2.tiers="MRF";
		m2.price=300000;
		m2.milege=28;

		m2.DisplayCar();
		System.out.println("<--------------------------------------->");

		Car m3= new Car();
	System.out.println(m3);	

		m3.brand="Tata";
		m3.model="Punch";
		m3.tiers="solo";
		m3.price=600000;
		m3.milege=35;

		m3.DisplayCar();
		System.out.println("<--------------------------------------->");
	}
}