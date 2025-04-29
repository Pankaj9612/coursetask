import java.util.Scanner;
class FibonaccisNo1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int count=0;
		int n1=0,n2=1,n3;
		while(count<num)
		{
			n3=n1+n2;
			n1=n2;
			n2=n3;
			if(num==n3)
			{
				System.out.println("Its a match number..");
				break;
			}
			count++;
		}	
		
		
	}
}