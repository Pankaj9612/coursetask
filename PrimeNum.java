package application;
import java.util.Scanner;
public class PrimeNum 
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int den=2;
		while(den<num)
		{
			if(num%den==0)
			{
				System.out.println("It is not a prime number..");
				break;
			}
			den++;
		}
		if(den==num)
		{
			System.out.println("It is prime number..");
		}
	}
}
