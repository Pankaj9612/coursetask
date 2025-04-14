import java.util.Scanner;
class Practice1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Divide number : ");
		int n=sc.nextInt();
		System.out.println("Enter a Divided by number : ");
		int i=sc.nextInt();

		if(n%i==0)
		{
			System.out.println(n+" is even number.");
		}
		else
		{
			System.out.println(n+" is odd number.");
		}
	}
}