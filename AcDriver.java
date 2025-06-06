class AcDriver
{
	public static void main(String[] args) {
		
		Ac a1= new Ac();
		System.out.println(a1);

		a1.brand="Blue star";
		a1.price=1000000.0;
		a1.ton=5;
		a1.maxTemp=30;
		a1.minTemp=16;
		a1.ambTemp=20;

		a1.displayAc();
		a1.displayMintemp();
		a1.displayMaxtemp();
		a1.displayAtemp();
	}
}