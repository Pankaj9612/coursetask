import java.util.Scanner;
class EvenDigit
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int no=sc.nextInt();
		while(no>0)
		{
			int rem=no%10;
			if(rem%2==0)
			{
				System.out.println(rem);
			}
			no/=10;
		}	
	}
}