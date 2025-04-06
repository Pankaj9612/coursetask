import java.util.*;
class M9
{	
	static void evenOdd(int num)
	{
		if(num%2==0)
		{
			System.out.println("Given number is an even number..");
		}
		else
		{
			System.out.println("Given number is an odd number..");
		}
		//return 1;
	}
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Eneter a number : ");
		int num=sc.nextInt();
		evenOdd(num);
	}
}