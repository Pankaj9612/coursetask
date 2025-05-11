import java.util.Scanner;
class BigDigit
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int no=sc.nextInt();
		int big=0;
		while(no>0)
		{
			int rem=no%10;
			if(rem>big)
			{
				big=rem;
			}
			no/=10;
		}
		System.out.println(big);
	}
}