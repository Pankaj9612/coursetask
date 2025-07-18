package objectclass;

public interface Whysapp {
 
	int messageLimit=100;
	
	void message(long phno,String msg);
	
	void voicemsg(long phno,String msg);
	
	void status(String ip);
	
	public static void greetings(String name)
	{
		System.out.println("Hey!"+name);
	}
}
