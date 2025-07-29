package application;

public class ConstructorOverloadingDriver {

	public static void main(String[] args) {
		
		ConstructorOverloading c1= new ConstructorOverloading("Pankaj",22);
		c1.display();
		
		ConstructorOverloading c2=new ConstructorOverloading("Rahul",22,345678865,"rahul@gmail.com","Pandharpur");
		c2.display();
	}
}
