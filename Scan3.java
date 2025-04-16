import java.util.Scanner;

class Scan3
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		int a=sc.nextInt();
		System.out.println("Enter a second number: ");
		int b=sc.nextInt();

		int res=a+b;
		System.out.println("Addition of two number is: "+res);	
	}
}