package exception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Exp1 {

	public static void main(String[] args) {
		
		try
		{
		Scanner sc=new Scanner(System.in);//null :- NullPointerException
		System.out.println("entre a numberator: ");
		int num=sc.nextInt();// abcd1234 :-inputMismatchException
		System.out.println("Enter a denomenator: ");
		int den=sc.nextInt();
			int result=num/den;
			System.out.println(result);// 0 :- ArithmeticException
		}
		catch(ArithmeticException e)
		{
			System.out.println("Can't divide by zero");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter a valid input");
		}
		catch(NullPointerException e)
		{
			System.out.println("Store a reference then invoke it");
		}
	}
}
