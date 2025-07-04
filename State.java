package application;

public class State {
	
	String name;
	int Districts;
	String lang;
	
	State()
	{
		
	}
	
	State(String name,int Districts,String lang)
	{
		this.name=name;
		this.Districts=Districts;
		this.lang=lang;
	}
	
	public State displayname()
	{
		System.out.println(name);
		return this;
	}
	
	public State displayDistricts()
	{
		System.out.println(Districts);
		return this;
	}
	
	public State displaylang()
	{
		System.out.println(lang);
		return this;
	}
	
	public static void main(String[] args) {
		
		State s1= new State("India",36,"Marathi");// Para-meterized Constructor
		
		s1.displayDistricts();
		s1.displaylang();
		s1.displayname();
		
		s1.displayDistricts().displaylang().displayname(); // Method Chaining 
				
	}
}
