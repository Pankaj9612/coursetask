class PalindromicPrime
{

	public static void main(String[] args) 
	{
		if(palindrome(131) && Prime(131))
		{
			System.out.println("it is palindromicprime number...");
		}
		else
		{
			System.out.println("it is not palindromicprime number..");
		}
	}

	public static boolean palindrome(int num)
	{
		int rev=0;
		for(int i=num;i!=0;i/=10)
		{
			rev=rev*10+(i%10);
			
		}
		return num==rev;
		
	}
	public static boolean Prime(int num)
	{
		int den=2;
		while(den<num)
		{
			if(num%den==0)
			{
				break;
			}
			den++;
		}
		return num==den;
	}
}