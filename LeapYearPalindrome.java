import java.util.Scanner;
class LeapYearPalindrome
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a year: ");
		int year=sc.nextInt();
		int dup=year;
		int rev=0;
		if((year%4==0 && year%100!=0) || year%400==0)
			{
				System.out.println("Its a leap year..");
				while(year>0)
				{
					int rem=year%10;
					rev=rev*10+rem;
					year/=10;
				}
				System.out.println(rev);
				if(rev==dup)
					{
						System.out.println("Palindrome leap year..");
					}
				else
					{
						System.out.println("Its not a Palindrome year..");
					}

			}
			else 
			{
				System.out.println("Not a leap year..");
			}		
	}
}
		
		