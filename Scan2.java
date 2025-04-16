import java.util.Scanner;

class Scan2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		short a=sc.nextShort();
		System.out.println("Enter a second number: ");
		short b=sc.nextShort();

		int res=a+b;
		System.out.println("Addition of two number is: "+res);	
	}
}