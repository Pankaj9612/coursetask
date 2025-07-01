package application;

public sealed class A1  permits Raju , Ramu
{
	String name="Pankaj";
	
	public  void displayAsS()
	{
		System.out.println(name);
	}
}
