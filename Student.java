package application;

public class Student {

	String  name;
	String degree;
	int age;
	int roll;
	int marks;
	
	
	public Student() {
		// TODO Auto-generated constructor stub
	}


	public Student(String name, String degree, int age, int roll, int marks) {
		super();
		this.name = name;
		this.degree = degree;
		this.age = age;
		this.roll = roll;
		this.marks = marks;
	}
	
	@Override
	public String toString() {
		return "[name=" + name + ", degree=" + degree + ", age=" + age + ", roll=" + roll + ", marks=" + marks
				+ "]";
	}
	
	public void displayStudent()
	{
		System.out.println("Name:"+name);
		System.out.println("Age:"+age);
		System.out.println("Roll:"+roll);
		System.out.println("Marks"+marks);
		System.out.println("Degree:"+degree);
	}
}
