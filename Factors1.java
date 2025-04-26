import java.util.Scanner;
class Factors1
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num=sc.nextInt();
		int ecount=0;
		int ocount=0;
		for(int i=1;i<=num;i++)
		{	
			
			if(num%i==0)
			{
				if(i%2==0)
				{
						ecount++;
				}
				else
				{
					ocount++;
				}
			}
		}	
		System.out.println(ecount);
		System.out.println(ocount);
	}
}