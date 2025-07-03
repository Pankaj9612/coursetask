package application;

public class TeacherStudenDriver {

	public static void main(String[] args) {
		
		Studentsclass s1= new Studentsclass();
		
		s1.Learning();
		s1.Studying();
		s1.Teaching();
		
		Teacher t1=new Teacher();
		t1.Teaching();
		
		Teacher t2=new Studentsclass(); // upcasting
		t2.Teaching();
		
		Studentsclass s2=(Studentsclass) t2; // Downcasting
		
		s2.Learning();
		s2.Teaching();
		s2.Studying();
	}
}
