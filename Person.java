package application;

public class Person {
	String name;
	int age;
	double sal;
	
	Person()
	{
		
	}
	
	Person(String name,int age,double sal)
	{
		this.name=name;
		this.age=age;
		this.sal=sal;
		
	}
	
	public  String getname()
	{
		return name;
	}
	
	public void setname(String name)
	{
		this.name=name;
	}
	
	public int getage()
	{
		return age;
		
	}
	
	public void setage(int age)
	{
		this.age=age;
	}
	
	public double sal()
	{
		return sal;
	}
	
	public void setsal(double sal)
	{
		if(sal>0 && sal>100000)
		{
			System.out.println("you are  afford it");
		}
		else 
		{
			System.out.println("You not afford it");
		}
	}
	public void displayPerson()
	{
		System.out.println("name: "+name);
		System.out.println("Age :"+age);
		System.out.println("sal :"+sal);
	}
}

