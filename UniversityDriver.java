package application;

public class UniversityDriver {

	public static void main(String[] args) {
		
		College c1= new College("Dbatu","shantu","Wadi",1234,"Technology","Sunrise",6315,3,5,"Shantanu");
		
		c1.displayCollege();
		c1.displayUniversity();
		
		Department d1=new Department("Dbatu","shantu","Wadi",1234,"Technology","Sunrise",6315,3,5,"Shantanu","cse","khadus",5,240,60);
		
		d1.displayDepartment();
		d1.displayCollege();
		d1.displayUniversity();
		
		
	}
}
