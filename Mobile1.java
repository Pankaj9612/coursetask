package application;

public class Mobile1 {
	String brand;
	String name;
	String Type;
	int rom;
	int ram;
	double price;
	
	Battery b1=new Battery("excide","lithum",5000);
	
	
	Mobile1() 
	{
	}
	
	Mobile1(String brand,String name,String Type,int rom,int ram,double price)
	{
		this.brand=brand;
		this.name=name;
		this.Type=Type;
		this.rom=rom;
		this.ram=ram;
		this.price=price;
	}
	
	public void displaymobile() {
		System.out.println(brand);
		System.out.println(name);
		System.out.println(Type);
		System.out.println(rom);
		System.out.println(ram);
		System.out.println(price);

	}
}
