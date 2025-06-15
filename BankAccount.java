package application;

public class BankAccount {
	private String name;
	private String BankName;
	private long phno;
	private String ifsc;
	private double balance;
	private long accno;
	private String address;
	private long adhar;
	private int pin;
	private String branch;
	
	BankAccount()
	{
		
	}
	
	BankAccount(String name,String BankName,long phno,String ifsc,
			double balance,long accno,String address,long adhar,int pin,String branch)
	{
		this.name=name;
		this.BankName=BankName;
		this.phno=phno;
		this.ifsc=ifsc;
		this.balance=balance;
		this.accno=accno;
		this.address=address;
		this.adhar=adhar;
		this.pin=pin;
		this.branch=branch;
	}
	
	public String Name()
	{
		return name;
	}
	
	public String getBankName()
	{
		return BankName;
	}
	
	public long getphno()
	{
		return phno;
	}
	
	public double getbalance()
	{
		if(this.accno== accno && this.pin==pin)
		{
			return balance;
		}
		System.out.println("Invalid Credentials..");
		return 0;
	}
	
	public long getaccno()
	{
		return accno;
	}
	
	public long getadhar()
	{
		return adhar;
	}
	
	public String branch()
	{
		return branch;
	}
	
	public void setpin(long accno,int oldpin,int newpin)
	{
		if(this.accno==accno && pin==newpin)
		{
			System.out.println("pin already used.");
		}
		else if(this.accno == accno && pin==oldpin)
		{
			pin=newpin;
			
			System.out.println("pin updated");
		}
		else
		{
			System.out.println("Invalid Credentials");
		}
	}
	
	public void displayAccount()
	{
		System.out.println(name);
		System.out.println(BankName);
		System.out.println(phno);
		System.out.println(ifsc);
		System.out.println(balance);
		System.out.println(accno);
		System.out.println(adhar);
		System.out.println(pin);
		System.out.println(branch);
	}
}
