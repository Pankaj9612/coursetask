import java.util.Scanner;

class Scan5
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		float a=sc.nextFloat();
		System.out.println("Enter a second number: ");
		float b=sc.nextFloat();

		float res=a+b;
		System.out.println("Addition of two number is: "+res);	
	}
}