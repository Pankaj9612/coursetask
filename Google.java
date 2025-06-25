package application;

public class Google {
	
	String ceo;
	double  turnover;
	String hq;
	
	String email;
	String pass;
	
	Google()
	{
		
	}

	public Google(String ceo, double turnover, String hq,String email,String pass) 
	{
		this.ceo = ceo;
		this.turnover = turnover;
		this.hq = hq;
		this.email=email;
		this.pass=pass;
	}
	
	public void displaygoogle()
	{
		System.out.println(ceo);
		System.out.println(turnover);
		System.out.println(hq);
	}
	
	public void login(String email,String pass)
	{
		if(this.email==email && this.pass==pass)
		{
			System.out.println("Login Successfully!");
		}
		else
		{
			System.out.println("Invalid credentials!");
		}
	}
	
}
