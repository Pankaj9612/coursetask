package application;

public class College1Driver {
	
	public static void main(String[] args) {
		College1 c1= new College1("SETI",6315,3,5,"Raju");
		c1.displayCollege();
		
		CseDepartment cd=new CseDepartment("SETI",6315,3,5,"Raju","tech","Jebya",7,877,1000);
		cd.displayCseDepartment();
		cd.displayCollege();
		
		CivilDepartment ci= new CivilDepartment("SETI",6315,3,5,"Raju","Tech","deshmukh",4,434,600);
		ci.displayCollege();
		ci.displayCivilDepartment();
		
		MechDepartment md= new MechDepartment("SETI",6315,3,5,"Raju","Tech", "ratan", 5, 530, 600);
		md.displayCollege();
		md.displayMechDepartment();
		
	}
}
