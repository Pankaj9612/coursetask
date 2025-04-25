import java.util.Scanner;
class Duck
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int no=sc.nextInt();
		while(no>0)
		{
			if(no%10==0)
			{
				break;
			}
			no/=10;
		}	
		if(no>0)
		{
		System.out.println("Its a duck no..");
		}
		else
		{
			System.out.println("It's not  a duck no..");
		}

	}
}