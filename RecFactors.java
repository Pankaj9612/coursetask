class RecFactors
{
	public static void main(String[] args) 
	{
		factors(12,2);
	}

	public static void factors(int num,int den)
	{
		if(den<=num)
		{
		if(num%den==0)
		{
			System.out.println(den);
		}
		factors(num,den+1);
	}
}
}