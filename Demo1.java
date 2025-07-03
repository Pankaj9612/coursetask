package application;

public class Demo1 {
	
	String name="Pankaj";
	String type;
	double price;
	
	{
		System.out.println("Hi from non-static block");
	}
	
	{
		System.out.println("It execute top to bottom order");
	}
	
	public  void display()
	{
		String name="Gaikwad";
		System.out.println(name);
		System.out.println(type);
		System.out.println(price);
		System.out.println(name);
		System.out.println(this.name);
		
		
	}
	
	public Demo1 print()
	{
		System.out.println("hi");
		return this;
	}
	
	public static void main(String[] args) {
		
		Demo1 d1= new Demo1();
		d1.name="pankaj";
		System.out.println(d1);
		d1.display();
		
		d1.display();
		
		
	}
}
