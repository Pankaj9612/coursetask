import java.util.Scanner;
class SmallDigit
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int no=sc.nextInt();
		int small=9;
		while(no>1)
		{
			int rem=no%10;
			if(rem<small)
			{
				small=rem;
			}
			no/=10;
		}
		System.out.println(small);
	}
}