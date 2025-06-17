package application;

public class Battery {
	String name;
	String type;
	int cap;
	
	
	Battery()
	{
		
	}
	
	Battery(String name,String type,int cap)
	{
		this.name=name;
		this.type=type;
		this.cap=cap;
		
		System.out.println("Batter loaded");
	}
	
	public void displayBattery()
	{
		System.out.println(name);
		System.out.println(type);
		System.out.println(cap);
	}
}
