package application;

public class Students {
	
	String name;
	int sci;
	int math;
	int his;
	int mar;
	int hin;
	int eng;
	double avg;
	
	public Students() {
		// TODO Auto-generated constructor stub
	}


	public Students(String name, int sci, int math, int his, int mar, int hin, int eng) {
		
		this.name = name;
		this.sci = sci;
		this.math = math;
		this.his = his;
		this.mar = mar;
		this.hin = hin;
		this.eng = eng;
	}
	
	public double avgOfmarks()
	{
		return (double) (sci + math + his+  mar + hin + eng)/6;
		
	}
	
	public void displayMarks()
	{
		System.out.println(name);
		System.out.println(sci);
		System.out.println(math);
		System.out.println(his);
		System.out.println(mar);
		System.out.println(hin);
		System.out.println(eng);
		
	}
	
	public static void main(String[] args) {
		
		Students s1= new Students("Rohan",98,65,78,88,98,34);
		s1.displayMarks();
		s1.avgOfmarks();
		
		Students s2= new Students();
		s2.displayMarks();
	}
	
	
}
