package application;

public class SoftwareEngineer {
	
	String name;
	int empId;
	String company;
	String degree;
	int exp;
	double salary;
	
	public SoftwareEngineer() {
		// TODO Auto-generated constructor stub
	}
	
	public SoftwareEngineer(String name, int empId, String company, String degree, int exp, double salary) {
	
		this.name = name;
		this.empId = empId;
		this.company = company;
		this.degree = degree;
		this.exp = exp;
		this.salary = salary;
	}
	
	
	public void displaySotwareEnginner()
	{
		System.out.println(name);
		System.out.println(empId);
		System.out.println(company);
		System.out.println(degree);
		System.out.println(exp);
		System.out.println(salary);
	}
	
	
}
