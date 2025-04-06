import java.util.*;
class M8
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		prime(num);
	}

	static int prime(int num)
	{
		if(num%2==0)
		{
			System.out.println("Given number is not a prime no..");
		}
		else
		{
			System.out.println("Given number is prime no..");
		}
		return 1;
	}
}