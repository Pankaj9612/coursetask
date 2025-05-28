class RecReverseNumber
{
	public static void main(String[] args) 
	{
		System.out.println(ReverseNumber(123,0,123));
	}

	public static boolean ReverseNumber(int num,int rev,int temp)
	{
		if(num!=0)
		{
			rev=rev*10 + num%10;

			return ReverseNumber(num/10,rev,temp);
		}

		return temp==rev;
	}
}