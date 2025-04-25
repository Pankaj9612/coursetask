import java.util.Scanner;
class EvenOddCount
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int no=sc.nextInt();
		int count1=0;
		int count2=0;
		while(no>0)
		{
			int rem=no%10;
			if(rem%2==0)
			{
				count1++;
			}
			else
			{
				count2++;
			}
			no/=10;
		}	
		System.out.println("Even Count of digit: "+count1);
		System.out.println("Odd count of digit: "+count2);
	}
}