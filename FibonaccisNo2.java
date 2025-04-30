import java.util.Scanner;
class FibonaccisNo2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int count=0;
		int n1=0,n2=1,n3;
		while(true)
		{
			n3=n1+n2;
			if(n1==num)
			{
				System.out.println("Its a match number..");
				break;
			}
			else if(n1>num)
			{
				System.out.println("it is not a FibonaccisNo");
				break;
			}
			else
			{
				n1=n2;
				n2=n3;
			}
			count++;
		}	
		
		
	}
}