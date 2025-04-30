import java.util.Scanner;
class Primeno5
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int den=2;
		while(den<num/2)
		{
			if(num%2==0)
			{	
				break;
			}
			den++;
		}	
		if(num/2<=den)
		{
			System.out.println("Its a prime..");
		}
		else 
		{
			System.out.println("it not prime no...");
		}
	}
}