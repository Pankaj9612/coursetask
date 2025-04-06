import java.util.*;
class M10
{	
	public static void score(int x,int y)
	{
		if(x>y)
		{
			System.out.println("Team 1 was won the match..");
		}
		else
		{
			System.out.println("Team 2 was won the match..");
		}
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a frist team score: ");
		int t1=sc.nextInt();
		System.out.println("Enter a second team Score: ");
		int t2=sc.nextInt();
		score(t1,t2);
	}
}