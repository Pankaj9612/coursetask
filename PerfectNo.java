class PerfectNo
{
	public static void main(String args[])
	{
		int n=29;
		int dup=n;
		int sum=0;
		for (int i = 1; i < n; i++)
       {
     	if (n % i == 0)
 	        sum = sum + i;
       }

		System.out.println(sum);
		String res=(dup==sum)?
		(dup+" is a perfect number."):
		(dup+" is not a perfect number.");
		System.out.println(res);
	}
}