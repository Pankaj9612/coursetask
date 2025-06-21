package application;

public class palindromicprimeno {
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
			return false;
		}
	}
	
	public static boolean palindrome(int num)
	{
		int rev=0;
		int temp=num;
		while(num!=0)
		{
			int rem=num%10;
			rev=rev*10+rem;
			num/=10;
		}
		if(temp==rev)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	public static void main(String args[])
	{
		System.out.println(prime(13));
		System.out.println(palindrome(131));
		if(palindrome(131) && prime(131))
		{
			System.out.println("The number is palindromic prime number");
		}
		else
		{
			System.out.println("number is not a palindromiv prime number");
		}
	}
}
