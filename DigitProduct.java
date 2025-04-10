class DigitProduct
{
	public static void main(String[] args) 
	{
		int num=125;
		int pro=1;
		int dup=num;

		int rem=num%10;
		pro*=rem;
		num=num/10;

		rem=num%10;
		pro*=rem;
		num=num/10;

		rem=num%10;
		pro*=rem;
		num=num/10;

		System.out.println(dup);
		System.out.println(pro);	
	}
}