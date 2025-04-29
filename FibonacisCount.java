import java.util.Scanner;
class FibonacisCount
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int n1=0,n2=1,n3;
		int count1=0;
		int count2=0;
		int count=0;
		while(count<num)
		{
			n3=n1+n2;
			//System.out.println(n1);
			n1=n2;
			n2=n3;
			if(n1%2==0)
			{
				count1++;
			}
			else
			{
				count2++;
			}
			count++;
		}
		System.out.println(count1);
		System.out.println(count2);
	}
}