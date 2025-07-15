package objectclass;

public class Person {

	String name;
	int age;
	double sal;
	
	public Person() {
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, double sal) {
		super();
		this.name = name;
		this.age = age;
		this.sal = sal;
	}
	
	public String printname()
	{
		System.out.println(name);
		return name;
	}
	
	public int printage()
	{
		System.out.println(age);
		return age;
	}
	
	public void setsal(double sal)
	{
		this.sal=sal;
	}
	
	public void  displayperson()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(sal);
	}
}
