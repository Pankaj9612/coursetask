package application;
// Constructor Overloading
public class Country {

	String name;
	String religion;
	double population;
	String lang;
	int state;
	
	public Country() {
		// TODO Auto-generated constructor stub
	}
	
	Country(String name,String lang)
	{
		this.name=name;
		this.lang=lang;
		
	}
	
	Country(String religion,int state,double population)
	{
		this.population=population;
		this.religion=religion;
		this.state=state;
	}
	
	Country(String religion,String lang,int state,double population)
	{
		this.population=population;
		this.religion=religion;
		this.state=state;
		this.lang=lang;
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
		
		Country c1=new Country("India","Marathi");
		
		c1.displayCountry();
	}
}
