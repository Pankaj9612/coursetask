class StudentsDriver
{
	public static void main(String[] args) 
	{
		Students m1= new Students();
		System.out.println(m1);	

		m1.firstname="Pankaj";
		m1.lastname="Gaikwad";
		m1.mobileno=9529644208l;
		m1.emailid="Pankajraje9612@gmail.com";
		m1.degree="BTech";
		m1.percentage=87.34;
		m1.rollno=1;

		m1.displayStudents();
		System.out.println("<--------------------------------------->");

		Students m2=new Students();
		System.out.println(m2);

		m2.firstname="Rohan";
		m2.lastname="Jadhav";
		m2.mobileno=9876543251l;
		m2.emailid="Rjadhav@gmail.com";
		m2.degree="MBA";
		m2.percentage=92;
		m2.rollno=2;

		m2.displayStudents();
		System.out.println("<--------------------------------------->");

		Students m3=new Students();
		System.out.println(m3);

		m3.firstname="Pooja";
		m3.lastname="Raut";
		m3.mobileno=9087654321l;
		m3.emailid="pr@gmail.com";
		m3.degree="BTech";
		m3.percentage=78.67;
		m3.rollno=3;

		m3.displayStudents();
		System.out.println("<--------------------------------------->");

		Students m5=new Students();
		System.out.println(m5);

		m5.firstname="Rohit";
		m5.lastname="Mohite";
		m5.mobileno=6354870912l;
		m5.emailid="RM766@gmail.com";
		m5.degree="Art";
		m5.percentage=99.80;
		m5.rollno=4;

		m5.displayStudents();
		System.out.println("<--------------------------------------->");


	}
}