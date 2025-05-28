class Recprime
{
	public static void main(String[] args) 
	{
		System.out.println(isprime(15,2));  
	}

	public static boolean isprime(int num,int den)
	{
		if(den<num)
		{
			if(num%den==0)
			{
				return false;
			}
			else
			{
					return isprime(num,den+1);
			}
			
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
}