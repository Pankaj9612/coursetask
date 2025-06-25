package application;

public class Gmail extends Google{
	
	int mails;
	int inbox;
	int sent;
	int recieve;
	int bin;
	
	public Gmail() {
		// TODO Auto-generated constructor stub
	}

	public Gmail(String ceo, double turnover, String hq) 
	{
		this.ceo = ceo;
		this.turnover = turnover;
		this.hq = hq;
	}
	
	public void send(String email,String content)
	{
		sent++;
		System.out.println("Mail sent");
	}
	
	public void receive(String email,String content)
	{
		recieve++;
		System.out.println("Mail Received!");
		mails++;
	}
	
	public void displayGmail()
	{
		System.out.println(mails);
		System.out.println(inbox);
		System.out.println(sent);
		System.out.println(recieve);
		System.out.println(bin);
	}
	
	
	
	
}
