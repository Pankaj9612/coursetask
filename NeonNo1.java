class NeonNo1
{
	public static boolean NeonNo(int num)
	{
		int sum=0;
		int square=num*num;
		while(square>0)
		{
			sum=sum+(square%10);
			square/=10;
		}
		return num==sum;
	}
	 
	public static void main(String[] args) 
	{
		if(NeonNo(9))
		{
			System.out.println("it is NeonNo");
		} 	
		else
		{
			System.out.println("It is not Neon number");
		}
	}
}