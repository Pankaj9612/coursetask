import java.util.Scanner;

class Scan1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a first number: ");
		byte a=sc.nextByte();
		System.out.println("Enter a second number: ");
		byte b=sc.nextByte();

		int res=a+b;
		System.out.println("Addition of two number is: "+res);	
	}
}