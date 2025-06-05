class MobilesDriver
{
	public static void main(String[] args) 
	{
		Mobiles m1= new Mobiles();
		System.out.println(m1);	

		m1.brand="Apple";
		m1.price=135900;
		m1.name="iphone 16pro max";
		m1.color="Black Titanium";
		m1.battery=5000;
		m1.seller="RIDNISHretail";
		m1.processor="A18 Pro Chip 6 Core Processor";

		m1.displayMobile();
		System.out.println("<--------------------------------------->");

		Mobiles m2=new Mobiles();
		System.out.println(m2);

		m2.brand="Samsung";
		m2.price=117999;
		m2.name="SAMSUNG Galaxy S25 Ultra 5G";
		m2.color="Titanium silverblue";
		m2.battery=5000;
		m2.seller="BTPLD";
		m2.processor="snapdragon 8 Elite for Galaxy";

		m2.displayMobile();
		System.out.println("<--------------------------------------->");

		Mobiles m3=new Mobiles();
		System.out.println(m3);

		m3.brand="Moto";
		m3.price=10999;
		m3.name="Motorola g45 5G";
		m3.color="Brilliant Green";
		m3.battery=5000;
		m3.seller="GRAHGOODS RETAIL";
		m3.processor="Snapdragon 6s Gen 3";

		m3.displayMobile();
		System.out.println("<--------------------------------------->");

		Mobiles m5=new Mobiles();
		System.out.println(m5);

		m5.brand="realme";
		m5.price=8199;
		m5.name="realme C61";
		m5.color="Marble Black";
		m5.battery=5000;
		m5.seller="Vision Star";
		m5.processor="Unisoc T612";

		m5.displayMobile();
		System.out.println("<--------------------------------------->");


	}
}