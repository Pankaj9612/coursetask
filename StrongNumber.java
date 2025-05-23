class StrongNumber
{
	public static void main(String[] args) 
	{
		System.out.println(StrongNumber(144));
	}

	public static boolean StrongNumber(int num)
	{
		int sum=0;
		for (int i=num;i!=0 ;i/=10) 
		{
			int last=i%10;
			sum=sum+Factorial(last);	
		}
		return sum==num;
	}

	public static int Factorial(int digit)
	{
		int fact=1;
		while(digit>0)
		{
			fact*=digit;
			digit--;
		}
		return fact;
	}
}