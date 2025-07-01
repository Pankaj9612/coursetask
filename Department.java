package application;

public class Department extends College{
	
	String type;
	String hod;
	int lec;
	int noOfStudents;
	int seats;
	
	public Department() {
		// TODO Auto-generated constructor stub
	}
	
	Department(String uname, String vc, String uloc, int code, 
			String utype,String collname, int collCode, int grade, 
			int noOfDepts, String principal,String type,String hod,int lec,int noOfStudents,int seats)
	{
		super(uname, vc, uloc, code, type, collname, collCode, grade, noOfDepts, principal);
		
		this.type=type;
		this.hod=hod;
		this.lec=lec;
		this.noOfStudents=noOfStudents;
		this.seats=seats;
	}
	
	public void displayDepartment()
	{
		displayUniversity();
		displayCollege();
		System.out.println(type);
		System.out.println(hod);
		System.out.println(lec);
		System.out.println(noOfStudents);
		System.out.println(seats);
		System.out.println("-------------------------------");
	}
}
