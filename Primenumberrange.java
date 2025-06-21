package application;

public class Primenumberrange {
	public static boolean prime(int num)
	{
		int den=2;
		while(den<num)
		{
			if(num%den==0)
			{
				return false;
			}
			den++;
		}
		if(den==num)
		{
			return true;
		}
		else
		{
			return true;
		}
	}
	
	public static void rangeprime(int start,int end)
	{
		while(start<=end)
		{
			if(prime(start))
			{
				System.out.println(start);
			}
			start++;
		}
	}
	
	public static void main(String[] args) {
	    System.out.println(prime(13));
	    rangeprime(10,20);
	}
}
