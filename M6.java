import java.util.*;
class M6
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a your age: ");
		int age=sc.nextInt();
		int a=voter(age);
	}
	static int voter(int a)
	{
		if(a>18)
		{
			System.out.println("You are eligible for vote..");
		}
		else
		{
			System.out.println("You are not eligible for vote");
		}
		return a;
	}
}