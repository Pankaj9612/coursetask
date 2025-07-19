package objectclass;

public class PersonDriver {

	 public static void main(String[] args) {
		
		 Person p1=new Person("pankaj",22,2356);
		 
		 System.out.println(p1);
		 
		 p1.printage();
		 p1.printname();
		 p1.setsal(4000);
		 p1.displayperson();
	}
}
