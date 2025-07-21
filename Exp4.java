package exception;
import java.util.Scanner;
public class Exp4 {

	public static void main(String[] args) {
		try
		{
		Scanner sc=null;
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		System.out.println(num);
		}
		catch(ClassCastException e)
		{
			System.out.println("Dont invoke the null value/ refernce");
		}
	}
	
	
}
