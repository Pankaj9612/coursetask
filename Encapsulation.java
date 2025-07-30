package application;

public class Encapsulation {

	String name="Pankaj";
	String comapanyname;
	int age;
	double sal;
	
	public Encapsulation() {
		// TODO Auto-generated constructor stub
	}
	
	public String getname()
	{
		return name;
	}
	
	public String getcname()
	{
		return comapanyname;
	}
	
	public int age()
	{
		return age;
	}
	
	public double sal()
	{
		return sal;
	}
	
	public void setsal(double sal)
	{
		if(sal>45000)
		{
			System.out.println("Accept the offer");
		}
		else
		{
			System.out.println("Reject the offer");
		}
	}
	
	public static void main(String[] args) {
		Encapsulation e1=new Encapsulation();
		e1.setsal(100000);
		e1.sal();
		System.out.println(e1.getcname());
		System.out.println(e1.getname());
	}
}
