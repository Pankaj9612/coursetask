package application;
public class StudentDriver {

	public static void main(String[] args) {
		
		StudnetDb sddr1=new StudnetDb("Root","Root");
		
		sddr1.login("Root", "Root");
		sddr1.addstudent("pankaj","Btech", 22, 123, 99);
		sddr1.addstudent("Raj","Btech", 22, 124, 89);
		sddr1.addstudent("kaju","Btech", 22, 143, 49);
		sddr1.addstudent("kaji","Btech", 22, 153, 45);
		
		sddr1.searchbymarks(99);
		sddr1.searchbyName("pankaj");
		sddr1.searchbyroll(123);
		sddr1.sortbyRoll();
		sddr1.sortbyname();
		sddr1.sortbyMarks();
		sddr1.printDb();
		sddr1.login("Root", "Root");
		sddr1.removeByName("kaji");
		sddr1.printDb();
		sddr1.removebyroll(123);
		sddr1.printDb();
		sddr1.highestmarks();
		sddr1.removebyspecificmarks(50);
		
		sddr1.updatetherecord("raj",155);
		sddr1.printDb();
	}
}
