package exception;
import java.util.InputMismatchException;
import java.util.Scanner;// Write exception in child type to parent type
public class Exp6 {

	public static void main(String[] args) {
		
		try
		{

			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a num");
			int num=sc.nextInt();
			System.out.println("Enter a deno");
			int den=sc.nextInt();
			int result=num/den;
			System.out.println(result);
		}
		catch(NullPointerException e)
		{
			System.out.println("Call with reference");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Don't divide by zero");
		}
		catch(ClassCastException e)
		{
			System.out.println("Can't call without upcasted");
		}
		catch(InputMismatchException e)
		{
			System.out.println("Enter a valid input");
		}
		catch(Exception e)
		{
			System.out.println("Unexcepted exception occurs");
		}
		catch(Throwable e)
		{
			System.out.println("we cannot guess which exception is occurs");
		}
		finally
		{
			System.out.println("Finally Executed");
		}
	}
}