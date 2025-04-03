import java.util.*;
class Switch4
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("1.Addition");
		System.out.println("2.Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4.Division");
		System.out.println("Enter number 1 to 4 only");
		System.out.println("Enter your choice:");
		int op=sc.nextInt();
		switch(op)
		{
		case 1:
			{
				System.out.println("Enter a frist number: ");
				int a=sc.nextInt();
				System.out.println("Enter a second number: ");
				int b=sc.nextInt();
				System.out.println("Addition is "+ (a+b));
				break;
			}
		case 2:
			{
				System.out.println("Enter a frist number: ");
				int a=sc.nextInt();
				System.out.println("Enter a second number: ");
				int b=sc.nextInt();
				System.out.println("Subtraction is "+ (a-b));
				break;
			}
		case 3:
			{
				System.out.println("Enter a frist number: ");
				int a=sc.nextInt();
				System.out.println("Enter a second number: ");
				int b=sc.nextInt();
				System.out.println("Multiplication is "+ (a*b));
				break;
			}
		case 4:
			{
				System.out.println("Enter a frist number: ");
				int a=sc.nextInt();
				System.out.println("Enter a second number: ");
				int b=sc.nextInt();
				System.out.println("Division is "+ (a/b));
				break;
			}
		default: System.out.println("Enter a wrong number...");
			break;
		}


	}
}