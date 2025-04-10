class RevNumber
{
	public static void main(String[] args) 
	{
		int num=1234;
		int rev=0;
		int dup=num;

		int rem=num%10;
		rev=rev*10+rem;
		num/=10;

		rem=num%10;
		rev=rev*10+rem;
		num/=10;

		rem=num%10;
		rev=rev*10+rem;
		num/=10;

		rem=num%10;
		rev=rev*10+rem;
		num/=10;

		System.out.println(dup);
		System.out.println(rev);	
	}
}