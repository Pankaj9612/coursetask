class RangeOfPrime
{	
	public static void RangeOfPrime(int start,int end)
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
		return true;
	}

	public static void main(String[] args) 
	{
		RangeOfPrime(100,200);	
	}
}