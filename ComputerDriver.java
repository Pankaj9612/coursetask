package application;

public class ComputerDriver {
	public static void main(String[] args) {
		LComputer c1= new LComputer("hp",4,1,"intel I-5",25500.08);
		
		c1.displayComputer();
		c1.insertPendrive("sandisk", 500, 40, 2000);
		c1.p.displayPendrive();
	}
}
