package exception;

public class Exp7{

	public static void main(String[] args) {
		try
		{
			test();	
		}
		catch(Exception e)
		{
			System.out.println("Don't divide by zero");
		}
	}
	public static void test()
	{
		System.out.println(10/0);
	}
}
