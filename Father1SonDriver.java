package application;

public class Father1SonDriver {
	
	public static void main(String[] args) {
		
		Father1 f1= new Father1();
		
		f1.dancing();
		f1.drinking();
		
		Son s1= new Son();
		
		s1.smoking();
		s1.dancing();
		s1.drinking();
		
		Father1 f2= new Son(); //upcasting 
		
		f2.dancing();
		f2.drinking();
		
		Son s2=(Son)f2;
		
		s2.dancing();
		s2.drinking();
		s2.smoking();
		
		
		Father1 f3= new Father1(); //Downcasting without upcasting  refernce 
		
		f3.dancing();
		f3.drinking();
		
		Son s3=(Son)f3;
		
		s3.dancing();
		s3.drinking();
		s3.smoking();
	}
}
