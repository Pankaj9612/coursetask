package application;

public class SoftwareDriver {
	
	public static void main(String[] args) {
		Developer d1= new Developer("Panku", 1234, "Tech Mahindra", "Btech", 2, 700000,
				"Java", 4,"Senior Tester","full Stack");
		System.out.println(d1);
		
		d1.displaySotwareEnginner();
		d1.displayDevloper();
		
	}
}
