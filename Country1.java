package application;
// Constructor Chaining using this() call method
public class Country1 {
	
	String name;
	String religion;
	double population;
	String lang;
	int state;
	
	public Country1() {
		// TODO Auto-generated constructor stub
	}
	
	Country1(String name,String lang)
	{
		this.name=name;
		this.lang=lang;
		
	}
	
	Country1(String name,String lang,String religion)
	{
		this(name,lang);
		this.religion=religion;
	}
	
	Country1(String name,String religion,String lang,double population)
	{
		this(name,religion,lang);
		this.population=population;
	}
	
	Country1(String name,String religion,String lang,double population,int state)
	{
		this(name,religion,lang,population);
		this.state=state;
	}
	
	public void displayCountry()
	{
		System.out.println(name);
		System.out.println(religion);
		System.out.println(population);
		System.out.println(lang);
		System.out.println(state);
	}
	
	public static void main(String[] args) {
		
		Country1 c1= new Country1("India","Marathi");
		
		c1.displayCountry();		
	}
}
