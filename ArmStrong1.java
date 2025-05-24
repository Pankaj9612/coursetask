class ArmStrong1
{
	public static void main(String[] args) 
	{
			System.out.println(isArmstrong(152));
	}

	public static boolean isArmstrong(int num)
	{
		int ct=count(num);

		int sum=0;
		for (int i=num;i!=0 ;i/=10 ) 
		{
			int last=i%10;
			sum=sum+power(last,ct);	
		}
		return sum==num;
	}
	
	public static int power(int digit,int ct)
	{
		int pow=1;
		while(ct>0)
		{
			pow*=digit;
			ct--;
		}
		return pow;
	}

	public static int count(int num)
	{
		int ct=0;
		while(num!=0)
		{
			ct++;
			num/=10;
		}
		return ct ;
	}
}