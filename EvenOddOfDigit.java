import java.util.Scanner;
class EvenOddOfDigit
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int product=1;
		int sum=0;
		while(num!=0)
		{	
			int rem=num%10;
			if (rem%2==0) {
				sum+=rem;
				
			}
			else
			{
				product *=rem;
				
			}
			num/=10;	
		}
		System.out.println(product);
		System.out.println(sum);
	}
}