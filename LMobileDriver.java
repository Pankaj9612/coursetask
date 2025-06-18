package application;

public class LMobileDriver {
	public static void main(String[] args) {
		LMobile m1= new LMobile("samsung","galaxy m30s",15000,500,8);
		m1.displaymobile();
		m1.insertSim("jio", 459.0, "prepaid", "5g");
		m1.s.displaySim();
	}
}
