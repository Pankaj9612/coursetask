package application;

public class Demo2 {
	
	String name="pankaj";
	public static void main(String[] args) {
		Demo2 d1=new Demo2();
//		d1.printFristname();
//		d1.printMiddlename();
//		d1.PrintSurname();
		System.out.println(d1.name);
		/*d1.printFristname().printMiddlename().PrintSurname();*/
	}
	
	Demo2()
	{
		System.out.println("Hi from construtor");
	}
	
	Demo2(String name)
	{
		this.name=name;
	}
	
	public Demo2 printFristname()
	{
		System.out.println("Pankaj");
		return this;
	}
	
	public Demo2 printMiddlename()
	{
		System.out.println("Govardhan");
		return this;
	}
	public Demo2 PrintSurname()
	{
		System.out.println("Gaikwad");
		return this;
	}
}
