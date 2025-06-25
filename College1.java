package application;

public class College1 {

	String collname;
	int collCode;
	int grade;
	int noOfDepts;
	String principal;
	
	College1()
	{
		
	}

	public College1(String collname, int collCode, int grade, int noOfDepts, String principal) 
	{
		this.collname = collname;
		this.collCode = collCode;
		this.grade = grade;
		this.noOfDepts = noOfDepts;
		this.principal = principal;
	}
	
	public void displayCollege()
	{
				
		System.out.println(collname);
		System.out.println(collCode);
		System.out.println(grade);
		System.out.println(noOfDepts);
		System.out.println(principal);
	
	}
	
	
}
