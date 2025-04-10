class CountDigit1
{
	public static void main(String[] args) 
	{
		int num=123;
		int sum=0;
		int dup=num;

		int rem=num%10;
		sum+=rem;
		num/=10;

		rem=num%10;
		sum+=rem;
		num/=10;

		rem=num%10;
		sum+=rem;
		num/=10;

		System.out.println(sum);
		System.out.println(dup);

	}
}