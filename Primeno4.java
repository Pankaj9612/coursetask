import java.util.Scanner;
class Primeno4
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int den=2;
		while(den<num)
		{
			if(num%2==0)
			{	
				break;
			}
			den++;
		}	
		if(num<=den)
		{
			System.out.println("Its a prime..");
		}
		else 
		{
			System.out.println("it not prime no...");
		}
	}
}