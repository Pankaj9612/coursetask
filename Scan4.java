import java.util.Scanner;

class Scan4
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		long a=sc.nextLong();
		System.out.println("Enter a second number: ");
		long b=sc.nextLong();

		long res=a+b;
		System.out.println("Addition of two number is: "+res);	
	}
}