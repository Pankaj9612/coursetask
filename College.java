package application;

public class College extends University {

	String collname;
	int collCode;
	int grade;
	int noOfDepts;
	String principal;
	
	College()
	{
		
	}

	public College(String uname,String vc, String uloc,int code , String type,String collname, int collCode, int grade, int noOfDepts, String principal) {
		
		super(uname, vc, uloc, collCode, type);
		
		
		this.collname = collname;
		this.collCode = collCode;
		this.grade = grade;
		this.noOfDepts = noOfDepts;
		this.principal = principal;
	}
	
	public void displayCollege()
	{
		displayUniversity();
		
		System.out.println(collname);
		System.out.println(collCode);
		System.out.println(grade);
		System.out.println(noOfDepts);
		System.out.println(principal);
		System.out.println("---------------------------------");
	}
	
	
}
