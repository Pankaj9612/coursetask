import java.util.Scanner;
class CountDigit1
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int no=sc.nextInt();
		int count=0;
		while(no>0)
		{
			int rem=no%10;
			count++;
			no/=10;
		}	
		System.out.println(count);
	}
}