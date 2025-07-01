package application;

public class Child extends Father{
	
	String name="Raju";
	
	public void displayA()
	{
		System.out.println(name);
		System.out.println(super.name);
		super.display();
	}
	
	
	public static void main(String[] args) {
		Child c1= new Child();
		
		c1.display();
		System.out.println(c1);
		c1.display();
		System.out.println(c1 instanceof Father);
		System.out.println(c1 instanceof Child);
		// System.out.println(c1 instanceof Raju);//Throws an error
		
	}
}
