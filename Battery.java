package objectclass;

public class Battery {

	String bname;
	String bbrand;
	double bprice;
	int mah;
	
	
	private void Battery() {
		// TODO Auto-generated method stub

	}


	public Battery(String name, String brand, double price, int mah) {
		super();
		this.bname = name;
		this.bbrand = brand;
		this.bprice = price;
		this.mah = mah;
	}
	
	public void displayBattery()
	{
		System.out.println(bname);
		System.out.println(bbrand);
		System.out.println(bprice);
		System.out.println(mah);
		System.out.println();
	}
	
}
