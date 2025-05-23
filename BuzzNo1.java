class BuzzNo1
{
	public static boolean BuzzNo(int num)
	{
		if(num%10==7 || num%7==0)
		{
			return true;
		}
		return false;
	}
	 
	public static void main(String[] args) 
	{
		if(BuzzNo(147))
		{
			System.out.println("it is buzz no");
		} 	
		else
		{
			System.out.println("It is not buzz number");
		}
	}
}