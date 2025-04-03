import java.util.*;
class Switch5
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a gender: ");

		char n= sc.next().charAt(0);
		switch(n)
		{
		case 'M':
		case 'm':System.out.println("Male");
			break;

		case 'F':
		case 'f':System.out.println("Female");
			break;

		default:System.out.println("You entered wrong input...");
			break;
		}
	}
}