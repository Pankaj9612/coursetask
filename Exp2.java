package exception;
import java.util.Scanner;
public class Exp2 
{
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a numerator: ");
		int num=sc.nextInt();
		System.out.println("Enter a denomenator:" );
		int den=sc.nextInt();
		
		try
		{
			int result=num/den;
			System.out.println(result);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Can't divide by zero");
		}
	}
}
