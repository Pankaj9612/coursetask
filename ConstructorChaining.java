package application;

public class ConstructorChaining {

	String name;
	int age;
	long phno;
	String email;
	String location;
	
	public ConstructorChaining() {
		// TODO Auto-generated constructor stub
	}

	ConstructorChaining(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	ConstructorChaining(String name,int age,long phno)
	{
		this(name,age);
		this.phno=phno;
	}
	
	ConstructorChaining(String name,int age,long phno,String email)
	{
		this.name=name;
		this.age=age;
		this.phno=phno;
		this.email=email;
	}
	
	ConstructorChaining(String name,int age,long phno,String email,String loaction)
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
