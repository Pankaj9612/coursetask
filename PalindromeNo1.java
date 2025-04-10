class PalindromeNo
{
	public static void main(String[] args) 
	{
		int num=1221;
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

		System.out.println(rev);
		String ans=(rev==dup)?(dup +" is palindrome."):(dup+" is not palindrome");
		System.out.println(ans);		
	}
}