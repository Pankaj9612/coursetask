package application;

public class MechDepartment extends College1 {
	
	String type;
	String hod;
	int lec;
	int noOfStudents;
	int seats;
	
	public MechDepartment() {
		// TODO Auto-generated constructor stub
	}

	public MechDepartment(String collname, int collCode, int grade, int noOfDepts, String principal,String type, String hod, int lec, int noOfStudents, int seats) {
		
		this.collname = collname;
		this.collCode = collCode;
		this.grade = grade;
		this.noOfDepts = noOfDepts;
		this.principal = principal;
		
		this.type = type;
		this.hod = hod;
		this.lec = lec;
		this.noOfStudents = noOfStudents;
		this.seats = seats;
	}
	
	public void displayMechDepartment()
	{
		displayCollege();
		System.out.println(type);
		System.out.println(hod);
		System.out.println(lec);
		System.out.println(noOfStudents);
		System.out.println(seats);
		System.out.println("---------------------------------------");
	}
}
