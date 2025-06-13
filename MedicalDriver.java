package application;

public class MedicalDriver {
	public static void main(String[] args) {
		Medical m1= new Medical();
		m1.displayInfo();
		
		Medical m2= new Medical("rohan","ans","sahukdh","blooddonate",56,7689);
		m2.displayInfo();
	}
}
