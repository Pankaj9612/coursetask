import java.util.Scanner;
class Lcm
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a first number: ");
		int n1=sc.nextInt();
		System.out.println("Enter a second number: ");
		int n2=sc.nextInt();
		
		int lcm=(n1>n2)?n1:n2;
		int i=1;
		while(true)
		{
			if((lcm*i)%n1==0 && (lcm*i)%n2==0)
			{
				System.out.println("the lcm of number is: "+(lcm*i));
				break;
			}
			i++;
		}
	}
}