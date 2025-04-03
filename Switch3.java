import java.util.*;
class Switch3
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a your age:  ");
		int ch= sc.nextInt();
		ch= ch>18?0:1;
		switch(ch)
		{
		case 0:System.out.println("Eligible for vote");
			break;
		case 1:System.out.println("Not Eligible for vote");
			break;
		default:System.out.println("Wrong choice");
			break;
		}
	}
}