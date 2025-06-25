package application;

public class GoogleDriver2 {
	
	public static void main(String[] args) {
		
		Google g=new Google("Sundar Pichai",23443,"Sun Francisco","S@gmail.com","s@123");
		g.login("S@gmail.com", "s@123");
		GoogleDrive g1= new GoogleDrive();
		
		g1.displaygoogle();
		
		g1.add("vedio");
		
		g1.displayGoogledrive();
		
		Gmail g2= new Gmail();
		
		g2.send("omu@gmail.com", "Hi from my side");
		
		g2.displayGmail();
		
		g2.receive("sanju@gmail.com", "Bye");
		
		g2.displayGmail();
		
		g2.displaygoogle();
	}
}
