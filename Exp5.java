package exception;
import java.util.Scanner;
public class Exp5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num");
		int num=sc.nextInt();
		System.out.println("Enter a deno");
		int den=sc.nextInt();
		try
		{
			int result=num/den;
			System.out.println(result);
		}
		catch(Exception e)
		{
			System.out.println("Exception happens");
		}
//		catch(ArithmeticException e)  we can't declare child type exception after the parent type exception
//		{
//			System.out.println("Dont divide by zero");
//		}
	}
}
