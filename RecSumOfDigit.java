class RecSumOfDigit
{
	public static void main(String[] args) 
	{
		System.out.println(SumOfDigit(234,0,234));
	}

	public static int SumOfDigit(int num,int sum,int temp)
	{
		if(num!=0)
		{
			sum=sum+num%10;

			return SumOfDigit(num/10,sum,temp);
		}

		return sum;
	}
}