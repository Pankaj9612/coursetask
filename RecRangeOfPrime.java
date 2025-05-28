class RecRangeOfPrime
{
	public static void main(String[] args) 
	{
		System.out.println(isprime(15,2)); 
		RangeOfPrime(10,100); 
	}

	public static void RangeOfPrime(int start,int end)
	{
		if(start<=end)
		{
			if(isprime(start,2))
			{
				System.out.println(start);
			}
			RangeOfPrime(start+1,end);
		}
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