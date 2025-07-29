package application;

public class ConstructorOverloading {

	String name;
	int age;
	long phno;
	String email;
	String location;
	
	public ConstructorOverloading() {
		// TODO Auto-generated constructor stub
	}

	ConstructorOverloading(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	ConstructorOverloading(String name,int age,long phno)
	{
		this.name=name;
		this.age=age;
		this.phno=phno;
	}
	
	ConstructorOverloading(String name,int age,long phno,String email)
	{
		this.name=name;
		this.age=age;
		this.phno=phno;
		this.email=email;
	}
	
	ConstructorOverloading(String name,int age,long phno,String email,String loaction)
	{
		this.name=name;
		this.age=age;
		this.phno=phno;
		this.email=email;
		this.location=location;
	}
	
	public void display()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(phno);
		System.out.println(email);
		System.out.println(location);
	}
}
