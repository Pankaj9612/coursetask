class Practice3
{
	public static void main(String[] args) {
		
		int n=153;
		int sum=0;
		int dup=n;

		while(n>0)
		{
			int rem=n%10;
			sum=sum+rem*rem*rem;
			n=n/10;
		}
		System.out.println(sum);
		if(sum==dup)
		{
			System.out.println(dup+"Number is armstrong number..");
		}
		else
		{
			System.out.println(dup+" NUmber is not a armstrng number..");
		}

	}
}