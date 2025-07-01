package application;

public final class Raju extends A1{
	
	String name = "Pankaj";
	
	public  void display()
	{
		System.out.println(name);
	}
	
	public static void main(String[] args) {
		Raju r1=new Raju();
		
		r1.display();
		r1.displayAsS();
	}
}
