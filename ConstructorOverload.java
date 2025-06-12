package application;

public class ConstructorOverload {
	
	String name;
	int age;
	long phno;
	String email;
	String location;
	String blood;
	long tel;
	String temploc;
	
	ConstructorOverload()
	{
	}
	
	ConstructorOverload(String name,int age,long phno,String email,String loc)
	{
		this.name=name;
		this.age=age;
		this.phno=phno;
		this.email=email;
		location=loc;
	}
	
	ConstructorOverload(String name,int age,long phno,String email,String loc,String blood)
	{
		this.name=name;
		this.age=age;
		this.phno=phno;
		this.email=email;
		location=loc;
		this.blood=blood;
	}
	
	ConstructorOverload(String name,int age,long phno,String email,String loc,String blood,long tel)
	{
		this.name=name;
		this.age=age;
		this.phno=phno;
		this.email=email;
		location=loc;
		this.blood=blood;
		this.tel=tel;
	}
	ConstructorOverload(String name,int age,long phno,String email,String loc,String blood,long tel,String temploc)
	{
		this.name=name;
		this.age=age;
		this.phno=phno;
		this.email=email;
		location=loc;
		this.blood=blood;
		this.tel=tel;
		this.temploc=temploc;
	}
	 
	public void displayForm()
	{
		System.out.println("name: " +name);
		System.out.println("age: " +age);
		System.out.println("email: " +email);
		System.out.println("location: " +location);
		System.out.println("blood: " +blood);
		System.out.println("tel: " +tel);
		System.out.println("temploc: " +temploc);
	}
}
