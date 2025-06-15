package application;

public class BsnkAccountDriver {
	public static void main(String[] args) {
		BankAccount a1= new BankAccount();
		
		a1.displayAccount();
				
		BankAccount a2= new BankAccount("pankaj","BOB",8474858594l,"BOB193",4589596.858,25465767l,
				"dharashiv",234567890012l,1234,"dharashiv");
		a2.setpin(25465767l, 1234, 4567);
		a2.displayAccount();
	}
}
