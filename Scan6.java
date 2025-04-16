import java.util.Scanner;

class Scan6
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		Double a=sc.nextDouble();
		System.out.println("Enter a second number: ");
		Double b=sc.nextDouble();

		Double res=a+b;
		System.out.println("Addition of two number is: "+res);	
	}
}